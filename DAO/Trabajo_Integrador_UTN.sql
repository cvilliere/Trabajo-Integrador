-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 24-11-2023 a las 21:48:38
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `Trabajo_Integrador_UTN`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `razon_social` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `cuit` varchar(15) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `mail` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente_servicio`
--

CREATE TABLE `cliente_servicio` (
  `id_cliente_servicio` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_servicio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_incidencia`
--

CREATE TABLE `detalle_incidencia` (
  `id_detalle_incidencia` int(11) NOT NULL,
  `id_servicio` int(11) NOT NULL,
  `id_incidencia` int(11) NOT NULL,
  `detalle_problema` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `descripcion_problema` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `resuelto` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialidad`
--

CREATE TABLE `especialidad` (
  `id_especialidad` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `incidencia`
--

CREATE TABLE `incidencia` (
  `id_incidencia` int(11) NOT NULL,
  `alias` varchar(255) NOT NULL,
  `descripcion` text NOT NULL,
  `fecha_estimada` date NOT NULL,
  `resuelto` tinyint(1) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_tipo_problema` int(11) NOT NULL,
  `id_tecnico` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `id_servicio` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tecnico`
--

CREATE TABLE `tecnico` (
  `id_tecnico` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `mail` varchar(255) NOT NULL,
  `num_telefonico` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tecnico_especialidad`
--

CREATE TABLE `tecnico_especialidad` (
  `id_tecnico_especialidad` int(11) NOT NULL,
  `id_tecnico` int(11) NOT NULL,
  `id_especialidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_problema`
--

CREATE TABLE `tipo_problema` (
  `id_tipo_problema` int(11) NOT NULL,
  `tipo` varchar(255) NOT NULL,
  `tiempo_estimado(dias)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_problema_especialidad`
--

CREATE TABLE `tipo_problema_especialidad` (
  `id_tipo_problema_especialidad` int(11) NOT NULL,
  `id_tipo_problema` int(11) NOT NULL,
  `id_especialidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

CREATE TABLE `tipo_usuario` (
  `id_tipo_usuario` int(11) NOT NULL,
  `tipo` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `tipo_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `cliente_servicio`
--
ALTER TABLE `cliente_servicio`
  ADD PRIMARY KEY (`id_cliente_servicio`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_servicio` (`id_servicio`);

--
-- Indices de la tabla `detalle_incidencia`
--
ALTER TABLE `detalle_incidencia`
  ADD PRIMARY KEY (`id_detalle_incidencia`),
  ADD KEY `id_servicio` (`id_servicio`),
  ADD KEY `id_incidencia` (`id_incidencia`);

--
-- Indices de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  ADD PRIMARY KEY (`id_especialidad`);

--
-- Indices de la tabla `incidencia`
--
ALTER TABLE `incidencia`
  ADD PRIMARY KEY (`id_incidencia`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `incidencia_ibfk_2` (`id_tipo_problema`),
  ADD KEY `id_tecnico` (`id_tecnico`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`id_servicio`);

--
-- Indices de la tabla `tecnico`
--
ALTER TABLE `tecnico`
  ADD PRIMARY KEY (`id_tecnico`);

--
-- Indices de la tabla `tecnico_especialidad`
--
ALTER TABLE `tecnico_especialidad`
  ADD PRIMARY KEY (`id_tecnico_especialidad`),
  ADD KEY `id_tecnico` (`id_tecnico`),
  ADD KEY `id_especialidad` (`id_especialidad`);

--
-- Indices de la tabla `tipo_problema`
--
ALTER TABLE `tipo_problema`
  ADD PRIMARY KEY (`id_tipo_problema`);

--
-- Indices de la tabla `tipo_problema_especialidad`
--
ALTER TABLE `tipo_problema_especialidad`
  ADD PRIMARY KEY (`id_tipo_problema_especialidad`),
  ADD KEY `id_tipo_problema` (`id_tipo_problema`);

--
-- Indices de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  ADD PRIMARY KEY (`id_tipo_usuario`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cliente_servicio`
--
ALTER TABLE `cliente_servicio`
  MODIFY `id_cliente_servicio` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalle_incidencia`
--
ALTER TABLE `detalle_incidencia`
  MODIFY `id_detalle_incidencia` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  MODIFY `id_especialidad` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `incidencia`
--
ALTER TABLE `incidencia`
  MODIFY `id_incidencia` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `id_servicio` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tecnico`
--
ALTER TABLE `tecnico`
  MODIFY `id_tecnico` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tecnico_especialidad`
--
ALTER TABLE `tecnico_especialidad`
  MODIFY `id_tecnico_especialidad` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_problema`
--
ALTER TABLE `tipo_problema`
  MODIFY `id_tipo_problema` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_problema_especialidad`
--
ALTER TABLE `tipo_problema_especialidad`
  MODIFY `id_tipo_problema_especialidad` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  MODIFY `id_tipo_usuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente_servicio`
--
ALTER TABLE `cliente_servicio`
  ADD CONSTRAINT `cliente_servicio_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `cliente_servicio_ibfk_2` FOREIGN KEY (`id_servicio`) REFERENCES `servicio` (`id_servicio`);

--
-- Filtros para la tabla `detalle_incidencia`
--
ALTER TABLE `detalle_incidencia`
  ADD CONSTRAINT `detalle_incidencia_ibfk_1` FOREIGN KEY (`id_servicio`) REFERENCES `servicio` (`id_servicio`),
  ADD CONSTRAINT `detalle_incidencia_ibfk_2` FOREIGN KEY (`id_incidencia`) REFERENCES `incidencia` (`id_incidencia`);

--
-- Filtros para la tabla `incidencia`
--
ALTER TABLE `incidencia`
  ADD CONSTRAINT `incidencia_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `detalle_incidencia` (`id_detalle_incidencia`),
  ADD CONSTRAINT `incidencia_ibfk_2` FOREIGN KEY (`id_tipo_problema`) REFERENCES `tipo_problema` (`id_tipo_problema`),
  ADD CONSTRAINT `incidencia_ibfk_3` FOREIGN KEY (`id_tecnico`) REFERENCES `tecnico` (`id_tecnico`);

--
-- Filtros para la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD CONSTRAINT `servicio_ibfk_1` FOREIGN KEY (`id_servicio`) REFERENCES `cliente_servicio` (`id_cliente_servicio`),
  ADD CONSTRAINT `servicio_ibfk_2` FOREIGN KEY (`id_servicio`) REFERENCES `detalle_incidencia` (`id_detalle_incidencia`);

--
-- Filtros para la tabla `tecnico`
--
ALTER TABLE `tecnico`
  ADD CONSTRAINT `tecnico_ibfk_1` FOREIGN KEY (`id_tecnico`) REFERENCES `incidencia` (`id_incidencia`),
  ADD CONSTRAINT `tecnico_ibfk_2` FOREIGN KEY (`id_tecnico`) REFERENCES `tecnico_especialidad` (`id_tecnico_especialidad`);

--
-- Filtros para la tabla `tecnico_especialidad`
--
ALTER TABLE `tecnico_especialidad`
  ADD CONSTRAINT `tecnico_especialidad_ibfk_1` FOREIGN KEY (`id_tecnico`) REFERENCES `tecnico` (`id_tecnico`),
  ADD CONSTRAINT `tecnico_especialidad_ibfk_2` FOREIGN KEY (`id_especialidad`) REFERENCES `especialidad` (`id_especialidad`);

--
-- Filtros para la tabla `tipo_problema`
--
ALTER TABLE `tipo_problema`
  ADD CONSTRAINT `tipo_problema_ibfk_1` FOREIGN KEY (`id_tipo_problema`) REFERENCES `incidencia` (`id_incidencia`),
  ADD CONSTRAINT `tipo_problema_ibfk_2` FOREIGN KEY (`id_tipo_problema`) REFERENCES `tipo_problema_especialidad` (`id_tipo_problema_especialidad`);

--
-- Filtros para la tabla `tipo_problema_especialidad`
--
ALTER TABLE `tipo_problema_especialidad`
  ADD CONSTRAINT `tipo_problema_especialidad_ibfk_1` FOREIGN KEY (`id_tipo_problema_especialidad`) REFERENCES `especialidad` (`id_especialidad`),
  ADD CONSTRAINT `tipo_problema_especialidad_ibfk_2` FOREIGN KEY (`id_tipo_problema`) REFERENCES `tipo_problema` (`id_tipo_problema`);

--
-- Filtros para la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  ADD CONSTRAINT `tipo_usuario_ibfk_1` FOREIGN KEY (`id_tipo_usuario`) REFERENCES `usuario` (`id_usuario`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `tipo_usuario` (`id_tipo_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

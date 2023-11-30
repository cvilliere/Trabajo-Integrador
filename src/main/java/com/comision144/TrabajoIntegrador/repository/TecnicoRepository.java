
package com.comision144.TrabajoIntegrador.repository;

import com.comision144.TrabajoIntegrador.entity.Incidencia;
import com.comision144.TrabajoIntegrador.entity.Tecnico;
import java.time.LocalDate;
import java.util.List;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

public interface TecnicoRepository extends JpaRepository<SecurityProperties.User, Long> {

    public void saveTecnico(Tecnico tecnico);

    public Tecnico findTecnicoPorId(int id);

    public List<Tecnico> findAllTecnicos();

    public void updateTecnico(Tecnico tecnico);

    public void delete(Tecnico tecnico);

    public List<Incidencia> obtenerResueltosPorFecha(boolean resuelto, LocalDate fecha1, LocalDate fecha2);
    
}

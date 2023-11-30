
package com.comision144.TrabajoIntegrador.service;

import com.comision144.TrabajoIntegrador.entity.Incidencia;
import com.comision144.TrabajoIntegrador.entity.TipoProblema;
import java.util.List;
import java.util.Set;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

public interface IncidenciaService extends JpaRepository<SecurityProperties.User, Long> {
    
    void crearIncidencia(Incidencia incidencia);
    
    Incidencia buscarporId(int id);
    
    List<Incidencia> findAllIncidencias();
    
    void modificarIncidencia(Incidencia incidente);

    void deleteIncidencia(Incidencia incidente);

    int sumarTiempoEstimado(Set<TipoProblema> problemas);

    //Metodos para consultas solicitadas en el TPF entrega 2
    List<Incidencia> listarPorXDias(int nDias);
    
}

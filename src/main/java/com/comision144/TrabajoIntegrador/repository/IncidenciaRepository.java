
package com.comision144.TrabajoIntegrador.repository;

import com.comision144.TrabajoIntegrador.entity.Incidencia;
import java.util.List;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

public interface IncidenciaRepository extends JpaRepository<SecurityProperties.User, Long> {

    public void saveIncidencia(Incidencia incidencia);

    public Incidencia findIncidenciaPorId(int id);

    public List<Incidencia> findAllIncidencias();

    public void updateIncidencia(Incidencia incidente);

    public void deleteIncidencia(Incidencia incidente);
    
}

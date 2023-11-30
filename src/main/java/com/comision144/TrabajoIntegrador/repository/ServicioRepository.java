
package com.comision144.TrabajoIntegrador.repository;

import com.comision144.TrabajoIntegrador.entity.Servicio;
import java.util.List;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

public interface ServicioRepository extends JpaRepository<SecurityProperties.User, Long> {

    public void saveServicio(Servicio servicio);

    public Servicio findServicioPorId(int id);

    public Servicio findServicioByDescripcion(String descripcion);

    public List<Servicio> findAllServicios();

    public void updateServicio(Servicio servicio);

    public void deleteServicio(Servicio servicio);
    
}

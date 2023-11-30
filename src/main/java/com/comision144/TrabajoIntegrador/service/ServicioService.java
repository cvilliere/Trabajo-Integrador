
package com.comision144.TrabajoIntegrador.service;

import com.comision144.TrabajoIntegrador.entity.Servicio;
import java.util.List;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

public interface ServicioService extends JpaRepository<SecurityProperties.User, Long> {
    
    void crearServicio(Servicio servicio);
    
    public Servicio buscarPorId(int id);
    
    public Servicio buscarPorDescripcion(String descripcion);
    
    public List<Servicio> findAllServicios();

    public void modificarServicio(Servicio servicio);
    
    public void eliminarServicio(Servicio servicio);
    
}

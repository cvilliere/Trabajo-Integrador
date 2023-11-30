
package com.comision144.TrabajoIntegrador.service;

import com.comision144.TrabajoIntegrador.entity.Servicio;
import com.comision144.TrabajoIntegrador.repository.ServicioRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

@Service
@AllArgsConstructor
public class ServicioServiceImpl {
    
    private final ServicioRepository servicioRepository;
    
    public void crearServicio(Servicio servicio){
        servicioRepository.saveServicio(servicio);
    }
    
    public Servicio buscarPorId(int id){
        return servicioRepository.findServicioPorId(id);
    }
    
    public Servicio buscarPorDescripcion(String descripcion){
        return servicioRepository.findServicioByDescripcion(descripcion);
    }
    
    public List<Servicio> findAllServicios(){
        return servicioRepository.findAllServicios();
    }
    
    public void modificarServicio(Servicio servicio){
        servicioRepository.updateServicio(servicio);
    }
    
    public void eliminarServicio(Servicio servicio){
        servicioRepository.deleteServicio(servicio);
    }
    
}

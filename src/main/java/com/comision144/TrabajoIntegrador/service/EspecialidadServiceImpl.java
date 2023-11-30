
package com.comision144.TrabajoIntegrador.service;

import com.comision144.TrabajoIntegrador.entity.Especialidad;
import com.comision144.TrabajoIntegrador.repository.EspecialidadRepository;
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
public class EspecialidadServiceImpl {
    
    private final EspecialidadRepository especialidadRepository;
    
    public void crearEspecialidad(Especialidad esp){
       especialidadRepository.saveEspecialidad(esp);
    }
    
    public Especialidad getEspecialidadById(int id){
        return especialidadRepository.findEspecialidadPorId(id);
    }
    
    public Especialidad findEspecialidadByNombre(String nombre) {
         return especialidadRepository.findEspecialidadByNombre(nombre);
    }
    
    public List<Especialidad> getTodasEspecialidades(){
        return especialidadRepository.findAllEspecialidades();
    }
    
    public void modificarEspecialidad(Especialidad especialidad){
        especialidadRepository.updateEspecialidad(especialidad);
    }
    
    public void borrarEspecialidad(Especialidad especialidad){
        especialidadRepository.deleteEspecialidad(especialidad);
    }
}

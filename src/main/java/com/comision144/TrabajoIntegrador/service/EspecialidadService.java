
package com.comision144.TrabajoIntegrador.service;

import com.comision144.TrabajoIntegrador.entity.Especialidad;
import java.util.List;

/**
 *
 * @author carlos
 */
public interface EspecialidadService {
    
    Especialidad crearEspecialidad(Especialidad especialidad);

    Especialidad getEspecialidadById(int idEspecialidad);
    
    Especialidad findEspecialidadByNombre(String nombre);

    List<Especialidad> getTodasEspecialidades();

    Especialidad modificarEspecialidad(Especialidad especialidad);

    void borrarEspecialidad(Especialidad especialidad);
    
}

/*
    
    
    
    
    
    
*/

package com.comision144.TrabajoIntegrador.repository;

import com.comision144.TrabajoIntegrador.entity.Especialidad;
import java.util.List;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

public interface EspecialidadRepository extends JpaRepository<SecurityProperties.User, Long> {

    public void saveEspecialidad(Especialidad esp);

    public Especialidad findEspecialidadPorId(int id);

    public Especialidad findEspecialidadByNombre(String nombre);

    public List<Especialidad> findAllEspecialidades();

    public void updateEspecialidad(Especialidad especialidad);

    public void deleteEspecialidad(Especialidad especialidad);
    
}

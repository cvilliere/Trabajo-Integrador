
package com.comision144.TrabajoIntegrador.service;

import com.comision144.TrabajoIntegrador.entity.Incidencia;
import com.comision144.TrabajoIntegrador.entity.TipoProblema;
import com.comision144.TrabajoIntegrador.repository.IncidenciaRepository;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

@Service
@AllArgsConstructor
public class IncidenciaServiceImpl {
    
    private final IncidenciaRepository incidenciaRepository;

    public void crearIncidencia(Incidencia incidencia) {
        incidenciaRepository.saveIncidencia(incidencia);
    }

    public Incidencia buscarporId(int id) {
        return incidenciaRepository.findIncidenciaPorId(id);
    }

    public List<Incidencia> findAllIncidencias() {
        return incidenciaRepository.findAllIncidencias();
    }

    public void modificarIncidencia(Incidencia incidencia) {
        incidenciaRepository.updateIncidencia(incidencia);
    }

    public void deleteIncidencia(Incidencia incidencia) {
        incidenciaRepository.deleteIncidencia(incidencia);
    }
/*
    public int sumarTiempoEstimado(Set<TipoProblema> problemas) {
        return problemas.stream().mapToInt(TipoProblema::getTiempoEstimado(tiempo)).sum();
    }*/

    //public int sumarTiempoEstimado(Set<TipoProblema> problemas) {
    //    return problemas.stream().mapToInt(TipoProblema::getTiempoEstimado).sum();
    //}

    //Metodos para consultas solicitadas en el TPF entrega 2
   /* public List<Incidencia> listarPorXDias(int nDias) {
        List<Incidencia> incidenciasNDias = findAllIncidencias().stream()
                .filter(incidencia -> incidencia.getTiempoResolucion() <= nDias)
                .collect(Collectors.toList());

        return incidenciasNDias;
    }*/

    
}

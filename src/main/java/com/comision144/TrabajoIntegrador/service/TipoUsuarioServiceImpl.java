
package com.comision144.TrabajoIntegrador.service;

import com.comision144.TrabajoIntegrador.entity.TipoUsuario;
import com.comision144.TrabajoIntegrador.repository.TipoUsuarioRepository;
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
public class TipoUsuarioServiceImpl {
    
    private final TipoUsuarioRepository tipoUsuarioRepository;
    
    public void crearTipoUsuario(TipoUsuario tUser){
        tipoUsuarioRepository.saveTipoUsuario(tUser);
    }
    
    public TipoUsuario buscarPorId(int idTipoUsuario){
        return tipoUsuarioRepository.findTipoUsuarioPorId(idTipoUsuario);
    }
    
    public List<TipoUsuario> findAllTipoUsuario(){
        return tipoUsuarioRepository.findAllTipoUsuarioes();
    }
    
    public void modificarTipoUsuario(TipoUsuario tipoUsuario){
        tipoUsuarioRepository.updateTipoUsuario(tipoUsuario);
    }
    
    public void eliminarTipoUsuario(TipoUsuario tipoUsuario){
        tipoUsuarioRepository.deleteTipoUsuario(tipoUsuario);
    }
    
}

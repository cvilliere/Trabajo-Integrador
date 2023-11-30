
package com.comision144.TrabajoIntegrador.service;

import com.comision144.TrabajoIntegrador.entity.Usuario;
import com.comision144.TrabajoIntegrador.repository.UsuarioRepository;
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
public class UsuarioServiceImpl {
    
    private final UsuarioRepository usuarioRepository;
    
    public void crearUsuario(Usuario Usuario){
        usuarioRepository.saveUsuario(Usuario);
    }
    
    public Usuario buscarPorId(int idUsuario){
        return usuarioRepository.findUsuarioPorId(idUsuario);
    }
    
    public List<Usuario> findAllUsuario(){
        return usuarioRepository.findAllUsuarioes();
    }
    
    public void modificarUsuario(Usuario usuario){
        usuarioRepository.updateUsuario(usuario);
    }
    
    public void eliminarUsuario(Usuario usuario){
        usuarioRepository.deleteUsuario(usuario);
    }
    
}

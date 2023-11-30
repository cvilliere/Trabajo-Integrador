
package com.comision144.TrabajoIntegrador.service;

import com.comision144.TrabajoIntegrador.entity.TipoUsuario;
import java.util.List;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

public interface TipoUsuarioService extends JpaRepository<SecurityProperties.User, Long>{
    
    public void crearTipoUsuario(TipoUsuario tUser);
    
    public TipoUsuario buscarPorId(int idTipoUsuario);
    
    public List<TipoUsuario> findAllTipoUsuario();
    
    public void modificarTipoUsuario(TipoUsuario tipoUsuario);
    
    public void eliminarTipoUsuario(TipoUsuario tipoUsuario);
    
}

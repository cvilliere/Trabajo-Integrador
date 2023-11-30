
package com.comision144.TrabajoIntegrador.repository;

import com.comision144.TrabajoIntegrador.entity.Usuario;
import java.util.List;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

public interface UsuarioRepository extends JpaRepository<SecurityProperties.User, Long> {

    public void saveUsuario(Usuario User);

    public Usuario findUsuarioPorId(int idUsuario);

    public List<Usuario> findAllUsuarioes();

    public void updateUsuario(Usuario usuario);

    public void deleteUsuario(Usuario tipoUsuario);
    
}

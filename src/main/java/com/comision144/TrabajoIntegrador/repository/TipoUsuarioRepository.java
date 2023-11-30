
package com.comision144.TrabajoIntegrador.repository;

import com.comision144.TrabajoIntegrador.entity.TipoUsuario;
import java.util.List;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

public interface TipoUsuarioRepository extends JpaRepository<SecurityProperties.User, Long> {

    public void saveTipoUsuario(TipoUsuario op);

    public TipoUsuario findTipoUsuarioPorId(int idTipoUsuario);

    public List<TipoUsuario> findAllTipoUsuarioes();

    public void updateTipoUsuario(TipoUsuario tipoUsuario);

    public void deleteTipoUsuario(TipoUsuario tipoUsuario);
    
}

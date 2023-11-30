
package com.comision144.TrabajoIntegrador.repository;

import com.comision144.TrabajoIntegrador.entity.Cliente;
import java.util.List;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

public interface ClienteRepository extends JpaRepository<User, Long> {

    public Cliente save(Cliente cliente);

    public Cliente findClientePorId(int idCliente);
    
    public Cliente findClienteByRazonSocial(String razonSocial);

    public List<Cliente> getAllClientes();

    public void updateCliente(Cliente cliente);

    public void delete(Cliente cliente);

    
}

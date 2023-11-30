
package com.comision144.TrabajoIntegrador.service;

import com.comision144.TrabajoIntegrador.entity.Cliente;
import java.util.List;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

public interface ClienteService {
    
    Cliente crearCliente(Cliente cliente);

    Cliente getClienteById(int idCliente);
    
    public Cliente findClienteByRazonSocial(String razonSocial);

    List<Cliente> getAllClientes();

    Cliente actualizarCliente(Cliente cliente);

    void borrarCliente(int idCliente);

    public Cliente createCliente(Cliente cliente);
    
}

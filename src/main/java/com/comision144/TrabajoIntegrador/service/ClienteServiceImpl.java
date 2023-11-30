
package com.comision144.TrabajoIntegrador.service;

import com.comision144.TrabajoIntegrador.entity.Cliente;
import com.comision144.TrabajoIntegrador.repository.ClienteRepository;
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
public class ClienteServiceImpl implements ClienteService {
    
    private final ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    
    public Cliente getClienteID(int idCliente) {
        return clienteRepository.findClientePorId(idCliente);
    }
    
    @Override
    public Cliente findClienteByRazonSocial(String razonSocial) {
        return clienteRepository.findClienteByRazonSocial(razonSocial);
    }

    @Override
    public List<Cliente> getAllClientes() {
         return clienteRepository.getAllClientes();
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        //clienteRepository.updateCliente(cliente);
        
       Cliente clienteExistente = clienteRepository.findClientePorId(cliente.getIdCliente());
        clienteExistente.setRazonSocial(cliente.getRazonSocial());
        clienteExistente.setCUIT(cliente.getCUIT());
        clienteExistente.setMail(cliente.getMail());
       Cliente usuarioActualizado = clienteRepository.save(clienteExistente);
        return usuarioActualizado;
    
    }

    public void borrarCliente(Cliente cliente) {
        clienteRepository.delete(cliente);
        
    }

    @Override
    public Cliente getClienteById(int idCliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrarCliente(int idCliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente createCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

           
}
    


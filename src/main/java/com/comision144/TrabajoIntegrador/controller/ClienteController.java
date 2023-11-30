
package com.comision144.TrabajoIntegrador.controller;

import com.comision144.TrabajoIntegrador.entity.Cliente;
import com.comision144.TrabajoIntegrador.service.ClienteService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */


@RestController
@AllArgsConstructor
@RequestMapping("api/cliente")
public class ClienteController {
    
    
    private final ClienteService clienteService;

    // Construir crear cliente API REST
    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente){
        Cliente savedCliente = clienteService.createCliente(cliente);
        return new ResponseEntity<>(savedCliente, HttpStatus.CREATED);
    }

    //Construir obtener usuario por ID REST API
    // http://localhost:8080/api/cliente/1
    @GetMapping("{id_cliente}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable("id_cliente") int idCliente){
        Cliente cliente = clienteService.getClienteById(idCliente);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    // Crear API REST para obtener todos los clientes
    // http://localhost:8080/api/cliente
    @GetMapping
    public ResponseEntity<List<Cliente>> getAllClientes(){
        List<Cliente> clientes = clienteService.getAllClientes();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    // Crear actualización de API REST de cliente
    @PutMapping("{id}")
    // http://localhost:8080/api/cliente/1
    public ResponseEntity<Cliente> updateCliente(@PathVariable("id_cliente") int  idCliente,
                                           @RequestBody Cliente cliente){
        cliente.setId(idCliente);
        Cliente actualizarCliente = clienteService.actualizarCliente(cliente);
        return new ResponseEntity<>(actualizarCliente, HttpStatus.OK);
    }

    // Crear API REST de eliminación de cliente
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCliente(@PathVariable("id") int  idCliente){
        clienteService.borrarCliente(idCliente);
        return new ResponseEntity<>("Cliente successfully deleted!", HttpStatus.OK);
    }
    
}

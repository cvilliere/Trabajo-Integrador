/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.comision144.TrabajoIntegrador.service;

import com.comision144.TrabajoIntegrador.entity.Usuario;
import java.util.List;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

public interface UsuarioService {
    
    public void crearUsuario(Usuario usuario);
    
    public Usuario buscarPorId(int idUsuario);
    
    public List<Usuario> findAllUsuario();
    
    public void modificarUsuario(Usuario usuario);
    
    public void eliminarUsuario(Usuario usuario);
    
}

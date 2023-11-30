
package com.comision144.TrabajoIntegrador.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.SEQUENCE;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="usuario")
public class Usuario {
    
    @Id
    @Column(name="id_usuario")
    @GeneratedValue(strategy = SEQUENCE, generator = "ID_SEQ")
    private int idUsuario;
    @Column(name="username")
    private String username;
    @Column(name="passwor")
    private String password;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "id_usuario", referencedColumnName= "id_tipo_usuario")
    private int idTipoUsuario;
        
}

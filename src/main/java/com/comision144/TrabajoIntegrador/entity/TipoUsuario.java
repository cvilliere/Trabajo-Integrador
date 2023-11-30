
package com.comision144.TrabajoIntegrador.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.SEQUENCE;
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
@Table(name="tipo_usuario")
public class TipoUsuario {
    
    @Id
    @Column(name="id_tipo_usuario")
    @GeneratedValue(strategy = SEQUENCE, generator = "ID_SEQ")
    private int idTipoUsuario;
    @Column(name="tipo")
    private String tipo;
        
}

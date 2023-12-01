
package com.comision144.TrabajoIntegrador.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.SEQUENCE;
import jakarta.persistence.Table;
import java.time.LocalDate;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

@Entity
@Table(name="tipo_problema")
public class TipoProblema {

    public static int getTiempoEstimado(LocalDate tiempo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Id
    @Column(name="id_tipo_problema")
    @GeneratedValue(strategy = SEQUENCE, generator = "ID_SEQ")
    private int idTipoProblema;
    @Column(name="tipo")
    private String tipo;
    @Column(name="tiempo_estimado")
    private int tiempoEstimado;
    
}

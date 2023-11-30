
package com.comision144.TrabajoIntegrador.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.SEQUENCE;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Carlos Villiere
 *         DNI 16425555
 */

@Table(name="tipo_problema_especialidad")
public class TipoProblemaEspecialidad {
    
    @Id
    @Column(name="id_tipo_problema_especialidad")
    @GeneratedValue(strategy = SEQUENCE, generator = "ID_SEQ")
    private int tipoProblemaEspecialidad;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "id_tipo_problema_especialidad", referencedColumnName= "id_tipo_problema")
    private int idTipoProblema;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "id_tipo_problema_especialidad", referencedColumnName= "id_especialidad")
    private int idEspecialidad;
        
}

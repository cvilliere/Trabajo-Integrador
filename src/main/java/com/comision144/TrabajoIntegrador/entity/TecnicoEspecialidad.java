
package com.comision144.TrabajoIntegrador.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

@Entity
@Table(name="tecnico_especialidad")
public class TecnicoEspecialidad {
    
    @Id
    @Column(name="id_tecnico_especialidad")
    @GeneratedValue(strategy = SEQUENCE, generator = "ID_SEQ")
    private int idTecnicoEspecialidad;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "id_tecnico_especialidad", referencedColumnName= "id_tecnico")
    private int idTecnico;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "id_tecnico_especialidad", referencedColumnName= "id_especialidad")
    private int idEspecialidad;
        
}

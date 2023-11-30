
package com.comision144.TrabajoIntegrador.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.SEQUENCE;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
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
@Table(name="incidencia")
public class Incidencia {
    
    @Id
    @Column(name="id_incidencia")
    @GeneratedValue(strategy = SEQUENCE, generator = "ID_SEQ")
    private int idIncidencia;
    @Column(name="alias")
    private String alias;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="fecha_estimada")
    private LocalDate fechaEstimada;
    @Column(name="resuelto")
    private boolean resuelto;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "id_incidencia", referencedColumnName= "id_cliente")
    private int idCliente;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "id_incidencia", referencedColumnName= "id_tipo_problema")
    private int idTipoProblema;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "id_incidencia", referencedColumnName= "id_tecnico")
    private int idTecnico;

    public int getTiempoResolucion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


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
@Table(name="detalle_incidencia")
public class DetalleIncidencia {
    
    @Id
    @Column(name="id_detalle_incidencia")
    @GeneratedValue(strategy = SEQUENCE, generator = "ID_SEQ")
    private int idDetalleIncidencia;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "id_detalle_incidencia", referencedColumnName= "id_servicio")
    private int idServicio;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "id_detalle_incidencia", referencedColumnName= "id_incidencia")
    private int idIncidencia;
    @Column(name="detalle_problema")
    private String detalleProblema;
    @Column(name="descripcion_problema")
    private String descripcionProblema;
    @Column(name="resuelto")
    private boolean resuelto;
    
    
    
}

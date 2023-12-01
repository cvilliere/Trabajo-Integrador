
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
@Table(name="cliente_servicio")
public class ClienteServicio {
    
    @Id
    @Column(name="id_cliente_servicio")
    @GeneratedValue(strategy = SEQUENCE, generator = "ID_SEQ")
    private int idClienteServicio;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "id_cliente_servicio", referencedColumnName= "id_cliente")
    private int idCliente;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "id_cliente_servicio", referencedColumnName= "id_servicio")
    private int idServicio;
    
}

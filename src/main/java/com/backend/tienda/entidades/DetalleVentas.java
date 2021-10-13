package com.backend.tienda.entidades;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "detalle_ventas")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder

public class DetalleVentas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo_detalle_venta;

    private int cantidad_producto;

    @ManyToOne(optional = false)
    @JoinColumn(name = "codigo_producto")
    private Productos codigo_producto;

    @ManyToOne(optional = false)
    @JoinColumn(name = "codigo_venta")
    private Ventas codigo_venta;

    private Double valor_total;
    private Double valor_venta;
    private Double valoriva;
}

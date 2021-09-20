package com.backend.tienda.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
    private Double codigo_detalle_venta;

    private int cantidad_producto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_producto")
    private Productos codigo_producto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_venta")
    private Ventas codigo_venta;

    private double valor_total;
    private double valor_venta;
    private double valoriva;
}

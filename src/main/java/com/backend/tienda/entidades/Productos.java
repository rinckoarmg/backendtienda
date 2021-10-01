package com.backend.tienda.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Productos {
    @Id
    private Long codigo_producto;

    private Double ivacompra;

    @ManyToOne(optional = false)
    @JoinColumn(name = "nitproveedor")
    private Proveedores nitproveedor;

    private String nombre_producto;
    private Double precio_compra;
    private Double precio_venta;
}

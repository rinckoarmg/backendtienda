package com.backend.tienda.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "proveedores")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Proveedores {
    @Id
    private Double nitproveedor;

    private String ciudad_proveedor;
    private String direccion_proveedor;
    private String nombre_proveedor;
    private String telefono_proveedor;
}

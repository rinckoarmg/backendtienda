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
@Table(name = "ventas")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Ventas {
    @Id
    private Long codigo_venta;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cedula_cliente")
    private Clientes cedula_cliente;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cedula_usuario")
    private Usuarios cedula_usuario;

    private Long ivaventa;
    private Long total_venta;
    private Long valor_venta;
}

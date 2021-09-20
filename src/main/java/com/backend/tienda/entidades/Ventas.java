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
@Table(name = "ventas")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Ventas {
    @Id
    private Double codigo_venta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cedula_cliente")
    private Clientes cedula_cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cedula_usuario")
    private Usuarios cedula_usuario;

    private Double ivaventa;
    private Double total_venta;
    private Double valor_venta;
}

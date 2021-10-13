package com.backend.tienda.entidades;

import javax.persistence.*;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo_venta;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cedula_cliente")
    private Clientes cedula_cliente;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cedula_usuario")
    private Usuarios cedula_usuario;

    private Double ivaventa;
    private Double total_venta;
    private Double valor_venta;
}

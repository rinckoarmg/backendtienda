package com.backend.tienda.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "clientes")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
@Entity

public class Clientes {
    @Id
    private Long cedula_cliente;

    private String direccion_cliente;
    private String email_cliente;
    private String nombre_cliente;
    private String telefono_cliente;
}

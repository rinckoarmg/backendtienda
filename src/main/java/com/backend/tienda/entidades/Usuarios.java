package com.backend.tienda.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Usuarios {
    @Id
    private Long cedula_usuario;

    private String email_usuario;
    private String nombre_usuario;
    private String password;
    private String usuario;
}

package com.backend.tienda.servicios;

import com.backend.tienda.entidades.Usuarios;

import java.util.List;

public interface UsuariosServicios {
    public Usuarios actualizarUsuarios(Usuarios usuarios);
    public void eliminarUsuarios(Double cedula_usuario);
    public Usuarios guardarUsuarios(Usuarios usuarios);
    public List<Usuarios> listarUsuarios();
    public Usuarios buscarUsuario(Double cedula_usuario);
}

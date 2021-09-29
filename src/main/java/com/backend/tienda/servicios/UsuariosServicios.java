package com.backend.tienda.servicios;

import com.backend.tienda.entidades.Usuarios;
import java.util.List;

public interface UsuariosServicios {
    public Usuarios actualizarUsuarios(Usuarios usuarios);
    public String eliminarUsuarios(Long cedula_usuario);
    public Usuarios guardarUsuarios(Usuarios usuarios);
    public List<Usuarios> listarUsuarios();
    public Usuarios buscarUsuario(Long cedula_usuario);
}

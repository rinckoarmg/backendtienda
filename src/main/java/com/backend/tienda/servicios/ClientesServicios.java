package com.backend.tienda.servicios;

import com.backend.tienda.entidades.Clientes;

import java.util.List;

public interface ClientesServicios {
    public Clientes actualizarClientes(Clientes clientes);
    public void eliminarClientes(Long cedula_cliente);
    public Clientes guardarClientes(Clientes clientes);
    public List<Clientes> listarClientes();
    public Clientes buscarClientes(Long cedula_cliente);
}

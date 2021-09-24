package com.backend.tienda.servicios;

import com.backend.tienda.entidades.Proveedores;

import java.util.List;

public interface ProveedoresServicios {
    public Proveedores actualizarProveedores(Proveedores proveedores);
    public void eliminarProveedores(Long nitproveedor);
    public Proveedores guardarProveedores(Proveedores proveedores);
    public List<Proveedores> listarProveedores();
    public Proveedores buscarProveedor(Long nitproveedor);
}

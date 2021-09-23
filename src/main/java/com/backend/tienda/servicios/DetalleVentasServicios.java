package com.backend.tienda.servicios;

import com.backend.tienda.entidades.DetalleVentas;

import java.util.List;

public interface DetalleVentasServicios {
    public DetalleVentas actualizarDetalleVentas(DetalleVentas detalleVentas);
    public void eliminarDetalleVentas(Double codigo_detalle_venta);
    public DetalleVentas guardarDetalleVentas(DetalleVentas detalleVentas);
    public List<DetalleVentas> listarDetalleVentas();
    public DetalleVentas buscarDetalleVenta(Double codigo_detalle_venta);
}

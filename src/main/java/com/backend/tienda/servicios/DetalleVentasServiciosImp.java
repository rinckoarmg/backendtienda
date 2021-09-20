package com.backend.tienda.servicios;

import com.backend.tienda.entidades.DetalleVentas;
import com.backend.tienda.repository.DetalleVentasRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DetalleVentasServiciosImp implements DetalleVentasServicios {

    @Autowired
    private DetalleVentasRepository detalleVentasRepository;

    @Override
    public DetalleVentas actualizarDetalleVentas(DetalleVentas detalleVentas) {
        DetalleVentas registro = buscarDetalleVenta(detalleVentas.getCodigo_detalle_venta());
        if (registro != null) {
            registro.setCantidad_producto(detalleVentas.getCantidad_producto());
            registro.setCodigo_detalle_venta(detalleVentas.getCodigo_detalle_venta());
            registro.setCodigo_producto(detalleVentas.getCodigo_producto());
            registro.setCodigo_venta(detalleVentas.getCodigo_venta());
            registro.setValor_total(detalleVentas.getValor_total());
            registro.setValor_venta(detalleVentas.getValor_venta());
            registro.setValoriva(detalleVentas.getValoriva());

            return detalleVentasRepository.save(registro);
        } else {
            return null;
        }
    }

    @Override
    public void eliminarDetalleVentas(Double codigo_detalle_venta) {
        detalleVentasRepository.deleteById(codigo_detalle_venta);
    }

    @Override
    public DetalleVentas guardarDetalleVentas(DetalleVentas detalleVentas) {
        DetalleVentas registro = detalleVentasRepository.save(detalleVentas);
        return registro;
    }

    @Override
    public List<DetalleVentas> listarDetalleVentas() {
        return detalleVentasRepository.findAll();
    }

    @Override
    public DetalleVentas buscarDetalleVenta(Double codigo_detalle_venta) {
        return detalleVentasRepository.findById(codigo_detalle_venta).orElse(null);
    }
}

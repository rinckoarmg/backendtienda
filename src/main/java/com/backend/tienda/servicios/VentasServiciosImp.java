package com.backend.tienda.servicios;

import com.backend.tienda.entidades.Ventas;
import com.backend.tienda.repository.VentasRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VentasServiciosImp implements VentasServicios{

    @Autowired
    private VentasRepository ventasRepository;

    @Override
    public Ventas actualizarVentas(Ventas ventas) {
        Ventas venta = buscarVenta(ventas.getCodigo_venta());
        if (venta != null) {
            venta.setCedula_cliente(ventas.getCedula_cliente());
            venta.setCedula_usuario(ventas.getCedula_usuario());
            venta.setCodigo_venta(ventas.getCodigo_venta());
            venta.setIvaventa(ventas.getIvaventa());
            venta.setTotal_venta(ventas.getTotal_venta());
            venta.setValor_venta(ventas.getValor_venta());

            return ventasRepository.save(venta);
        } else {
            return null;
        }
    }

    @Override
    public void eliminarVentas(Double cedula_cliente) {
        ventasRepository.deleteById(cedula_cliente);
    }

    @Override
    public Ventas guardarVentas(Ventas ventas) {
        Ventas venta = ventasRepository.save(ventas);
        return venta;
    }

    @Override
    public List<Ventas> listarVentas() {
        return ventasRepository.findAll();
    }

    @Override
    public Ventas buscarVenta(Double cedula_cliente) {
        ventasRepository.findById(cedula_cliente).orElse(null);
        return null;
    }
}

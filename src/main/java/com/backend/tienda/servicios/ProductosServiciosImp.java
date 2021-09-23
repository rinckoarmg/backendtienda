package com.backend.tienda.servicios;

import com.backend.tienda.entidades.Productos;
import com.backend.tienda.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosServiciosImp implements ProductosServicios{

    @Autowired
    private ProductosRepository productosRepository;

    @Override
    public Productos actualizarProductos(Productos productos) {
        Productos producto = buscarProducto(productos.getCodigo_producto());
        if (producto != null) {
            producto.setCodigo_producto(productos.getCodigo_producto());
            producto.setIvacompra(productos.getIvacompra());
            producto.setNitproveedor(productos.getNitproveedor());
            producto.setNombre_producto(productos.getNombre_producto());
            producto.setPrecio_compra(productos.getPrecio_compra());
            producto.setPrecio_venta(productos.getPrecio_venta());

            return productosRepository.save(producto);

        } else {
            return null;
        }
    }

    @Override
    public void eliminarProductos(Double codigo_producto) {
        productosRepository.deleteById(codigo_producto);
    }

    @Override
    public Productos guardarProductos(Productos productos) {
        Productos producto = productosRepository.save(productos);
        return producto;
    }

    @Override
    public List<Productos> listarProductos() {
        return productosRepository.findAll();
    }

    @Override
    public Productos buscarProducto(Double codigo_producto) {
        return productosRepository.findById(codigo_producto).orElse(null);
    }
}

package com.backend.tienda.servicios;

import com.backend.tienda.entidades.Proveedores;
import com.backend.tienda.repository.ProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedoresServiciosImp implements ProveedoresServicios{

    @Autowired
    private ProveedoresRepository proveedoresRepository;

    @Override
    public Proveedores actualizarProveedores(Proveedores proveedores) {
        Proveedores proveedor = buscarProveedor(proveedores.getNitproveedor());
        if (proveedor != null) {
            proveedor.setCiudad_proveedor(proveedores.getCiudad_proveedor());
            proveedor.setDireccion_proveedor(proveedores.getDireccion_proveedor());
            proveedor.setNitproveedor(proveedores.getNitproveedor());
            proveedor.setNombre_proveedor(proveedores.getNombre_proveedor());
            proveedor.setTelefono_proveedor(proveedores.getTelefono_proveedor());

            return proveedoresRepository.save(proveedor);
        } else {
            return null;
        }
    }

    @Override
    public void eliminarProveedores(Long nitproveedor) {
        proveedoresRepository.deleteById(nitproveedor);
    }

    @Override
    public Proveedores guardarProveedores(Proveedores proveedores) {
        Proveedores proveedor = proveedoresRepository.save(proveedores);
        return proveedor;
    }

    @Override
    public List<Proveedores> listarProveedores() {
        return proveedoresRepository.findAll();
    }

    @Override
    public Proveedores buscarProveedor(Long nitproveedor) {
        return proveedoresRepository.findById(nitproveedor).orElse(null);
    }
}

package com.backend.tienda.servicios;

import com.backend.tienda.entidades.Clientes;
import com.backend.tienda.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesServiciosImp implements ClientesServicios {

    @Autowired
    private ClientesRepository clientesRepository;

    @Override
    public Clientes actualizarClientes(Clientes clientes) {
        Clientes clienteDB = buscarClientes(clientes.getCedula_cliente());
        if (clienteDB != null) {
            clienteDB.setCedula_cliente(clientes.getCedula_cliente());
            clienteDB.setDireccion_cliente(clientes.getDireccion_cliente());
            clienteDB.setEmail_cliente(clientes.getEmail_cliente());
            clienteDB.setNombre_cliente(clientes.getNombre_cliente());
            clienteDB.setTelefono_cliente(clientes.getTelefono_cliente());

            return clientesRepository.save(clienteDB);
        } else {
            return null;
        }
    }

    @Override
    public void eliminarClientes(Long cedula_cliente) {
        clientesRepository.deleteById(cedula_cliente);
    }

    @Override
    public Clientes guardarClientes(Clientes clientes) {
        Clientes registro = clientesRepository.save(clientes);
        return registro;
    }

    @Override
    public List<Clientes> listarClientes() {
        return clientesRepository.findAll();
    }

    @Override
    public Clientes buscarClientes(Long cedula_cliente) {
        return clientesRepository.findById(cedula_cliente).orElse(null);
    }
}

package com.backend.tienda.repository;

import com.backend.tienda.entidades.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Double> {
}

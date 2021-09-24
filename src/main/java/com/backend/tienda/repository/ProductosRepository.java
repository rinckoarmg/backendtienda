package com.backend.tienda.repository;

import com.backend.tienda.entidades.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Productos, Long> {
}

package com.backend.tienda.repository;

import com.backend.tienda.entidades.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentasRepository extends JpaRepository<Ventas, Long> {
}

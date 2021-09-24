package com.backend.tienda.repository;

import com.backend.tienda.entidades.DetalleVentas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleVentasRepository extends JpaRepository<DetalleVentas, Long> {
}

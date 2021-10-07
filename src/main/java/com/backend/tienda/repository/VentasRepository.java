package com.backend.tienda.repository;


import com.backend.tienda.entidades.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VentasRepository extends JpaRepository<Ventas, Long> {
    @Query(value = "SELECT * FROM ventas WHERE cedula_cliente=?",nativeQuery = true)
    Ventas findByClient(String cedula_cliente);
}

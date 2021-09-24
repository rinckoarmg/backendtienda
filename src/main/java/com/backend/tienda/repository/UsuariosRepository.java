package com.backend.tienda.repository;

import com.backend.tienda.entidades.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
}

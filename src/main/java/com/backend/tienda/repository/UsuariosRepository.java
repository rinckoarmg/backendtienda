package com.backend.tienda.repository;

import com.backend.tienda.entidades.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
    @Query(value = "SELECT * FROM usuarios WHERE usuario=? AND password=?", nativeQuery = true)
    Usuarios findByUserPassword(String usuario,String password);
}

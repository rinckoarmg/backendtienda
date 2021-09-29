package com.backend.tienda.controladores;

import com.backend.tienda.entidades.Usuarios;
import com.backend.tienda.servicios.UsuariosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://127.0.0.1:5500")
@RestController
@RequestMapping("/usuarios")
public class UsuariosControlador {

    @Autowired
    private UsuariosServicios usuariosServicios;

    @GetMapping("/listar")
    public ResponseEntity<List<Usuarios>> listaUsuarios(){
        List<Usuarios> usuarios = usuariosServicios.listarUsuarios();
        if (usuarios.isEmpty()){
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(usuarios);
        }
    }

    @GetMapping("/buscar/{cedula_usuario}")
    public ResponseEntity<Usuarios> buscarUsuario(@PathVariable("cedula_usuario") long cedula_usuario){
        Usuarios usuarios = usuariosServicios.buscarUsuario(cedula_usuario);
        if (usuarios == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(usuarios);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<Usuarios> guardarUsuario(@RequestBody Usuarios usuarios){
        Usuarios nuevo_usuario = usuariosServicios.guardarUsuarios(usuarios);
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevo_usuario);
    }

    @PutMapping("/actualizar/{cedula_usuario}")
    public ResponseEntity<Usuarios> actualizarUsuarios(@PathVariable("cedula_usuario") Long cedula_usuario, @RequestBody Usuarios usuarios){
        usuarios.setCedula_usuario(cedula_usuario);
        Usuarios usuarioBD = usuariosServicios.actualizarUsuarios(usuarios);
        if (usuarioBD == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(usuarioBD);
        }
    }

    @DeleteMapping("/eliminar/{cedula_usuario}")
    public ResponseEntity<String> eliminarUsuario (@PathVariable("cedula_usuario") Long cedula_usuario){
        String eliminado = usuariosServicios.eliminarUsuarios(cedula_usuario);
        if (eliminado != null){
            return ResponseEntity.status(HttpStatus.OK).body("eliminado");
        } else {
            return ResponseEntity.status((HttpStatus.BAD_REQUEST)).body("No se pudo eliminar");
        }

    }
}

package com.backend.tienda.controladores;


import com.backend.tienda.entidades.DetalleVentas;
import com.backend.tienda.servicios.DetalleVentasServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/detalle_ventas")
public class DetalleVentasControlador {

    @Autowired
    private DetalleVentasServicios detalleVentasServicios;

    @GetMapping("/listar")
    public ResponseEntity<List<DetalleVentas>> listaDetalleVentas(){
        List<DetalleVentas> ventas =detalleVentasServicios.listarDetalleVentas();
        if (ventas.isEmpty()){
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(ventas);
        }
    }

    @GetMapping("/buscar/{codigo_detalle_venta}")
    public ResponseEntity<DetalleVentas> buscarDetalleVenta(@PathVariable("codigo_detalle_venta") Long codigo_detalle_venta){
        DetalleVentas detalle = detalleVentasServicios.buscarDetalleVenta(codigo_detalle_venta);
        if (detalle == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(detalle);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<DetalleVentas> guardarDetalleVentas(@RequestBody DetalleVentas detalleVentas){
        DetalleVentas nuevaVenta =detalleVentasServicios.guardarDetalleVentas(detalleVentas);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaVenta);
    }

    @PutMapping("/actualizar/{codigo_detalle_venta}")
    public ResponseEntity<DetalleVentas> actualizarDetalleVentas(@PathVariable("codigo_detalle_venta") Long codigo_detalle_venta, @RequestBody DetalleVentas detalleVentas){
        detalleVentas.setCodigo_detalle_venta(codigo_detalle_venta);
        DetalleVentas detalleVentasDB = detalleVentasServicios.actualizarDetalleVentas(detalleVentas);
        if (detalleVentasDB == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(detalleVentasDB);
        }
    }

    @DeleteMapping("/eliminar/{codigo_detalle_venta}")
    public void eliminarDetalleVentas (@PathVariable ("codigo_detalle_venta") Long codigo_detalle_venta){
        detalleVentasServicios.eliminarDetalleVentas(codigo_detalle_venta);
    }
}

package com.dh.cuenta.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CajaController {

    /*@Value("${denominaciones_billete}")
    private Integer[] denominacionesBilletes;*/

    @Value("${cantidad_maxima_efectivo:}")
    private Integer cantidadMaximaEfectivo;

    @GetMapping("/info")
    public ResponseEntity<String> mostrarInfo() {
        return ResponseEntity.ok("Cantidad máxima: " + cantidadMaximaEfectivo);
    }
}
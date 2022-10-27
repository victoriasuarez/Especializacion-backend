package com.dh.weatherservice.controller;

import com.dh.weatherservice.service.ClimaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class ClimaController {

    private final ClimaService climaService;

    public ClimaController(ClimaService climaService) {
        this.climaService = climaService;
    }

    @GetMapping("/weather")
    public ResponseEntity<String> getTemperatura(@PathParam("city") String city, @PathParam("country") String country){
        return ResponseEntity.ok(climaService.calcularClima(city,country));
    }

}

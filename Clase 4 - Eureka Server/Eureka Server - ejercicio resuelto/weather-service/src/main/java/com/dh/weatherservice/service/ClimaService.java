package com.dh.weatherservice.service;

import org.springframework.stereotype.Service;

@Service
public class ClimaService {

    public String calcularClima(String ciudad,String pais){
        return "25 ºC";
    }

}

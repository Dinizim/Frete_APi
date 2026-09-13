package com.nicollas.frete_api.service;

import org.springframework.stereotype.Service;

import com.nicollas.frete_api.dto.TipoFrete;

@Service
public class FreteExpresso implements FreteCalculadora {

    @Override
    public TipoFrete getTipo() {
        return TipoFrete.EXPRESSO;
    }

    @Override
    public double calcular(double peso) {
        double valor = peso * 15.00;
        return Math.round(valor * 100.0) / 100.0;
    }

    @Override
    public int calcularPrazo() {
        return 1;
    }
}
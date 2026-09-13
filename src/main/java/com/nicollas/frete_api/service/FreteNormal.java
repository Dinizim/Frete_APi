package com.nicollas.frete_api.service;

import org.springframework.stereotype.Service;

import com.nicollas.frete_api.dto.TipoFrete;

@Service
public class FreteNormal implements FreteCalculadora {

    @Override
    public TipoFrete getTipo() {
        return TipoFrete.NORMAL;
    }

    @Override
    public double calcular(double peso) {

        double valor = peso * 9.96;

        return Math.round(valor * 100.0) / 100.0;
    }
    @Override
public int calcularPrazo() {
    return 3;
}
}
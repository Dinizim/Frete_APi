package com.nicollas.frete_api.service;

import com.nicollas.frete_api.dto.TipoFrete;

public interface FreteCalculadora {

    TipoFrete getTipo();

    double calcular(double peso);

    int calcularPrazo();
}
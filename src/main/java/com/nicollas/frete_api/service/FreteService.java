package com.nicollas.frete_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nicollas.frete_api.dto.TipoFrete;

@Service
public class FreteService {

    private final List<FreteCalculadora> calculadoras;

    public FreteService(List<FreteCalculadora> calculadoras) {
        this.calculadoras = calculadoras;
    }

    public double calcularValor(double peso, TipoFrete tipo) {

        FreteCalculadora calculadora = calculadoras.stream()
                .filter(c -> c.getTipo() == tipo)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(
                        "Tipo de frete não encontrado"
                ));

        return calculadora.calcular(peso);
    }

    public int calcularPrazo(TipoFrete tipo) {

    FreteCalculadora calculadora = calculadoras.stream()
            .filter(c -> c.getTipo() == tipo)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(
                    "Tipo de frete não encontrado"
            ));

    return calculadora.calcularPrazo();
}
}
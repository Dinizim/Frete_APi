package com.nicollas.frete_api.dto;

public record FreteResponse(
        String origem,
        String destino,
        double peso,
        double valor,
        int prazoDias
) {
}
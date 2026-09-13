package com.nicollas.frete_api.dto;

import com.nicollas.frete_api.validation.ValidCep;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record FreteRequest(
        @NotBlank
        @ValidCep
        String cepOrigem,

        @NotBlank
        @ValidCep
        String cepDestino,

        @Positive
        double peso,

        TipoFrete tipo
) {
}
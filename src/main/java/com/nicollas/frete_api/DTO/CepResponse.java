package com.nicollas.frete_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CepResponse(
        String cep,
        String logradouro,
        String bairro,
        String localidade,
        String uf,
        @JsonProperty("erro")
        Boolean erro
) {
    
    public CepResponse(String cep, String logradouro, String bairro, String localidade, String uf) {
        this(cep, logradouro, bairro, localidade, uf, null);
    }
}
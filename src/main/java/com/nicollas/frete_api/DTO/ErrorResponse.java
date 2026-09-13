package com.nicollas.frete_api.dto;

import java.util.List;

public record ErrorResponse(
    int status,
    String mensagem,
    List<String> erros
) {
    
    public ErrorResponse(int status, String mensagem, List<String> erros) {
        this.status = status;
        this.mensagem = mensagem;
        this.erros = erros;
    }
    
    public ErrorResponse(int status, String mensagem) {
        this(status, mensagem, List.of());
    }
}

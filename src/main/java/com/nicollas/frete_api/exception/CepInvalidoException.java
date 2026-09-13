package com.nicollas.frete_api.exception;

public class CepInvalidoException extends RuntimeException {
    
    public CepInvalidoException(String mensagem) {
        super(mensagem);
    }
    
    public CepInvalidoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}

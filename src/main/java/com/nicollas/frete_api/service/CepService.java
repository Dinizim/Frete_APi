package com.nicollas.frete_api.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.HttpClientErrorException;

import com.nicollas.frete_api.dto.CepResponse;
import com.nicollas.frete_api.exception.CepInvalidoException;

@Service
public class CepService {

    private final RestClient restClient;

    public CepService() {
        this.restClient = RestClient.create("https://viacep.com.br");
    }

    public CepResponse buscarCep(String cep) {
        try {
            CepResponse response = restClient
                    .get()
                    .uri("/ws/{cep}/json/", cep)
                    .retrieve()
                    .body(CepResponse.class);
            
            if (response == null || (response.erro() != null && response.erro())) {
                throw new CepInvalidoException("CEP " + cep + " não encontrado ou inválido");
            }
            
            return response;
        } catch (HttpClientErrorException e) {
            throw new CepInvalidoException("Erro ao consultar CEP " + cep + ": serviço ViaCEP indisponível", e);
        } catch (Exception e) {
            if (e instanceof CepInvalidoException) {
                throw e;
            }
            throw new CepInvalidoException("Erro ao buscar CEP " + cep + ": " + e.getMessage(), e);
        }
    }
}
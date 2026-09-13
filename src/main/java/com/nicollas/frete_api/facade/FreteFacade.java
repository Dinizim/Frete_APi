package com.nicollas.frete_api.facade;

import org.springframework.stereotype.Service;

import com.nicollas.frete_api.dto.CepResponse;
import com.nicollas.frete_api.dto.FreteRequest;
import com.nicollas.frete_api.dto.FreteResponse;
import com.nicollas.frete_api.service.CepService;
import com.nicollas.frete_api.service.FreteService;
@Service
public class FreteFacade {

    private final FreteService freteService;
    private final CepService cepService;

    public FreteFacade(FreteService freteService, CepService cepService) {
        this.freteService = freteService;
        this.cepService = cepService;
    }

    public FreteResponse calcular(FreteRequest request) {

    CepResponse origem = cepService.buscarCep(request.cepOrigem());
    CepResponse destino = cepService.buscarCep(request.cepDestino());

    double valor = freteService.calcularValor(
        request.peso(),
        request.tipo()
);

    int prazoDias = freteService.calcularPrazo(request.tipo());

    return new FreteResponse(
            origem.localidade() + " - " + origem.uf(),
            destino.localidade() + " - " + destino.uf(),
            request.peso(),
            valor,
            prazoDias
    );
}
}
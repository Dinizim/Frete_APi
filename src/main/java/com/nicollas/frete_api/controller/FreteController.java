package com.nicollas.frete_api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicollas.frete_api.dto.FreteRequest;
import com.nicollas.frete_api.dto.FreteResponse;
import com.nicollas.frete_api.facade.FreteFacade;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/fretes")
public class FreteController {

    private final FreteFacade freteFacade;

    public FreteController(FreteFacade freteFacade) {
        this.freteFacade = freteFacade;
    }

    @PostMapping
    public FreteResponse calcularFrete(@Valid @RequestBody FreteRequest request) {
        return freteFacade.calcular(request);
    }
}
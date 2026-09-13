package com.nicollas.frete_api.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CepValidator implements ConstraintValidator<ValidCep, String> {

    @Override
    public boolean isValid(String cep, ConstraintValidatorContext context) {

        if (cep == null) {
            return true;
        }

        String cepLimpo = cep.replace("-", "");

        return cepLimpo.matches("\\d{8}");
    }
}
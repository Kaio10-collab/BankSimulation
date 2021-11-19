package com.SimulacaoBancaria.simulacaoBancaria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CpfRegistredException extends RuntimeException {
    public CpfRegistredException(String message) {
        super(message) ;
    }
}
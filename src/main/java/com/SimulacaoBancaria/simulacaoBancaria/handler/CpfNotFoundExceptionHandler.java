package com.SimulacaoBancaria.simulacaoBancaria.handler;

import com.SimulacaoBancaria.simulacaoBancaria.exception.CpfNotFoundException;
import com.SimulacaoBancaria.simulacaoBancaria.exception.CpfNotFoundExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CpfNotFoundExceptionHandler {

    @ExceptionHandler(CpfNotFoundException.class)
    public ResponseEntity<?> handlerNotFoundCpfException (CpfNotFoundException cpfNotFoundException) {
        CpfNotFoundExceptionDetails exceptionDetails = CpfNotFoundExceptionDetails.CpfNotFoundExceptionDetailsBuilder.newBuilder().
                title(" Not found. ").
                details(cpfNotFoundException.getMessage()).
                build() ;
        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND) ;
    }
}
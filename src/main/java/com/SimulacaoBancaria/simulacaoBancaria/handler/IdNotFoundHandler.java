package com.SimulacaoBancaria.simulacaoBancaria.handler;

import com.SimulacaoBancaria.simulacaoBancaria.exception.IdNotFoundException;
import com.SimulacaoBancaria.simulacaoBancaria.exception.IdNotFoundExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class IdNotFoundHandler {

    @ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<?> handlerNotFoundIdException(IdNotFoundException idNotFoundException) {
        IdNotFoundExceptionDetails exceptionDetails = IdNotFoundExceptionDetails.IdNotFoundExceptionDetailsBuilder.newBuilder().
                title(" Not found. ").
                details(idNotFoundException.getMessage()).
                build() ;
        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND) ;
    }
}
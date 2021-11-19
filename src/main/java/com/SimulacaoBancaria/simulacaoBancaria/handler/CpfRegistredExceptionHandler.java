package com.SimulacaoBancaria.simulacaoBancaria.handler;

import com.SimulacaoBancaria.simulacaoBancaria.exception.CpfRegistredException;
import com.SimulacaoBancaria.simulacaoBancaria.exception.CpfRegistredExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CpfRegistredExceptionHandler {

    @ExceptionHandler(CpfRegistredException.class)
    public ResponseEntity<?> handlerRegistredCpfException (CpfRegistredException cpfRegistredException) {
        CpfRegistredExceptionDetails exceptionDetails = CpfRegistredExceptionDetails.cpfRegistredExceptionDetailsBuilder.newBuilder().
                title(" Registred. ").
                details(cpfRegistredException.getMessage()).
                build();
        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);
    }
}

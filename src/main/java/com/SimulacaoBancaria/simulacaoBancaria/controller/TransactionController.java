package com.SimulacaoBancaria.simulacaoBancaria.controller;

import com.SimulacaoBancaria.simulacaoBancaria.model.Transaction;
import com.SimulacaoBancaria.simulacaoBancaria.request.TransactionRequest;
import com.SimulacaoBancaria.simulacaoBancaria.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/performWithdrawalMoney")
    public ResponseEntity<Transaction> withdrawMoney(@RequestBody @Valid TransactionRequest transactionRequest){
        Transaction transaction = transactionService.performWithdrawalMoney(transactionRequest);
        return new ResponseEntity<>(transaction, HttpStatus.CREATED);
    }
}
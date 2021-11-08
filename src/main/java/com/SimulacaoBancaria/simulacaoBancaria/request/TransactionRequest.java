package com.SimulacaoBancaria.simulacaoBancaria.request;

import com.SimulacaoBancaria.simulacaoBancaria.model.Client;
import com.SimulacaoBancaria.simulacaoBancaria.model.Transaction;
import com.SimulacaoBancaria.simulacaoBancaria.utils.TypeTransactionEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class TransactionRequest {

    @NotBlank
    private Double amountTransaction;

    @NotBlank
    private Client originClient;

    @NotBlank
    private Client destinyClient;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @NotBlank
    private LocalDate dateTransaction;

    @NotBlank
    private TypeTransactionEnum typeTransaction;

    public TransactionRequest() {
    }

    public TransactionRequest(Double amountTransaction, Client originClient, Client destinyClient, LocalDate dateTransaction, TypeTransactionEnum typeTransaction) {
        this.amountTransaction = amountTransaction;
        this.originClient = originClient;
        this.destinyClient = destinyClient;
        this.dateTransaction = dateTransaction;
        this.typeTransaction = typeTransaction;
    }

    public Double getAmountTransaction() {
        return amountTransaction;
    }

    public void setAmountTransaction(Double amountTransaction) {
        this.amountTransaction = amountTransaction;
    }

    public Client getOriginClient() {
        return originClient;
    }

    public void setOriginClient(Client originClient) {
        this.originClient = originClient;
    }

    public Client getDestinyClient() {
        return destinyClient;
    }

    public void setDestinyClient(Client destinyClient) {
        this.destinyClient = destinyClient;
    }

    public LocalDate getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(LocalDate dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public TypeTransactionEnum getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(TypeTransactionEnum typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public Transaction requestObjectTransaction (){
        Transaction transaction = new Transaction();
        transaction.setAmountTransaction(this.amountTransaction);
        transaction.setOriginClient(this.originClient);
        transaction.setDestinyClient(this.destinyClient);
        transaction.setDateTransaction(this.dateTransaction);
        transaction.setTypeTransaction(this.typeTransaction);
        transaction.setCreatedAt(LocalDate.now());
        return transaction;
    }

}
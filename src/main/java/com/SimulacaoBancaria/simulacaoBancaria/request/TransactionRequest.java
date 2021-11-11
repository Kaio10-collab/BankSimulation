package com.SimulacaoBancaria.simulacaoBancaria.request;

import com.SimulacaoBancaria.simulacaoBancaria.model.Client;
import com.SimulacaoBancaria.simulacaoBancaria.utils.TypeTransactionEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class TransactionRequest {

    @NotBlank(message = "{validation.field_required}")
    private Double amountTransaction;

    @NotBlank(message = "{validation.field_required}")
    private Client originClient;

    @NotBlank(message = "{validation.field_required}")
    private Client destinyClient;

    @NotNull(message = "{validation.field_required}")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateTransaction;

    @Enumerated(EnumType.STRING)
    @NotBlank(message = "{validation.field_required}")
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

}
package com.SimulacaoBancaria.simulacaoBancaria.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @Column(name = "amount_transaction", nullable = false)
    private Double amountTransaction;

    @Column(name = "origin_client", nullable = false)
    private Client originClient;

    @Column(name = "destiny_client", nullable = false)
    private Client destinyClient;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @Column(name = "date_transaction", nullable = false)
    private LocalDate dateTransaction;

    @Column(name = "type_transaction", nullable = false)
    private String typeTransaction;

    @Column(name = "created_at", nullable = false)
    private LocalDate createdAt;

    public Transaction() {
    }

    public Transaction(Double amountTransaction, Client originClient, Client destinyClient, LocalDate dateTransaction, String typeTransaction, LocalDate createdAt) {
        this.amountTransaction = amountTransaction;
        this.originClient = originClient;
        this.destinyClient = destinyClient;
        this.dateTransaction = dateTransaction;
        this.typeTransaction = typeTransaction;
        this.createdAt = createdAt;
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

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
package com.SimulacaoBancaria.simulacaoBancaria.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @Column(name = "amountTransaction", nullable = false)
    private Double amountTransaction;

    @Column(name = "originClient", nullable = false)
    private Client originClient;

    @Column(name = "destinyClient", nullable = false)
    private Client destinyClient;

    @Column(name = "dateTransaction", nullable = false)
    private LocalDate dateTransaction;

    @Column(name = "typeTransaction", nullable = false)
    private String typeTransaction;

    public Transaction() {
    }

    public Transaction(Double amountTransaction, Client originClient, Client destinyClient, LocalDate dateTransaction, String typeTransaction) {
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

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }
}
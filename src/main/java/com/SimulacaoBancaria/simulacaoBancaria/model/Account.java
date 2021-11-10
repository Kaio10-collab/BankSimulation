package com.SimulacaoBancaria.simulacaoBancaria.model;

import com.SimulacaoBancaria.simulacaoBancaria.utils.TypeAccountEnum;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "number_account", nullable = false)
    private Long numberAccount;

    @Column(name = "balance", nullable = false)
    private Double balance;

    @Column(name = "type_account", nullable = false)
    @Enumerated(EnumType.STRING)
    private TypeAccountEnum typeAccount;

    @Column(name = "created_at", nullable = false)
    private LocalDate createdAt;

    //TODO FK
    @JoinColumn(name = "cpf", foreignKey = @ForeignKey)
    private Client client;

    public Account() {
    }

    public Account(Long numberAccount, Double balance, TypeAccountEnum typeAccount, LocalDate createdAt, Client client) {
        this.numberAccount = numberAccount;
        this.balance = balance;
        this.typeAccount = typeAccount;
        this.createdAt = createdAt;
        this.client = client;
    }

    public Long getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(Long numberAccount) {
        this.numberAccount = numberAccount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public TypeAccountEnum getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(TypeAccountEnum typeAccount) {
        this.typeAccount = typeAccount;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
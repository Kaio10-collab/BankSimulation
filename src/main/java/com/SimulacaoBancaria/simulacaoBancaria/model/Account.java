package com.SimulacaoBancaria.simulacaoBancaria.model;

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

    @Column(name = "created_at", nullable = false)
    private LocalDate createdAt;

    public Account() {
    }

    public Account(Long numberAccount, Double balance, LocalDate createdAt) {
        this.numberAccount = numberAccount;
        this.balance = balance;
        this.createdAt = createdAt;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
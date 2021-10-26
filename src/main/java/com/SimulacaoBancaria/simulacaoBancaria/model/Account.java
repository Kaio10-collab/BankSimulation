package com.SimulacaoBancaria.simulacaoBancaria.model;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "numberAccount", nullable = false)
    private Long numberAccount;

    @Column(name = "balance", nullable = false)
    private Double balance;

    public Account() {
    }

    public Account(Long numberAccount, Double balance) {
        this.numberAccount = numberAccount;
        this.balance = balance;
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
}
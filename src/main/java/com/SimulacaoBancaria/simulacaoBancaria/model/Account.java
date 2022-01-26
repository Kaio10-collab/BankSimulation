package com.SimulacaoBancaria.simulacaoBancaria.model;

import com.SimulacaoBancaria.simulacaoBancaria.utils.AccountTypeEnum;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "accountNumber", length = 50, nullable = false)
    private Long accountNumber;

    @Column(name = "type_account", length = 50, nullable = false)
    @Enumerated(EnumType.STRING)
    private AccountTypeEnum type_account;

    @JoinColumn(name = "cpf", foreignKey = @ForeignKey)
    private Client client;

    @Column(name = "created_at")
    private LocalDate createdAt;

    public Account() {
    }

    public Account(Long id, Long accountNumber, AccountTypeEnum type_account, Client client, LocalDate createdAt) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.type_account = type_account;
        this.client = client;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountTypeEnum getType_account() {
        return type_account;
    }

    public void setType_account(AccountTypeEnum type_account) {
        this.type_account = type_account;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
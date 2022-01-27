package com.SimulacaoBancaria.simulacaoBancaria.response;

import com.SimulacaoBancaria.simulacaoBancaria.model.Client;
import com.SimulacaoBancaria.simulacaoBancaria.utils.AccountTypeEnum;

public class AccountResponse {

    private Long id;
    private AccountTypeEnum type_account;
    private Long balanceMoney;
    private Client client;

    public AccountResponse() {
    }

    public AccountResponse(Long id, AccountTypeEnum type_account, Long balanceMoney, Client client) {
        this.id = id;
        this.type_account = type_account;
        this.balanceMoney = balanceMoney;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getBalanceMoney() {
        return balanceMoney;
    }

    public void setBalanceMoney(Long balanceMoney) {
        this.balanceMoney = balanceMoney;
    }
}
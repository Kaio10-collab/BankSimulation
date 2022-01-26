package com.SimulacaoBancaria.simulacaoBancaria.response;

import com.SimulacaoBancaria.simulacaoBancaria.model.Client;
import com.SimulacaoBancaria.simulacaoBancaria.utils.AccountTypeEnum;

public class AccountResponse {

    private Long id;
    private AccountTypeEnum type_account;
    private Client cpf;

    public AccountResponse(Long id, AccountTypeEnum type_account, Client cpf) {
        this.id = id;
        this.type_account = type_account;
        this.cpf = cpf;
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

    public Client getCpf() {
        return cpf;
    }

    public void setCpf(Client cpf) {
        this.cpf = cpf;
    }
}
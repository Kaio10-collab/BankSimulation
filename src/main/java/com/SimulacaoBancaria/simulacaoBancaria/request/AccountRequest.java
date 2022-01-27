package com.SimulacaoBancaria.simulacaoBancaria.request;

import com.SimulacaoBancaria.simulacaoBancaria.model.Account;
import com.SimulacaoBancaria.simulacaoBancaria.utils.AccountTypeEnum;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class AccountRequest {

    @NotNull(message = "{validation.field_required}")
    private Long accountNumber;

    @NotNull(message = "{validation.field_required}")
    @Enumerated(EnumType.STRING)
    private AccountTypeEnum type_account;

    @NotNull(message = "{validation.field_required}")
    private Long balanceMoney;

    @NotNull(message = "{validation.field_required}")
    private Long amount;

    public AccountRequest() {
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

    public Long getBalanceMoney() {
        return balanceMoney;
    }

    public void setBalanceMoney(Long balanceMoney) {
        this.balanceMoney = balanceMoney;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Account requestObjectAccount() {
        Account account = new Account();
        account.setAccountNumber(this.accountNumber);
        account.setType_account(this.type_account);
        account.setClient(this.requestObjectAccount().getClient());
        account.setBalanceMoney(this.balanceMoney);
        account.setAmount(this.amount);
        account.setCreatedAt(LocalDate.now());
        return account;
    }
}
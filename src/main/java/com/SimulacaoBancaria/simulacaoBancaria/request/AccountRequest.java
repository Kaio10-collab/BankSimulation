package com.SimulacaoBancaria.simulacaoBancaria.request;

import com.SimulacaoBancaria.simulacaoBancaria.model.Account;
import com.SimulacaoBancaria.simulacaoBancaria.utils.TypeAccountEnum;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class AccountRequest {

    @NotBlank(message = "{validation.field_required}")
    private Long numberAccount;

    @NotBlank(message = "{validation.field_required}")
    private Double balance;

    @Enumerated(EnumType.STRING)
    @NotBlank(message = "{validation.field_required}")
    private TypeAccountEnum typeAccount;

    public AccountRequest() {
    }

    public AccountRequest(Long numberAccount, Double balance, TypeAccountEnum typeAccount) {
        this.numberAccount = numberAccount;
        this.balance = balance;
        this.typeAccount = typeAccount;
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

    public Account requestObjectAccount(){
        Account account = new Account();
        account.setNumberAccount(this.numberAccount);
        account.setBalance(this.balance);
        account.setTypeAccount(this.typeAccount);
        account.setCreatedAt(LocalDate.now());
        return account;
    }
}
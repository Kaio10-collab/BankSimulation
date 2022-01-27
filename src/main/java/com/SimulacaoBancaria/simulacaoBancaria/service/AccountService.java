package com.SimulacaoBancaria.simulacaoBancaria.service;

import com.SimulacaoBancaria.simulacaoBancaria.model.Account;
import com.SimulacaoBancaria.simulacaoBancaria.repository.AccountRepository;
import com.SimulacaoBancaria.simulacaoBancaria.request.AccountRequest;
import com.SimulacaoBancaria.simulacaoBancaria.response.AccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account depositMoney(AccountRequest accountRequest) {

        Account account = accountRepository.getById(accountRequest.getBalanceMoney());

        Long balance = account.getAmount();
        balance+= accountRequest.getBalanceMoney();
        account.setAmount(balance);
        return accountRepository.save(account);
    }
}
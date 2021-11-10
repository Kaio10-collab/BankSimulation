package com.SimulacaoBancaria.simulacaoBancaria.service;

import com.SimulacaoBancaria.simulacaoBancaria.model.Account;
import com.SimulacaoBancaria.simulacaoBancaria.repository.AccountRepository;
import com.SimulacaoBancaria.simulacaoBancaria.request.AccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account registerAccount(AccountRequest accountRequest){

        Account account = accountRequest.requestObjectAccount();

        if(accountRepository.existsById(accountRequest.getNumberAccount())){
            throw new RuntimeException("Account not found");
        }
        return accountRepository.save(account);
    }

}

package com.SimulacaoBancaria.simulacaoBancaria.service;

import com.SimulacaoBancaria.simulacaoBancaria.model.Account;
import com.SimulacaoBancaria.simulacaoBancaria.repository.ClientRepository;
import com.SimulacaoBancaria.simulacaoBancaria.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final ClientRepository clientRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository, ClientRepository clientRepository) {
        this.accountRepository = accountRepository;
        this.clientRepository = clientRepository;
    }

    public Account performWithdrawalMoney(Long account){

        Optional<Account> optionalAccount = clientRepository.existsByAccount(account);

        //Todo: Optional<Client> client = repository.findByAccountId(accountId);
        if (optionalAccount.isEmpty()) {
            throw new RuntimeException("Account not found");
        }
        return optionalAccount.get();
    }


}

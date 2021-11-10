package com.SimulacaoBancaria.simulacaoBancaria.service;

import com.SimulacaoBancaria.simulacaoBancaria.model.Account;
import com.SimulacaoBancaria.simulacaoBancaria.request.TransactionRequest;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class TransactionService {

    //public Account performWithdrawalMoney(Account account, TransactionRequest transactionRequest){
        //TODO método optional

        //Optional<Account> optionalAccount = accountRepository.findByAccount(account.getNumberAccount());
        //Account balanceWithdraw = optionalAccount.get();
        //TransactionRequest amount = new TransactionRequest();
        //Double balanceUpdated = amount.getAmountTransaction() - balanceWithdraw.getBalance();

        //if (optionalAccount.isEmpty()) {
        //    throw new RuntimeException("Account not found");
        //}
        //return optionalAccount.get(account.getBalance(balanceUpdated));
    //}
}

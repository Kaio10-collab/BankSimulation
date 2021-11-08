package com.SimulacaoBancaria.simulacaoBancaria.service;

import com.SimulacaoBancaria.simulacaoBancaria.model.Transaction;
import com.SimulacaoBancaria.simulacaoBancaria.repository.ClientRepository;
import com.SimulacaoBancaria.simulacaoBancaria.repository.TransactionRepository;
import com.SimulacaoBancaria.simulacaoBancaria.request.TransactionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    private final ClientRepository clientRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository, ClientRepository clientRepository) {
        this.transactionRepository = transactionRepository;
        this.clientRepository = clientRepository;
    }

    public Transaction performWithdrawalMoney(TransactionRequest transactionRequest){

        Transaction transaction = transactionRequest.requestObjectTransaction();

        //Todo: Optional<Client> client = repository.findByAccountId(accountId);
        if (clientRepository.existsByAccount(transactionRequest.getAmountTransaction())){
            throw new RuntimeException("Account not found");
        }
        return transactionRepository.save(transaction);
    }


}

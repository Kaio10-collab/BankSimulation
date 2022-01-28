package com.SimulacaoBancaria.simulacaoBancaria.repository;

import com.SimulacaoBancaria.simulacaoBancaria.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Boolean existsByAccount(Long accountNumber);

}
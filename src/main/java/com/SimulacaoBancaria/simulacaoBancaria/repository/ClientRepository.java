package com.SimulacaoBancaria.simulacaoBancaria.repository;

import com.SimulacaoBancaria.simulacaoBancaria.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Boolean existsByCpf(String cpf) ;

    Optional<Client> findByCpf(String cpf);
}
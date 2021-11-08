package com.SimulacaoBancaria.simulacaoBancaria.repository;

import com.SimulacaoBancaria.simulacaoBancaria.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    //Todo: estudar como montar consulta em jpa JPA e validar nomeclatura
    //Todo: criar relacionamento com as classes andress e account
    Boolean existsByCpf(String cpf);
    Boolean existsByAccount(Double account);

}
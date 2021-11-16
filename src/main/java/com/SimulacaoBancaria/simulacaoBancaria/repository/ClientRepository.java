package com.SimulacaoBancaria.simulacaoBancaria.repository;

import com.SimulacaoBancaria.simulacaoBancaria.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {

}
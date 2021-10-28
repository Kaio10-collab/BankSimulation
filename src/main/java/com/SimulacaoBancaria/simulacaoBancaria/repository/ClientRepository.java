package com.SimulacaoBancaria.simulacaoBancaria.repository;

import com.SimulacaoBancaria.simulacaoBancaria.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
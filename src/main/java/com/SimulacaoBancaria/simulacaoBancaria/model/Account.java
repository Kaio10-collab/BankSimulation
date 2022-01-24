package com.SimulacaoBancaria.simulacaoBancaria.model;

import com.SimulacaoBancaria.simulacaoBancaria.utils.AccountTypeEnum;
import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "accountNumber", length = 50, nullable = false)
    private Long accountNumber;

    @Column(name = "type_account", length = 50, nullable = false)
    @Enumerated(EnumType.STRING)
    private AccountTypeEnum type_account;

    @JoinColumn(name = "client_cpf", foreignKey = @ForeignKey)
    private Client client;

}
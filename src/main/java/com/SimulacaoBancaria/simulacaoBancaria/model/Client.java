package com.SimulacaoBancaria.simulacaoBancaria.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
//Todo lombok teste
@Entity
@Table(name = "client")
@Setter
@Getter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "postal_code", nullable = false)
    private String postalCode;

    @Column(name = "street", nullable = false)
    private String street;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "country", nullable = false)
    private String country;

   // Todo @JoinColumn(name = "cpf", foreignKey = @ForeignKey)
  //  private Account account;

    @Column(name = "created_at", nullable = false)
    private LocalDate createdAt;

    public Client() {
    }

    public Client(Long id, String name, String cpf, String phoneNumber, String postalCode, String street, String state, String city, String country, LocalDate createdAt) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
        this.street = street;
        this.state = state;
        this.city = city;
        this.country = country;
        this.createdAt = createdAt;
    }
}
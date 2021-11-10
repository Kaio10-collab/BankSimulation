package com.SimulacaoBancaria.simulacaoBancaria.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "address")
public class Address {

    @Id
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

    @Column(name = "created_at", nullable = false)
    private LocalDate createdAt;

    //TODO FK
    @JoinColumn(name = "cpf", foreignKey = @ForeignKey(name = ""))
    private Client client;

    public Address() {
    }

    public Address(String postalCode, String street, String state, String city, String country, LocalDate createdAt, Client client) {
        this.postalCode = postalCode;
        this.street = street;
        this.state = state;
        this.city = city;
        this.country = country;
        this.createdAt = createdAt;
        this.client = client;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
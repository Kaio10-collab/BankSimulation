package com.SimulacaoBancaria.simulacaoBancaria.request;

import com.SimulacaoBancaria.simulacaoBancaria.model.*;
import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class ClientRequest {

    @NotNull(message = "{validation.field_required}")
    private String name;

    @CPF(message = "{validation.cpf_invalid}")
    private String cpf;

    @NotNull(message = "{validation.field_required}")
    private String phoneNumber;

    @NotNull(message = "{validation.field_required}")
    private String postalCode;

    @NotNull(message = "{validation.field_required}")
    private String street;

    @NotNull(message = "{validation.field_required}")
    private String state;

    @NotNull(message = "{validation.field_required}")
    private String city;

    @NotNull(message = "{validation.field_required}")
    private String country;

    public ClientRequest() {
    }

    public ClientRequest(String name, String cpf, String phoneNumber, String postalCode, String street, String state, String city, String country) {
        this.name = name;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
        this.street = street;
        this.state = state;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public Client requestObjectClient() {
        Client client = new Client();
        client.setName(this.name);
        client.setCpf(this.cpf);
        client.setPhoneNumber(this.phoneNumber);
        client.setPostalCode(this.postalCode);
        client.setStreet(this.street);
        client.setState(this.state);
        client.setCity(this.city);
        client.setCountry(this.country);
        client.setCreatedAt(LocalDate.now());
        return client;
    }
}
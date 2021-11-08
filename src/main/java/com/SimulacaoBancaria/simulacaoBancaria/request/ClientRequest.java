package com.SimulacaoBancaria.simulacaoBancaria.request;

import com.SimulacaoBancaria.simulacaoBancaria.model.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class ClientRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String cpf;

    @NotBlank
    private String phoneNumber;

    @NotBlank
    private Address address;

    @NotBlank
    private Account account;

    public ClientRequest() {
    }

    public ClientRequest(String name, String cpf, String phoneNumber, Address address, Account account) {
        this.name = name;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.account = account;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Client requestObjectClient(){
        Client client = new Client();
        client.setName(this.name);
        client.setCpf(this.cpf);
        client.setPhoneNumber(this.phoneNumber);
        client.setAddress(this.address);
        client.setAccount(this.account);
        client.setCreatedAt(LocalDate.now());
        return client;
    }

}
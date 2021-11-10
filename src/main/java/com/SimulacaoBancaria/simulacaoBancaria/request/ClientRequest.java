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

    public ClientRequest() {
    }

    public ClientRequest(String name, String cpf, String phoneNumber) {
        this.name = name;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
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

    public Client requestObjectClient(){
        Client client = new Client();
        client.setName(this.name);
        client.setCpf(this.cpf);
        client.setPhoneNumber(this.phoneNumber);
        client.setCreatedAt(LocalDate.now());
        return client;
    }

}
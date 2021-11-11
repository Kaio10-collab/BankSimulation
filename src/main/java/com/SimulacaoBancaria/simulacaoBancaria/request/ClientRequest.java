package com.SimulacaoBancaria.simulacaoBancaria.request;

import com.SimulacaoBancaria.simulacaoBancaria.model.*;
import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class ClientRequest {

    @NotBlank(message = "{validation.field_required}")
    private String name;

    @CPF(message = "{validation.cpf_invalid}")
    private String cpf;

    @NotBlank(message = "{validation.field_required}")
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
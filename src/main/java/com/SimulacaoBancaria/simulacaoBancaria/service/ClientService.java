package com.SimulacaoBancaria.simulacaoBancaria.service;

import com.SimulacaoBancaria.simulacaoBancaria.exception.CpfNotFoundException;
import com.SimulacaoBancaria.simulacaoBancaria.exception.CpfRegistredException;
import com.SimulacaoBancaria.simulacaoBancaria.exception.IdNotFoundException;
import com.SimulacaoBancaria.simulacaoBancaria.model.Client;
import com.SimulacaoBancaria.simulacaoBancaria.repository.ClientRepository;
import com.SimulacaoBancaria.simulacaoBancaria.request.ClientRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client registerClient (ClientRequest clientRequest) {

        Client client = clientRequest.requestObjectClient() ;

        if (clientRepository.existsByCpf(clientRequest.getCpf())) {
            throw new CpfRegistredException("Client already registred") ;
        }
        return clientRepository.save(client) ;
    }

    public Client registrationChange(ClientRequest clientRequest) {

        Client objectClient = searchClientByCpf(clientRequest.getCpf()) ;
        objectClient.setName(clientRequest.getName()) ;
        objectClient.setCpf(clientRequest.getCpf()) ;
        objectClient.setPhoneNumber(clientRequest.getPhoneNumber()) ;
        objectClient.setPostalCode(clientRequest.getPostalCode()) ;
        objectClient.setStreet(clientRequest.getStreet()) ;
        objectClient.setState(clientRequest.getState()) ;
        objectClient.setCity(clientRequest.getCity()) ;
        objectClient.setCountry(clientRequest.getCountry()) ;
        return clientRepository.save(objectClient) ;
    }

    private Client searchClientByCpf(String cpf) {

        Optional<Client> optionalClient = clientRepository.findByCpf(cpf) ;

        if (optionalClient.isEmpty()) {
            throw new CpfNotFoundException("client with CPF " + cpf + " not found.") ;
        }
        return optionalClient.get() ;
    }

    public void deleteClient (Long id) {

        Optional<Client> clientId = clientRepository.findById(id) ;

        if (!clientId.isPresent()) {
            throw new IdNotFoundException("The client was not found in this searched id") ;
        }
        clientRepository.deleteById(id) ;
    }
}
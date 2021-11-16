package com.SimulacaoBancaria.simulacaoBancaria.service;

import com.SimulacaoBancaria.simulacaoBancaria.model.Client;
import com.SimulacaoBancaria.simulacaoBancaria.repository.ClientRepository;
import com.SimulacaoBancaria.simulacaoBancaria.request.ClientRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client registerClient (ClientRequest clientRequest) {

        Client client = clientRequest.requestObjectClient() ;

        if (clientRepository.existsById(clientRequest.getCpf())) {
            throw new RuntimeException("Client already registred") ;
        }
        return clientRepository.save(client) ;
    }

    public Client registrationChange (ClientRequest clientRequest) {

        Client objectClient = registerClient(clientRequest) ;

        if(clientRepository.existsById(clientRequest.requestObjectClient().getCpf())) {
            throw new RuntimeException("Client already registred") ;
        }

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

    public void deleteClient (String cpf) {

        clientRepository.deleteById(cpf) ;
        }
}
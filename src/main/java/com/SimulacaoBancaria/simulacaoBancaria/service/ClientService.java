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

    public Client registerClient(ClientRequest clientRequest){

        Client client = clientRequest.requestObjectClient();

        if (clientRepository.existsByCpf(clientRequest.getCpf())){
            throw new RuntimeException("Client already registred");
        }
        return clientRepository.save(client);
    }

    public Client registrationChange (ClientRequest clientRequest) {
        if(clientRepository.existsById(clientRequest.requestObjectClient().getId())){
            Client objectClient = registerClient(clientRequest);
            return objectClient;
        }
        throw new RuntimeException("Client already registred");
    }

}
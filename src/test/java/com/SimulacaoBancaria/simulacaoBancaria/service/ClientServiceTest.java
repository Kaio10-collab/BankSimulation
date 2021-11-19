package com.SimulacaoBancaria.simulacaoBancaria.service;

import com.SimulacaoBancaria.simulacaoBancaria.model.Client;
import com.SimulacaoBancaria.simulacaoBancaria.repository.ClientRepository;
import com.SimulacaoBancaria.simulacaoBancaria.request.ClientRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ClientServiceTest {

    @InjectMocks
    private ClientService clientService;

    @Mock
    private ClientRepository clientRepository;
    private ClientRequest clientRequest;

    private List<Client> clients = new ArrayList<>() ;

    @BeforeEach
    public void setup() {
        this.clientRequest = new ClientRequest() ;
        this.clientRequest.setName("Narutinho") ;
        this.clientRequest.setCpf("699.666.760-74") ;
        this.clientRequest.setPhoneNumber("(00) 00000-0000") ;
        this.clientRequest.setStreet("Rua dos alffajores") ;
        this.clientRequest.setState("SP") ;
        this.clientRequest.setCity("São Paulo") ;
        this.clientRequest.setCountry("Brasil") ;
        clients.add(clientRequest.requestObjectClient()) ;
    }

    @Test
    public void sucess_registredClient() {

        Mockito.when(clientRepository.save(Mockito.any(Client.class))).thenReturn(clientRequest.requestObjectClient()) ;

        Client clientTest = clientService.registerClient(clientRequest) ;

        Assertions.assertEquals(clientTest.getName(), clientRequest.requestObjectClient().getName()) ;
        Assertions.assertEquals(clientTest.getCpf(), clientRequest.requestObjectClient().getCpf()) ;
        Assertions.assertEquals(clientTest.getPhoneNumber(), clientRequest.requestObjectClient().getPhoneNumber()) ;
        Assertions.assertEquals(clientTest.getStreet(), clientRequest.requestObjectClient().getStreet()) ;
        Assertions.assertEquals(clientTest.getState(), clientRequest.requestObjectClient().getState()) ;
        Assertions.assertEquals(clientTest.getCity(), clientRequest.requestObjectClient().getCity()) ;
        Assertions.assertEquals(clientTest.getCountry(), clientRequest.requestObjectClient().getCountry()) ;
    }

    @Test
    public void sucess_clientCpfFound() {

    }
}
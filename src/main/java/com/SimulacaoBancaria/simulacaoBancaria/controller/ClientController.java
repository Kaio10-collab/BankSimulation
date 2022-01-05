package com.SimulacaoBancaria.simulacaoBancaria.controller;

import com.SimulacaoBancaria.simulacaoBancaria.model.Client;
import com.SimulacaoBancaria.simulacaoBancaria.request.ClientRequest;
import com.SimulacaoBancaria.simulacaoBancaria.service.ClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/clients")
@Api(value = "client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    private static final Logger logger = LoggerFactory.getLogger(ClientController.class);

    @ApiOperation(value = "Client registration")
    @PostMapping
    public ResponseEntity<Client> registerCustomer (@RequestBody @Valid ClientRequest clientRequest) {
        Client client = clientService.registerClient(clientRequest) ;
        return new ResponseEntity<>(client, HttpStatus.CREATED) ;
    }

    @ApiOperation(value = "Client update")
    @PutMapping()
    public ResponseEntity<Client> clientUpdate (@RequestBody @Valid ClientRequest cpf) {

        Client client = clientService.registrationChange(cpf) ;
        return new ResponseEntity<Client>(client, HttpStatus.ACCEPTED) ;
    }

    @ApiOperation(value = "Delete client")
    @DeleteMapping("/{id}")
    public void cancelClient(@PathVariable Long id) {
        clientService.deleteClient(id) ;
    }
}
package com.SimulacaoBancaria.simulacaoBancaria.controller;

import com.SimulacaoBancaria.simulacaoBancaria.model.Client;
import com.SimulacaoBancaria.simulacaoBancaria.request.ClientRequest;
import com.SimulacaoBancaria.simulacaoBancaria.service.ClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value = "Client registration")
    @PostMapping
    public ResponseEntity<Client> registerCustomer (@RequestBody @Valid ClientRequest clientRequest) {
        Client client = clientService.registerClient(clientRequest) ;
        return new ResponseEntity<>(client, HttpStatus.CREATED) ;
    }

    @ApiOperation(value = "Client update")
    @PutMapping("/{cpf}")
    public ResponseEntity<Client> clientUpdate (@PathVariable ClientRequest cpf, @RequestBody @Valid ClientRequest clientRequest) {

        Client client = clientService.registrationChange(cpf) ;
        return new ResponseEntity<Client>(client, HttpStatus.ACCEPTED) ;

    }

    @ApiOperation(value = "Delete client")
    @DeleteMapping("/{cpf}")
    public void cancelClient(@PathVariable String cpf) {
        clientService.deleteClient(cpf) ;
    }
}
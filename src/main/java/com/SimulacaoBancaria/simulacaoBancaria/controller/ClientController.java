package com.SimulacaoBancaria.simulacaoBancaria.controller;

import com.SimulacaoBancaria.simulacaoBancaria.model.Client;
import com.SimulacaoBancaria.simulacaoBancaria.request.ClientRequest;
import com.SimulacaoBancaria.simulacaoBancaria.service.ClientService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
    public ResponseEntity<Client> registerCustomer (@RequestBody @Valid @NotNull ClientRequest clientRequest) {
        Client client = clientService.registerClient(clientRequest);
        return new ResponseEntity<>(client, HttpStatus.CREATED) ;
    }

    @ApiOperation(value = "Client update")
    @PutMapping("/{cpf}")
    public ResponseEntity<Client> clientUpdate (@PathVariable @NotNull ClientRequest cpf, @RequestBody @Valid @NotNull ClientRequest clientRequest) {

        Client client = clientService.registrationChange(cpf) ;
        return new ResponseEntity<Client>(client, HttpStatus.ACCEPTED) ;

    }

    @ApiOperation(value = "Delete client")
    @DeleteMapping("/{cpf}")
    public void cancelClient(@PathVariable @NotNull String cpf) {
        clientService.deleteClient(cpf);
    }
}

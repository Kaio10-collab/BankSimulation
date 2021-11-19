package com.SimulacaoBancaria.simulacaoBancaria.controller;

import com.SimulacaoBancaria.simulacaoBancaria.service.ClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ClientController.class)
@AutoConfigureMockMvc(addFilters = false)
public class ClientControllerTest {

    @MockBean
    private ClientService clientService;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void sucessClient() throws Exception {
        mockMvc.perform(get("/clients")).andExpect(status().isOk()) ;
    }
}
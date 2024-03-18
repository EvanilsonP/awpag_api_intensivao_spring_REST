package com.algaworks.awpag.api.controller;

import ch.qos.logback.core.net.server.Client;
import com.algaworks.awpag.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {
    @GetMapping("/clientes")
    public List<Cliente> teste() {
        // instâncias da classe Cliente
        var client1 = new Cliente();
        client1.setId(1);
        client1.setNome("Evanilson");
        client1.setTelefone("96 9999-2222");
        client1.setEmail("pevanilson@.gmail.com");

        var client2 =  new Cliente();
        client2.setId(2);
        client2.setNome("Joao");
        client2.setEmail("joao@gmail.com");
        client2.setTelefone("85 8888-8555");

        return Arrays.asList(client1, client2);
    }
}

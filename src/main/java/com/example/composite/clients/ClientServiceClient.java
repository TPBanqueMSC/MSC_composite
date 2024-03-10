package com.example.composite.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import com.example.composite.model.Client;

import java.util.List;

@FeignClient(name = "clients")
public interface ClientServiceClient {

    @GetMapping("/clients")
    List<Client> getClients();

    @GetMapping("/clients/{id}")
    Client getClientById(@PathVariable("id") Long id);

    @PostMapping("/clients")
    Client saveClient(@RequestBody Client client);

    @DeleteMapping("/clients/{id}")
    void deleteClient(@PathVariable("id") Long id);
}
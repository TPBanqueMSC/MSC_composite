package com.example.composite.clients;

import com.example.composite.model.Compte;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "comptes")
public interface CompteServiceClient {

    @GetMapping("/comptes")
    List<Compte> findAll();

    @PostMapping("/comptes")
    Compte save(@RequestBody Compte compte);
}
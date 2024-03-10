package com.example.composite.service;

import com.example.composite.clients.CompteServiceClient;
import com.example.composite.model.Compte;
import com.example.composite.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteService {

    @Autowired
    private CompteServiceClient compteServiceClient;

    public List<Compte> getAllComptes() {
        return compteServiceClient.findAll();
    }

    public Compte creerCompte(Compte compte) {
        return compteServiceClient.save(compte);
    }

    // Autres méthodes de service si nécessaire
}

package com.example.composite.service;

import com.example.composite.clients.ClientServiceClient;
import com.example.composite.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientServiceClient clientServiceClient;

    public List<Client> getAllClients() {
        return clientServiceClient.getClients();
    }

    public Client getClientById(Long id) {
        // Vous devez ajouter une méthode dans ClientsServiceClient pour obtenir un client par son ID
        return clientServiceClient.getClientById(id);
    }

    public Client saveClient(Client client) {
        // Vous devez ajouter une méthode dans ClientsServiceClient pour sauvegarder un client
        return clientServiceClient.saveClient(client);
    }

    public void deleteClient(Long id) {
        // Vous devez ajouter une méthode dans ClientsServiceClient pour supprimer un client
        clientServiceClient.deleteClient(id);
    }
}
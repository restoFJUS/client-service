package com.reserva.resto.client_service.service;

import com.reserva.resto.client_service.entity.Client;

import java.util.List;

public interface ClientService {

    public Client createClient(Client client);
    public Client getClient(Long id);
    public List<Client> getAllClients();
    public Client updateClient(Client client);
    public void deleteClient(Long id);
}
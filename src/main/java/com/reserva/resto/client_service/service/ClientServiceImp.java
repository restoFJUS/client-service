package com.reserva.resto.client_service.service;

import com.netflix.discovery.converters.Auto;
import com.reserva.resto.client_service.entity.Client;
import com.reserva.resto.client_service.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImp implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client createClient (Client client) {return clientRepository.save(client); }

    @Override
    public Client getClient(Long id) {return clientRepository.findById(id).orElse(null); }

    @Override
    public List<Client> getAllClients() {return clientRepository.findAll(); }

    @Override
    public Client updateClient (Client client) {
        Client clientDB = getClient(client.getId());
        if (clientDB == null){
            return null;
        }
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient (Long id) {
        Client clientDB = getClient(id);
        if (clientDB != null){
            clientRepository.delete(clientDB);
        }
    }
}

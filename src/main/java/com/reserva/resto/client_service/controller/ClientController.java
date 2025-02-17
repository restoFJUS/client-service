package com.reserva.resto.client_service.controller;

import com.reserva.resto.client_service.entity.Client;
import com.reserva.resto.client_service.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    //--> ABM de clientes
    //--> POSTs
    @PostMapping("/create-client")
    public ResponseEntity<Client> createCliente(@RequestBody Client client) {
        Client clientCreated = clientService.createClient(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(clientCreated);
    }

    //--> GETs
    @GetMapping("/get-all-clients")
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> allClients = clientService.getAllClients();
        return ResponseEntity.ok(allClients);
    }

    @GetMapping("/get-client/{id}")
    public ResponseEntity<Client> getClient(@PathVariable Long id) {
        Client client = clientService.getClient(id);
        return ResponseEntity.ok(client);
    }

    //--> PUTs
    @PutMapping("/update-client")
    public ResponseEntity<Client> updateClient(@RequestBody Client client) {
        Client clientUpdated = clientService.updateClient(client);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(clientUpdated);
    }

    //--> DELETEs
    @DeleteMapping("/delete-client/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return ResponseEntity.ok().body(clientService.getClient(id));
    }


}

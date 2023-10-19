package com.myproject.myprojectapi.controller;

import com.myproject.myprojectapi.model.Client;
import com.myproject.myprojectapi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping
    public List<Client> list() {
        return clientRepository.findAll();
    }

    @PostMapping
    public List<Client> add(@RequestBody List<Client> client) {
        return clientRepository.saveAll(client);
    }

    @PutMapping(value = "/update", params = {"id"})
    public Client update(@RequestBody Client client, @RequestParam Long id) {
        if(!clientRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Client not found. Invalid ID");
        }
        client.setId(id);
        return clientRepository.save(client);
    }

    @DeleteMapping(value = "/delete", params = {"id"})
    public HttpStatus delete(@RequestParam Long id) {
        if(!clientRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Client not found. Invalid ID");
        }
        clientRepository.deleteById(id);
        return HttpStatus.ACCEPTED;
    }
}


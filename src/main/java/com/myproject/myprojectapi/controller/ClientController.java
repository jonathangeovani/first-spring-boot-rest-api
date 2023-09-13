package com.myproject.myprojectapi.controller;

import com.myproject.myprojectapi.model.Client;
import com.myproject.myprojectapi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Client add(@RequestBody Client client) {
        return clientRepository.save(client);
    }
}


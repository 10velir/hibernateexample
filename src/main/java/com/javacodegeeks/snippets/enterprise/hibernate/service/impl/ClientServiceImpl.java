package com.javacodegeeks.snippets.enterprise.hibernate.service.impl;

import com.javacodegeeks.snippets.enterprise.hibernate.dao.reposytories.ClientRepository;
import com.javacodegeeks.snippets.enterprise.hibernate.model.Client;
import com.javacodegeeks.snippets.enterprise.hibernate.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client addClient(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public void delete(long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client getByName(String name) {
        return clientRepository.findByName(name);
    }

    @Override
    public Client editClient(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}

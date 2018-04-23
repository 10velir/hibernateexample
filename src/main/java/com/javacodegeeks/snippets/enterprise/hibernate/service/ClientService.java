package com.javacodegeeks.snippets.enterprise.hibernate.service;


import com.javacodegeeks.snippets.enterprise.hibernate.model.Client;
import java.util.List;

public interface ClientService {

    void delete(long id);

    Client getByName(String name);

    List<Client> getAll();

    Client addClient(Client client);

    Client editClient(Client client);
}

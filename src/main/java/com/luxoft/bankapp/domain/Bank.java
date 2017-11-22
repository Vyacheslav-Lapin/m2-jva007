package com.luxoft.bankapp.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Bank {

    private List<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }
}


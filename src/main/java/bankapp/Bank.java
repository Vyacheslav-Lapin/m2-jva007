package bankapp;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class Bank {

    private List<Client> clients;

    public Bank(Client... clients) {
        this.clients = new ArrayList<>();
        Collections.addAll(this.clients, clients);
    }

    public void addClient(Client client) {
        clients.add(client);
    }
}

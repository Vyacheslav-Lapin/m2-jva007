package bankapp;

public class Bank {

    private Collection clients;

    public Bank(Client... clients) {
        this.clients = new Collection(clients);
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public Client[] getClients() {
        return ((Client[]) clients.getObjects())
                .clone();
    }
}

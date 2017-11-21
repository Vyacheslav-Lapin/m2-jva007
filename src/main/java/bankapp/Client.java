package bankapp;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class Client {

    @Getter
    private final String name;
    private Collection accounts;

    public Client(String name, Account... accounts) {
        this.name = name;
        this.accounts = new Collection(accounts);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account[] getAccounts() {
        return ((Account[]) accounts.getObjects())
                .clone();
    }

    public String getInfo() {
        Account[] accounts = ((Account[]) this.accounts.getObjects());

        StringBuilder accountsString = new StringBuilder();
        for (Account account : accounts) {
            accountsString.append(account).append("\n");
        }
        return "Клиент " + name + " имеет " + accounts.length + " аккаунтов\n" + accountsString;
    }
}

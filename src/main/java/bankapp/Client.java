package bankapp;

import lombok.Getter;

public class Client {

    @Getter
    private String name;
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
        Account[] accounts = getAccounts();

        StringBuilder accountsString = new StringBuilder();
        for (Account account : accounts)
            accountsString.append(account).append("\n");

        return String.format(
                "Клиент %s имеет %d аккаунтов\n%s",
                name, accounts.length, accountsString);
    }
}

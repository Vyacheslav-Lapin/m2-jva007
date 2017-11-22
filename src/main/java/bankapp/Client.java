package bankapp;

import lombok.Getter;

public class Client {

    @Getter
    private String name;
    private Collection accounts;
    private Gender gender;

    public Client(String name, Gender gender, Account... accounts) {
        this.name = name;
        this.gender = gender;
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
                "%s %s имеет %d аккаунтов\n%s",
                gender.getGreeting(),
                name,
                accounts.length,
                accountsString);
    }

    public String getClientGreeting() {
        return gender.getGreeting();
    }
}

package com.luxoft.bankapp.domain;

import com.luxoft.bankapp.domain.accounts.Account;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

    @Getter
    private String name;
    private Gender gender;
    private List<Account> accounts;

    public Client(String name, Gender gender, Account... accounts) {
        this.name = name;
        this.gender = gender;
        this.accounts = new ArrayList<>();
        Collections.addAll(this.accounts, accounts);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return Collections.unmodifiableList(accounts);
    }

    public String getInfo() {
        StringBuilder accountsString = new StringBuilder();
        for (Account account : accounts)
            accountsString.append(account).append("\n");

        return String.format(
                "%s %s имеет %d аккаунтов\n%s",
                gender.getGreeting(),
                name,
                accounts.size(),
                accountsString);
    }

    public String getClientGreeting() {
        return gender.getGreeting();
    }
}

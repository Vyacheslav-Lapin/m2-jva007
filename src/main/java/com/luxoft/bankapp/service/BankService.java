package com.luxoft.bankapp.service;

import com.luxoft.bankapp.domain.Bank;
import com.luxoft.bankapp.domain.Client;
import com.luxoft.bankapp.domain.accounts.Account;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankService {

    private Bank bank;

    public BankService addClient(Client client) {
        BankService.addClient(bank, client);
        return this;
    }

    public static Bank addClient(Bank bank, Client client) {
        bank.addClient(client);
        return bank;
    }

    public static void modifyBank(Bank bank) {
        for (Client client : bank.getClients())
            for (Account account : client.getAccounts()) {
                double balance = account.getBalance();
                double delta = Math.round(
                        Math.random() * balance * 2)
                        - balance;

                if (delta >= 0)
                    account.deposit(delta);
                else
                    account.withdraw(-delta);
            }
    }

    public static void printBalance(Bank bank) {
        for (Client client : bank.getClients())
            System.out.println(client.getInfo());
    }

    public static double getMaximumAmountToWithdraw(Bank bank) {
        double maximumAmountToWithdraw = 0;
        for (Client client : bank.getClients())
            for (Account account: client.getAccounts())
                maximumAmountToWithdraw += account.maximumAmountToWithdraw();

        return maximumAmountToWithdraw;
    }

    public static void printMaximumAmountToWithdraw(Bank bank) {
        System.out.println("getMaximumAmountToWithdraw(bank) = "
                + getMaximumAmountToWithdraw(bank));
    }
}

package com.luxoft.bankapp.service;

import com.luxoft.bankapp.domain.*;
import com.luxoft.bankapp.domain.accounts.Account;
import com.luxoft.bankapp.domain.accounts.CheckingAccount;
import com.luxoft.bankapp.domain.accounts.SavingAccount;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankApplication {

    public static void main(String... args) {
        Bank bank = new Bank();

        new BankService(bank)
                .addClient(new Client("Мария", Gender.FEMALE, new SavingAccount(100)))
                .addClient(new Client("Семён", Gender.MALE, new SavingAccount(1000)))
                .addClient(new Client("Варвара", Gender.FEMALE, new CheckingAccount(10_000, 50_000)))
                .addClient(new Client("Анна", Gender.FEMALE, new SavingAccount(10)))
                .addClient(new Client("Александр", Gender.MALE, new SavingAccount(400)))
                .addClient(new Client("Игнат", Gender.MALE, new CheckingAccount(800, 1_500)))
                .addClient(new Client("Изяслав", Gender.MALE, new SavingAccount(300)))
                .addClient(new Client("Игорь", Gender.MALE, new SavingAccount(450)))
                .addClient(new Client("Ольга", Gender.FEMALE, new CheckingAccount(780, 1_500)))
                .addClient(new Client("Виктория", Gender.FEMALE, new SavingAccount(57)))
                .addClient(new Client("Евгения", Gender.FEMALE, new CheckingAccount(59, 100)));

        BankService.modifyBank(bank);
        BankService.printBalance(bank);
        BankService.printMaximumAmountToWithdraw(bank);
    }
}

package com.luxoft.bankapp.domain.accounts;

import lombok.Getter;
import lombok.ToString;

@ToString(exclude = "id")
public abstract class AbstractAccount implements Account {

    private static int counter;

    private int id = ++counter;

    @Getter(onMethod = @__(@Override))
    private double balance;

    public AbstractAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0)
            withdraw(-amount);
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (maximumAmountToWithdraw() >= amount)
            balance -= amount;
    }
}

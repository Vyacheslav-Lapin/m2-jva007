package com.luxoft.bankapp.domain.accounts;

public interface Account {

    double getBalance();

    default double maximumAmountToWithdraw() {
        return getBalance();
    }

    void deposit(double amount);
    void withdraw(double amount);
}

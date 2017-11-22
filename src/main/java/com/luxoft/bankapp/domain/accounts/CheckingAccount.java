package com.luxoft.bankapp.domain.accounts;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class CheckingAccount extends AbstractAccount {

    @Getter
    @Setter
    private double overdraft;

    public CheckingAccount(double balance, double overdraft) {
        super(balance);
        this.overdraft = overdraft;
    }

    @Override
    public double maximumAmountToWithdraw() {
        return getBalance() + overdraft;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + getBalance() +
                ", overdraft=" + overdraft +
                " (maximumAmountToWithdraw=" + maximumAmountToWithdraw() + ")" +
                '}';
    }
}

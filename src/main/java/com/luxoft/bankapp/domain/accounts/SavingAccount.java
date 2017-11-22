package com.luxoft.bankapp.domain.accounts;

@A1(s = "Мама мыла раму")
public class SavingAccount extends AbstractAccount {

    public SavingAccount(double balance) {
        super(balance);
    }

    public static void main(String... args) {
        A1 a1 = SavingAccount.class.getDeclaredAnnotation(A1.class);
        System.out.println(a1.s());
    }
}

package bankapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString(exclude = "id")
public class Account {
    private int id;

    @Getter
    private double balance;

    public void deposit(double amount) {
        if (amount < 0)
            withdraw(-amount);
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
    }
}

package bankapp;

import lombok.AllArgsConstructor;

import static bankapp.Gender.FEMALE;
import static bankapp.Gender.MALE;

@AllArgsConstructor
public class BankApplication {

    private Bank bank;

    public static void main(String... args) {
        BankApplication bankApplication =
                new BankApplication(new Bank(
                        new Client("Мария", FEMALE, new Account(1, 100)),
                        new Client("Семён", MALE, new Account(2, 1000)),
                        new Client("Варвара", FEMALE, new Account(3, 10000)),
                        new Client("Анна", FEMALE, new Account(4, 10)),
                        new Client("Александр", MALE, new Account(5, 400)),
                        new Client("Игнат", MALE, new Account(6, 800)),
                        new Client("Изяслав", MALE, new Account(7, 300)),
                        new Client("Игорь", MALE, new Account(8, 450)),
                        new Client("Ольга", FEMALE, new Account(9, 780)),
                        new Client("Виктория", FEMALE, new Account(10, 57)),
                        new Client("Евгения", FEMALE, new Account(11, 59))
                ));

        bankApplication.modifyBank();
        bankApplication.printBalance();
    }

    public void modifyBank() {
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

    public void printBalance() {
        for (Client client : bank.getClients())
            System.out.println(client.getInfo());
    }
}

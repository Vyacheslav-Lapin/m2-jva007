package bankapp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankApplication {
    private Bank bank;

    public static void main(String... args) {
        BankApplication bankApplication =
                new BankApplication(new Bank(
                        new Client("Мария", new Account(1, 100)),
                        new Client("Семён", new Account(2, 1000)),
                        new Client("Варвара", new Account(3, 10000)),
                        new Client("Анна", new Account(4, 10)),
                        new Client("Александр", new Account(5, 400)),
                        new Client("Игнат", new Account(6, 800)),
                        new Client("Изяслав", new Account(7, 300)),
                        new Client("Игорь", new Account(8, 450)),
                        new Client("Ольга", new Account(9, 780)),
                        new Client("Виктория", new Account(10, 57)),
                        new Client("Виктория", new Account(11, 59))
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

                if (delta > 0)
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

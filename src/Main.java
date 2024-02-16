import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating three clients
        Client[] clients = new Client[3];
        clients[0] = new Client(101, "Amanda");
        // Adding 2 accounts for clientid101
        Account amandaAccount1 = new Account(1012, 1000, clients[0]);
        Account amandaAccount2 = new Account(1013, 3000, clients[0]);
        clients[0].AccountADD(amandaAccount1);
        clients[0].AccountADD(amandaAccount2);

        clients[1] = new Client(102, "Rob");
        // Adding three accounts for client102
        Account robAccount1 = new Account(1024, 1000, clients[1]);
        Account robAccount2 = new Account(1025, 1500, clients[1]);
        Account robAccount3 = new Account(1026, 3400, clients[1]);
        clients[1].AccountADD(robAccount1);
        clients[1].AccountADD(robAccount2);
        clients[1].AccountADD(robAccount3);

        clients[2] = new Client(103, "Brad");

        // Simulate transactions
        for (Client client : clients) {
            System.out.println("Transactions for Client: " + client.getName());
            for (Account account : client.getAccounts()) {
                // Deposit some funds
                double depositAmount = Math.random() * 1000; // Random deposit amount
                account.deposit(depositAmount);
                // Withdraw some funds
                double withdrawAmount = Math.random() * account.getBalance(); // Random withdraw amount
                account.withdraw(withdrawAmount);
                // Display account info along with transaction details
                account.displayInfo();
                System.out.println();
            }
            System.out.println();
        }
    }
}

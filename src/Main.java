import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating two clients using java array
        Client[] clients = new Client[2];
        clients[0] = new Client(101, "Amanda");
        // Adding 2 accounts for clientid101
        Account account1 = new Account(1012, 1000, clients[0]);
        Account account2 = new Account(1013, 3000, clients[0]);
        clients[0].AccountADD(account1);
        clients[0].AccountADD(account2);

        clients[1] = new Client(102, "Rob");
        // Adding three accounts for client102
        Account account3 = new Account(1024, 1000, clients[1]);
        Account account4 = new Account(1025, 1500, clients[1]);
        Account account5 = new Account(1026, 3400, clients[1]);
        clients[1].AccountADD(account3);
        clients[1].AccountADD(account4);
        clients[1].AccountADD(account5);

        // Perform transactions for result
        Transaction transaction1 = new Transaction(account1, account2, 500);
        transaction1.execute();

        Transaction transaction2 = new Transaction(account3, account4, 700);
        transaction2.execute();

        Transaction transaction3 = new Transaction(account1, account2, 300);
        transaction3.execute();

        Transaction transaction4 = new Transaction(account4, account5, 200);
        transaction4.execute();

        // Printing required info and transaction details
        for (Client client : clients) {
            System.out.println("Client ID: " + client.getCLIENTid());
            System.out.println("Name: " + client.getName());
            for (Account account : client.getAccounts()) {
                System.out.println("Account Number: " + account.getAccountNum());
                System.out.println("Current Balance: " + account.getBalance());
                System.out.println("Total Deposits: " + account.getDeposits());
                System.out.println("Total Withdrawals: " + account.getWithdrawals());
                System.out.println("Transactions:");
                // loop to display each detail
                for (Transaction transaction : account.getTransactions()) {
                    System.out.println("Transaction ID: " + transaction.getTransactionID());
                    System.out.println("Amount: " + transaction.getAmount());
                    System.out.println("Timestamp: " + transaction.getTimestamp());
                }
            }
        }
    }
}

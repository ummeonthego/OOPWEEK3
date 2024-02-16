import java.util.*;

public class Transaction {
    // Attributes
    private int transactionID;
    private Account sourceAccount;
    private Account destinationAccount;
    private double amount;
    private Date timestamp;

    // Constructor
    public Transaction(int transactionID, Account sourceAccount, Account destinationAccount, double amount) {
        this.transactionID = transactionID;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
        this.timestamp = new Date();
    }

    // Methods
    // Execute the transaction
    public void execute() {
        // Check if the source account has sufficient balance
        if (sourceAccount.getBalance() >= amount && amount > 0) {
            // Withdraw from the source account and deposit to the destination account
            sourceAccount.withdraw(amount);
            destinationAccount.deposit(amount);
            // Display transaction details
            System.out.println("Transaction ID: " + transactionID);
            System.out.println("Source Account: " + sourceAccount.getAccountNum());
            System.out.println("Destination Account: " + destinationAccount.getAccountNum());
            System.out.println("Amount: " + amount);
            System.out.println("Timestamp: " + timestamp);
            System.out.println();
        } else {
            System.out.println("Transaction failed: Insufficient balance.");
        }
    }
}

import java.util.Date;

public class Transaction {
    // Attributes
    private static int transactionCounter = 1000;
    private int transactionID;
    private Account sourceAccount;
    private Account destinationAccount;
    private double amount;
    private Date timestamp;

    // Constructor
    public Transaction(Account sourceAccount, Account destinationAccount, double amount) {
        this.transactionID = transactionCounter++;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
        this.timestamp = new Date();
    }

    // Getters
    public int getTransactionID() {
        return transactionID;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }
    public void execute() {
        // Check if the source account has enough balance
        if (sourceAccount.getBalance() >= amount && amount > 0) {
            // Withdraw from the source account and deposit to the destination account
            sourceAccount.withdraw(amount);
            destinationAccount.deposit(amount);
            System.out.println("Transaction ID: " + transactionID);
            System.out.println("Source Account: " + sourceAccount.getAccountNum());
            System.out.println("Destination Account: " + destinationAccount.getAccountNum());
            System.out.println("Amount: " + amount);
            System.out.println("Timestamp: " + timestamp);
        } else {
            System.out.println("Transaction failed: Insufficient balance or invalid amount.");
        }
    }

}


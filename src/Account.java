import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNum;
    private double balance;
    private Client owner;
    private List<String> transactionDetails;

    public Account(int accountNum, double balance, Client owner) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.owner = owner;
        this.transactionDetails = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            balance -= amount;
            recordTransaction("Withdrawal of $" + amount);
        } else {
            recordTransaction("Withdrawal failed: Insufficient balance");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            recordTransaction("Deposit of $" + amount);
        } else {
            recordTransaction("Deposit failed: Invalid amount");
        }
    }

    public void recordTransaction(String details) {
        transactionDetails.add(details);
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNum);
        System.out.println("Current Balance: " + balance);
        System.out.println("Owner: " + owner.getName());
        System.out.println("Transaction Details:");
        for (String detail : transactionDetails) {
            System.out.println("- " + detail);
        }
    }
}
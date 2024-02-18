import java.util.*;

public class Account {
    // defining the required attributes
    private int accountNum;
    private double balance;
    private int withdrawals;
    private int deposits;
    private ArrayList<Transaction> transactions;

    // getters and setters
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

    public int getWithdrawals() {
        return withdrawals;
    }

    public void setWithdrawals(int withdrawals) {
        this.withdrawals = withdrawals;
    }

    public int getDeposits() {
        return deposits;
    }

    public void setDeposits(int deposits) {
        this.deposits = deposits;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    private Client owner;

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    // Account constructor
    public Account(int accountNum, double balance, Client owner) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.owner = owner;
        this.withdrawals = 0;
        this.deposits = 0;
        this.transactions = new ArrayList<>();
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            balance -= amount; // deducting from previous balance
            withdrawals++;
            transactions.add(new Transaction(this, null, amount));
        } else {
            System.out.println("You do not have enough funds to perform this transaction.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // adding the input amount to initial balance
            deposits++;
            transactions.add(new Transaction(null, this, amount));
        } else {
            System.out.println("Invalid transaction! Try again."); // to deal with erroneous input
        }
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNum);
        System.out.println("Current Balance: " + balance);
        System.out.println("Owner: " + owner.getName());
    }
}

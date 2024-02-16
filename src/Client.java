import java.util.ArrayList;
import java.util.List;

public class Client {
    // Defining attributes
    private int CLIENTid;
    private String name;
    private ArrayList<Account> accounts;

    public int getCLIENTid() {
        return CLIENTid;
    }

    public void setCLIENTid(int CLIENTid) {
        this.CLIENTid = CLIENTid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    // Client constructor
    public Client(int CLIENTid, String name) {
        this.CLIENTid = CLIENTid;
        this.name = name;
        this.accounts = new ArrayList<>(); // New instance of the account class
    }

    // Required attributes
    // To add accounts
    public void AccountADD(Account account) {
        accounts.add(account); // Adds a new account to the list
    }

    public void displayInfo() {
        System.out.println("Client ID: " + CLIENTid + " Name of the client: " + name);
        for (Account account : accounts) {
            account.displayInfo();
        }
    }
}

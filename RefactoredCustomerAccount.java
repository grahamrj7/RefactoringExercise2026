import java.util.ArrayList;
import java.util.List;

public class CustomerAccount {

    private String number;
    private double balance;
    private List<AccountTransaction> transactionList;

    public CustomerAccount() {
        this.number = "";
        this.balance = 0.0;
        this.transactionList = new ArrayList<>();
    }

    public CustomerAccount(String number, double balance) {
        this.number = number;
        this.balance = balance;
        this.transactionList = new ArrayList<>();
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public List<AccountTransaction> getTransactionList() {
        return transactionList;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addTransaction(AccountTransaction transaction) {
        transactionList.add(transaction);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

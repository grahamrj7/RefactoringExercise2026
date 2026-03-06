public class CustomerDepositAccount extends CustomerAccount {

    private double interestRate;

    public CustomerDepositAccount() {
        super();
        this.interestRate = 0.0;
    }

    public CustomerDepositAccount(double interestRate, String number, double balance) {
        super(number, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public boolean withdraw(double amount) {

        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            return true;
        }

        return false;
    }
}

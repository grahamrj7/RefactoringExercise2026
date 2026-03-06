public class CustomerCurrentAccount extends CustomerAccount {

    private double overdraft;

    public CustomerCurrentAccount() {
        super();
        overdraft = 0.0;
    }

    public CustomerCurrentAccount(String number, double balance, double overdraft) {
        super(number, balance);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public boolean withdraw(double amount) {

        if (getBalance() + overdraft >= amount) {
            setBalance(getBalance() - amount);
            return true;
        }

        return false;
    }
}

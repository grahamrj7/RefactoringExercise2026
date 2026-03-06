import java.util.List;

public class CustomerCurrentAccount extends CustomerAccount {

    private ATMCard atm;
    private double overdraft;

    public CustomerCurrentAccount() {
        super();
        this.atm = null;
        this.overdraft = 0.0;
    }

    public CustomerCurrentAccount(ATMCard atm, String number, double balance) {
        super(number, balance);
        this.atm = atm;
        this.overdraft = 0.0;
    }

    public ATMCard getAtm() {
        return atm;
    }

    public void setAtm(ATMCard atm) {
        this.atm = atm;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public boolean withdraw(double amount) {

        if(getBalance() + overdraft >= amount) {
            setBalance(getBalance() - amount);
            return true;
        }

        return false;
    }
}

public class AccountTransaction {

    private String date;
    private String type;
    private double amount;

    public AccountTransaction() {
        date = "";
        type = "";
        amount = 0;
    }

    public AccountTransaction(String date, String type, double amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public String getDate() { return date; }
    public String getType() { return type; }
    public double getAmount() { return amount; }

    public void setDate(String date) { this.date = date; }
    public void setType(String type) { this.type = type; }
    public void setAmount(double amount) { this.amount = amount; }

    public String toString() {
        return "\nDate = " + date +
               "\nType = " + type +
               "\nAmount = " + amount + "\n";
    }
}

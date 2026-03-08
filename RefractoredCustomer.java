import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String PPS;
    private String surname;
    private String firstName;
    private String DOB;
    private String customerID;
    private String password;

    private List<CustomerAccount> accounts;

    public Customer() {
        PPS = "";
        surname = "";
        firstName = "";
        DOB = "";
        customerID = "";
        password = "";
        accounts = new ArrayList<>();
    }

    public Customer(String PPS, String surname, String firstName, String DOB,
                    String customerID, String password, List<CustomerAccount> accounts) {

        this.PPS = PPS;
        this.surname = surname;
        this.firstName = firstName;
        this.DOB = DOB;
        this.customerID = customerID;
        this.password = password;
        this.accounts = accounts;
    }

    public String getPPS() { return PPS; }
    public String getSurname() { return surname; }
    public String getFirstName() { return firstName; }
    public String getDOB() { return DOB; }
    public String getCustomerID() { return customerID; }
    public String getPassword() { return password; }

    public List<CustomerAccount> getAccounts() {
        return accounts;
    }

    public void setPPS(String PPS) { this.PPS = PPS; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setDOB(String DOB) { this.DOB = DOB; }
    public void setCustomerID(String customerID) { this.customerID = customerID; }
    public void setPassword(String password) { this.password = password; }

    public String toString() {
        return "PPS number = " + PPS + "\n"
                + "Surname = " + surname + "\n"
                + "First Name = " + firstName + "\n"
                + "Date of Birth = " + DOB + "\n"
                + "Customer ID = " + customerID;
    }
}

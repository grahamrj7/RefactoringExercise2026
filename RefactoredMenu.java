
//Remove Duplicate Imports
//Before
import java.util.ArrayList;
import java.util.ArrayList;

import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
//after
import java.util.ArrayList;
import java.util.Date;
//Encapsulation of Fields
//before
Customer e;
CustomerAccount acc = new CustomerAccount();

//after
private Customer currentCustomer;
private CustomerAccount selectedAccount;

//Extract Method – Customer Search
//before
for (Customer aCustomer: customerList){
    if(aCustomer.getCustomerID().equals(customerID))
    {
        found = true;
        customer = aCustomer;
    }					    	
}

//after
private Customer findCustomer(String id) {
    for(Customer c : customerList) {
        if(c.getCustomerID().equals(id)) {
            return c;
        }
    }
    return null;
}

//Improve Variable Naming
//Before
Customer e;
CustomerAccount acc;
//After
Customer currentCustomer;
CustomerAccount selectedAccount;


//Simplifying Customer Login Logic
//Before
boolean found = false;
Customer customer = null;

for (Customer aCustomer: customerList){
    if(aCustomer.getCustomerID().equals(customerID))
    {
        found = true;
        customer = aCustomer;
    }
}
//After
Customer customer = findCustomer(customerID);

if(customer == null){
    JOptionPane.showMessageDialog(null, "Customer not found");
    return;
}

//Simplified Transaction Recording
//Before
Date date = new Date();
String date2 = date.toString();
String type = "Lodgement";
double amount = balance;

AccountTransaction transaction = new AccountTransaction(date2, type, amount);
acc.getTransactionList().add(transaction);
//After
AccountTransaction transaction =
        new AccountTransaction(new Date().toString(), "Lodge", value);

acc.getTransactionList().add(transaction);

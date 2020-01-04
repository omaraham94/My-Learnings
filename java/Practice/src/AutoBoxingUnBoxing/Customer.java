package AutoBoxingUnBoxing;

import java.util.ArrayList;

public class Customer {
    private double balance = 0;
    private ArrayList <Double> transactions = new ArrayList<Double>();
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void withdraw(double amt) {
        if (amt <=0) {
            System.out.println("wrong input");
        } else if (balance < amt) {
            System.out.println("Insufficient Funds");
        } else {
            this.balance -= amt;
            transactions.add(-amt);

        }
    }

    public void deposit(double amt) {
        if (amt <= 0) {
            System.out.println("wrong input");
        } else {
            this.balance += amt;
            this.transactions.add(amt);
        }
    }


}

package AutoBoxingUnBoxing;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList <Customer> customers = new ArrayList<Customer>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public void addCustomer(Customer newCustomer) {
        int position = findCustomer(newCustomer);
        if (position == -1) {
            customers.add(newCustomer);
        } else {
            System.out.println("Customer already exists");
        }
    }

    public String getBranchName() {
        return branchName;
    }

    public int findCustomer(String customerName) {
        for(int i=0;i<customers.size();i++) {
            if (customers.get(i).getCustomerName().equals(customerName)) {
                return (i);
            }
        }
        return -1;
    }

    private int findCustomer(Customer newCustomer) {
        return customers.indexOf(newCustomer);
    }
}

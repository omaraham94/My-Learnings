package AutoBoxingUnBoxing;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList <Branch> branches = new ArrayList<Branch>();

    public void addBranch(Branch newBranch) {
        int position = findBranch(newBranch);
        if (position < 0) {
            branches.add(newBranch);
            System.out.println("Branch added successfully");
        } else {
            System.out.println("Branch already exists");
        }
    }

    public int findBranch(String branchName) {
        for(int i=0;i<branches.size();i++) {
            if(branches.get(i).getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    private int findBranch(Branch newBranch) {
        return branches.indexOf(newBranch);
    }
}
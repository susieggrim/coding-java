package bankingsystembranchescustomerstransactions;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return false;
        }
        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return  branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            int customerCounter = 0;
            for (Customer customer : branch.getCustomers()) {
                System.out.println("Customer: " + customer.getName() + "[" + ++customerCounter + "]");
                if (printTransactions) {
                    int transactionCounter = 0;
                    System.out.println("Transactions");
                    for (Double transaction : customer.getTransactions()) {
                        System.out.println("[" + ++transactionCounter + "] Amount " + transaction);
                    }
                }
            }
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : this.branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }
}

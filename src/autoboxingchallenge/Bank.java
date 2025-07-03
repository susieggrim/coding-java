package autoboxingchallenge;

import java.util.ArrayList;

public class Bank {

    private final String name;
    private final ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addCustomer(Customer customer) {
        if(!customerExist(customer)) {
            customers.add(customer);
        } else {
            System.out.println("Customer " + customer.getName() + " already exist");
        }
    }

    public void addTransaction(Double amount, Customer customer) {
        if (customerExist(customer)) {
            customer.getTransactions().add(amount);
        } else {
            System.out.println("Customer " + customer.getName() + " does not exist");
        }
    }

    public void printStatement(Customer customer) {
        if (customers.contains(customer)) {
            System.out.println("-".repeat(30));
            System.out.println("Bank name: " + this.name);
            System.out.println("Customer name: " + customer.getName());
            System.out.println("Transactions: ");
            for (Double transaction: customer.getTransactions()) {
                System.out.printf("$%10.2f (%s)%n", transaction, transaction < 0 ? "debit" : "credit");
            }
            System.out.println("-".repeat(30));
        } else {
            System.out.println("Customer does not exist");
        }
    }

    private boolean customerExist(Customer customer) {
        boolean customerExist = false;

        for (Customer existingCustomer: customers) {
            if (existingCustomer.getName().equals(customer.getName())) {
                customerExist = true;
                break;
            }
        }
        return customerExist;
    }

}

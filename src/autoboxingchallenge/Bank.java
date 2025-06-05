package autoboxingchallenge;

import java.util.List;

public class Bank {

    private String name;
    private List<Customer> customers;

    public void addCustomer(Customer customer) {
        // add a new customer if they're not yet already in the list

    }

    public void addTransaction(Double amount, Customer customer) {
        // Add transaction to an existing customer

    }

    public void printStatement(Customer customer) {

        System.out.println("customer name: " + customer.getName());
        System.out.println("Transactions: " + customer.getTransactions()); // this method should use unboxing

    }

}

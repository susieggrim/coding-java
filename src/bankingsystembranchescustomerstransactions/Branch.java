package bankingsystembranchescustomerstransactions;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        Customer customer = findCustomer(customerName);

        if (customer != null) {
            return false;
        }

        this.customers.add(new Customer(customerName, initialTransaction));
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);

        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : this.customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }

        return null;
    }

}

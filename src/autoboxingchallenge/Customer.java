package autoboxingchallenge;

import java.util.ArrayList;

public class Customer {

    private final String name;
    private final ArrayList<Double> transactions = new ArrayList<>(); // transaction can be credit positive amount or debit a negative amount

    public Customer(String name, Double transaction) {
        this.name = name;
        this.transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

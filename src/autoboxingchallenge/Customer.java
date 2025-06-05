package autoboxingchallenge;

import java.util.List;

public class Customer {

    private String name;
    private List<Transaction> transactions; // transaction can be credit positive amount or debit a negative amount

    public String getName() {
        return name;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}

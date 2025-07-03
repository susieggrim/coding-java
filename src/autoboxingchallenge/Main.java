package autoboxingchallenge;

public class Main {

    public static void main(String[] args) {
        Bank bank1 = new Bank("Bank Of America");
        Bank bank2 = new Bank("Wells Fargo");
        Bank bank3 = new Bank("Chase");

        Customer customer = new Customer("Mary", 5.00);
        bank1.addCustomer(customer);
        bank1.printStatement(customer);

        bank1.addTransaction(-10.50, customer);
        bank1.printStatement(customer);

        bank1.addTransaction(-2.00, customer);
        bank1.printStatement(customer);

        bank1.addCustomer(customer);

        Customer customer2 = new Customer("Joe", 2.00);
        bank1.addCustomer(customer2);
        bank1.printStatement(customer2);

        bank1.addTransaction(23.57, customer2);
        bank1.printStatement(customer2);

        Customer customer3 = new Customer("Mary", 100.56);
        bank2.addCustomer(customer3);
        bank2.addTransaction(5.00, customer3);
        bank2.printStatement(customer3);

        bank1.printStatement(customer2);
        Customer customer4 = new Customer("Joe", 1000.01);

        bank1.addCustomer(customer4);

        bank1.printStatement(customer4);

        bank3.addCustomer(customer4);
        bank3.addTransaction(14.00, customer4);
        bank3.printStatement(customer4);
        bank3.addCustomer(customer4);
    }

}

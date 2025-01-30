package customer;

public class CustomerMain {

    public static void main(String[] args) {

        Customer customer = new Customer("Susie", 500.00, "susie@mail.com");
        System.out.println("customer.Customer: " + customer.getName() + ", "  + "credit limit: " + customer.getCreditLimit() + ", " + "Email address: " + customer.getEmailAddress());

        Customer customer2 = new Customer();
        System.out.println("customer.Customer: " + customer2.getName() + ", "  + "credit limit: " + customer2.getCreditLimit() + ", " + "Email address: " + customer2.getEmailAddress());

        Customer customer3 = new Customer();
        System.out.println("customer.Customer: " + customer3.getName() + ", "  + "credit limit: " + customer3.getCreditLimit() + ", " + "Email address: " + customer3.getEmailAddress());

    }

}

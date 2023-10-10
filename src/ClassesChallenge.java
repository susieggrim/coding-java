public class ClassesChallenge {

    public static void main(String[] args) {

        Account account1 = new Account();

        account1.setCustomerName("Susie");
        account1.setAccountNumber(123789);
        account1.setEmail("susie@test.com");
        account1.setPhoneNumber("717-888-8777");


        account1.depositingFunds(10.50);
        account1.depositingFunds(100.00);
        account1.withdrawingFunds(20.10);
        account1.withdrawingFunds(0.40);
        account1.depositingFunds(30.00);
    }

}

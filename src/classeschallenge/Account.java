package classeschallenge;

public class Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositingFunds(double deposit) {
        balance = this.balance + deposit;
        System.out.println("Balance after deposit: $" + balance);
    }

    public void withdrawingFunds(double withdraw) {
        balance = this.balance - withdraw;
        if (this.balance < 0) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Balance after withdrawing: $" + getBalance());
        }
    }

}

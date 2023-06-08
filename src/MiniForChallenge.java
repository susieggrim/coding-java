public class MiniForChallenge {

    public static void main(String[] args) {

        for (double interestRate = 7.5; interestRate <= 10; interestRate += 0.25) {
            calculateInterest(100, interestRate);

        }

    }

    public static void calculateInterest(double amount, double interestRate) {
        System.out.println(interestRate + "% interest of " + amount + " = " + amount * (interestRate/100));
    }
}

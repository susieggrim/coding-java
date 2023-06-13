public class ThePrimeNumberChallenge {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;

                if (count == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

}

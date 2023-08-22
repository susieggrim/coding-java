public class LargestPrime {

    public static void main(String[] args) {
        System.out.println("Largest number: " + getLargestPrime(217));
    }

    public static int getLargestPrime(int number) {
        for (int i = number; i > 1; i--) {
            int j = i;
            int largeNumber = 0;
            int counter = 0;
            while (j > 1) {
                if (i % j == 0) {
                    if (largeNumber < j) {
                        largeNumber = j;
                    }
                    counter= counter + 1;
                }
                j--;
            }

            if ((counter == 1) && (number % largeNumber == 0)) {
                return largeNumber ;
            }
        }
        return -1;
    }
}

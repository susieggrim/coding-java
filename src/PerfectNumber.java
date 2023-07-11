public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {

        int perfectNumber = 0;

        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    perfectNumber = perfectNumber + i;
                }
            }

            if (perfectNumber == number) {
                return true;
            }
        }

        return false;

    }
}

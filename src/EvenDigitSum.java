public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println("Even digit sum result: " + getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number = number / 10;
        }

        if (number % 2 == 0) {
            sum += number;
        }

        return sum;
    }

}

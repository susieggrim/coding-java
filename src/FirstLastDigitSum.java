public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {
        int counter = 0;
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        do {
            if (sum == 0) {
                sum = number%10;
            } else if (number/10 == 0) {
                sum += number;
            }
            number = number / 10;
            counter++;
        } while (number > 0);

        if (counter == 1) {
            return sum * 2;
        }

        return sum;
    }



}

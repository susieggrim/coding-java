public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println("Has the same last digit? " + hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000) {
            return false;
        }

        num1 = num1 % 10;
        num2 = num2 % 10;
        num3 = num3 % 10;

        return num1 == num2 || num1 == num3 || num2 == num3;
    }
}

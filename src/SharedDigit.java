public class SharedDigit {

    public static void main(String[] args) {
        System.out.println("Has shared digit? " + hasSharedDigit(15, 55));

    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int digit11 = num1 % 10;
        int digit12 = num1 / 10;
        int digit21 = num2 % 10;
        int digit22 = num2 / 10;

        return digit11 == digit21 || digit11 == digit22 || digit12 == digit21 || digit12 == digit22;
    }

}

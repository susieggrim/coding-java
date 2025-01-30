public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);

        int reverse = 0;
        int someNumber = number;

        while (someNumber > 0) {
            int lastNumber = someNumber % 10;
            reverse = reverse * 10 + lastNumber;
            someNumber = someNumber / 10;

            System.out.println("lastNumber: " + lastNumber );
            System.out.println("reverse: " + reverse);
            System.out.println("someNumber :" + someNumber);
        }

        return reverse == number;
    }


}

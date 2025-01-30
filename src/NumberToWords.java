public class NumberToWords {

    public static void main(String[] args) {
        System.out.println(reverse(-2521));
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reverseNumber = reverse(number);
            int numberOfDigits = getDigitCount(number);

            String word = "";
            int digit = 0;

            for (int i = 0; i < numberOfDigits; i++) {
                if (reverseNumber > 9) {
                    digit = reverseNumber % 10;
                } else {
                    digit = reverseNumber;
                }

                switch (digit) {
                    case 1:  word = "One";
                    break;
                    case 2: word = "Two";
                    break;
                    case 3: word = "Three";
                    break;
                    case 4: word = "Four";
                    break;
                    case 5: word = "Five";
                    break;
                    case 6: word = "Six";
                    break;
                    case 7: word = "Seven";
                    break;
                    case 8: word = "Eight";
                    break;
                    case 9: word = "Nine";
                    break;
                    default: word = "Zero";
                };

                System.out.println(word);
                reverseNumber = reverseNumber / 10;

            }
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int counter = 1;
        while (number > 9) {
            number = number / 10;
            counter++;
        }
        return counter;
    }

    public static int reverse(int number){
        int digit = 0;
        int reverseNumber = 0;
        boolean isNegative = false;

        if (number < 0) {
            number = -(number);
            isNegative = true;
        }

        while (number > 9) {
            digit = number % 10;
            number = number / 10;
            if (reverseNumber != 0) {
                reverseNumber = reverseNumber * 10 + digit;
            } else {
                reverseNumber = reverseNumber + digit;
            }
        }
        if (isNegative) {
            return -(reverseNumber * 10 + number);
        }
        return reverseNumber * 10 + number;
    }
}

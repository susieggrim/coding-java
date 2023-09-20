import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double min = null;
        Double max = null;
        boolean isNumber = true;

        while (isNumber) {
            System.out.println("Enter a number: ");
            String nextNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                if ((min == null) || (min > number)) {
                    min = number;
                }
                if ((max == null) || (max < number)) {
                    max = number;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
                isNumber = false;
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

}

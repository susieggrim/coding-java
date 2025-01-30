import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        boolean isNumber = true;

        Scanner scanner = new Scanner(System.in);

        while(isNumber) {
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                isNumber = false;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(((double) sum / (double) counter)));
    }

}

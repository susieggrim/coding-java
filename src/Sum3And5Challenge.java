public class Sum3And5Challenge {

    public static void main(String[] args) {


        int total = 0;
        int counter = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                total += i;
                counter++;
                System.out.println("Number " + i + " can be divided by 3 and 5");
                if (counter == 5) {
                    break;
                }
            }
        }

        System.out.println("The sum of all numbers that can be divided by 3 and 5 is: " + total);
    }
}

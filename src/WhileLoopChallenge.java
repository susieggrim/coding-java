public class WhileLoopChallenge {

    public static void main(String[] args) {
        int counter = 5;
        int oddCount = 0;
        int evenCount = 0;

        while(counter <= 20) {
            counter++;
            if (isEvenNumber(counter)) {
                evenCount++;
                System.out.println(counter + " is an even number");
                continue;
            }
            oddCount++;
        }

        System.out.println("Total odd numbers found: " + oddCount);
        System.out.println("Total even numbers found: " + evenCount);
    }

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0) {
            return true;
        }

        return false;
    }

}

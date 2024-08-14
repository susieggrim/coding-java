package minimumelementexercise;

import java.util.Scanner;

public class MinimumElementExerciseMain {

    public static void main(String[] args) {
        int numberOfElements = readInteger();
        int [] listOfElements = readElements(numberOfElements);
        System.out.println("Minimum number is: " + findMin(listOfElements));
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements that need to read: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int [] readElements(int numberOfElements) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            System.out.println("Enter number: ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        return numbers;
    }

    public static int findMin(int [] numbers) {
        int minimum = 0;
        for(int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                minimum = numbers[i];
            } else if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        return minimum;
    }

}

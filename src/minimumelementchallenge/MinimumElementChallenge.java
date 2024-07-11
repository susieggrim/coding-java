package minimumelementchallenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

    public static void main(String[] args) {
        int [] arrayOfNumbers =  readIntegers();
        System.out.println("List of numbers: " + Arrays.toString(arrayOfNumbers));
        System.out.println("Minimum value: " + findMin(arrayOfNumbers));
    }

    private static int [] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a list of integers, separated by commas: ");
        String[] listOfNumbers = scanner.nextLine().split(", ");
        int [] numbers = new int[listOfNumbers.length];
        for (int i = 0; i < listOfNumbers.length; i++) {
            numbers[i] = Integer.parseInt(listOfNumbers[i]);
        }
        return numbers;
    }

    private static int findMin(int [] arrayOfNumbers) {
        int minNum = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (i != 0) {
                if (minNum > arrayOfNumbers[i]) {
                    minNum = arrayOfNumbers[i];
                }
            } else {
                minNum = arrayOfNumbers[i];
            }
        }
        return minNum;
    }

}

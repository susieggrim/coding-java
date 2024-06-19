package sortedarray;

import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        int [] array = getIntegers(6);
        int [] sortedIntegersArray = sortIntegers(array);
        printArray(sortedIntegersArray);
    }

    public static int [] getIntegers(int size) {
        int [] newArray = new int[size];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++ ) {
            newArray[i] = Integer.parseInt(scanner.next());
        }
        return newArray;
    }

    public static void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int [] sortIntegers(int [] array) {
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = false;
                }
            }
        }
        return array;
    }

}

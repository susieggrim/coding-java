package arraychallenge;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {

    public static void main(String[] args) {
        int[] randomArray = getArray(5);

        System.out.println("random array: " + Arrays.toString(randomArray));
        System.out.println("Inverse sorted random array: " + Arrays.toString(getInverseSortedArray(randomArray)));
    }

    public static int [] getArray(int numberOfElements) {
        int [] newArray = new int[numberOfElements];
        Random randomInt = new Random();

        for (int i = 0; i < 5; i++ ) {
            newArray[i] = randomInt.nextInt(50);
        }
        return newArray;
    }

    public static int [] getInverseSortedArray(int [] array) {
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

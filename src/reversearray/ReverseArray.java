package reversearray;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        reverse(new int[] {1, 2, 67, 7, 2});

    }

    private static void reverse(int[] baseArray) {
        System.out.println("Array = " + Arrays.toString(baseArray));
        int temp = 0;

        for (int i = 0; i <= baseArray.length % 2; i++) {
            temp = baseArray[i];
            baseArray[i] = baseArray[baseArray.length - 1 - i];
            baseArray[baseArray.length - 1 - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(baseArray));
    }

}

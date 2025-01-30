package reversearraychallenge;

import java.util.Arrays;

public class MainReverseArrayChallenge {

    public static void main(String[] args) {

        reverse(new int[] {1, 2, 67, 7, 2});

    }

    private static void reverse(int[] normalArray) {
        System.out.println("Array = " + Arrays.toString(normalArray));
        int [] reverseArray = new int[normalArray.length];

        for (int i = 0; i < normalArray.length; i++) {
            reverseArray[(normalArray.length - 1) - i] = normalArray[i];
        }

        System.out.println("Reversed array = " + Arrays.toString(reverseArray));
    }

}

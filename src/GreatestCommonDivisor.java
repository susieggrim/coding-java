public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int greatestCommonDivisor = 0;
        int maxNumber = 0;

        if ((first < 10) || (second < 10)) {
            return -1;
        }

        if (first < second) {
             maxNumber = first;
        } else {
            maxNumber  = second;
        }

        for (int i = 1; i <= maxNumber ; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }

}

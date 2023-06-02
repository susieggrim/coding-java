public class OverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("5 feet, 8 inches = " + convertToCentimeters(5, 8));
        System.out.println("68 inches = " + convertToCentimeters(68));

    }

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {
        int heightInInches = (heightInFeet * 12) + remainingHeightInInches;
        return convertToCentimeters(heightInInches);
    }

}

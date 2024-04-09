package billsburgerchallenge;

public class Drink {

    private final String drinkType;
    private final String drinkSize;
    private final double drinkPrice;

    public Drink(String drinkType, String drinkSize) {
        this.drinkType = drinkType;
        this.drinkSize = drinkSize;
        this.drinkPrice = getDrinkPrice(drinkSize);
    }

    public double getDrinkPrice(String drinkSize) {
        return switch (drinkSize) {
            case "small" -> 0.50;
            case "medium" -> 0.75;
            case "large" -> 1.00;
            default -> 0.0;
        };

    }
}

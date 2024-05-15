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

    public String getDrinkType() {
        return drinkType;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public double getDrinkPrice(String drinkSize) {
        return switch (drinkSize) {
            case "deluxe" -> 0.00;
            case "small" -> 0.50;
            case "medium" -> 0.75;
            case "large" -> 1.00;
            default -> 1.50;
        };
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkType='" + drinkType + '\'' +
                ", drinkSize='" + drinkSize + '\'' +
                ", drinkPrice=" + drinkPrice +
                '}';
    }
}

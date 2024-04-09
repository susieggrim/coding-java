package billsburgerchallenge;

public class Burgers {

    private final String burgerType;
    private final double burgerBasePrice;
    private final String burgerExtraTopping1;
    private final String burgerExtraTopping2;
    private final String burgerExtraTopping3;

    public Burgers(String burgerType, String burgerExtraTopping1, String burgerExtraTopping2, String burgerExtraTopping3) {
        this.burgerType = burgerType;
        this.burgerBasePrice = getBurgerBasePrice(burgerType);
        this.burgerExtraTopping1 = burgerExtraTopping1;
        this.burgerExtraTopping2 = burgerExtraTopping2;
        this.burgerExtraTopping3 = burgerExtraTopping3;
    }

    public double getBurgerBasePrice(String burgerType) {
        return switch (burgerType) {
            case "default" -> 3.50;
            case "meal" -> 4.50;
            case "deluxe" -> 5.50;
            default -> 0.0;
        };
    }

}

package billsburgerchallenge;

public class Burger {

    private final String burgerType;
    private final double burgerBasePrice;
    private String burgerExtraTopping1;
    private String burgerExtraTopping2;
    private String burgerExtraTopping3;

    public Burger(String burgerType, double burgerBasePrice) {
        this.burgerType = burgerType;
        this.burgerBasePrice = burgerBasePrice;
    }

    public String getBurgerType() {
        return burgerType;
    }

    public double getBurgerBasePrice() {
        return burgerBasePrice;
    }

    public String getBurgerExtraTopping1() {
        return burgerExtraTopping1;
    }

    public String getBurgerExtraTopping2() {
        return burgerExtraTopping2;
    }

    public String getBurgerExtraTopping3() {
        return burgerExtraTopping3;
    }

    public void setBurgerExtraTopping1(String burgerExtraTopping1) {
        this.burgerExtraTopping1 = burgerExtraTopping1;
    }

    public void setBurgerExtraTopping2(String burgerExtraTopping2) {
        this.burgerExtraTopping2 = burgerExtraTopping2;
    }

    public void setBurgerExtraTopping3(String burgerExtraTopping3) {
        this.burgerExtraTopping3 = burgerExtraTopping3;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "burgerType='" + burgerType + '\'' +
                ", burgerBasePrice=" + burgerBasePrice +
                ", burgerExtraTopping1='" + burgerExtraTopping1 + '\'' +
                ", burgerExtraTopping2='" + burgerExtraTopping2 + '\'' +
                ", burgerExtraTopping3='" + burgerExtraTopping3 + '\'' +
                '}';
    }
}

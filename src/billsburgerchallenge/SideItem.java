package billsburgerchallenge;

public class SideItem {

    private final String sideItemType;
    private final double sideItemPrice;

    public SideItem(String sideItemType) {
        this.sideItemType = sideItemType;
        this.sideItemPrice = getSideItemPrice(sideItemType);
    }

    public String getSideItemType() {
        return sideItemType;
    }

    public double getSideItemPrice() {
        return sideItemPrice;
    }

    public double getSideItemPrice(String sideItemType) {
        return switch (sideItemType) {
            case "deluxe fries", "deluxe cookie", "deluxe ice cream" -> 0.00;
            case "fries" -> 0.50;
            case "cookie" -> 0.75;
            case "ice cream" -> 1.00;
            default -> 0.0;
        };
    }

    @Override
    public String toString() {
        return "SideItem{" +
                "sideItemType='" + sideItemType + '\'' +
                ", sideItemPrice=" + sideItemPrice +
                '}';
    }
}

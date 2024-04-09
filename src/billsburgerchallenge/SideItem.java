package billsburgerchallenge;

public class SideItem {

    private final String sideItemType;
    private final double sideItemPrice;

    public SideItem(String sideItemType) {
        this.sideItemType = sideItemType;
        this.sideItemPrice = getSideItemPrice(sideItemType);
    }

    public double getSideItemPrice(String sideItemType) {
        return switch (sideItemType) {
            case "fries" -> 0.50;
            case "cookie" -> 0.75;
            case "ice cream" -> 1.00;
            default -> 0.0;
        };
    }
}

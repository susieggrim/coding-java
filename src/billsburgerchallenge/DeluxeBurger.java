package billsburgerchallenge;

public class DeluxeBurger extends Burger {

    private String deluxeExtraTopping1;
    private String deluxeExtraTopping2;

    public DeluxeBurger() {
        super("Deluxe Burger", 6.00);
    }

    public String getDeluxeExtraTopping1() {
        return deluxeExtraTopping1;
    }

    public void setDeluxeExtraTopping1(String deluxeExtraTopping1) {
        this.deluxeExtraTopping1 = deluxeExtraTopping1;
    }

    public String getDeluxeExtraTopping2() {
        return deluxeExtraTopping2;
    }

    public void setDeluxeExtraTopping2(String deluxeExtraTopping2) {
        this.deluxeExtraTopping2 = deluxeExtraTopping2;
    }

    @Override
    public String toString() {
        return "DeluxeBurger{" +
                "deluxeExtraTopping1='" + deluxeExtraTopping1 + '\'' +
                ", deluxeExtraTopping2='" + deluxeExtraTopping2 + '\'' +
                "} " + super.toString();
    }
}

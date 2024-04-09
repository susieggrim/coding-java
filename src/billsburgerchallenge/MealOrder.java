package billsburgerchallenge;

public class MealOrder {

    private final Burgers burger;
    private final Drink drink;
    private final SideItem sideItem;

    public MealOrder(Burgers burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

}

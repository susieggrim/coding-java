package billsburgerchallenge;

public class DefaultMeal {

    private final Burgers burger;
    private final Drink drink;
    private final SideItem sideItem;

    public DefaultMeal() {
        this.burger = getBurger();
        this.drink = getDrink();
        this.sideItem = getSideItem();
    }

    public Burgers getBurger() {
        return new Burgers("default", "cheese", "lettuce", "tomato");
    }

    public Drink getDrink() {
        return new Drink("coke", "small");
    }

    public SideItem getSideItem() {
        return new SideItem("fries");
    }

}

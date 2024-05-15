package billsburgerchallenge;

public class MealOrder {

    private Burger burger;
    private DeluxeBurger deluxeBurger;
    private Drink drink;
    private SideItem sideItem;

    public MealOrder() {
        this.burger = new Burger("regular", 4.50);
        this.drink = new Drink("coke", "small");
        this.sideItem = new SideItem("fries");
    }

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public MealOrder(DeluxeBurger deluxeBurger, Drink drink, SideItem sideItem) {
        this.deluxeBurger = deluxeBurger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public void setSideItem(SideItem sideItem) {
        this.sideItem = sideItem;
    }

    public DeluxeBurger getDeluxeBurger() {
        return deluxeBurger;
    }

    public void setDeluxeBurger(DeluxeBurger deluxeBurger) {
        this.deluxeBurger = deluxeBurger;
    }
}

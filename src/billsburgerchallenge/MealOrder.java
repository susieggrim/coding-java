package billsburgerchallenge;

import static java.util.Objects.nonNull;

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

    public void addAdditionalToppings(String topping1, String topping2, String topping3) {
        if (this.burger.getBurgerType().equals("regular")) {
            System.out.println("Sorry, unable to add additional toppings");
        } else if (this.deluxeBurger.getBurgerType().equals("deluxe")) {
            this.deluxeBurger.setBurgerExtraTopping1(topping1);
            this.deluxeBurger.setBurgerExtraTopping2(topping2);
            this.deluxeBurger.setBurgerExtraTopping3(topping3);
        } else {
            this.burger.setBurgerExtraTopping1(topping1);
            this.burger.setBurgerExtraTopping2(topping2);
            this.burger.setBurgerExtraTopping3(topping3);
        }
    }

    public void addAdditionalDeluxeToppings(String topping1, String topping2) {
        this.deluxeBurger.setDeluxeExtraTopping1(topping1);
        this.deluxeBurger.setDeluxeExtraTopping2(topping2);
    }

    public void changeDrinkSize(String size) {
        if (!this.burger.getBurgerType().equals("regular")) {
            this.drink = new Drink(drink.getDrinkType(), size);
        }
    }

    public void printItemizedList() {
        System.out.println("*** Meal Order ***");
        if (nonNull(burger)) {
            System.out.println("Burger: " + this.burger.getBurgerType());
            System.out.println("Toppings: " + this.burger.getBurgerExtraTopping1() + ", " + this.burger.getBurgerExtraTopping2() + ", " + this.burger.getBurgerExtraTopping3());
            System.out.println("Price: " + this.burger.getBurgerBasePrice());
        } else if (nonNull(deluxeBurger)) {
            System.out.println("Burger: " + this.deluxeBurger.getBurgerType());
            System.out.println("Toppings: " + this.deluxeBurger.getBurgerExtraTopping1() + ", " + this.deluxeBurger.getBurgerExtraTopping2() + ", " + this.deluxeBurger.getBurgerExtraTopping3() + ", " + this.deluxeBurger.getDeluxeExtraTopping1() + ", " + this.deluxeBurger.getDeluxeExtraTopping2());
            System.out.println("Price: " + deluxeBurger.getBurgerBasePrice());
        }
        System.out.println(" ");
        System.out.println("Drink: " + this.drink.getDrinkType());
        System.out.println("Size: " + this.drink.getDrinkSize());
        System.out.println("Price: " + this.drink.getDrinkPrice());
        System.out.println(" ");
        System.out.println("Side Item: " + this.sideItem.getSideItemType());
        System.out.println("Price: " + this.sideItem.getSideItemPrice());
    }

    public void printTotalMealAmount() {
        double burgerPrice = 0.0;
        if (nonNull(burger)) {
            burgerPrice = this.burger.getBurgerBasePrice();
        } else if (nonNull(deluxeBurger)) {
            burgerPrice = this.deluxeBurger.getBurgerBasePrice();
        }
        System.out.println(" ");
        System.out.println("Total: " + (burgerPrice + this.drink.getDrinkPrice() + this.sideItem.getSideItemPrice()));
    }

}

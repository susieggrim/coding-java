package billsburgerchallenge;

public class BillsBurgerChallenge {

    public static void main(String[] args) {

        System.out.println("===================================");

        System.out.println("Creating default meal: ");
        MealOrder mealOrder = new MealOrder();
        mealOrder.printItemizedList();
        mealOrder.printTotalMealAmount();

        System.out.println("===================================");

        System.out.println("Creating meal: ");
        Burger burger = new Burger("Double cheese burger", 3.25);
        burger.setBurgerExtraTopping1("bacon");
        burger.setBurgerExtraTopping2("mushrooms");
        Drink drink = new Drink("Sprite", "large");
        SideItem sideItem = new SideItem("fries");
        MealOrder mealOrder1 = new MealOrder(burger, drink, sideItem);
        mealOrder1.changeDrinkSize("medium");
        mealOrder1.addAdditionalToppings("avocado");
        mealOrder1.addAdditionalToppings("tomato");
        mealOrder1.printItemizedList();
        mealOrder1.printTotalMealAmount();

        System.out.println("===================================");

        System.out.println("Creating deluxe burger");
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.setBurgerExtraTopping1("cheese");
        deluxeBurger.setBurgerExtraTopping2("bacon");
        deluxeBurger.setBurgerExtraTopping3("mushrooms");
        deluxeBurger.setDeluxeExtraTopping1("fried egg");
        deluxeBurger.setDeluxeExtraTopping2("avocado");
        Drink deluxeDrink = new Drink("Fanta","deluxe");
        SideItem deluxeSideItem = new SideItem("deluxe fries");
        MealOrder deluxeMealOrder = new MealOrder(deluxeBurger, deluxeDrink, deluxeSideItem);
        deluxeMealOrder.changeDrinkSize("small");
        deluxeMealOrder.printItemizedList();
        deluxeMealOrder.printTotalMealAmount();
    }

}

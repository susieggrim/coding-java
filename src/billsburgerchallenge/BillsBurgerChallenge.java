package billsburgerchallenge;

public class BillsBurgerChallenge {

    public static void main(String[] args) {

        System.out.println("Creating default meal: ");
        MealOrder mealOrder = new MealOrder();
        System.out.println("Burger: " + mealOrder.getBurger());
        System.out.println("Drink: " + mealOrder.getDrink());
        System.out.println("Side Item: " + mealOrder.getSideItem());

        System.out.println("===================================");

        System.out.println("Creating meal: ");
        Burger burger = new Burger("Double cheese burger", 3.25);
        burger.setBurgerExtraTopping1("bacon");
        burger.setBurgerExtraTopping2("mushrooms");
        burger.setBurgerExtraTopping3("avocado");
        Drink drink = new Drink("Sprite", "large");
        SideItem sideItem = new SideItem("fries");
        MealOrder mealOrder1 = new MealOrder(burger, drink, sideItem);
        System.out.println("Burger: " + mealOrder1.getBurger());
        System.out.println("Drink: " + mealOrder1.getDrink());
        System.out.println("Side Item: " + mealOrder1.getSideItem());

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

        System.out.println("Burger: " + deluxeMealOrder.getDeluxeBurger());
        System.out.println("Drink: " + deluxeMealOrder.getDrink());
        System.out.println("Side Item: " + deluxeMealOrder.getSideItem());
    }



}

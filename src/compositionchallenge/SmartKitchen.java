package compositionchallenge;

public class SmartKitchen {

    private final CoffeeMaker brewMaster;
    private final DishWasher dishWasher;
    private final Refrigerator iceBox;

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean hasBrewMasterWorkToDo, boolean hasIceBoxWorkToDo, boolean hasDishWasherWorkToDo) {
        brewMaster.setHasWorkToDo(hasBrewMasterWorkToDo);
        iceBox.setHasWorkToDo(hasIceBoxWorkToDo);
        dishWasher.setHasWorkToDo(hasDishWasherWorkToDo);
    }

    public void doKitchenWork() {
        iceBox.orderFood();
        dishWasher.doDishes();
        brewMaster.brewCoffee();
    }

}

package abstractclasschallenge;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public Double getSalePrice(Integer quantity) {
        return quantity * price;
    }

    public void printPricedItem(Integer quantity) {
        System.out.println(quantity + " ".repeat(5 - String.valueOf(quantity).length()) + String.format("%.2f", getSalePrice(quantity)));
    }

    public abstract void showDetails();

}

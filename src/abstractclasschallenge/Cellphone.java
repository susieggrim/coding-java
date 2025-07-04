package abstractclasschallenge;

public class Cellphone extends ProductForSale {

    public Cellphone(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        String formattedPrice = String.format("%.2f", price);
        System.out.print(type + " ".repeat(20 - type.length()) + description + " ".repeat(20 - description.length()) + formattedPrice + " ".repeat(10 - formattedPrice.length()));
    }

}

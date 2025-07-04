package abstractclasschallenge;

import java.util.ArrayList;


/**
 * - Manage a list of products for sale, including displaying the product details
 * - Manage an order, which can just be a list of OrderItems
 */
public class Store {

    private static final ArrayList<ProductForSale> productForSales = new ArrayList<>();

    public static void main(String[] args) {
        productForSales.add(new Cellphone("Smartphone", 130.00, "Android"));
        productForSales.add(new Cellphone("Smartphone", 500.45, "iPhone"));
        productForSales.add(new Laptop("Windows laptop", 550.00, "Small"));

        // Order 1
        ArrayList<OrderItem> order = new ArrayList<>();
        addItemToOrder(order, new OrderItem(4, productForSales.get(1)));
        addItemToOrder(order, new OrderItem(5, productForSales.get(0)));

        printOrderedItems(order);

        // Order 2
        ArrayList<OrderItem> order2 = new ArrayList<>();
        addItemToOrder(order2, new OrderItem(1, productForSales.get(1)));
        addItemToOrder(order2, new OrderItem(1, productForSales.get(2)));

        printOrderedItems(order2);
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, OrderItem orderItem) {
        order.add(orderItem);
    }

    public static void printOrderedItems(ArrayList<OrderItem> order) {
        System.out.println("-".repeat(62));
        System.out.println("Product Type - Description - Price - Quantity - Total");
        System.out.println("-".repeat(62));
        double saleTotal =  0.00;
        for(OrderItem orderItem : order) {
            orderItem.productForSale().showDetails();
            orderItem.productForSale().printPricedItem(orderItem.quantity());
            saleTotal = saleTotal + orderItem.productForSale().getSalePrice(orderItem.quantity());
        }
        System.out.println("-".repeat(62));
        System.out.println("Sale total: $" + String.format("%.2f", saleTotal));

    }

}

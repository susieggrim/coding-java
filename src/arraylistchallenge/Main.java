package arraylistchallenge;

import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> groceryListArray = new ArrayList<>();

        boolean isShutdown = false;

        System.out.println("Available actions: ");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add item(s) to list (comma delimited list)");
        System.out.println("2 - to remove any items (comma delimited list)");

        while (!isShutdown) {
            System.out.println("Enter a number fo which action you want to do:");
            String action = scanner.nextLine();

            switch (action) {
                case "1" -> addItems(groceryListArray);
                case "2"-> removeItem(groceryListArray);
                default -> isShutdown = true;
            }

            groceryListArray.sort(Comparator.naturalOrder());
            System.out.println("Grocery List: " + groceryListArray);
        }
    }

    private static void addItems(ArrayList<String> groceryListArray) {
        System.out.println("Add items, separated by comma");
        String newGroceryItems = scanner.nextLine();
        ArrayList<String> receivedList = new ArrayList<>(List.of(newGroceryItems.split(", ")));
        for (String groceryItem : receivedList) {
            if (!(groceryListArray.contains(groceryItem))) {
                groceryListArray.add(groceryItem);
            }
        }
    }

    private static void removeItem(ArrayList<String> groceryListArray) {
        System.out.println("Add items to be removed, separated by comma");
        String removeGroceryItems = scanner.nextLine();
        ArrayList<String> receivedList = new ArrayList<>(List.of(removeGroceryItems.split(", ")));
        groceryListArray.removeAll(receivedList);
    }

}

package arraylistchallenge;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> groceryListArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isShutdown = false;

        System.out.println("Available actions: ");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add item(s) to list (comma delimited list)");
        System.out.println("2 - to remove any items (comma delimited list)");

        while (!isShutdown) {

            System.out.println("Enter a number fo which action you want to do:");
            String action = scanner.nextLine();

            if (action.equals("0")) {
                isShutdown = true;
            } else {
                if (action.equals("1")) {
                    String newGroceryItems = scanner.nextLine();
                    ArrayList<String> receivedList = new ArrayList<>(List.of(newGroceryItems.split(", ")));
                    for (String groceryItem : receivedList) {
                        if (!(groceryListArray.contains(groceryItem))) {
                            groceryListArray.add(groceryItem);
                        }
                    }
                }
                if (action.equals("2")) {
                    String removeGroceryItems = scanner.nextLine();
                    ArrayList<String> receivedList = new ArrayList<>(List.of(removeGroceryItems.split(", ")));
                    groceryListArray.removeAll(receivedList);
                }
                groceryListArray.sort(Comparator.naturalOrder());
                System.out.println("Grocery List: " + groceryListArray);
            }

        }
    }

}

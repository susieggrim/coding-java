package linkedlistchallenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListChallenge {

    public static void main(String[] args) {
        LinkedList<Town> townLinkedList = createListOfPlaces();
        Scanner scanner = new Scanner(System.in);
        printMenu();
        String option = "M";
        var iterator = townLinkedList.listIterator();
        boolean isForward = false;

        while(!option.equals("Q")) {
            option = scanner.nextLine();
            switch (option) {
                case "F" -> isForward = getNext(iterator, isForward);
                case "B" -> isForward = getPrevious(iterator, isForward);
                case "L" -> printListOfPlaces(townLinkedList);
                case "M" -> printMenu();
            };
        }

    }


    private static LinkedList<Town> createListOfPlaces() {
        LinkedList<Town> townLinkedList = new LinkedList<>();
        townLinkedList.add(new Town("Sidney", 0));
        townLinkedList.add(new Town("Melbourne", 877));
        townLinkedList.add(new Town("Brisbane", 917));
        townLinkedList.add(new Town("Adelaide", 1374));
        townLinkedList.add(new Town("Alice Springs", 2771));
        townLinkedList.add(new Town("Perth", 3923));
        townLinkedList.add(new Town("Darwin", 3972));
        return townLinkedList;
    }

    private static boolean getNext(ListIterator<Town> iterator, boolean isForward) {
        if (!isForward && iterator.hasNext()) {
            iterator.next();
        }
        if (iterator.hasNext()) {
            Town town = iterator.next();
            System.out.println(town.town() + " - " + town.distance());
        } else{
            System.out.println("Unable to continue. You have arrived to your destination!");
        }
        return true;
    }

    private static boolean getPrevious(ListIterator<Town> iterator, boolean isForward) {
        if (isForward && iterator.hasPrevious()) {
            iterator.previous();
        }
        if (iterator.hasPrevious()) {
            Town town = iterator.previous();
            System.out.println(town.town() + " - " + town.distance());
        } else{
            System.out.println("Unable to go backward. You're in your initial point");
        }
        return false;
    }

    private static LinkedList<Town> printListOfPlaces(LinkedList<Town> townLinkedList) {
        for (Town town : townLinkedList) {
            System.out.println(town.town() + " - " + town.distance());
        }
        return townLinkedList;
    }

    private static void printMenu() {
        System.out.println("Available actions (select word or letter");
        System.out.println("(F)orward");
        System.out.println("(B)ackward");
        System.out.println("(L)ist Places");
        System.out.println("(M)enu");
        System.out.println("(Q)uit");
    }

}

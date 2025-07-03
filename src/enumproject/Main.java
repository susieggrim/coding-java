package enumproject;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay = getRandoDay();

            System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());

            if (weekDay == DayOfTheWeek.FRI) {
                System.out.println("Found a Friday!!!");
            }
        }

    }

    public static DayOfTheWeek getRandoDay() {
        int randomInteger = new Random().nextInt(7);

        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }

}

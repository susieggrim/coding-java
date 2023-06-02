public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println("3945s = " + getDurationString(-3945));
        System.out.println("65min, 45s = " + getDurationString(-65, 45));
        System.out.println("65min, 45s = " + getDurationString(65, 145));
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            return getDurationString(seconds/60, seconds%60);
        }
        return "Invalid parameter";
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0) && seconds <= 59) {
            return minutes/60 + "h " + minutes%60 + "m " + seconds + "s";
        }
        return "Invalid parameters";
    }
}

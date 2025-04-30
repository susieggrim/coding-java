package linkedlistchallenge;

public class Town {

    private final String town;
    private final int distance;

    public String getTown() {
        return town;
    }

    public int getDistance() {
        return distance;
    }

    public Town(String town, int distance) {
        this.town = town;
        this.distance = distance;
    }
}

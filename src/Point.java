public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        Point pointB = new Point(0, 0);
        return Math.sqrt((pointB.getX() - this.x) * (pointB.getX() - this.x) + (pointB.getY() - this.y) * (pointB.getY() - this.y));
    }

    public double distance(Point pointB) {
        return Math.sqrt((pointB.getX() - this.x) * (pointB.getX() - this.x) + (pointB.getY() - this.y) * (pointB.getY() - this.y));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

}

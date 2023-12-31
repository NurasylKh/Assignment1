package Models;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point destination) {
        double dx = this.x - destination.x;
        double dy = this.y - destination.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }
}

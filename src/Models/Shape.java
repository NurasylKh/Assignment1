package Models;

import java.util.List;

public class Shape {
    private List<Point> points;

    public Shape(List<Point> points) {
        this.points = points;
    }

    public double Perimeter() {
        double perimeter = 0.0;
        int size = points.size();
        for (int i = 0; i < size; i++) {
            perimeter += points.get(i).distance(points.get((i + 1) % size));
        }
        return perimeter;
    }

    public double LongestSide() {
        double longSide = 0.0;
        int size = points.size();
        for (int i = 0; i < size; i++) {
            longSide = Math.max(longSide, points.get(i).distance(points.get((i + 1) % size)));
        }
        return longSide;
    }

    public double AverageSide() {
        return Perimeter() / points.size();
    }
}

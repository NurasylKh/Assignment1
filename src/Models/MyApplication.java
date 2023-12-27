package Models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\ASUS\\IdeaProjects\\untitled2\\src\\Models\\source");

        Scanner sc = new Scanner(file);
        List<Point> points = new ArrayList<>();

        while (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            points.add(new Point(x, y));
        }

        Shape shape = new Shape(points);

        System.out.println("Perimeter: " + shape.Perimeter());
        System.out.println("Longest Side: " + shape.LongestSide());
        System.out.println("Average Side: " + shape.AverageSide());
    }
}

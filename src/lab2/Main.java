package lab2;
//import com.company.Circle;
//import com.company.Point;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(30,40,50));
        shapes.add(new Circle(20));
        shapes.add(new Rectangle(4, 7));
        shapes.add(new Square(33.5));
        shapes.add(new Circle(-12));
        shapes.add(new Triangle(0, 0, 0));
        double sumArea = 0;
        Shape maxPerimeter = shapes.get(0), maxArea = shapes.get(0), minPerimeter = shapes.get(0), minArea = shapes.get(0);
        for (Shape current: shapes) {
            if (current.calcArea() > maxArea.calcArea())
                maxArea = current;
            if (current.calcPerimeter() > maxPerimeter.calcPerimeter())
                maxPerimeter = current;
            if (current.calcArea() <  minArea.calcArea())
                minArea = current;
            if (current.calcPerimeter() < minPerimeter.calcPerimeter())
                minPerimeter = current;
            sumArea += current.calcArea();
        }
        System.out.println("Суммарная площадь фигур: " + sumArea);
        System.out.println("Наибольшей площадью обладает " + maxArea.toString());
        System.out.println("Наибольшим периметром обладает " + maxPerimeter.toString());
        System.out.println("Наименьшей площадью обладает " + minArea.toString());
        System.out.println("Наименьшим периметром обладает " + minPerimeter.toString());
    }
}

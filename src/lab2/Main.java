package lab2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Shape maxPerimeter, maxArea , minPerimeter, minArea;
        ArrayList<Shape> shapes = new ArrayList<>();
            shapes.add(new Triangle(30,40,50));
        try {
            shapes.add(new Circle(-1200000));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
            shapes.add(new Rectangle(4, 7));
            shapes.add(new Square(10));
            shapes.add(new Square(33.5));
            double sumArea = 0;
            try{
            maxPerimeter = shapes.get(0);
            maxArea = shapes.get(0);
            minPerimeter = shapes.get(0);
            minArea = shapes.get(0);}
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Empty list");
                return;
            }
            for (Shape current : shapes) {
                if (current.calcArea() > maxArea.calcArea())
                    maxArea = current;
                if (current.calcPerimeter() > maxPerimeter.calcPerimeter())
                    maxPerimeter = current;
                if (current.calcArea() < minArea.calcArea())
                    minArea = current;
                if (current.calcPerimeter() < minPerimeter.calcPerimeter())
                    minPerimeter = current;
                sumArea += current.calcArea();
            }
            System.out.println("Суммарная площадь фигур: " + sumArea);
            System.out.println("Наибольшей площадью обладает " + maxArea);
            System.out.println("Наибольшим периметром обладает " + maxPerimeter);
            System.out.println("Наименьшей площадью обладает " + minArea);
            System.out.println("Наименьшим периметром обладает " + minPerimeter);
    }
}

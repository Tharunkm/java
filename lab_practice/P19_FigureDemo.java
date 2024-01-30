package lab_practice;

import java.util.Scanner;

import lab_practice.Rectangle;
import lab_practice.Triangle;

public class P19_FigureDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length and width for Rectangle: ");
        double lengthRectangle = scanner.nextDouble();
        double widthRectangle = scanner.nextDouble();

        System.out.print("Enter base and height for Triangle: ");
        double baseTriangle = scanner.nextDouble();
        double heightTriangle = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(lengthRectangle, widthRectangle);
        Triangle triangle = new Triangle(baseTriangle, heightTriangle);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}

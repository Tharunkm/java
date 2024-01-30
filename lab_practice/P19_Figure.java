package lab_practice;

public class P19_Figure {
    double dimension1;
    double dimension2;

    public P19_Figure(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double area() {
        return 0; // Default implementation, to be overridden by subclasses
    }
}

class Rectangle extends P19_Figure {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double area() {
        return dimension1 * dimension2;
    }
}

class Triangle extends P19_Figure {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double area() {
        return 0.5 * dimension1 * dimension2;
    }
}
	



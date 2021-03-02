package day9.Task2;

public class Triangle extends Figure {
    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle(double lengthA, double lengthB, double lengthC, String color) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    public double area() {
        double semiPerimeter = (lengthA + lengthB + lengthC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - lengthA) * (semiPerimeter - lengthB) * (semiPerimeter - lengthC));
    }

    public double perimeter() {
        return lengthA + lengthB + lengthC;
    }
}

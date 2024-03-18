// Base class Shape
class Shape {
    // Method to calculate area of a shape
    public double calculateArea() {
        return 0; // Default implementation for unknown shapes
    }

    // Method overloading to calculate area of a shape with parameters
    public double calculateArea(double radius) {
        return Math.PI * radius * radius; // Area of circle
    }

    // Method overloading to calculate area of a shape with parameters
    public double calculateArea(double length, double width) {
        return length * width; // Area of rectangle
    }
}

// Subclass Rectangle inheriting from Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method overriding to calculate area of a rectangle
    @Override
    public double calculateArea() {
        return length * width; // Area of rectangle
    }
}

public class OverRiddingOverLoading {
    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle rectangle = new Rectangle(5, 4);

        // Calling methods
        System.out.println("Area of rectangle (method overriding): " + rectangle.calculateArea());
        System.out.println("Area of circle (method overloading): " + rectangle.calculateArea(3.0));
        System.out.println("Area of rectangle (method overloading): " + rectangle.calculateArea(5.0, 4.0));
    }
}

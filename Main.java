import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the radius of the circle: ");
            double circleRadius = scanner.nextDouble();
            Circle circle = new Circle("Red", circleRadius);

            System.out.print("Enter the length of the rectangle: ");
            double rectangleLength = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double rectangleWidth = scanner.nextDouble();
            Rectangle rectangle = new Rectangle("Blue", rectangleLength, rectangleWidth);

            System.out.println("Circle Area: " + circle.getArea());
            System.out.println("Circle Perimeter: " + circle.getPerimeter());
            System.out.println("Circle Color: " + circle.getColor());

            System.out.println("Rectangle Area: " + rectangle.getArea());
            System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
            System.out.println("Rectangle Color: " + rectangle.getColor());

            circle.draw();
            rectangle.draw();
        } catch (java.util.InputMismatchException e) {
            System.err.println("Invalid input! Please enter valid numeric values for dimensions.");
        } finally {
            scanner.close();
        }
    }
}

abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }
}


class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

	public void draw() {
		// TODO Auto-generated method stub
		
	}
}


interface Drawable {
    void draw();
}


class Rectangle extends Shape implements Drawable {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with length " + length + " and width " + width);
    }
}



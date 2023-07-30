import java.util.Scanner;


//Main.java
public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         System.out.print("Enter the radius of the circle: ");
         double circleRadius = Double.parseDouble(scanner.nextLine());
         Circle circle = new Circle("Red", circleRadius);

         System.out.print("Enter the length of the rectangle: ");
         double rectangleLength = Double.parseDouble(scanner.nextLine());
         System.out.print("Enter the width of the rectangle: ");
         double rectangleWidth = Double.parseDouble(scanner.nextLine());
         Rectangle rectangle = new Rectangle("Blue", rectangleLength, rectangleWidth);

         System.out.println("Circle Area: " + circle.getArea());
         System.out.println("Circle Perimeter: " + circle.getPerimeter());
         System.out.println("Circle Color: " + circle.getColor());

         System.out.println("Rectangle Area: " + rectangle.getArea());
         System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
         System.out.println("Rectangle Color: " + rectangle.getColor());

         circle.draw();
         rectangle.draw();
     } catch (NumberFormatException e) {
         System.err.println("Invalid input! Please enter valid numeric values for dimensions.");
     } finally {
         scanner.close();
     }
 }}

// Shape.java
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

// Circle.java
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

// Drawable.java
interface Drawable {
    void draw();
}

// Implementing Drawable in Circle and Rectangle
class Rectangle extends Shape implements Drawable {  // Rectangle implements Drawable
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



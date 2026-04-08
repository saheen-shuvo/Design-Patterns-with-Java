// TODO: Define an abstract class called 'Shape' that implements 'Cloneable'
public abstract class Shape implements Cloneable {

    // TODO: Define a private field 'color' of type String
    private String color;

    // TODO: Create a constructor that takes a 'color' parameter and sets the color field
    public Shape(String color) {
        this.color = color;
    }

    // TODO: Create a 'getColor' method that returns the color
    public String getColor() {
        return color;
    }

    // TODO: Define an abstract method named 'cloneShape'
    public abstract Shape cloneShape();

    // TODO: Override the 'clone' method from 'Cloneable' interface
    @Override
    protected Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

// TODO: Define a class called 'Circle' that extends 'Shape'
public class Circle extends Shape {

    // TODO: Define a private field 'radius' of type int
    private int radius;

    // TODO: Create a constructor that takes 'color' and 'radius' parameters and initializes the fields
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    // TODO: Create a 'getRadius' method that returns the radius
    public int getRadius() {
        return radius;
    }

    // TODO: Implement the 'cloneShape' method which returns a new Circle object with the same color and radius
    @Override
    public Shape cloneShape() {
        return new Circle(getColor(), radius);
    }

    // TODO: Create a method 'showDetails' to print the details of the Circle
    public void showDetails() {
        System.out.println("Shape: Circle, Color: " + getColor() + ", Radius: " + radius);
    }
}

// TODO: Define a class called 'Rectangle' that extends 'Shape'
public class Rectangle extends Shape {

    // TODO: Define private fields 'width' and 'height' of type int
    private int width;
    private int height;

    // TODO: Create a constructor that takes 'color', 'width', and 'height' parameters and initializes the fields
    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // TODO: Create 'getWidth' and 'getHeight' methods that return the width and height respectively
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // TODO: Implement the 'cloneShape' method which returns a new Rectangle object with the same color, width, and height
    @Override
    public Shape cloneShape() {
        return new Rectangle(getColor(), width, height);
    }

    // TODO: Create a method 'showDetails' to print the details of the Rectangle
    public void showDetails() {
        System.out.println("Shape: Rectangle, Color: " + getColor() + ", Width: " + width + ", Height: " + height);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create an original Circle object and a clone of it
        Circle originalCircle = new Circle("Red", 10);
        Circle clonedCircle = (Circle) originalCircle.cloneShape();

        // TODO: Display details of the original and cloned circles
        originalCircle.showDetails();
        clonedCircle.showDetails();

        // TODO: Create an original Rectangle object and a clone of it
        Rectangle originalRectangle = new Rectangle("Blue", 20, 15);
        Rectangle clonedRectangle = (Rectangle) originalRectangle.cloneShape();

        // TODO: Display details of the original and cloned rectangles
        originalRectangle.showDetails();
        clonedRectangle.showDetails();
    }
}
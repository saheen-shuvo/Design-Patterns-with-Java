// TODO: Define the Vehicle class with private members make and year of string and int type respectively
public class Vehicle {
    private String make;
    private int year;

    // Define a public constructor that initializes the make and year members
    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    // Define a drive method that shows a message "Driving a vehicle made by make in the year year"
    public void drive() {
        System.out.println("Driving a vehicle made by " + make + " in the year " + year);
    }
}

// TODO: Define the Car class that inherits from Vehicle
public class Car extends Vehicle {

    // Define an additional private member model of string type
    private String model;

    // Define a public constructor that initializes make, year, and model using the superclass constructor
    public Car(String make, int year, String model) {
        super(make, year);
        this.model = model;
    }

    // Define a displayDetails method that calls the drive method and then shows the model "The model is model"
    // In the displayDetails method, make use of the drive method from the Vehicle class
    public void displayDetails() {
        drive();
        System.out.println("The model is " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create an object of Car and call the displayDetails method to show its details
        Car car = new Car("Toyota", 2022, "Corolla");
        car.displayDetails();
    }
}
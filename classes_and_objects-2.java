public class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Copy constructor
    public Car(Car other) {
        this.year = other.year;
        this.brand = other.brand;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 2021);
        car.display();

        Car carCopy = new Car(car);
        carCopy.display();
    }
}

//output:
//Brand: Tesla, Year: 2021
//Brand: Tesla, Year: 2021
public class Car {

    // Required parameters
    private String make;
    private String model;

    // Optional parameters
    private boolean hasSunroof;
    private boolean hasGPS;
    private boolean hasHeatedSeats;

    // Private constructor to enforce the use of the builder
    private Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.hasSunroof = builder.hasSunroof;
        this.hasGPS = builder.hasGPS;
        this.hasHeatedSeats = builder.hasHeatedSeats;
    }

    // Getters (optional)
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean hasSunroof() {
        return hasSunroof;
    }

    public boolean hasGPS() {
        return hasGPS;
    }

    public boolean hasHeatedSeats() {
        return hasHeatedSeats;
    }

    // TODO: Implement the static nested CarBuilder class
    public static class CarBuilder {
        // TODO: Declare the required and optional parameters
        private final String make;
        private final String model;

        private boolean hasSunroof = false;
        private boolean hasGPS = false;
        private boolean hasHeatedSeats = false;

        // TODO: Implement the constructor for the required parameters
        public CarBuilder(String make, String model) {
            this.make = make;
            this.model = model;
        }

        // TODO: Implement setters for the optional parameters
        public CarBuilder setSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public CarBuilder setGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        public CarBuilder setHeatedSeats(boolean hasHeatedSeats) {
            this.hasHeatedSeats = hasHeatedSeats;
            return this;
        }

        // TODO: Implement the build method that returns a new Car object
        public Car build() {
            return new Car(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Use the CarBuilder to build a Car object with make, model, and optional parameters
        Car car = new Car.CarBuilder("Toyota", "Corolla")
                .setSunroof(true)
                .setGPS(true)
                .setHeatedSeats(true)
                .build();

        // TODO: Print out some of the Car properties using the getters
        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Has Sunroof: " + car.hasSunroof());
        System.out.println("Has GPS: " + car.hasGPS());
        System.out.println("Has Heated Seats: " + car.hasHeatedSeats());
    }
}
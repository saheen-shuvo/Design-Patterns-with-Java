public interface Car {
    String assemble();
}

public class BasicCar implements Car {
    @Override
    public String assemble() {
        return "Basic Car";
    }
}

public class CarDecorator implements Car {
    private Car decoratedCar;

    public CarDecorator(Car car) {
        this.decoratedCar = car;
    }

    @Override
    public String assemble() {
        return decoratedCar.assemble();
    }
}

public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " + Sports Car Features";
    }
}

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " + Luxury Car Features";
    }
}

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        System.out.println(sportsCar.assemble()); // Outputs: Basic Car + Sports Car Features

        Car luxuryCar = new LuxuryCar(new BasicCar());
        System.out.println(luxuryCar.assemble()); // Outputs: Basic Car + Luxury Car Features
    }
}
// TODO: Define the Beverage interface with a method getDescription returning String
public interface Beverage {
    String getDescription();
}

// TODO: Implement the Beverage interface in BasicCoffee class
// TODO: Define the getDescription method to return "Black Coffee"
public class BasicCoffee implements Beverage {

    @Override
    public String getDescription() {
        return "Black Coffee";
    }
}

// TODO: Implement the Beverage interface in BeverageDecorator class
// TODO: Add a private Beverage variable named decoratedBeverage
// TODO: Create a constructor that takes a Beverage object and assigns it to decoratedBeverage
// TODO: Implement the getDescription method that returns decoratedBeverage.getDescription()
public class BeverageDecorator implements Beverage {
    private Beverage decoratedBeverage;

    public BeverageDecorator(Beverage beverage) {
        this.decoratedBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription();
    }
}

// TODO: Extend the BeverageDecorator class in MilkDecorator
// TODO: Create a constructor that takes a Beverage object and passes it to the BeverageDecorator constructor
// TODO: Override the getDescription method to add " + Milk" to the base description.
public class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Milk";
    }
}

// TODO: Extend the BeverageDecorator class in SugarDecorator
// TODO: Create a constructor that takes a Beverage object and passes it to the BeverageDecorator constructor
// TODO: Override the getDescription method to add " + Sugar" to the base description.
public class SugarDecorator extends BeverageDecorator {

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Sugar";
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create instances of BasicCoffee and wrap them using MilkDecorator and SugarDecorator.
        // Print the final descriptions.

        Beverage coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription()); // Output: Black Coffee + Milk + Sugar
    }
}
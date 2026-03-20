public enum Fruit {
    APPLE(52, 10),
    ORANGE(47, 8),
    BANANA(96, 12),
    GRAPE(69, 17);

    // immutable using final fields
    private final int calories;  // calories per 100 grams
    private final int sugar;     // sugar in grams per 100 grams

    // Constructor
    Fruit(int calories, int sugar) {
        this.calories = calories;
        this.sugar = sugar;
    }

    // Accessor methods
    public int getCalories() {
        return calories;
    }

    public int getSugar() {
        return sugar;
    }

    // Calculate the sugar-to-calorie ratio
    public double sugarToCalorieRatio() {
        return (double) sugar / calories;
    }
}

public class Main {
    public static void main(String[] args) {
        for (Fruit fruit : Fruit.values()) {
            System.out.println(fruit + ": calories = " + fruit.getCalories() + ", sugar = " + fruit.getSugar()
                + ", sugar-to-calorie ratio = " + fruit.sugarToCalorieRatio());
        }
    }
}
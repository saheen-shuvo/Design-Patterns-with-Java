public class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public void showSpecies() {
        System.out.println("Species: " + species);
    }
}

// TODO: Define the Bird class that extends Animal
// Add a private member variable color of string type
// Define a public constructor that initializes species and color using the superclass constructor
// Implement a displayColor method to show a message "Color: color". The method should only contain one line that prints the color.

public class Bird extends Animal {
    private String color;

    public Bird(String species, String color) {
        super(species);
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create a Bird object with species "Parrot" and color "Green"
        Bird bird = new Bird("Parrot", "Green");

        // TODO: Call the showSpecies method to display the species
        bird.showSpecies();

        // TODO: Call the displayColor method to display the color
        bird.displayColor();
    }
}
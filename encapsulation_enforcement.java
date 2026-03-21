public class Superhero {
    private String alias;
    private int strength;

    // Constructor
    public Superhero(String alias, int strength) {
        this.alias = alias;
        this.strength = strength;
    }

    // TODO: Define the setAlias method
    public void setAlias(String alias) {
        this.alias = alias;
    }

    // TODO: Define the setStrength method
    public void setStrength(int strength) {
        this.strength = strength;
    }

    // TODO: Define the getAlias method
    public String getAlias() {
        return alias;
    }

    // TODO: Define the getStrength method
    public int getStrength() {
        return strength;
    }
}

public class Main {
    public static void main(String[] args) {
        Superhero hero = new Superhero("Iron Man", 85);

        // TODO: Use setAlias and setStrength methods to change the values to "Doctor Strange" and 95
        hero.setAlias("Doctor Strange");
        hero.setStrength(95);

        // TODO: Print the alias and strength using getAlias and getStrength methods
        System.out.println("Alias: " + hero.getAlias());
        System.out.println("Strength: " + hero.getStrength());
    }
}
public abstract class Hero implements Cloneable {

    private String alias;

    // Constructor
    public Hero(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    // TODO: Declare an abstract method named 'cloneHero'
    public abstract Hero cloneHero();

    @Override
    protected Hero clone() {
        try {
            return (Hero) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

public class FlyingHero extends Hero {

    private String power;

    // Constructor
    public FlyingHero(String alias, String power) {
        super(alias);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    // TODO: Implement the 'cloneHero' method
    @Override
    public Hero cloneHero() {
        return new FlyingHero(getAlias(), power);
    }

    public void showDetails() {
         // TODO: Print hero details
        System.out.println("Hero Alias: " + getAlias() + ", Power: " + power);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create an original FlyingHero object with alias "SkyDiver" and power "Super Flight" and a clone of it
        FlyingHero originalHero = new FlyingHero("SkyDiver", "Super Flight");
        FlyingHero clonedHero = (FlyingHero) originalHero.cloneHero();

        // TODO: Display details of the original and cloned heroes
        originalHero.showDetails();
        clonedHero.showDetails();

        // Should Output: Hero Alias: SkyDiver, Power: Super Flight

        // Should Output: Hero Alias: SkyDiver, Power: Super Flight
    }
}
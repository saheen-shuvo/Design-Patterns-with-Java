// TODO: Define the Superhero enum
public enum Superhero{
    // TODO: Define the constants SUPERMAN, BATMAN, WONDER_WOMAN, and SPIDERMAN with their respective power levels and year introduced
    SUPERMAN(1, 2017),
    BATMAN(8, 2018),
    WONDER_WOMAN(2, 2021),
    SPIDERMAN(7, 2025);
    
    // TODO: Create private final int fields for power level and year introduced
    private final int power;
    private final int year;
    
    // TODO: Implement a constructor that accepts power level and year introduced as parameters and initializes the corresponding fields
    Superhero(int power, int year){
        this.power = power;
        this.year = year;
    }
    
    // TODO: Write accessor methods getPowerLevel() and getYearIntroduced() returning int values
    public int getPowerLevel(){
        return power;
    }
    public int getYearIntroduced(){
        return year;
    }
}

// TODO: Iterate over all values of the Superhero enum and print out the power level and year introduced for each superhero
public class Main {
    public static void main(String[] args) {
        // TODO: Implement the loop to iterate and print details of superheroes here 
        for(Superhero s : Superhero.values()){
            System.out.println(s + ": power level = " + s.getPowerLevel() + ", year introduced = "
                + s.getYearIntroduced());
        }
    }
}
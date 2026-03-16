class Musician {
    private String name;
    private String instrument;
    private int yearsActive;

    public Musician(String name, String instrument, int yearsActive) {
        this.name = name;
        this.instrument = instrument;
        this.yearsActive = yearsActive;
    }
    public void display() {
        System.out.println("Name: " + name + ", Instrument: " + instrument + ", Year Active: " + yearsActive);
    }
}

public class classes_and_objects {
    public static void main(String[] args) {
        Musician musician = new Musician("John", "Guitar", 5);
        musician.display();
    }
}

//output:
//Name: John, Instrument: Guitar, Year Active: 5
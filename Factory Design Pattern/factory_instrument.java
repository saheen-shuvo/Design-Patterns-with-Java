// TODO: Define an abstract class Instrument with a method called play
public abstract class Instrument {
    public abstract void play();
}

// TODO: Create a class Guitar that extends Instrument and implements the play method
public class Guitar extends Instrument {

    @Override
    public void play() {
        System.out.println("Playing guitar...");
    }
}

// TODO: Create a class Piano that extends Instrument and implements the play method
public class Piano extends Instrument {

    @Override
    public void play() {
        System.out.println("Playing piano...");
    }
}

// TODO: Create a class NullInstrument that extends Instrument and implements the play method
public class NullInstrument extends Instrument {

    @Override
    public void play() {
        System.out.println("No instrument to play.");
    }
}

// TODO: Create a class InstrumentFactory with an enum for InstrumentType
public class InstrumentFactory {

    public enum InstrumentType {
        GUITAR,
        PIANO
    }

    // TODO: Add a factory method to create instruments based on the type
    public static Instrument getInstrument(InstrumentType type) {

        // Handle null safely (Null Object Pattern)
        if (type == null) {
            return new NullInstrument();
        }

        switch (type) {
            case GUITAR:
                return new Guitar();
            case PIANO:
                return new Piano();
            default:
                return new NullInstrument();
        }
    }
}

// TODO: Create a Main class to test the Instrument factory method
public class Main {
    public static void main(String[] args) {
        // TODO: Use the InstrumentFactory to create a Guitar and call the play method
        Instrument guitar = InstrumentFactory.getInstrument(InstrumentFactory.InstrumentType.GUITAR);
        guitar.play();

        // TODO: Use the InstrumentFactory to create a Piano and call the play method
        Instrument piano = InstrumentFactory.getInstrument(InstrumentFactory.InstrumentType.PIANO);
        piano.play();

        // TODO: Use the InstrumentFactory to create an unsupported instrument (null) and call the play method
        Instrument unknown = InstrumentFactory.getInstrument(null);
        unknown.play();
    }
}
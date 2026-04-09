// TODO: Define the Hdmi interface
// It should have a method: void connectWithHdmiCable();

public interface Hdmi {
    void connectWithHdmiCable();
}

// TODO: Create the Vga class
// It should have a method: void connectWithVgaCable() that prints "Connected with VGA cable."

public class Vga {
    public void connectWithVgaCable() {
        System.out.println("Connected with VGA cable.");
    }
}

// TODO: Implement the HdmiAdapter class
// It should implement the Hdmi interface
// It should have a private instance of Vga
// It should have a constructor to initialize the Vga instance
// Implement the connectWithHdmiCable method to call connectWithVgaCable on the Vga instance

public class HdmiAdapter implements Hdmi {

    private Vga vga;

    public HdmiAdapter(Vga vga) {
        this.vga = vga;
    }

    @Override
    public void connectWithHdmiCable() {
        vga.connectWithVgaCable();
    }
}
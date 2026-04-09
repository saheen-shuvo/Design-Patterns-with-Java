public interface Usb {
    void connectWithUsbCable();
}

public class MicroUsb {
    public void connectWithMicroUsbCable() {
        System.out.println("Connected with MicroUSB cable.");
    }
}

public class Adapter implements Usb {
    private MicroUsb microUsb;

    public Adapter(MicroUsb microUsb) {
        this.microUsb = microUsb;
    }

    @Override
    public void connectWithUsbCable() {
        microUsb.connectWithMicroUsbCable();
    }
}

public class Main {
    public static void main(String[] args) {
        MicroUsb microUsb = new MicroUsb();
        Usb adapter = new Adapter(microUsb);
        adapter.connectWithUsbCable(); // Outputs: Connected with MicroUSB cable.
    }
}
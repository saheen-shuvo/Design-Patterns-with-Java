public class Singleton {

    // Private constructor to prevent instantiation
    private Singleton() { }

    // Static inner helper class
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    // Public method to access the instance
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

public class Main {
    public static void main(String[] args) {

        // Create two references using getInstance()
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Compare both references
        if (singleton1 == singleton2) {
            System.out.println("Both references point to the same Singleton instance.");
        } else {
            System.out.println("The references point to different instances.");
        }
    }
}
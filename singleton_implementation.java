// TODO: Implement the Singleton pattern for this class
public class SessionManager {

    // TODO: Create a private constructor to prevent instantiation from other classes
    // Print statement to indicate the constructor is only called once per JVM
    private SessionManager() {
        System.out.println("SessionManager instance created.");
    }

    // TODO: Create a static inner helper class that holds the Singleton instance
    private static class SessionManagerHelper {
        private static final SessionManager INSTANCE = new SessionManager();
    }

    // TODO: Create a public method to provide access to the Singleton instance
    public static SessionManager getInstance() {
        return SessionManagerHelper.INSTANCE;
    }
}

// TODO: Use the Main class to test the Singleton pattern
public class Main {
    public static void main(String[] args) {
        // TODO: Get the Singleton instance using getInstance() method
        SessionManager s1 = SessionManager.getInstance();

        // TODO: Call the getInstance method again to demonstrate Singleton behavior
        SessionManager s2 = SessionManager.getInstance();

        // Verify both are the same instance
        System.out.println(s1 == s2);
    }
}
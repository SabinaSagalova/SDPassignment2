package singleton;

public class DatabaseConnection {

    // 1) Here is creating of a private static variable in order to hold the single instance of the class
    private static volatile DatabaseConnection instance;

    // Then we make the constructor private
    private DatabaseConnection() {
        // It is made to prevent instantiation
    }

    // After it, we provide a static method to get the single instance of the class, and it is with lazy initialization and thread safety.
    public static DatabaseConnection getInstance() {
        if (instance == null) { // First checking (without locking)
            synchronized (DatabaseConnection.class) {
                if (instance == null) { // Second checking (with locking)
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    // The next is method to simulate connecting to database, just in text
    public void connect() {
        System.out.println("Connected to the database.");
    }

    // The same but here is disconnecting from database
    public void disconnect() {
        System.out.println("Disconnected from the database.");
    }
}

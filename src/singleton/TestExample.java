package singleton;

public class TestExample {
    public static void main(String[] args) {

        // Here is example if there will be attempt to create multiple instances of DBConnection:
        DatabaseConnection DB1 = DatabaseConnection.getInstance();
        DatabaseConnection DB2 = DatabaseConnection.getInstance();

        // Here is checking if both references point to the same object being returned:
        System.out.println("Are DB1 and DB2 the same instance? " + (DB1 == DB2)); // It should be true

        // And the using of the connect and disconnect methods:
        DB1.connect(); // "Connected to database."
        DB2.disconnect(); // "Disconnected from database."
    }
}



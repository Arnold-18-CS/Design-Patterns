package Singleton_Design_Pattern;

import java.sql.*;

public class Singleton {
    private static Singleton instance = null;
    private int counter = 0;

    private Singleton() {
        // Private constructor to prevent direct instantiation.
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static boolean instanceExists(Singleton instance) {

        if(instance!=null)
            return true;
        else
            return false;

    }

    public static void upload() throws RuntimeException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mybd", "root", "");
            System.out.println("DATABASE CONNECTION SUCCESS");

            Statement statement = connection.createStatement();
            String insertOperation = "INSERT INTO `singleton`(`singleton`) VALUES ('"+ instance + "')";
            getInstance();
            statement.execute(insertOperation); // we use .execute() because INSERT is an OPERATION NOT QUERY




        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

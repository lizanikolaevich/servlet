package by.bsuir.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseManager {
    private static final String URL = "jdbc:mariadb://localhost:3306/BookLibrary";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}

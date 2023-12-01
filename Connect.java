import org.jetbrains.annotations.NotNull;
import org.sqlite.SQLiteConnectionConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Connect {

    public Connect() {
    }

    public Connection connect() {
        Connection conn = null;
        try {
            // db parameters
                String url = "jdbc:sqlite:C:/Users/Halyna/IdeaProjects/SimpleBankApp-v1.0-/demoDB.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");
            return conn;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return null;
    }

    public void close(@NotNull Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

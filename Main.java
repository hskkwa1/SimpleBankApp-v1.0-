import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        String sql = "SELECT * FROM User";
        Connect connect = new Connect();
        try {
            Connection connection = connect.connect();
            Statement stmt  = connection.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" +
                        rs.getString("name") + "\t" +
                        rs.getString("lastName"));
            }
            connect.close(connection);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}


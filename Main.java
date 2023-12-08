import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        String sql = "SELECT balance,customerId FROM BankAccounts ORDER BY balance ASC ";
        String sql2 = "SELECT id,name FROM User";
        Connect connect = new Connect();
        try {
            Connection connection = connect.connect();
            Statement stmt = connection.createStatement();
            Statement stmt2 = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);


            // loop through the result set
            while (rs.next()) {
                ResultSet rs2 = stmt2.executeQuery(sql2);
                double balance = 0;
                String name = null;
                balance = rs.getDouble("balance");

                while (rs2.next()){
                    if(rs.getInt("customerId") == rs2.getInt("id")){
                        name = rs2.getString("name");
                    }
                }

                rs2.beforeFirst();

                System.out.println(name+ " " + balance);

            }
            connect.close(connection);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}


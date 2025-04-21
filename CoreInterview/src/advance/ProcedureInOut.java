package advance;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedureInOut {

    public static void main(String[] args) {

        Connection conn = null;
        CallableStatement callStmt = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_int", "root", "root");

            // Prepare the callable statement to call stored procedure
            callStmt = conn.prepareCall("{CALL empInOut(?)}");

            // Set the input parameter for the stored procedure
            callStmt.setInt(1, 10);

            // Register the output parameter
            callStmt.registerOutParameter(1, Types.INTEGER);
            // Execute the stored procedure
            callStmt.execute();

            // Retrieve and print the output parameter
            System.out.println(callStmt.getInt(1));

        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources in finally block to ensure they are always released
            try {
                if (callStmt != null) {
                    callStmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}

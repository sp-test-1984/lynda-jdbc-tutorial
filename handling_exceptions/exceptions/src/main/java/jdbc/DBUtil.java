package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String M_CONN =
            "jdbc:mysql://localhost/explorecalifornia";

    private static final String USER = "dbuser";
    private static final String PASSWORD = "dbpassword";

    public static Connection getConnection(DBType dbType) throws SQLException {
        switch (dbType){
            case MYSQL:
                return DriverManager.getConnection(M_CONN, USER, PASSWORD);
            case HSQLDB:
                return null;
                default:
                    return null;
        }
    }


    public static void processException(SQLException e){
        System.err.println("message: " + e.getMessage());
        System.err.println("error code: " + e.getErrorCode());
        System.err.println("state: " + e.getSQLState());
    }
}

package ru.netcracker;
import java.sql.*;
import java.util.Locale;
import oracle.jdbc.driver.*;

public class Main {
    private static String driverName = "oracle.jdbc.driver.OracleDriver";

    private static String server = "192.168.56.101";
    private static String port = "1521";
    private static String sid = "xe";
    private static String username = "netcracker";
    private static String password = "1234";
    private static String url = "jdbc:oracle:thin:@" + server + ":" + port + ":" + sid;
    private static Connection connection;
    private static boolean isConnected = false;

    public static void main(String[] args) {
        try {
            Locale.setDefault(Locale.ENGLISH);

            url = "jdbc:oracle:thin:@" + server + ":" + port + ":" + sid;
            System.out.println(url);

            Class.forName(driverName);

            connection = DriverManager.getConnection(url, username, password);

            System.out.println("connecting: " + url);

            if (connection.equals(null))
                isConnected = false;
            else
                isConnected = true;

        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            isConnected = false;
        } catch (SQLException e) {
            System.out.println("SQLException\n" + e.getMessage());
            isConnected = false;
        }
    }
}





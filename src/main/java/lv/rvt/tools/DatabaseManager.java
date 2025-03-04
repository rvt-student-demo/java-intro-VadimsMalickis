package lv.rvt.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private static final String URL = "jdbc:sqlite:data.db";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void createNewTable() {
        String sql = "CREATE TABLE IF NOT EXISTS persons (\n"
                + " id integer PRIMARY KEY,\n"
                + " name text NOT NULL,\n"
                + " age integer,\n"
                + " weight real,\n"
                + " height real,\n"
                + " address text\n"
                + ");";

        try (Connection conn = connect();
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table created.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertPerson(String name, int age, double weight, double height, String address) {
        String sql = "INSERT INTO persons(name, age, weight, height, address) VALUES(?,?,?,?,?)";

        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setDouble(3, weight);
            pstmt.setDouble(4, height);
            pstmt.setString(5, address);
            pstmt.executeUpdate();
            System.out.println("Person inserted.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ResultSet selectAll() {
        String sql = "SELECT * FROM persons";
        ResultSet rs;
        try {
            Connection conn = connect();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}

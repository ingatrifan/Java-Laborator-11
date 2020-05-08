package com.lab11.database;

import java.sql.*;

public class Database {
    private static Connection con;
    private static Database single_instance;

    static {
        single_instance = null;
        connectWithDatabase();
    }

    private static void connectWithDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Gomuku?useSSL=false", "root", "password");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static ResultSet makeQuery(String queryString) {
        try {
            Statement stmt = con.createStatement();
            return stmt.executeQuery(queryString);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static void makeUpdate(String queryString) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(queryString);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void closeConnection() {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Database getInstance() {
        if (single_instance == null)
            single_instance = new Database();

        return single_instance;
    }
}

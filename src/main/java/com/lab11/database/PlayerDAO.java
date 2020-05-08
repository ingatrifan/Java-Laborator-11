package com.lab11.database;

import com.lab11.entities.Player;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {
    public static void create(String name) {
        Database database = Database.getInstance();
        String queryString = "INSERT INTO players(name) VALUES('" + name + "');";
        database.makeUpdate(queryString);
    }

    public static void update(String lastName, String newName) {
        Database database = Database.getInstance();
        String queryString = "UPDATE players set name = '" + newName + "' where name = '" + lastName + "'";
        database.makeUpdate(queryString);
    }

    public static List<Player> getAll() {
        Database database = Database.getInstance();
        String queryString = "SELECT * FROM players";
        ResultSet rs = database.makeQuery(queryString);
        List<Player> playerList = new ArrayList<>();
        try {
            while (rs.next()) {
                Player player = new Player(rs.getString(2));
                playerList.add(player);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void delete(String name) {
        Database database = Database.getInstance();
        String queryString = "DELETE FROM players where name = '" + name + "'";
        database.makeUpdate(queryString);
    }
}

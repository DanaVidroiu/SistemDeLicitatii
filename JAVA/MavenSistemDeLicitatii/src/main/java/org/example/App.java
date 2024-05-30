package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3307/project";
        String user = "root";
        String password = "myPassword";


        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexiunea la baza de date a fost realizata cu succes!");

            connection.close();
        } catch (SQLException e) {
            System.err.println("Eroare la conectare la baza de date: " + e.getMessage());
        }
    }
}

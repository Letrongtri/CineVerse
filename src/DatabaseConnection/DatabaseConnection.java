/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import java.sql.*;

public class DatabaseConnection {
    
    public static Connection getConnection(){
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cineverse", "root", "QgcZ&7dh");
            
        } catch (Exception e) {
            System.out.println("Cannot connect");
            e.printStackTrace();
        }
        
        return conn;
    }
    
    public static void main(String[] args) {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cineverse", "root", "QgcZ&7dh");
            
            System.out.println("Connected");
            
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from person");
            
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1) + ", " + resultSet.getString(2));
            }
            
            conn.close();
        } catch (Exception e) {
            System.out.println("Cannot connect");
            e.printStackTrace();
        }
    }
    
}

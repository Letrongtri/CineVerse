/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;
import DatabaseConnection.DatabaseConnection;
import java.util.List;
import model.Revenue;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import model.View;

/**
 *
 * @author Tieu Bang
 */
public class DashboardDAO {
    public static List<Revenue> getRevenueData(){ //tạo 1 lớp DAO để cái này vô
        List<Revenue> revenues = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();

            String query = "SELECT tidate AS date, SUM(total) AS revenue FROM Ticket GROUP BY tidate ORDER BY tidate"; // nữa sửa lại cái database thêm 1 cột tổng tiền vô bảng ticket
            Statement sm = conn.createStatement();                                     // câu lệnh select là select time, sum(tiền) as...

            // Thực thi truy vấn và xử lý kết quả
            ResultSet rs = sm.executeQuery(query);
            while (rs.next()) {
                String date = LocalDate.parse(rs.getDate("date").toString()).toString();
                double revenue = rs.getDouble("revenue");
                revenues.add(new Revenue(date, revenue));
            }

            rs.close();
            sm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return revenues;
    }
    
     public static List<View> getViewData(){ //tạo 1 lớp DAO để cái này vô
        List<View> views = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();

            String query = "SELECT m.title AS Movie_Title, COUNT(t.tid) AS Total_Views " + 
                    "FROM Movie m " 
                    + "JOIN Schedule s ON m.mid = s.mid " 
                    + "JOIN Ticket t ON s.scid = t.scid " 
                    + "GROUP BY m.mid";
            Statement sm = conn.createStatement();                                     

            // Thực thi truy vấn và xử lý kết quả
            ResultSet rs = sm.executeQuery(query);
            while (rs.next()) {
                String movieTitle = rs.getString("Movie_Title");
                int totalViews = rs.getInt("Total_Views");
                views.add(new View(movieTitle, totalViews));
            }

            rs.close();
            sm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return views;
    }
}

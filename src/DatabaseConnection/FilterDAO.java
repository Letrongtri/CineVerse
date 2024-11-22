/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import java.util.ArrayList;
import java.util.List;
import model.Movie;
import java.sql.*;
import java.time.LocalDate;
import model.Customer;
import model.Staff;

/**
 *
 * @author ADMIN
 */
public class FilterDAO {
    
    
    public static List<Movie> findMovie(String mid, String title, String genre, String language, int releaseYear) {
        List<Movie> movies = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();

            String query = "SELECT * FROM Movie WHERE 1=1";
            if (!mid.isEmpty()) 
                query += " AND mid LIKE ?";
            if (!title.isEmpty()) 
                query += " AND title LIKE ?";
            if (!genre.isEmpty()) 
                query += " AND genre LIKE ?";
            if (!language.isEmpty()) 
                query += " AND language LIKE ?";
            if (releaseYear != 0) 
                query += " AND YEAR(release_date) = ?";

            PreparedStatement p = conn.prepareStatement(query);

            // Thiết lập giá trị cho các tham số truy vấn
            int paramIndex = 1;
            if (!mid.isEmpty()) 
                p.setString(paramIndex++, "%" + mid + "%");
            if (!title.isEmpty()) 
                p.setString(paramIndex++, "%" + title + "%");
            if (!genre.isEmpty()) 
                p.setString(paramIndex++, "%" + genre + "%");
            if (!language.isEmpty()) 
                p.setString(paramIndex++, "%" + language + "%");
            if (releaseYear != 0) 
                p.setInt(paramIndex++, releaseYear);

            // Thực thi truy vấn và xử lý kết quả
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                String movieID = rs.getString(1);
                String movieTitle = rs.getString(2);
                String movieGenre = rs.getString(3);
                String movieLanguage = rs.getString(4);
                String movieSubtitle = rs.getString(5);
                int movieDuration = rs.getInt(6);
                String movieDirector = rs.getString(7);
                String movieCast = rs.getString(8);
                Date releaseDate = rs.getDate(9);
                LocalDate releaseLocalDate = releaseDate != null ? releaseDate.toLocalDate() : null;
                Date endDate = rs.getDate(10);
                LocalDate endLocalDate = endDate != null ? endDate.toLocalDate() : null;
                String movieDescription = rs.getString(11);

                movies.add(new Movie(movieID, movieTitle, movieGenre, movieLanguage, movieSubtitle, movieDuration, movieDirector, movieCast, releaseLocalDate, endLocalDate, movieDescription));
            }

            rs.close();
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movies;
    }
    
    public static List<Integer> getReleaseYearData(){
        List<Integer> releaseYear = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();

            String query = "SELECT YEAR(release_date) as Release_year FROM Movie GROUP BY YEAR(release_date)ORDER BY Release_year";
            Statement sm = conn.createStatement();

            // Thực thi truy vấn và xử lý kết quả
            ResultSet rs = sm.executeQuery(query);
            while (rs.next()) {
                int year = rs.getInt("Release_year");
                releaseYear.add(year);
            }

            rs.close();
            sm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return releaseYear;
    }
    
    public static List<Staff> findStaff(String sid, String name, String role, float salary, int enrollYear) {
        List<Staff> staffs = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();

            String query = "SELECT * FROM Staff WHERE 1=1";
            if (!sid.isEmpty()) 
                query += " AND sid LIKE ?";
            if (!name.isEmpty()) 
                query += " AND sname LIKE ?";
            if (!role.isEmpty()) 
                query += " AND role LIKE ?";
            if (salary != 0f) 
                query += " AND salary = ?";
            if (enrollYear != 0) 
                query += " AND YEAR(enroll_date) = ?";

            PreparedStatement p = conn.prepareStatement(query);

            // Thiết lập giá trị cho các tham số truy vấn
            int paramIndex = 1;
            if (!sid.isEmpty()) 
                p.setString(paramIndex++, "%" + sid + "%");
            if (!name.isEmpty()) 
                p.setString(paramIndex++, "%" + name + "%");
            if (!role.isEmpty()) 
                p.setString(paramIndex++, "%" + role + "%");
            if (salary != 0f) 
                p.setFloat(paramIndex++, salary);
            if (enrollYear != 0) 
                p.setInt(paramIndex++, enrollYear);

            // Thực thi truy vấn và xử lý kết quả
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                String staffID = rs.getString(1);
                LocalDate staffDOB = rs.getDate(2) != null ? rs.getDate(2).toLocalDate() : null;
                String staffName = rs.getString(3);
                String staffEmail = rs.getString(4);
                int staffPhone = rs.getInt(5);
                String staffRole = rs.getString(6);
                float staffSalary = rs.getFloat(7);
                LocalDate staffEnrollDate = rs.getDate(8) != null ? rs.getDate(8).toLocalDate() : null;
                String staffPassword = rs.getString(9);

                staffs.add(new Staff(staffID, staffDOB, staffName, staffEmail, staffPhone, staffRole, staffSalary, staffEnrollDate, staffPassword));
            }

            rs.close();
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return staffs;
    }
    
    public static List<Integer> getEnrollYearData(){
        List<Integer> enrollYear = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();

            String query = "SELECT YEAR(enroll_date) as Enroll_year FROM Staff GROUP BY YEAR(enroll_date)ORDER BY enroll_year";
            Statement sm = conn.createStatement();

            // Thực thi truy vấn và xử lý kết quả
            ResultSet rs = sm.executeQuery(query);
            while (rs.next()) {
                int year = rs.getInt("Enroll_year");
                enrollYear.add(year);
            }

            rs.close();
            sm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return enrollYear;
    }
    
    public static List<String> getRoleData(){
        List<String> roles = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();

            String query = "SELECT role FROM Staff GROUP BY role";
            Statement sm = conn.createStatement();

            // Thực thi truy vấn và xử lý kết quả
            ResultSet rs = sm.executeQuery(query);
            while (rs.next()) {
                String role = rs.getString("role");
                roles.add(role);
            }

            rs.close();
            sm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roles;
    }
    
    public static List<Customer> findCustomer(String cid, String name, int phone) {
        List<Customer> customers = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();

            String query = "SELECT * FROM Customer WHERE 1=1";
            if (!cid.isEmpty()) 
                query += " AND cid LIKE ?";
            if (!name.isEmpty()) 
                query += " AND cname LIKE ?";
            if (phone != 0) 
                query += " AND phone = ?";
            
            PreparedStatement p = conn.prepareStatement(query);

            // Thiết lập giá trị cho các tham số truy vấn
            int paramIndex = 1;
            if (!cid.isEmpty()) 
                p.setString(paramIndex++, "%" + cid + "%");
            if (!name.isEmpty()) 
                p.setString(paramIndex++, "%" + name + "%");
            if (phone != 0) 
                p.setInt(paramIndex++, phone);

            // Thực thi truy vấn và xử lý kết quả
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                String cusID = rs.getString(1);
                String cusName = rs.getString(2);
                int cusPhone = rs.getInt(3);
                LocalDate cusDOB = rs.getDate(4) != null ? rs.getDate(4).toLocalDate() : null;
                LocalDate cusStartDate = rs.getDate(5) != null ? rs.getDate(5).toLocalDate() : null;

                customers.add(new Customer(cusID, cusName, cusPhone, cusDOB, cusStartDate));
            }

            rs.close();
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers;
    }

}

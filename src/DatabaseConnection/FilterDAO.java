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
                query += " AND YEAR(release_Date) = ?";

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

            String query = "SELECT YEAR(release_date) as Release_year FROM Movie GROUP BY YEAR(release_date)";
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

}

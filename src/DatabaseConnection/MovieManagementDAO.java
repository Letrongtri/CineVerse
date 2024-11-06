/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import model.Movie;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class MovieManagementDAO {
    private List<Movie> movies;

    public MovieManagementDAO() {
        this.movies = new ArrayList<Movie>();
        setMovieData();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    
    
    public void setMovieData(){
        String query = "Select * from movie";
        
        try {
            Connection conn = DatabaseConnection.getConnection();
            
            Statement statement = conn.createStatement();
            
            ResultSet rs = statement.executeQuery(query);
            
            
            while (rs.next()){
                String mid = rs.getString(1);
                String title = rs.getString(2);
                String genre = rs.getString(3);
                String language = rs.getString(4);
                String subtitle = rs.getString(5);
                int duration = rs.getInt(6);
                String director = rs.getString(7);
                String cast = rs.getString(8);
                
                Date releaseDate = rs.getDate(9);
                LocalDate releaseLocalDate = releaseDate.toLocalDate();
                Date endDate = rs.getDate(10);
                LocalDate endLocalDate = endDate.toLocalDate();
                String description = rs.getString(11);

                movies.add(new Movie(mid, title, genre, language, subtitle, duration, director, cast, releaseLocalDate, endLocalDate, description));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
//    public static void createAndUpdateMovie(Movie m){
//        try (
//            Connection conn = DatabaseConnection.getConnection();
//            CallableStatement c = conn.prepareCall(
//                isExistMovie(m.getMid())
//                ? "{call sp_editMovie(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}"
//                : "{call sp_addMovie(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}"
//            )
//        ) {
//            // Convert dates
//            Date releaseDate = Date.valueOf(m.getRelease_date());
//            Date endDate = Date.valueOf(m.getEnd_date());
//
//            // Set parameters for stored procedure
//            c.setString(1, m.getMid());
//            c.setString(2, m.getTitle());
//            c.setString(3, m.getGenre());
//            c.setString(4, m.getLanguage());
//            c.setString(5, m.getSubtitle());
//            c.setInt(6, m.getDuration());
//            c.setString(7, m.getDirector());
//            c.setString(8, m.getCast());
//            c.setDate(9, releaseDate);
//            c.setDate(10, endDate);
//            c.setString(11, m.getDescription());
//            
//            // Execute the stored procedure
//            c.executeQuery();
//            
//
//        } catch (SQLException e) {
//            // Log the exception or rethrow a custom one if needed
//            System.err.println("Database error: " + e.getMessage());
//        } catch (IllegalArgumentException e) {
//            // Handle invalid movie data (optional)
//            System.err.println("Invalid movie data: " + e.getMessage());
//        }
//    }
//    
    public void addMovie(Movie m){
        if(isExistMovie(m.getMid())){
            System.out.println("Movie is existed!)");
            return;
        }
        try {
            Connection conn = DatabaseConnection.getConnection();
            CallableStatement c = conn.prepareCall("{call sp_addMovie(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            
            // Convert dates
            Date releaseDate = Date.valueOf(m.getRelease_date());
            Date endDate = Date.valueOf(m.getEnd_date());

            // Set parameters for stored procedure
            c.setString(1, m.getMid());
            c.setString(2, m.getTitle());
            c.setString(3, m.getGenre());
            c.setString(4, m.getLanguage());
            c.setString(5, m.getSubtitle());
            c.setInt(6, m.getDuration());
            c.setString(7, m.getDirector());
            c.setString(8, m.getCast());
            c.setDate(9, releaseDate);
            c.setDate(10, endDate);
            c.setString(11, m.getDescription());
            
            // Execute the stored procedure
            c.executeQuery();
            
            // Add new movie to list movie
            movies.add(m);
            
        } catch (SQLException e) {
            // Log the exception or rethrow a custom one if needed
            System.err.println("Database error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handle invalid movie data (optional)
            System.err.println("Invalid movie data: " + e.getMessage());
        }
    }
    
    public void editMovie(Movie m){
        if(!isExistMovie(m.getMid())){
            System.out.println("Movie is not existed!)");
            return;
        }
        try {
            Connection conn = DatabaseConnection.getConnection();
            CallableStatement c = conn.prepareCall("{call sp_editMovie(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            
            // Convert dates
            Date releaseDate = Date.valueOf(m.getRelease_date());
            Date endDate = Date.valueOf(m.getEnd_date());

            // Set parameters for stored procedure
            c.setString(1, m.getMid());
            c.setString(2, m.getTitle());
            c.setString(3, m.getGenre());
            c.setString(4, m.getLanguage());
            c.setString(5, m.getSubtitle());
            c.setInt(6, m.getDuration());
            c.setString(7, m.getDirector());
            c.setString(8, m.getCast());
            c.setDate(9, releaseDate);
            c.setDate(10, endDate);
            c.setString(11, m.getDescription());
            
            // Execute the stored procedure
            c.executeQuery();
            
            // Update movie in list movie
            movies.removeIf(movy -> movy.getMid().equals(m.getMid()));
            movies.add(m);
            
        } catch (SQLException e) {
            // Log the exception or rethrow a custom one if needed
            System.err.println("Database error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handle invalid movie data (optional)
            System.err.println("Invalid movie data: " + e.getMessage());
        }
    }
    
    public void deleteMovie(Movie m) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            CallableStatement c = conn.prepareCall("{call sp_deleteMovie(?)}");
            c.setString(1, m.getMid());
            
            c.executeQuery();
            
            // delete movie in list movie
            movies.removeIf(movy -> movy.getMid().equals(m.getMid()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean isExistMovie(String movieID){
        
        try {
            PreparedStatement p = null;
            ResultSet r = null;
            Connection conn = DatabaseConnection.getConnection();
            
            p = conn.prepareStatement("Select fn_isExistMovie(?)");
            
            p.setString(1, movieID);
            r = p.executeQuery();
            r.next();
            return r.getBoolean(1);
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    
    public static void main(String[] args) {
//        List<Movie> m = new ArrayList<Movie>();
//        m = CineVerseDAO.MovieData();
//        System.out.println(m);
//        
//        CineVerseDAO c = new CineVerseDAO(new CineVerseModel());
//        c.isExistMovie("MOV004");
    }
}

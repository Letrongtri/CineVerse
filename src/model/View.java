/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Tieu Bang
 */
public class View {
    private String movieTitle;
    private int totalViews;

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public View(String movieTitle, int totalViews) {
        this.movieTitle = movieTitle;
        this.totalViews = totalViews;
    }

   public View() {
       this.movieTitle=new String();
       this.totalViews = 0;
   }
    
    
    
}

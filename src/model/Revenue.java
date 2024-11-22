/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Tieu Bang
 */
public class Revenue {
    
    private String date;
    private double revenue;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Revenue(String time, double revenue) {
        this.date = time;
        this.revenue = revenue;
    }

   public Revenue() {
       this.date = new String();
       this.revenue = 0.0f;
   }
    
}

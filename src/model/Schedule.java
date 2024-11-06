/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Schedule {
    private Movie movie;
    private ScreenRoom room;
    private LocalDateTime time;
    private int price;

    public Schedule() {
        this.movie = new Movie();
        this.room = new ScreenRoom();
        this.time = LocalDateTime.of(2000, 1, 1, 0, 0);
        this.price = 0;
    }

    public Schedule(Movie movie, ScreenRoom room, LocalDateTime time, int price) {
        this.movie = movie;
        this.room = room;
        this.time = time;
        this.price = price;
    }

    public Movie getMovie() {
        return movie;
    }

    public ScreenRoom getRoom() {
        return room;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setRoom(ScreenRoom room) {
        this.room = room;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.movie);
        hash = 79 * hash + Objects.hashCode(this.room);
        hash = 79 * hash + Objects.hashCode(this.time);
        hash = 79 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Schedule other = (Schedule) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.movie, other.movie)) {
            return false;
        }
        if (!Objects.equals(this.room, other.room)) {
            return false;
        }
        return Objects.equals(this.time, other.time);
    }

    @Override
    public String toString() {
        return "Schedule{" + "movie=" + movie + ", room=" + room + ", time=" + time + ", price=" + price + '}';
    }
    
    
}

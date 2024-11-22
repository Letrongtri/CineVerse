/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Seat {
    private int seat_id;
    private String type;
    private String status;
    private int seat_row, seat_column;
    
    public Seat(){
        seat_id = 0;
        type = new String();
        status = new String();
        seat_row = -1;
        seat_column = -1;
    }

    public Seat(int seat_id, String type, String status, int seat_row, int seat_column) {
        this.seat_id = seat_id;
        this.type = type;
        this.status = status;
        this.seat_row = seat_row;
        this.seat_column = seat_column;
    }

    public int getSeat_id() {
        return seat_id;
    }

    public String getType() {
        return type;
    }

    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSeat_row() {
        return seat_row;
    }

    public void setSeat_row(int seat_row) {
        this.seat_row = seat_row;
    }

    public int getSeat_column() {
        return seat_column;
    }

    public void setSeat_column(int seat_column) {
        this.seat_column = seat_column;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.seat_id);
        hash = 37 * hash + Objects.hashCode(this.type);
        hash = 37 * hash + Objects.hashCode(this.status);
        hash = 37 * hash + this.seat_row;
        hash = 37 * hash + this.seat_column;
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
        final Seat other = (Seat) obj;
        if (this.seat_id != other.seat_id) {
            return false;
        }
        if (this.seat_row != other.seat_row) {
            return false;
        }
        if (this.seat_column != other.seat_column) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return Objects.equals(this.status, other.status);
    }

    
    @Override
    public String toString() {
        return "Seat{" + "seat_id=" + seat_id + ", type=" + type + ", status=" + status + ", seat_row=" + seat_row + ", seat_column=" + seat_column + '}';
    }

    
}

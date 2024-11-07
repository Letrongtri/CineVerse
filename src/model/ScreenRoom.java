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
public class ScreenRoom {
    private String rid, rname;
    private String type, equipment;
    private boolean status;
    private String note;
    
    public ScreenRoom(){
        rid = new String();
        rname = new String();
        type = new String();
        equipment = new String();
        status = false;
        note = new String();
    }

    public ScreenRoom(String rid, String rname, String type, String equipment, boolean status, String note) {
        this.rid = rid;
        this.rname = rname;
        this.type = type;
        this.equipment = equipment;
        this.status = status;
        this.note = note;
    }

    public String getRid() {
        return rid;
    }

    public String getRname() {
        return rname;
    }

    public String getType() {
        return type;
    }

    public String getEquipment() {
        return equipment;
    }

    public boolean isStatus() {
        return status;
    }

    public String getNote() {
        return note;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.rid);
        hash = 41 * hash + Objects.hashCode(this.rname);
        hash = 41 * hash + Objects.hashCode(this.type);
        hash = 41 * hash + Objects.hashCode(this.equipment);
        hash = 41 * hash + (this.status ? 1 : 0);
        hash = 41 * hash + Objects.hashCode(this.note);
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
        final ScreenRoom other = (ScreenRoom) obj;
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.rid, other.rid)) {
            return false;
        }
        if (!Objects.equals(this.rname, other.rname)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.equipment, other.equipment)) {
            return false;
        }
        return Objects.equals(this.note, other.note);
    }

    @Override
    public String toString() {
        return "ScreenRoom{" + "rid=" + rid + ", rname=" + rname + ", type=" + type + ", equipment=" + equipment + ", status=" + status + ", note=" + note + '}';
    }

    
}

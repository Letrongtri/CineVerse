/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Customer {
    private String cid;
    private String name;
    private int phone;
    private LocalDate dob;
    private LocalDate start_Date;

    public Customer() {
        cid = new String();
        name = new String();
        phone = 0;
        dob = LocalDate.of(2000, 1, 1);
        start_Date = LocalDate.of(2000, 1, 1);
    }

    public Customer(String cid, String name, int phone, LocalDate dob, LocalDate startDate) {
        this.cid = cid;
        this.name = name;
        this.phone = phone;
        this.dob = dob;
        this.start_Date = startDate;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(LocalDate start_Date) {
        this.start_Date = start_Date;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.cid);
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.phone;
        hash = 89 * hash + Objects.hashCode(this.dob);
        hash = 89 * hash + Objects.hashCode(this.start_Date);
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
        final Customer other = (Customer) obj;
        if (this.phone != other.phone) {
            return false;
        }
        if (!Objects.equals(this.cid, other.cid)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.dob, other.dob)) {
            return false;
        }
        return Objects.equals(this.start_Date, other.start_Date);
    }

    @Override
    public String toString() {
        return "Customer{" + "cid=" + cid + ", name=" + name + ", phone=" + phone + ", dob=" + dob + ", startDate=" + start_Date + '}';
    }

    
}

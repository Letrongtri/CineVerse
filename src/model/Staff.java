/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Staff {
    private String sid;
    private LocalDate dob;
    private String name, email;
    private int phone;
    private String roll;
    private float salary;
    private LocalDate enroll_date;

    public Staff() {
        sid = new String();
        dob = LocalDate.of(2000, 1, 1);
        name = new String();
        email = new String();
        phone = 0;
        roll = new String();
        salary = 0;
        enroll_date = LocalDate.of(2000, 1, 1);
    }

    public Staff(String sid, LocalDate dob, String name, String email, int phone, String roll, float salary, LocalDate enroll_date) {
        this.sid = sid;
        this.dob = dob;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.roll = roll;
        this.salary = salary;
        this.enroll_date = enroll_date;
    }
    

    public String getSid() {
        return sid;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public String getRoll() {
        return roll;
    }

    public float getSalary() {
        return salary;
    }

    public LocalDate getEnroll_date() {
        return enroll_date;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setEnroll_date(LocalDate enroll_date) {
        this.enroll_date = enroll_date;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.sid);
        hash = 89 * hash + Objects.hashCode(this.dob);
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.email);
        hash = 89 * hash + this.phone;
        hash = 89 * hash + Objects.hashCode(this.roll);
        hash = 89 * hash + Float.floatToIntBits(this.salary);
        hash = 89 * hash + Objects.hashCode(this.enroll_date);
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
        final Staff other = (Staff) obj;
        if (this.phone != other.phone) {
            return false;
        }
        if (this.salary != other.salary) {
            return false;
        }
        if (!Objects.equals(this.sid, other.sid)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.roll, other.roll)) {
            return false;
        }
        if (!Objects.equals(this.dob, other.dob)) {
            return false;
        }
        return Objects.equals(this.enroll_date, other.enroll_date);
    }

    @Override
    public String toString() {
        return "Staff{" + "sid=" + sid + ", dob=" + dob + ", name=" + name + ", email=" + email + ", phone=" + phone + ", roll=" + roll + ", salary=" + salary + ", enroll_date=" + enroll_date + '}';
    }

    
}

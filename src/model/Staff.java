/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Staff {
    private String sid;
    private LocalDate dob;
    private String name;
    private String email;
    private int phone;
    private String role;
    private Float salary;
    private LocalDate enroll_date;
    private String password;
    
    public Staff() {
        this.sid = new String();
        this.dob = LocalDate.of(2000, 1, 1);
        this.name = new String();
        this.email = new String();
        this.phone = 0;
        this.role = new String();
        this.salary = 0.0f;
        this.enroll_date = LocalDate.of(2000, 1, 1);
        this.password = new String();

    }

    public Staff(String sid, LocalDate dob, String name, String email, int phone, String roll, Float salary, LocalDate enroll_date, String password) {
        this.sid = sid;
        this.dob = dob;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.role = roll;
        this.salary = salary;
        this.enroll_date = enroll_date;
        this.password = password;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public LocalDate getEnroll_date() {
        return enroll_date;
    }

    public void setEnroll_date(LocalDate enroll_date) {
        this.enroll_date = enroll_date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.sid);
        hash = 97 * hash + Objects.hashCode(this.dob);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + this.phone;
        hash = 97 * hash + Objects.hashCode(this.role);
        hash = 97 * hash + Objects.hashCode(this.salary);
        hash = 97 * hash + Objects.hashCode(this.enroll_date);
        hash = 97 * hash + Objects.hashCode(this.password);
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
        if (!Objects.equals(this.sid, other.sid)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.role, other.role)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.dob, other.dob)) {
            return false;
        }
        if (!Objects.equals(this.salary, other.salary)) {
            return false;
        }
        return Objects.equals(this.enroll_date, other.enroll_date);
    }

    @Override
    public String toString() {
        return "Staff{" + "sid=" + sid + ", dob=" + dob + ", name=" + name + ", email=" + email + ", phone=" + phone + ", roll=" + role + ", salary=" + salary + ", enroll_date=" + enroll_date + ", password=" + password + '}';
    }

    
    















    
 
 


}

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
public class Customer {
    private String cid;
    private String password;

    public Customer() {
        cid = new String();
        password = new String();
    }

    public Customer(String cid, String password) {
        this.cid = cid;
        this.password = password;
    }

    public String getCid() {
        return cid;
    }

    public String getPassword() {
        return password;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.cid);
        hash = 31 * hash + Objects.hashCode(this.password);
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
        if (!Objects.equals(this.cid, other.cid)) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }

    @Override
    public String toString() {
        return "Customer{" + "cid=" + cid + ", password=" + password + '}';
    }

}

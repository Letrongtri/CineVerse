/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;
    
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Staff;

/**
 *
 * @author Tieu Bang
 */
public class StaffManagementDAO {
    private List<Staff> staffs;
    public StaffManagementDAO() {
        this.staffs = new ArrayList<Staff>();
        setStaffData();
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }
    
    public void setStaffData(){
        String query = "Select * from Staff";
        
        try {
            Connection conn = DatabaseConnection.getConnection();
            
            Statement statement = conn.createStatement();
            
            ResultSet rs = statement.executeQuery(query);
            
            
            while (rs.next()){
                String sid = rs.getString(1);
                Date dob = rs.getDate(2);
                LocalDate dobLocalDate = dob.toLocalDate();
                String name = rs.getString(3);
                String email = rs.getString(4);
                int phone = rs.getInt(5);
                String roll = rs.getString(6);
                Float salary = rs.getFloat(7);
                Date enroll_date = rs.getDate(8);
                LocalDate enroll_dateLocalDate = enroll_date.toLocalDate();
                String password = rs.getString(9);
                

                staffs.add(new Staff(sid, dobLocalDate, name, email, phone, roll, salary, enroll_dateLocalDate, password));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public String getPasswordByID(String id){
        String password = new String();
        try {
            PreparedStatement p = null;
            ResultSet r = null;
            Connection conn = DatabaseConnection.getConnection();
            
            p = conn.prepareStatement("Select password from Staff where sid like ?");
            
            p.setString(1, id);
            r = p.executeQuery();
            if (r.next()){
                password = r.getString(1);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return password;
    }
       
    public boolean isExistStaff(String id){        
        try {
            PreparedStatement p = null;
            ResultSet r = null;
            Connection conn = DatabaseConnection.getConnection();
            
            p = conn.prepareStatement("Select fn_isExistStaff(?)");
            
            p.setString(1, id);
            r = p.executeQuery();
            r.next();
            return r.getBoolean(1);
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public void editStaff(Staff s){
        if(!isExistStaff(s.getSid())){
            System.out.println("Staff is not existed!)");
            return;
        }
        try {
            Connection conn = DatabaseConnection.getConnection();
            CallableStatement c = conn.prepareCall("{call sp_editStaff(?, ?, ?, ?, ?, ?, ?, ?)}");
            
            // Convert dates
            Date dob = Date.valueOf(s.getDob());
            Date enrolldate = Date.valueOf(s.getEnroll_date());

            // Set parameters for stored procedure
            c.setString(1, s.getSid());
            c.setDate(2, dob);
            c.setString(3, s.getName());
            c.setString(4, s.getEmail());
            c.setInt(5, s.getPhone());
            c.setString(6, s.getRole());
            c.setFloat(7, s.getSalary());
            c.setDate(8, enrolldate);
            
            // Execute the stored procedure
            c.executeQuery();
            
            // Update movie in list movie
            staffs.removeIf(staff -> staff.getSid().equals(s.getSid()));
            staffs.add(s);
            
        } catch (SQLException e) {
            // Log the exception or rethrow a custom one if needed
            System.err.println("Database error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handle invalid movie data (optional)
            System.err.println("Invalid movie data: " + e.getMessage());
        }
    }
    
    public boolean addStaff(Staff s) {
      try {
            Connection conn = DatabaseConnection.getConnection();
            CallableStatement c = conn.prepareCall("{call sp_addStaff(?, ?, ?, ?, ?, ?, ?, ?)}");
            
            // Convert dates
            Date dob = Date.valueOf(s.getDob());
            Date enrolldate = Date.valueOf(s.getEnroll_date());

            // Set parameters for stored procedure
            c.setString(1, s.getSid());
            c.setDate(2, dob);
            c.setString(3, s.getName());
            c.setString(4, s.getEmail());
            c.setInt(5, s.getPhone());
            c.setString(6, s.getRole());
            c.setFloat(7, s.getSalary());
            c.setDate(8, enrolldate);
            
            // Execute the stored procedure
            c.executeQuery();
            s.setPassword(getPasswordByID(s.getSid()));
            staffs.add(s);
            conn.close();
            return true;         
        } catch (SQLException e) {
            System.err.println("database error: " +e.getMessage());
            return false;
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid staff data: " + e.getMessage());
            return false;
        }
    }
    
    public boolean deleteStaff(Staff s) {
        Connection conn = null;
        try {
            conn = DatabaseConnection.getConnection();
            conn.setAutoCommit(false);
            conn.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
            
            PreparedStatement checkStmt = conn.prepareStatement("Select fn_isExistStaff(?)");
            checkStmt.setString(1, s.getSid());
            ResultSet rs = checkStmt.executeQuery();
            
            if (!rs.next() && !rs.getBoolean(1)){
                throw new SQLException("Staff not found");
            }
            
            CallableStatement c = conn.prepareCall("{call sp_deleteStaff(?)}");
            c.setString(1, s.getSid());
            
            c.executeUpdate();
            staffs.removeIf(staff -> staff.getSid().equals(s.getSid()));
            conn.commit();
            return true;
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
            return false;
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true); // Reset lại AutoCommit về true
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static String getStaffName(String staffID){
        Connection conn = null;
        String staffName = new String();
        try {
            conn = DatabaseConnection.getConnection();
            
            PreparedStatement p = conn.prepareStatement("Select sname from staff where sid = ?");
            p.setString(1, staffID);
            
            ResultSet r = p.executeQuery();
            if (r.next()){
                staffName = r.getString(1);
            }
            
        } catch (SQLException e) {
            staffName = null;
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true); // Reset lại AutoCommit về true
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return staffName;
    }
}

    
    

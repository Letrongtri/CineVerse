/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import java.util.ArrayList;
import java.util.List;
import model.ScreenRoom;

import java.sql.*;
import model.Seat;
/**
 *
 * @author ADMIN
 */
public class ScreenRoomManagementDAO {
    private List<ScreenRoom> screenRooms;
    

    public ScreenRoomManagementDAO() {
        screenRooms = new ArrayList<>();

        setScreenRoomData();
    }

    public List<ScreenRoom> getScreenRooms() {
        return screenRooms;
    }

    public void setScreenRoom(List<ScreenRoom> screenRooms) {
        this.screenRooms = screenRooms;
    }
    
    public void setScreenRoomData() {
        screenRooms.clear();
        Connection conn = null;
        try {
            conn = DatabaseConnection.getConnection();
            conn.setAutoCommit(false);
            conn.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
            
            Statement statement = conn.createStatement();
            
            ResultSet rs1 = statement.executeQuery("Select * from ScreenRoom");
            while (rs1.next()){
                String rid = rs1.getString(1);
                String rname = rs1.getString(2);
                String type = rs1.getString(3);
                String equipment = rs1.getString(4);
                boolean status = rs1.getBoolean(5);
                String note = rs1.getString(6);
                
                //seats
                List<Seat> seats = new ArrayList<>();
                try (PreparedStatement p = conn.prepareStatement("Select seid, type, status, seat_row, seat_column from seat where rid = ?")) {
                    p.setString(1, rid);

                    try (ResultSet rs2 = p.executeQuery()) {
                        while (rs2.next()) {
                            int seid  = rs2.getInt(1);
                            String seType = rs2.getString(2);
                            String seStatus = rs2.getString(3);
                            int row = rs2.getInt(4);
                            int column = rs2.getInt(5);
                            
                            seats.add(new Seat(seid, seType, seStatus, row, column));
                        }
                    }
                }

                screenRooms.add(new ScreenRoom(rid, rname, type, equipment, seats, status, note));
            }
            
            conn.commit();
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static List<Seat> getSeats(String rid){
        List<Seat> seats = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();
            
            PreparedStatement p = conn.prepareStatement("Select seid, type, status, seat_row, seat_column from seat where rid = ?");
            p.setString(1, rid);
            
            ResultSet rs = p.executeQuery();
            
            while (rs.next()){
                int seid  = rs.getInt(1);
                String seType = rs.getString(2);
                String seStatus = rs.getString(3);
                int row = rs.getInt(4);
                int column = rs.getInt(5);
                
                seats.add(new Seat(seid, seType, seStatus, row, column));
            }
            
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return seats;
    }
    
    public static int getSeatCount(String rid){
        int seatCount = 0;
        try {
            Connection conn = DatabaseConnection.getConnection();
            
            PreparedStatement p = conn.prepareStatement("Select count(*) from seat where rid = ?");
            p.setString(1, rid);
            
            ResultSet rs = p.executeQuery();
            
            if (rs.next()){
                seatCount = rs.getInt(1);
            }
            
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return seatCount;
    }
    
    public boolean addScreenRoom(ScreenRoom s){
        List<Seat> seats = s.getSeats();
        try {
            Connection conn = DatabaseConnection.getConnection();
            
            // insert into Screen room table
            CallableStatement c1 = conn.prepareCall("{call sp_addScreenRoom(?, ?, ?, ?, ?, ?)}");
            
            c1.setString(1, s.getRid());
            c1.setString(2,s.getRname());
            c1.setString(3, s.getType());
            c1.setString(4, s.getEquipment());
            c1.setBoolean(5, s.isStatus());
            
            c1.setString(6, s.getNote());
            
            c1.executeUpdate();
            
            // insert into Seat table
            if (seats != null) {
                for (Seat seat : seats) {
                    CallableStatement c2 = conn.prepareCall("{call sp_addSeat(?, ?, ?, ?, ?, ?)}");

                    c2.setInt(1, seat.getSeat_id());
                    c2.setString(2, s.getRid());
                    c2.setInt(3, seat.getSeat_row());
                    c2.setInt(4, seat.getSeat_column());
                    c2.setString(5, seat.getType());
                    c2.setString(6, seat.getStatus());

                    c2.executeQuery();
                }
            }
            screenRooms.add(s);
            conn.close();
            return true;
        } catch (SQLException e) {
            // Log the exception or rethrow a custom one if needed
            System.err.println("Database error: " + e.getMessage());
            return false;
        } catch (IllegalArgumentException e) {
            // Handle invalid movie data (optional)
            System.err.println("Invalid movie data: " + e.getMessage());
            return false;
        }
    }

    
    public boolean deleteScreenRoom(ScreenRoom s){
        Connection conn = null;
        try {
            conn = DatabaseConnection.getConnection();
            conn.setAutoCommit(false);
            conn.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
            
            PreparedStatement checkStmt = conn.prepareStatement("Select fn_isExistScreenRoom(?)");
            checkStmt.setString(1, s.getRid());
            ResultSet rs = checkStmt.executeQuery();
            
            if (!rs.next() && !rs.getBoolean(1)){
                throw new SQLException("Movie not found");
            }            
            
            CallableStatement c = conn.prepareCall("{call sp_deleteScreenRoom(?)}");
            c.setString(1, s.getRid());
            
            c.executeUpdate();
            
            // delete movie in list movie
            screenRooms.removeIf(sr -> sr.getRid().equals(s.getRid()));
            
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
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
//    public boolean deleteSeat(String roomID, int seatID){
//        boolean checkDelete = true;
//        try {
//            Connection conn = DatabaseConnection.getConnection();
//            PreparedStatement p = conn.prepareStatement("select fn_deleteSeat(?, ?)");
//            p.setString(1, roomID);
//            p.setInt(2, seatID);
//            
//            ResultSet r = p.executeQuery();
//            
//            // delete seat in list screen room
//            if (r.next()){
//                if (!r.getBoolean(1)){
//                    checkDelete = false;
//                }
//                else {
//                    for (ScreenRoom screenRoom : screenRooms) {
//                        if (screenRoom.getRid().equals(roomID)){
//                            screenRoom.getSeats().removeIf(s -> s.getSeat_id().equals(seatID));
//                        }
//                    }
//                }
//            }
//            
//            conn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return checkDelete;
//    }
//    
    public boolean canDeleteSeat(int seatID){
        try {
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement p = conn.prepareStatement("SELECT COUNT(*) AS countRef FROM ticket WHERE seid = ?");
            p.setInt(1, seatID);
            
            ResultSet r = p.executeQuery();
            
            // delete movie in list movie
            if (r.next()){
                int countRef = r.getInt("countRef");
                return countRef == 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean editScreenRoom(ScreenRoom s) {
        Connection conn = null;
        try {
            conn = DatabaseConnection.getConnection();
            conn.setAutoCommit(false);
            conn.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);

            // Cập nhật thông tin ScreenRoom
            CallableStatement c = conn.prepareCall("{call sp_editScreenRoom(?, ?, ?, ?, ?, ?)}");
            c.setString(1, s.getRid());
            c.setString(2, s.getRname());
            c.setString(3, s.getType());
            c.setString(4, s.getEquipment());
            c.setBoolean(5, s.isStatus());
            c.setString(6, s.getNote());
            c.executeQuery();
            c.close();

            // Lấy danh sách các ghế hiện có trong cơ sở dữ liệu cho phòng chiếu này
            List<Seat> existingSeats = ScreenRoomManagementDAO.getSeats(s.getRid());

            // Tìm ghế cần xóa (ghế trong cơ sở dữ liệu nhưng không có trong danh sách mới của ScreenRoom)
            for (Seat existingSeat : existingSeats) {
                boolean seatExistsInNewList = s.getSeats().stream().anyMatch(newSeat -> newSeat.getSeat_id() == existingSeat.getSeat_id());
                if (!seatExistsInNewList) {
                    PreparedStatement csDelete = conn.prepareCall("select fn_deleteSeat(?, ?)");
                    csDelete.setString(1, s.getRid());
                    csDelete.setInt(2, existingSeat.getSeat_id());
                    csDelete.executeQuery();
                    csDelete.close();
                }
            }

            // Thêm hoặc cập nhật ghế trong danh sách mới
            for (Seat seat : s.getSeats()) {
                boolean seatExistsInDatabase = existingSeats.stream().anyMatch(existingSeat -> existingSeat.getSeat_id() == seat.getSeat_id());

                if (seatExistsInDatabase) {
                    // Nếu ghế đã tồn tại, cập nhật thông tin ghế
                    CallableStatement csUpdate = conn.prepareCall("{call sp_editSeat(?, ?, ?, ?, ?, ?)}");
                    csUpdate.setInt(1, seat.getSeat_id());
                    csUpdate.setString(2, s.getRid());
                    csUpdate.setInt(3, seat.getSeat_row());
                    csUpdate.setInt(4, seat.getSeat_column());
                    csUpdate.setString(5, seat.getType());
                    csUpdate.setString(6, seat.getStatus());
                    csUpdate.executeUpdate();
                    csUpdate.close();
                } else {
                    // Nếu ghế chưa tồn tại, thêm mới ghế vào cơ sở dữ liệu
                    CallableStatement csInsert = conn.prepareCall("{call sp_addSeat(?, ?, ?, ?, ?, ?)}");
                    csInsert.setInt(1, seat.getSeat_id());
                    csInsert.setString(2, s.getRid());
                    csInsert.setInt(3, seat.getSeat_row());
                    csInsert.setInt(4, seat.getSeat_column());
                    csInsert.setString(5, seat.getType());
                    csInsert.setString(6, seat.getStatus());
                    csInsert.executeUpdate();
                    csInsert.close();
                }
            }

            // Cập nhật danh sách screenRooms
            screenRooms.removeIf(sr -> sr.getRid().equals(s.getRid()));
            screenRooms.add(s);
            conn.commit(); // Xác nhận transaction
            return true;
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            if (conn != null) {
                try {
                    conn.rollback(); // Hoàn tác transaction nếu có lỗi xảy ra
                } catch (SQLException rollbackEx) {
                    System.err.println("Rollback error: " + rollbackEx.getMessage());
                }
            }
            return false;
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true); // Khôi phục trạng thái tự động commit ban đầu
                    conn.close(); // Đóng kết nối
                } catch (SQLException closeEx) {
                    System.err.println("Connection close error: " + closeEx.getMessage());
                }
            }
        }
    }

}

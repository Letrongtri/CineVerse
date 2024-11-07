/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import java.util.ArrayList;
import java.util.List;
import model.ScreenRoom;

import java.sql.*;
/**
 *
 * @author ADMIN
 */
public class ScreenRoomManagementDAO {
    private List<ScreenRoom> screenRooms;
    

    public ScreenRoomManagementDAO() {
        screenRooms = new ArrayList<ScreenRoom>();

        setScreenRoomData();
    }

    public List<ScreenRoom> getScreenRooms() {
        return screenRooms;
    }

    public void setScreenRoom(List<ScreenRoom> screenRooms) {
        this.screenRooms = screenRooms;
    }
    private void setScreenRoomData() {
        try {
            Connection conn = DatabaseConnection.getConnection();
            
            Statement statement = conn.createStatement();
            
            ResultSet rs1 = statement.executeQuery("Select * from ScreenRoom");
//            ResultSet rs2 = statement.executeQuery("Select count(*) from seat group by rid");
            while (rs1.next()){
                String rid = rs1.getString(1);
                String rname = rs1.getString(2);
                String type = rs1.getString(3);
                String equipment = rs1.getString(4);
                boolean status = rs1.getBoolean(5);
                String note = rs1.getString(6);
                
                screenRooms.add(new ScreenRoom(rid, rname, type, equipment, status, note));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    
    
    
}

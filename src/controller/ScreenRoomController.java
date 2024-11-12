/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ScreenRoomManagementPanel;

/**
 *
 * @author ADMIN
 */
public class ScreenRoomController implements ActionListener{
    private ScreenRoomManagementPanel screenRoomManagementPanel;

    public ScreenRoomController(ScreenRoomManagementPanel screenRoomManagementPanel) {
        this.screenRoomManagementPanel = screenRoomManagementPanel;
        screenRoomManagementPanel.setActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = e.getActionCommand();
        
        switch (btn) {
            case "Insert":
                if (e.getSource().equals(screenRoomManagementPanel.getBtn_insert())){
                    screenRoomManagementPanel.showInsertScreenRoomDialog(); // finish
                }
                else if (e.getSource().equals(screenRoomManagementPanel.getBtn_seatInsert())){
                    screenRoomManagementPanel.addRowToSeatTable(screenRoomManagementPanel.getJt_seats()); //finish
                }
                else if (e.getSource().equals(screenRoomManagementPanel.getBtn_seatInsert1())){
                    screenRoomManagementPanel.addRowToSeatTable(screenRoomManagementPanel.getJt_seats1()); //finish
                }
                break;
            case "Edit":
                screenRoomManagementPanel.showEditScreenRoomDialog(); // finish
                break;
            case "Delete":
                if (e.getSource().equals(screenRoomManagementPanel.getBtn_delete())){
                    screenRoomManagementPanel.deleteScreenRoom(); // finish
                }
                else if (e.getSource().equals(screenRoomManagementPanel.getBtn_seatDelete())){
                    screenRoomManagementPanel.deleteRowInSeatTable(screenRoomManagementPanel.getJt_seats()); // finish
                }
                else if (e.getSource().equals(screenRoomManagementPanel.getBtn_seatDelete1())){
                    screenRoomManagementPanel.deleteRowInSeatTable(screenRoomManagementPanel.getJt_seats1()); // finish
                }
                break;
            case "OK": // not yet
                if (e.getSource().equals(screenRoomManagementPanel.getBtn_insertOK())){
                    screenRoomManagementPanel.insertScreenRoom();
                }
                else if (e.getSource().equals(screenRoomManagementPanel.getBtn_editOK())){
                    screenRoomManagementPanel.editScreenRoom();
                }
                break;
            case "Cancel": // not yet
                if (e.getSource().equals(screenRoomManagementPanel.getBtn_insertCancel())){
                    screenRoomManagementPanel.cancel(screenRoomManagementPanel.getJd_insert());
                }
                else if (e.getSource().equals(screenRoomManagementPanel.getBtn_editCancel())){
                    screenRoomManagementPanel.cancel(screenRoomManagementPanel.getJd_edit());
                }
                else if (e.getSource().equals(screenRoomManagementPanel.getBtn_seatCancel())){
                    screenRoomManagementPanel.cancel(screenRoomManagementPanel.getJd_insertSeat()); // hong piec lam
                }
                else if (e.getSource().equals(screenRoomManagementPanel.getBtn_seatCancel1())){
                    screenRoomManagementPanel.cancel(screenRoomManagementPanel.getJd_editSeat());
                }
                break;
            case "Detail": 
                if (e.getSource().equals(screenRoomManagementPanel.getBtn_detail1())){
                    screenRoomManagementPanel.showInsertSeatsDialog();
                }
                else if (e.getSource().equals(screenRoomManagementPanel.getBtn_detail2())){
                    screenRoomManagementPanel.showEditSeatsDialog();
                }
                break;
            case "Save": 
                if (e.getSource().equals(screenRoomManagementPanel.getBtn_seatSave())){
                    screenRoomManagementPanel.saveInsertSeats();
                }
                else if (e.getSource().equals(screenRoomManagementPanel.getBtn_seatSave1())){
                    screenRoomManagementPanel.saveEditSeats();
                }
                break;
            default:
                break;
        }
    }
    
    
}

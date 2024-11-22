/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.StaffManagement;
/**
 *
 * @author Tieu Bang
 */
public class StaffManagementController implements ActionListener{

    private StaffManagement staffmanagement;

    public StaffManagementController(StaffManagement staffmanagement) {
        this.staffmanagement = staffmanagement;
        staffmanagement.setActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = e.getActionCommand();
        
        switch(btn) {
            case "Insert":
                staffmanagement.showinsertStaffdialog();
                break;
            case "Delete":
                staffmanagement.deleteStaff();
                break;
            case "Edit":
                staffmanagement.showeditStaffdialog();
                break;
            case "OK": 
                if(e.getSource().equals(staffmanagement.getJb_insertOK())){
                  staffmanagement.insertStaff();
                } else if (e.getSource().equals(staffmanagement.getJb_editOK())){
                  staffmanagement.editStaff();
                }
                
                break;
            case "Cancel":
                if(e.getSource().equals(staffmanagement.getJb_insertcancel())){
                    staffmanagement.cancel();
                } else if (e.getSource().equals(staffmanagement.getJb_editcancel())){
                    staffmanagement.cancelEdit();
                }
                break;
            case "btn_confirm":
                //
            default:
                break;
    }
    
}
}

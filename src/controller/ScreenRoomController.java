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
        
    }
    
    
}

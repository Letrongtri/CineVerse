/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainFrame;
import view.MovieManagementPanel;

/**
 *
 * @author ADMIN
 */
public class MovieManagementController implements ActionListener{
    private MovieManagementPanel movieManagementPanel;
    
    public MovieManagementController(MovieManagementPanel movieManagementPanel) {
        this.movieManagementPanel = movieManagementPanel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = e.getActionCommand();
        
        switch (btn) {
            case "Insert":
                movieManagementPanel.showInsertMovieDialog();
                break;
            case "Edit":
                movieManagementPanel.showEditMovieDialog();
                break;
            case "Delete":
                movieManagementPanel.deleteMovie();
                break;
            case "OK": 
                if (e.getSource().equals(movieManagementPanel.getBtn_insertOK())){
                    movieManagementPanel.insertMovie();
                }
                else if (e.getSource().equals(movieManagementPanel.getBtn_editOK())){
                    movieManagementPanel.editMovie();
                }
                break;
            case "Cancel":
                if (e.getSource().equals(movieManagementPanel.getBtn_insertCancel())){
                    movieManagementPanel.cancelInsert();
                }
                else if (e.getSource().equals(movieManagementPanel.getBtn_editCancel())){
                    movieManagementPanel.cancelEdit();
                }
                break;
            default:
                break;
        }
    }
    
    
}

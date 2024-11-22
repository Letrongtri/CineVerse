/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FilterPanel;

/**
 *
 * @author ADMIN
 */
public class FilterController implements ActionListener{
    private FilterPanel filterPanel;

    public FilterController(FilterPanel filterPanel) {
        this.filterPanel = filterPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = e.getActionCommand();
        switch (btn) {
            case "Movie":
                filterPanel.showPanel("movie");
                break;
            case "Staff":
                filterPanel.showPanel("staff");
                break;
            case "Customer":
                filterPanel.showPanel("customer");
                break;
            case "Find":
                if (e.getSource().equals(filterPanel.getBtn_findMovie())){
                    filterPanel.findMovie();
                }
                else if (e.getSource().equals(filterPanel.getBtn_findStaff())){
                    filterPanel.findStaff();
                }
                else if (e.getSource().equals(filterPanel.getBtn_findCustomer())){
                    filterPanel.findCustomer();
                }
                break;
            default:
                break;
        }
    }
    
    
    
}

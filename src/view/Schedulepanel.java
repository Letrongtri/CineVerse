package view;

import DatabaseConnection.DatabaseConnection;
import DatabaseConnection.Schedule_TicketDAO;
import controller.Schedulecontroller;
import font.SetFont;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Schedule_model;

public class Schedulepanel extends javax.swing.JPanel {
    private SetFont font;
    private Schedule_TicketDAO scheduleDAO;
    

    public Schedulepanel() {
        font = new  SetFont();
        scheduleDAO = new Schedule_TicketDAO();
        initComponents();
        setData();
        Schedulecontroller schedulecontroller = new Schedulecontroller(this);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_insert = new javax.swing.JDialog();
        movieID11 = new javax.swing.JLabel();
        cb_movie1 = new javax.swing.JComboBox<>();
        roomID11 = new javax.swing.JLabel();
        cb_room1 = new javax.swing.JComboBox<>();
        showtime11 = new javax.swing.JLabel();
        tf_time1 = new javax.swing.JTextField();
        date11 = new javax.swing.JLabel();
        price11 = new javax.swing.JLabel();
        tf_price1 = new javax.swing.JTextField();
        Jdate1 = new com.toedter.calendar.JDateChooser();
        ok_insert = new javax.swing.JButton();
        cancel_insert = new javax.swing.JButton();
        tf_schedule1 = new javax.swing.JTextField();
        sheduleID11 = new javax.swing.JLabel();
        jl_insertSchedule1 = new javax.swing.JLabel();
        jDialog_edit = new javax.swing.JDialog();
        movieID12 = new javax.swing.JLabel();
        cb_movie2 = new javax.swing.JComboBox<>();
        roomID12 = new javax.swing.JLabel();
        cb_room2 = new javax.swing.JComboBox<>();
        showtime12 = new javax.swing.JLabel();
        tf_time2 = new javax.swing.JTextField();
        date12 = new javax.swing.JLabel();
        price12 = new javax.swing.JLabel();
        tf_price2 = new javax.swing.JTextField();
        Jdate2 = new com.toedter.calendar.JDateChooser();
        ok_edit = new javax.swing.JButton();
        cancel_edit = new javax.swing.JButton();
        tf_schedule2 = new javax.swing.JTextField();
        sheduleID12 = new javax.swing.JLabel();
        jl_editSchedule2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        insert = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTschedule = new javax.swing.JTable();
        showtittle = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jDialog_insert.setSize(new java.awt.Dimension(820, 540));
        jDialog_insert.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movieID11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        movieID11.setText("Movie ID:");
        jDialog_insert.getContentPane().add(movieID11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 102, 45));

        cb_movie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_movie1movieBox3ActionPerformed(evt);
            }
        });
        jDialog_insert.getContentPane().add(cb_movie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 200, 45));

        roomID11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        roomID11.setText("Room ID:");
        jDialog_insert.getContentPane().add(roomID11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 102, 33));

        jDialog_insert.getContentPane().add(cb_room1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 200, 44));

        showtime11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        showtime11.setText("Show Time:");
        jDialog_insert.getContentPane().add(showtime11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 102, 33));

        tf_time1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jDialog_insert.getContentPane().add(tf_time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 190, 41));

        date11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        date11.setText("Show Date:");
        jDialog_insert.getContentPane().add(date11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 102, 33));

        price11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        price11.setText("Price:");
        jDialog_insert.getContentPane().add(price11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 76, 32));

        tf_price1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jDialog_insert.getContentPane().add(tf_price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 196, 44));

        Jdate1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Jdate2.setFont(new java.awt.Font("Courier New", java.awt.Font.PLAIN, 15));
        jDialog_insert.getContentPane().add(Jdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 200, 45));

        ok_insert.setBackground(new java.awt.Color(102, 23, 26));
        ok_insert.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ok_insert.setForeground(new java.awt.Color(255, 255, 255));
        ok_insert.setText("OK");
        ok_insert.setPreferredSize(new java.awt.Dimension(70, 30));
        ok_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_insertActionPerformed(evt);
            }
        });
        jDialog_insert.getContentPane().add(ok_insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 150, 40));

        cancel_insert.setBackground(new java.awt.Color(102, 23, 26));
        cancel_insert.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancel_insert.setForeground(new java.awt.Color(255, 255, 255));
        cancel_insert.setText("Cancel");
        cancel_insert.setPreferredSize(new java.awt.Dimension(150, 30));
        cancel_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_insertActionPerformed(evt);
            }
        });
        jDialog_insert.getContentPane().add(cancel_insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 150, 40));
        jDialog_insert.getContentPane().add(tf_schedule1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, 50));

        sheduleID11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sheduleID11.setText("ScheduleID:");
        jDialog_insert.getContentPane().add(sheduleID11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jl_insertSchedule1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_insertSchedule1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_insertSchedule1.setText("Insert Schedule");
        jDialog_insert.getContentPane().add(jl_insertSchedule1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 660, -1));

        jDialog_edit.setSize(new java.awt.Dimension(810, 540));
        jDialog_edit.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movieID12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        movieID12.setText("Movie ID:");
        jDialog_edit.getContentPane().add(movieID12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 102, 45));

        cb_movie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_movie2movieBox3ActionPerformed(evt);
            }
        });
        jDialog_edit.getContentPane().add(cb_movie2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 200, 50));

        roomID12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        roomID12.setText("Room ID:");
        jDialog_edit.getContentPane().add(roomID12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 102, 33));

        jDialog_edit.getContentPane().add(cb_room2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 200, 44));

        showtime12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        showtime12.setText("Show Time:");
        jDialog_edit.getContentPane().add(showtime12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 102, 33));

        tf_time2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jDialog_edit.getContentPane().add(tf_time2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 190, 50));

        date12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        date12.setText("Show Date:");
        jDialog_edit.getContentPane().add(date12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 102, 33));

        price12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        price12.setText("Price:");
        jDialog_edit.getContentPane().add(price12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 76, 32));

        tf_price2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jDialog_edit.getContentPane().add(tf_price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 196, 44));

        Jdate2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Jdate2.setFont(new java.awt.Font("Courier New", java.awt.Font.PLAIN, 15));
        jDialog_edit.getContentPane().add(Jdate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 196, 45));

        ok_edit.setBackground(new java.awt.Color(102, 23, 26));
        ok_edit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ok_edit.setForeground(new java.awt.Color(255, 255, 255));
        ok_edit.setText("OK");
        jDialog_edit.getContentPane().add(ok_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 150, 40));

        cancel_edit.setBackground(new java.awt.Color(102, 23, 26));
        cancel_edit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancel_edit.setForeground(new java.awt.Color(255, 255, 255));
        cancel_edit.setText("Cancel");
        jDialog_edit.getContentPane().add(cancel_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 150, 40));
        jDialog_edit.getContentPane().add(tf_schedule2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, 50));

        sheduleID12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sheduleID12.setText("ScheduleID:");
        jDialog_edit.getContentPane().add(sheduleID12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jl_editSchedule2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_editSchedule2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_editSchedule2.setText("Edit Schedule");
        jDialog_edit.getContentPane().add(jl_editSchedule2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 660, -1));

        setPreferredSize(new java.awt.Dimension(1366, 688));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBackground(new java.awt.Color(195, 170, 170, 123));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insert.setBackground(new java.awt.Color(102, 23, 26));
        insert.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        insert.setForeground(new java.awt.Color(255, 255, 255));
        insert.setText("Insert");
        jPanel4.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 162, 51));

        delete.setBackground(new java.awt.Color(102, 23, 26));
        delete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        jPanel4.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 560, 165, 51));

        edit.setBackground(new java.awt.Color(102, 23, 26));
        edit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Edit");
        jPanel4.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 560, 163, 51));

        jTschedule.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTschedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Movie ID", "Room ID", "Date", "Time", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTschedule);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1240, 490));

        showtittle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        font.setFontFutura(showtittle, 24f);
        showtittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showtittle.setText("Schedule Management");
        jPanel4.add(showtittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1240, 30));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1280, 630));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 690));
    }// </editor-fold>//GEN-END:initComponents

    private void cb_movie1movieBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_movie1movieBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_movie1movieBox3ActionPerformed

    private void cb_movie2movieBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_movie2movieBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_movie2movieBox3ActionPerformed

    private void ok_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_insertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ok_insertActionPerformed

    private void cancel_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_insertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel_insertActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Jdate1;
    private com.toedter.calendar.JDateChooser Jdate2;
    private javax.swing.JButton cancel_edit;
    private javax.swing.JButton cancel_insert;
    private javax.swing.JComboBox<String> cb_movie1;
    private javax.swing.JComboBox<String> cb_movie2;
    private javax.swing.JComboBox<String> cb_room1;
    private javax.swing.JComboBox<String> cb_room2;
    private javax.swing.JLabel date11;
    private javax.swing.JLabel date12;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton insert;
    private javax.swing.JDialog jDialog_edit;
    private javax.swing.JDialog jDialog_insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTschedule;
    private javax.swing.JLabel jl_editSchedule2;
    private javax.swing.JLabel jl_insertSchedule1;
    private javax.swing.JLabel movieID11;
    private javax.swing.JLabel movieID12;
    private javax.swing.JButton ok_edit;
    private javax.swing.JButton ok_insert;
    private javax.swing.JLabel price11;
    private javax.swing.JLabel price12;
    private javax.swing.JLabel roomID11;
    private javax.swing.JLabel roomID12;
    private javax.swing.JLabel sheduleID11;
    private javax.swing.JLabel sheduleID12;
    private javax.swing.JLabel showtime11;
    private javax.swing.JLabel showtime12;
    private javax.swing.JLabel showtittle;
    private javax.swing.JTextField tf_price1;
    private javax.swing.JTextField tf_price2;
    private javax.swing.JTextField tf_schedule1;
    private javax.swing.JTextField tf_schedule2;
    private javax.swing.JTextField tf_time1;
    private javax.swing.JTextField tf_time2;
    // End of variables declaration//GEN-END:variables

    public void setActionListener(ActionListener ac) {
        insert.addActionListener(ac);
        edit.addActionListener(ac);
        delete.addActionListener(ac);
        ok_insert.addActionListener(ac);
        cancel_insert.addActionListener(ac);
        ok_edit.addActionListener(ac);
        cancel_edit.addActionListener(ac);
    }

    public JButton getEdit() {
        return edit;
    }

    public void setEdit(JButton edit) {
        this.edit = edit;
    }

    public JButton getInsert() {
        return insert;
    }

    public void setInsert(JButton insert) {
        this.insert = insert;
    }

    public JButton getOk_edit() {
        return ok_edit;
    }

    public void setOk_edit(JButton ok_edit) {
        this.ok_edit = ok_edit;
    }

    public JButton getOk_insert() {
        return ok_insert;
    }

    public void setOk_insert(JButton ok_insert) {
        this.ok_insert = ok_insert;
    }

    public JButton getCancel_edit() {
        return cancel_edit;
    }

    public void setCancel_edit(JButton cancel_edit) {
        this.cancel_edit = cancel_edit;
    }

    public JButton getCancel_insert() {
        return cancel_insert;
    }

    public void setCancel_insert(JButton cancel_insert) {
        this.cancel_insert = cancel_insert;
    }


    public void setData() {
        DefaultTableModel tableModel = (DefaultTableModel) jTschedule.getModel();
        tableModel.setRowCount(0);

        for (model.Schedule_model s : scheduleDAO.getSchedules()) {
            String sdateString = s.getSdate().toString(); 
            LocalTime stime = s.getStime(); 

            stime = stime.minusHours(1);  

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String stimeString = stime.format(formatter);  

            String[] rowData = {
                s.getScid() + "",                   
                s.getMid(),                  
                s.getRid(),                    
                sdateString,                 
                stimeString,                   
                String.valueOf(s.getPrice())   
            };

            tableModel.addRow(rowData);
        }
    }


    public void showInsertdialog() {
        
        tf_schedule1.setText(""); 
        cb_movie1.removeAllItems(); 
        cb_room1.removeAllItems();
        Jdate1.setDate(null); 
        tf_time1.setText("");
        tf_price1.setText(""); 
        

         ArrayList<String> list = scheduleDAO.loaddatacomboboxMovie();
         for (String item : list) {
             cb_movie1.addItem(item);  
         }

         
         ArrayList<String> list1 = scheduleDAO.loaddatacomboboxroom();
         for (String item : list1) {
             cb_room1.addItem(item);  
         }

       
        jDialog_insert.setVisible(true);
        
        
        
        }
    

    
    public void showEditDialog() {
    Schedule_model schedule = getSelectedRow();
    
    if (schedule == null) { 
        JOptionPane.showMessageDialog(null, "Please select a showtime to edit.");
        return;
    }
    
    cb_movie2.removeAllItems();
    cb_room2.removeAllItems();

    
    ArrayList<String> list = scheduleDAO.loaddatacomboboxMovie();
    for (String item : list) {
        cb_movie2.addItem(item);  
    }

    ArrayList<String> list1 = scheduleDAO.loaddatacomboboxroom();
    for (String item : list1) {
        cb_room2.addItem(item);  
    }

    
    
    
    
    LocalDate localDate = schedule.getSdate();
    Date date = (localDate != null) ? Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()) : null;
    
   
    tf_schedule2.setText(schedule.getScid() + "");
    cb_movie2.setSelectedItem(schedule.getMid());
    cb_room2.setSelectedItem(schedule.getRid());
    Jdate2.setDate(date);
    tf_time2.setText(schedule.getStime() != null ? schedule.getStime().toString() : "");
    tf_price2.setText(String.valueOf(schedule.getPrice()));
    
    jDialog_edit.setVisible(true);
}

     
    private Schedule_model getSelectedRow() {
    DefaultTableModel model = (DefaultTableModel) jTschedule.getModel();
    int selectedRow = jTschedule.getSelectedRow();
    
    if (selectedRow == -1) { 
        return null; 
    }
    
    int scheduleID = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
    String movieID = model.getValueAt(selectedRow, 1).toString();
    String roomID = model.getValueAt(selectedRow, 2).toString();
    LocalDate sdate = LocalDate.parse(model.getValueAt(selectedRow, 3).toString());
    LocalTime stime = LocalTime.parse(model.getValueAt(selectedRow, 4).toString());
    float price = Float.parseFloat(model.getValueAt(selectedRow, 5).toString());
    
    return new Schedule_model(scheduleID, movieID, roomID, sdate, stime, price);
}
    
    
    public void cancelInsert() {
        int confirm = JOptionPane.showConfirmDialog(jDialog_insert, "Do you want to cancel?", "Cancel", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION){
            // thêm hàm xoá dữ liệu cũ , 
            jDialog_insert.setVisible(false);
        }
    }
    
     public void cancelEdit() {
        int confirm = JOptionPane.showConfirmDialog(jDialog_edit, "Do you want to cancel?", "Cancel", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION){
            jDialog_edit.setVisible(false);
        }
    }
     
     public void insertSchedule() {

    int scid;
    String mid = (cb_movie1.getSelectedItem() != null) ? cb_movie1.getSelectedItem().toString() : "";
    String rid = (cb_room1.getSelectedItem() != null) ? cb_room1.getSelectedItem().toString() : "";
    LocalDate sdate = null;
    String timeText = tf_time1.getText().trim();
    String priceText = tf_price1.getText().trim();
    LocalTime stime;

    // Validate input fields
    if (tf_schedule1.getText().trim().isEmpty() || mid.isEmpty() || rid.isEmpty() || timeText.isEmpty() || priceText.isEmpty()) {
        JOptionPane.showMessageDialog(jDialog_insert, "Please fill in all the information!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        scid = Integer.parseInt(tf_schedule1.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(jDialog_insert, "Schedule ID must be a numeric value!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }


    if (Jdate1.getDate() == null) {
        JOptionPane.showMessageDialog(jDialog_insert, "Please select a valid date!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    } else {
        sdate = Jdate1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }


    try {
        stime = LocalTime.parse(timeText);
    } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(jDialog_insert, "Time must be in the format HH:mm:ss (e.g., 10:00:00)!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    stime = stime.plusHours(1); 

  
    float price;
    try {
        price = Float.parseFloat(priceText);
        if (price <= 0) {
            JOptionPane.showMessageDialog(jDialog_insert, "Price must be greater than 0.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(jDialog_insert, "Invalid price!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

   
    Schedule_model s = new Schedule_model();
    s.setScid(scid);
    s.setMid(mid);
    s.setRid(rid);
    s.setSdate(sdate);
    s.setStime(stime);
    s.setPrice(price);

    
    if (scheduleDAO.isExistschedule(s.getScid())) {
        JOptionPane.showMessageDialog(jDialog_insert, "Schedule ID already exists. Please enter a different ID!", "Insert Schedule Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

  
    scheduleDAO.addSchedule(s);

 
    setData();

 
    JOptionPane.showMessageDialog(jDialog_insert, "Schedule has been added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    jDialog_insert.setVisible(false);
}

public void editSchedule() {

    int scid;
    String mid = (cb_movie2.getSelectedItem() != null) ? cb_movie2.getSelectedItem().toString() : "";
    String rid = (cb_room2.getSelectedItem() != null) ? cb_room2.getSelectedItem().toString() : "";
    LocalDate sdate = null;
    String timeText = tf_time2.getText().trim();
    String priceText = tf_price2.getText().trim();
    LocalTime stime;

   
    if (tf_schedule2.getText().trim().isEmpty() || mid.isEmpty() || rid.isEmpty() || timeText.isEmpty() || priceText.isEmpty()) {
        JOptionPane.showMessageDialog(jDialog_edit, "Please fill in all the information!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }


    try {
        scid = Integer.parseInt(tf_schedule2.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(jDialog_edit, "Schedule ID must be a numeric value!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }


    if (Jdate2.getDate() == null) {
        JOptionPane.showMessageDialog(jDialog_edit, "Please select a valid date!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    } else {
        sdate = Jdate2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

  
    try {
        stime = LocalTime.parse(timeText);
    } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(jDialog_edit, "Time must be in the format HH:mm:ss (e.g., 10:00:00)!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    stime = stime.plusHours(1);


    float price;
    try {
        price = Float.parseFloat(priceText);
        if (price <= 0) {
            JOptionPane.showMessageDialog(jDialog_edit, "Price must be greater than 0.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(jDialog_edit, "Invalid price! Please enter a valid numeric value.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }


    Schedule_model s = new Schedule_model();
    s.setScid(scid);
    s.setMid(mid);
    s.setRid(rid);
    s.setSdate(sdate);
    s.setStime(stime);
    s.setPrice(price);

  
    if (!scheduleDAO.isExistschedule(s.getScid())) {
        JOptionPane.showMessageDialog(jDialog_edit, "Schedule ID does not exist. Please enter again!", "Edit Schedule Error", JOptionPane.ERROR_MESSAGE);
        return;
    }


    scheduleDAO.editSchedule(s);


    setData();

  
    JOptionPane.showMessageDialog(jDialog_edit, "Schedule has been edited!", "Editing Successfully", JOptionPane.PLAIN_MESSAGE);
    jDialog_edit.setVisible(false);
}
public void deleteSchedule() {
    Schedule_model sc = getSelectedRow();

  
    if (sc == null) {
        JOptionPane.showMessageDialog(
            jLabel1, 
            "No schedule selected.", 
            "Error", 
            JOptionPane.ERROR_MESSAGE
        );
        return;
    }

    int scheduleId = sc.getScid();

 
    if (!scheduleDAO.isExistschedule(scheduleId)) {
        JOptionPane.showMessageDialog(
            jLabel1, 
            "Schedule does not exist.", 
            "Error", 
            JOptionPane.ERROR_MESSAGE
        );
        return;
    }

  
    if (scheduleDAO.isSeatBooked(scheduleId)) {
        JOptionPane.showMessageDialog(
            jLabel1, 
            "Cannot delete schedule because seats have been booked.", 
            "Error", 
            JOptionPane.ERROR_MESSAGE
        );
        return;
    }

  
    boolean deleteSuccess = scheduleDAO.deleteSchedule(sc);
    if (deleteSuccess) {
        
        JOptionPane.showMessageDialog(
            jLabel1, 
            "Schedule has been deleted successfully.", 
            "Success", 
            JOptionPane.INFORMATION_MESSAGE
        );
        
            setData();

       
    } else {
        JOptionPane.showMessageDialog(
            jLabel1, 
            "Failed to delete schedule. Please try again.", 
            "Error", 
            JOptionPane.ERROR_MESSAGE
        );
    }
}


}

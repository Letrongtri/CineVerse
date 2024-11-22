/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import DatabaseConnection.StaffManagementDAO;
import controller.StaffManagementController;
import font.SetFont;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Staff;
import java.time.format.DateTimeParseException;
/**
 *
 * @author Tieu Bang
 */

public class StaffManagement extends javax.swing.JPanel {

private SetFont font;
private StaffManagementDAO staffmanagementdao;    
    /**
     * Creates new form StaffManagement
     */
    public StaffManagement() {
        font = new SetFont();
        staffmanagementdao = new StaffManagementDAO();
        initComponents();
        setData();
        
        StaffManagementController staffManagementController = new StaffManagementController(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jD_insert = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jl_StaffManagement1 = new javax.swing.JLabel();
        jl_id = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jl_dob = new javax.swing.JLabel();
        tf_dob = new javax.swing.JTextField();
        jl_role = new javax.swing.JLabel();
        tf_role = new javax.swing.JTextField();
        jl_salary = new javax.swing.JLabel();
        tf_salary = new javax.swing.JTextField();
        jl_fullname = new javax.swing.JLabel();
        tf_fullname = new javax.swing.JTextField();
        jl_email = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        jl_phone = new javax.swing.JLabel();
        tf_phone = new javax.swing.JTextField();
        jl_enrolldate = new javax.swing.JLabel();
        tf_enrolldate = new javax.swing.JTextField();
        jb_insertOK = new javax.swing.JButton();
        jb_insertcancel = new javax.swing.JButton();
        jD_edit = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jl_StaffManagement2 = new javax.swing.JLabel();
        jl_id1 = new javax.swing.JLabel();
        tf_id1 = new javax.swing.JTextField();
        jl_dob1 = new javax.swing.JLabel();
        tf_dob1 = new javax.swing.JTextField();
        jl_role1 = new javax.swing.JLabel();
        tf_role1 = new javax.swing.JTextField();
        jl_salary1 = new javax.swing.JLabel();
        tf_salary1 = new javax.swing.JTextField();
        jl_fullname1 = new javax.swing.JLabel();
        tf_fullname1 = new javax.swing.JTextField();
        jl_email1 = new javax.swing.JLabel();
        tf_email1 = new javax.swing.JTextField();
        jl_phone1 = new javax.swing.JLabel();
        tf_phone1 = new javax.swing.JTextField();
        jl_enrolldate1 = new javax.swing.JLabel();
        tf_enrolldate1 = new javax.swing.JTextField();
        jb_editOK = new javax.swing.JButton();
        jb_editcancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jl_StaffManagement = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_staff = new javax.swing.JTable();
        jp_button = new javax.swing.JPanel();
        btn_insert = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jD_insert.setSize(new java.awt.Dimension(890, 550));
        jD_insert.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(890, 550));
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel1.setBackground(new java.awt.Color(226, 226, 229));
        jPanel1.setBackground(new java.awt.Color(226, 226, 229,123));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_StaffManagement1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_StaffManagement1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_StaffManagement1.setText("Insert Staff");
        jPanel2.add(jl_StaffManagement1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 660, -1));

        jl_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_id.setText("ID:");
        jl_id.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel2.add(jl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));

        tf_id.setBackground(new java.awt.Color(226, 226, 229));
        tf_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_id.setBorder(null);
        tf_id.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_id.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel2.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 220, -1));

        jl_dob.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_dob.setText("Date Of Birth:");
        jl_dob.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel2.add(jl_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        tf_dob.setBackground(new java.awt.Color(226, 226, 229));
        tf_dob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_dob.setBorder(null);
        tf_dob.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_dob.setPreferredSize(new java.awt.Dimension(100, 30));
        tf_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dobActionPerformed(evt);
            }
        });
        jPanel2.add(tf_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 220, -1));

        jl_role.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_role.setText("Role:");
        jl_role.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel2.add(jl_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 30));

        tf_role.setBackground(new java.awt.Color(226, 226, 229));
        tf_role.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_role.setBorder(null);
        tf_role.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_role.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel2.add(tf_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 220, -1));

        jl_salary.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_salary.setText("Salary:");
        jl_salary.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel2.add(jl_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 30));

        tf_salary.setBackground(new java.awt.Color(226, 226, 229));
        tf_salary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_salary.setBorder(null);
        tf_salary.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_salary.setPreferredSize(new java.awt.Dimension(100, 30));
        tf_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_salaryActionPerformed(evt);
            }
        });
        jPanel2.add(tf_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 220, -1));

        jl_fullname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_fullname.setText("Full Name:");
        jl_fullname.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel2.add(jl_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, 30));

        tf_fullname.setBackground(new java.awt.Color(226, 226, 229));
        tf_fullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_fullname.setBorder(null);
        tf_fullname.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_fullname.setPreferredSize(new java.awt.Dimension(100, 30));
        tf_fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fullnameActionPerformed(evt);
            }
        });
        jPanel2.add(tf_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 220, -1));

        jl_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_email.setText("Email:");
        jl_email.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel2.add(jl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, 30));

        tf_email.setBackground(new java.awt.Color(226, 226, 229));
        tf_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_email.setBorder(null);
        tf_email.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_email.setPreferredSize(new java.awt.Dimension(100, 30));
        tf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_emailActionPerformed(evt);
            }
        });
        jPanel2.add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 220, -1));

        jl_phone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_phone.setText("Phone:");
        jl_phone.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel2.add(jl_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, 30));

        tf_phone.setBackground(new java.awt.Color(226, 226, 229));
        tf_phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_phone.setBorder(null);
        tf_phone.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_phone.setPreferredSize(new java.awt.Dimension(100, 30));
        tf_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_phoneActionPerformed(evt);
            }
        });
        jPanel2.add(tf_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        jl_enrolldate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_enrolldate.setText("Enroll Date:");
        jl_enrolldate.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel2.add(jl_enrolldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, 30));

        tf_enrolldate.setBackground(new java.awt.Color(226, 226, 229));
        tf_enrolldate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_enrolldate.setBorder(null);
        tf_enrolldate.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_enrolldate.setPreferredSize(new java.awt.Dimension(100, 30));
        tf_enrolldate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_enrolldateActionPerformed(evt);
            }
        });
        jPanel2.add(tf_enrolldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 220, -1));

        jb_insertOK.setBackground(new java.awt.Color(102, 0, 0));
        jb_insertOK.setForeground(new java.awt.Color(255, 255, 255));
        jb_insertOK.setLabel("OK");
        jb_insertOK.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel2.add(jb_insertOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, -1));

        jb_insertcancel.setBackground(new java.awt.Color(102, 0, 0));
        jb_insertcancel.setForeground(new java.awt.Color(255, 255, 255));
        jb_insertcancel.setLabel("Cancel");
        jb_insertcancel.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel2.add(jb_insertcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, -1, -1));

        jD_insert.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 550));

        jD_edit.setSize(new java.awt.Dimension(810, 500));
        jD_edit.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(890, 550));
        jPanel3.setVerifyInputWhenFocusTarget(false);
        jPanel1.setBackground(new java.awt.Color(226, 226, 229));
        jPanel1.setBackground(new java.awt.Color(226, 226, 229,123));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_StaffManagement2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_StaffManagement2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_StaffManagement2.setText("Edit Staff");
        jPanel3.add(jl_StaffManagement2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 660, -1));

        jl_id1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_id1.setText("ID:");
        jl_id1.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel3.add(jl_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));

        tf_id1.setBackground(new java.awt.Color(226, 226, 229));
        tf_id1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_id1.setBorder(null);
        tf_id1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_id1.setPreferredSize(new java.awt.Dimension(100, 30));
        tf_id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_id1ActionPerformed(evt);
            }
        });
        jPanel3.add(tf_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 220, -1));

        jl_dob1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_dob1.setText("Date Of Birth:");
        jl_dob1.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel3.add(jl_dob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        tf_dob1.setBackground(new java.awt.Color(226, 226, 229));
        tf_dob1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_dob1.setBorder(null);
        tf_dob1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_dob1.setPreferredSize(new java.awt.Dimension(100, 30));
        tf_dob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dob1ActionPerformed(evt);
            }
        });
        jPanel3.add(tf_dob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 220, -1));

        jl_role1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_role1.setText("Role:");
        jl_role1.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel3.add(jl_role1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 30));

        tf_role1.setBackground(new java.awt.Color(226, 226, 229));
        tf_role1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_role1.setBorder(null);
        tf_role1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_role1.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel3.add(tf_role1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 220, -1));

        jl_salary1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_salary1.setText("Salary:");
        jl_salary1.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel3.add(jl_salary1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 30));

        tf_salary1.setBackground(new java.awt.Color(226, 226, 229));
        tf_salary1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_salary1.setBorder(null);
        tf_salary1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_salary1.setPreferredSize(new java.awt.Dimension(100, 30));
        tf_salary1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_salary1ActionPerformed(evt);
            }
        });
        jPanel3.add(tf_salary1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 220, -1));

        jl_fullname1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_fullname1.setText("Full Name:");
        jl_fullname1.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel3.add(jl_fullname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, 30));

        tf_fullname1.setBackground(new java.awt.Color(226, 226, 229));
        tf_fullname1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_fullname1.setBorder(null);
        tf_fullname1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_fullname1.setPreferredSize(new java.awt.Dimension(100, 30));
        tf_fullname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fullname1ActionPerformed(evt);
            }
        });
        jPanel3.add(tf_fullname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 220, -1));

        jl_email1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_email1.setText("Email:");
        jl_email1.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel3.add(jl_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, 30));

        tf_email1.setBackground(new java.awt.Color(226, 226, 229));
        tf_email1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_email1.setBorder(null);
        tf_email1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_email1.setPreferredSize(new java.awt.Dimension(100, 30));
        tf_email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_email1ActionPerformed(evt);
            }
        });
        jPanel3.add(tf_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 220, -1));

        jl_phone1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_phone1.setText("Phone:");
        jl_phone1.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel3.add(jl_phone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, 30));

        tf_phone1.setBackground(new java.awt.Color(226, 226, 229));
        tf_phone1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_phone1.setBorder(null);
        tf_phone1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_phone1.setPreferredSize(new java.awt.Dimension(100, 30));
        tf_phone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_phone1ActionPerformed(evt);
            }
        });
        jPanel3.add(tf_phone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        jl_enrolldate1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_enrolldate1.setText("Enroll Date:");
        jl_enrolldate1.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel3.add(jl_enrolldate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, 30));

        tf_enrolldate1.setBackground(new java.awt.Color(226, 226, 229));
        tf_enrolldate1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_enrolldate1.setBorder(null);
        tf_enrolldate1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_enrolldate1.setPreferredSize(new java.awt.Dimension(100, 30));
        tf_enrolldate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_enrolldate1ActionPerformed(evt);
            }
        });
        jPanel3.add(tf_enrolldate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 220, -1));

        jb_editOK.setBackground(new java.awt.Color(102, 0, 0));
        jb_editOK.setForeground(new java.awt.Color(255, 255, 255));
        jb_editOK.setLabel("OK");
        jb_editOK.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel3.add(jb_editOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        jb_editcancel.setBackground(new java.awt.Color(102, 0, 0));
        jb_editcancel.setForeground(new java.awt.Color(255, 255, 255));
        jb_editcancel.setLabel("Cancel");
        jb_editcancel.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel3.add(jb_editcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, -1, -1));

        jD_edit.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 650));
        jPanel1.setBackground(new java.awt.Color(226, 226, 229));
        jPanel1.setBackground(new java.awt.Color(226, 226, 229,123));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_StaffManagement.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        font.setFontFutura(jl_StaffManagement, 24f);
        jl_StaffManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_StaffManagement.setText("Staff Management");
        jPanel1.add(jl_StaffManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1190, -1));

        jt_staff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Date Of Birth", "Full Name", "Email", "Phone", "Role", "Salary", "Enroll Date", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_staff);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 38, 1152, 540));

        jp_button.setOpaque(false);
        jp_button.setPreferredSize(new java.awt.Dimension(1196, 40));
        jp_button.setLayout(null);

        btn_insert.setBackground(new java.awt.Color(102, 23, 26));
        btn_insert.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontRobotoBold(btn_insert, 20f);
        btn_insert.setForeground(new java.awt.Color(226, 226, 229));
        btn_insert.setText("Insert");
        btn_insert.setBorder(null);
        btn_insert.setFocusPainted(false);
        btn_insert.setPreferredSize(new java.awt.Dimension(150, 40));
        jp_button.add(btn_insert);
        btn_insert.setBounds(590, 0, 150, 40);

        btn_delete.setBackground(new java.awt.Color(102, 23, 26));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontRobotoBold(btn_delete, 20f);
        btn_delete.setForeground(new java.awt.Color(226, 226, 229));
        btn_delete.setText("Delete");
        btn_delete.setBorder(null);
        btn_delete.setFocusPainted(false);
        btn_delete.setPreferredSize(new java.awt.Dimension(150, 40));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jp_button.add(btn_delete);
        btn_delete.setBounds(780, 0, 150, 40);

        btn_edit.setBackground(new java.awt.Color(102, 23, 26));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontRobotoBold(btn_edit, 20f);
        btn_edit.setForeground(new java.awt.Color(226, 226, 229));
        btn_edit.setText("Edit");
        btn_edit.setBorder(null);
        btn_edit.setFocusPainted(false);
        btn_edit.setPreferredSize(new java.awt.Dimension(150, 40));
        jp_button.add(btn_edit);
        btn_edit.setBounds(970, 0, 150, 40);

        jPanel1.add(jp_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 1120, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 19, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tf_enrolldateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_enrolldateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_enrolldateActionPerformed

    private void tf_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_salaryActionPerformed

    private void tf_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dobActionPerformed

    private void tf_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_phoneActionPerformed

    private void tf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_emailActionPerformed

    private void tf_fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fullnameActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tf_id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_id1ActionPerformed

    private void tf_dob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dob1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dob1ActionPerformed

    private void tf_salary1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_salary1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_salary1ActionPerformed

    private void tf_fullname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fullname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fullname1ActionPerformed

    private void tf_email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_email1ActionPerformed

    private void tf_phone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_phone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_phone1ActionPerformed

    private void tf_enrolldate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_enrolldate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_enrolldate1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_insert;
    private javax.swing.JDialog jD_edit;
    private javax.swing.JDialog jD_insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_editOK;
    private javax.swing.JButton jb_editcancel;
    private javax.swing.JButton jb_insertOK;
    private javax.swing.JButton jb_insertcancel;
    private javax.swing.JLabel jl_StaffManagement;
    private javax.swing.JLabel jl_StaffManagement1;
    private javax.swing.JLabel jl_StaffManagement2;
    private javax.swing.JLabel jl_dob;
    private javax.swing.JLabel jl_dob1;
    private javax.swing.JLabel jl_email;
    private javax.swing.JLabel jl_email1;
    private javax.swing.JLabel jl_enrolldate;
    private javax.swing.JLabel jl_enrolldate1;
    private javax.swing.JLabel jl_fullname;
    private javax.swing.JLabel jl_fullname1;
    private javax.swing.JLabel jl_id;
    private javax.swing.JLabel jl_id1;
    private javax.swing.JLabel jl_phone;
    private javax.swing.JLabel jl_phone1;
    private javax.swing.JLabel jl_role;
    private javax.swing.JLabel jl_role1;
    private javax.swing.JLabel jl_salary;
    private javax.swing.JLabel jl_salary1;
    private javax.swing.JPanel jp_button;
    private javax.swing.JTable jt_staff;
    private javax.swing.JTextField tf_dob;
    private javax.swing.JTextField tf_dob1;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_email1;
    private javax.swing.JTextField tf_enrolldate;
    private javax.swing.JTextField tf_enrolldate1;
    private javax.swing.JTextField tf_fullname;
    private javax.swing.JTextField tf_fullname1;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_id1;
    private javax.swing.JTextField tf_phone;
    private javax.swing.JTextField tf_phone1;
    private javax.swing.JTextField tf_role;
    private javax.swing.JTextField tf_role1;
    private javax.swing.JTextField tf_salary;
    private javax.swing.JTextField tf_salary1;
    // End of variables declaration//GEN-END:variables

    public void setActionListener(ActionListener ac) {
        btn_insert.addActionListener(ac);
        jb_insertcancel.addActionListener(ac);
        btn_delete.addActionListener(ac);
        jb_insertOK.addActionListener(ac);    
        btn_edit.addActionListener(ac);
        jb_editcancel.addActionListener(ac);
        jb_editOK.addActionListener(ac);
    }

    
    public void setData(){
        DefaultTableModel tableModel = (DefaultTableModel) jt_staff.getModel();
        tableModel.setRowCount(0);
        
        for (Staff s : staffmanagementdao.getStaffs()) {
            String[] rowData = {
                s.getSid(),
                s.getDob().toString(),
                s.getName(),
                s.getEmail(),
                s.getPhone() + "",
                s.getRole(),
                s.getSalary() + "",
                s.getEnroll_date().toString(),
                s.getPassword(),
            };
            // Thêm dòng vào bảng
            tableModel.addRow(rowData);
        }
    }
    
    
    public void insertStaff() {
    try {
        // Chuyển đổi và kiểm tra các trường dữ liệu
        int phone = Integer.parseInt(tf_phone.getText().trim());
        LocalDate dob = LocalDate.parse(tf_dob.getText().trim());
        LocalDate enroll_date = LocalDate.parse(tf_enrolldate.getText().trim());
        float salary = Float.parseFloat(tf_salary.getText().trim());

        // Tạo đối tượng Staff
        Staff s = new Staff();
        s.setSid(tf_id.getText().trim());
        s.setDob(dob);
        s.setName(tf_fullname.getText().trim());
        s.setEmail(tf_email.getText().trim());
        s.setPhone(phone);
        s.setRole(tf_role.getText().trim());
        s.setSalary(salary);
        s.setEnroll_date(enroll_date);

        // Kiểm tra Staff ID tồn tại
        if (staffmanagementdao.isExistStaff(s.getSid())) {
            JOptionPane.showMessageDialog(jD_insert, "Staff ID already exists. Please enter again!", "Insert Staff Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Thêm Staff vào cơ sở dữ liệu
        boolean canInsert = staffmanagementdao.addStaff(s);
        if (canInsert) {
            setData();
            JOptionPane.showMessageDialog(jD_insert, "Staff has been added successfully!", "Adding Successfully", JOptionPane.PLAIN_MESSAGE);
            jD_insert.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(jD_insert, "Staff could not be added.", "Adding Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {
        // Xử lý lỗi nhập không đúng định dạng số
        JOptionPane.showMessageDialog(jD_insert, "Invalid number format for phone or salary. Please enter valid values.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (DateTimeParseException e) {
        // Xử lý lỗi nhập ngày sai định dạng
        JOptionPane.showMessageDialog(jD_insert, "Invalid date format for DOB or Enrollment Date. Please use the format YYYY-MM-DD.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        // Bắt lỗi không xác định
        JOptionPane.showMessageDialog(jD_insert, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}

    
    public void deleteStaff() {
        int confirm = JOptionPane.showConfirmDialog(this, "Do you wnat do delete this Staff", "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(confirm != JOptionPane.YES_OPTION) {
            return;
        }
        Staff s = getSelectedRow();
        if(s == null) {
            JOptionPane.showMessageDialog(this, "Please choose a Staff to delete", "Delete staff error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        boolean checkDelete = staffmanagementdao.deleteStaff(s);
        if(!checkDelete) {
            JOptionPane.showMessageDialog(this, "Cannot delete this satff because the foreign key constraint fails", "Delete staff error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        setData();
    }
    
    
    public void editStaff() {
    try {
        // Chuyển đổi và kiểm tra dữ liệu nhập
        int phone = Integer.parseInt(tf_phone1.getText().trim());
        LocalDate dob = LocalDate.parse(tf_dob1.getText().trim());
        LocalDate enroll_date = LocalDate.parse(tf_enrolldate1.getText().trim());
        float salary = Float.parseFloat(tf_salary1.getText().trim());

        // Tạo đối tượng Staff
        Staff s = new Staff();
        s.setSid(tf_id1.getText().trim());
        s.setDob(dob);
        s.setName(tf_fullname1.getText().trim());
        s.setEmail(tf_email1.getText().trim());
        s.setPhone(phone);
        s.setRole(tf_role1.getText().trim());
        s.setSalary(salary);
        s.setEnroll_date(enroll_date);
        s.setPassword(staffmanagementdao.getPasswordByID(tf_id1.getText().trim()));

        // Kiểm tra Staff ID có tồn tại không
        if (!staffmanagementdao.isExistStaff(s.getSid())) {
            JOptionPane.showMessageDialog(jD_edit, "Staff ID does not exist. Please enter again!", "Edit Staff Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Gọi phương thức editStaff
        staffmanagementdao.editStaff(s);
        setData();
        JOptionPane.showMessageDialog(jD_edit, "Staff has been edited successfully!", "Editing Successfully", JOptionPane.PLAIN_MESSAGE);
        jD_edit.setVisible(false);

    } catch (NumberFormatException e) {
        // Xử lý lỗi khi nhập sai định dạng số
        JOptionPane.showMessageDialog(jD_edit, "Invalid number format for phone or salary. Please enter valid numeric values.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (DateTimeParseException e) {
        // Xử lý lỗi khi nhập sai định dạng ngày
        JOptionPane.showMessageDialog(jD_edit, "Invalid date format for DOB or Enrollment Date. Please use the format YYYY-MM-DD.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        // Bắt lỗi không xác định
        JOptionPane.showMessageDialog(jD_edit, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}


    public void showeditStaffdialog() {  
        Staff s = getSelectedRow();
        if(s == null) {
            JOptionPane.showMessageDialog(jD_edit, "Please choose a Staff to edit", "Edit Staff Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        tf_id1.setText(s.getSid());
        tf_dob1.setText(s.getDob() + "");
        tf_fullname1.setText(s.getName());
        tf_email1.setText(s.getEmail());
        tf_phone1.setText(s.getPhone() + "");
        tf_role1.setText(s.getRole());
        tf_salary1.setText(s.getSalary()+ "");
        tf_enrolldate1.setText(s.getEnroll_date()+ "");
       
        jD_edit.setVisible(true);
        


    }

    public  void showinsertStaffdialog() {
        jD_insert.setVisible(true);
        
    }
    
    private Staff getSelectedRow() {
        DefaultTableModel model = (DefaultTableModel) jt_staff.getModel();
        int selectedRow = jt_staff.getSelectedRow();
        if(selectedRow == -1) {
            return null;
        }
        
        String id = model.getValueAt(selectedRow, 0) + "";
        LocalDate dob = LocalDate.parse(model.getValueAt(selectedRow, 1) + "");
        String fullname = model.getValueAt(selectedRow, 2) + "";
        String email = model.getValueAt(selectedRow, 3) + "";
        int phone = Integer.valueOf(model.getValueAt(selectedRow, 4) + "");
        String role = model.getValueAt(selectedRow, 5 )+ "";
        float salary  = Float.valueOf(model.getValueAt(selectedRow, 6) + "");
        LocalDate enroll_date = LocalDate.parse(model.getValueAt(selectedRow, 7) + "");
        String password = model.getValueAt(selectedRow, 8)+ "";
         System.out.println(password);
        return new Staff(id, dob, fullname, email, phone, role, salary, enroll_date, password);
    }
    
    public void cancel() {
        int confirm = JOptionPane.showConfirmDialog(this, "Do you want to cancel?", "Cancel", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            jD_insert.setVisible(false);
        }
    }
     
    public void cancelEdit() {
        int confirm = JOptionPane.showConfirmDialog(this, "Do you want to cancel?", "Cancel", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION){
            jD_edit.setVisible(false);
        }
     }
    

    public JButton getBtn_delete() {
        return btn_delete;
    }

    public JButton getBtn_edit() {
        return btn_edit;
    }

    public JButton getBtn_insert() {
        return btn_insert;
    }

    public JDialog getjD_edit() {
        return jD_edit;
    }

    public JDialog getjD_insert() {
        return jD_insert;
    }

    public JButton getJb_editOK() {
        return jb_editOK;
    }

    public JButton getJb_editcancel() {
        return jb_editcancel;
    }

    public JButton getJb_insertOK() {
        return jb_insertOK;
    }

    public JButton getJb_insertcancel() {
        return jb_insertcancel;
    }
     
}
    

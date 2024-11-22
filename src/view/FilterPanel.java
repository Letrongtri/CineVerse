/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import DatabaseConnection.FilterDAO;
import controller.FilterController;
import font.SetFont;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.Movie;
import model.Staff;

/**
 *
 * @author ADMIN
 */
public class FilterPanel extends javax.swing.JPanel {
    private SetFont font;

    public FilterPanel() {
        font = new SetFont();
        initComponents();
        setActionListener(new FilterController(this));
        setDefaultData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_sideBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_staff = new javax.swing.JButton();
        btn_customer = new javax.swing.JButton();
        btn_movie = new javax.swing.JButton();
        jp_filter = new javax.swing.JPanel();
        findMoviePanel = new javax.swing.JPanel();
        jl_title = new javax.swing.JLabel();
        tf_title = new javax.swing.JTextField();
        jl_movieID = new javax.swing.JLabel();
        tf_movieID = new javax.swing.JTextField();
        jl_genre = new javax.swing.JLabel();
        jl_releaseYear = new javax.swing.JLabel();
        cb_releaseYear = new javax.swing.JComboBox<>();
        tf_genre = new javax.swing.JTextField();
        jl_language = new javax.swing.JLabel();
        tf_language = new javax.swing.JTextField();
        btn_findMovie = new javax.swing.JButton();
        findSatffPanel = new javax.swing.JPanel();
        jl_staffID = new javax.swing.JLabel();
        tf_staffID = new javax.swing.JTextField();
        jl_staffName = new javax.swing.JLabel();
        tf_staffName = new javax.swing.JTextField();
        jl_role = new javax.swing.JLabel();
        cb_role = new javax.swing.JComboBox<>();
        jl_salary = new javax.swing.JLabel();
        tf_salary = new javax.swing.JTextField();
        jl_enrollYear = new javax.swing.JLabel();
        cb_enrollYear = new javax.swing.JComboBox<>();
        btn_findStaff = new javax.swing.JButton();
        findCustomerPanel = new javax.swing.JPanel();
        jl_cid = new javax.swing.JLabel();
        tf_cid = new javax.swing.JTextField();
        jl_cname = new javax.swing.JLabel();
        tf_cname = new javax.swing.JTextField();
        jl_cphone = new javax.swing.JLabel();
        tf_cphone = new javax.swing.JTextField();
        btn_findCustomer = new javax.swing.JButton();
        jp_table = new javax.swing.JPanel();
        sp_movie = new javax.swing.JScrollPane();
        jt_movie = new javax.swing.JTable();
        sp_staff = new javax.swing.JScrollPane();
        jt_staff = new javax.swing.JTable();
        sp_customer = new javax.swing.JScrollPane();
        jt_customer = new javax.swing.JTable();
        background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_sideBar.setBackground(new java.awt.Color(71, 15, 17));
        jp_sideBar.setPreferredSize(new java.awt.Dimension(400, 690));
        jp_sideBar.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        font.setFontFutura(jLabel1, 24f);
        jLabel1.setForeground(new java.awt.Color(226, 226, 229));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filter");
        jp_sideBar.add(jLabel1);
        jLabel1.setBounds(0, 39, 400, 32);

        btn_staff.setBackground(new java.awt.Color(102, 23, 26));
        btn_staff.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_staff.setForeground(new java.awt.Color(226, 226, 229));
        btn_staff.setText("Staff");
        btn_staff.setBorder(null);
        btn_staff.setBorderPainted(false);
        btn_staff.setFocusPainted(false);
        btn_staff.setPreferredSize(new java.awt.Dimension(124, 40));
        jp_sideBar.add(btn_staff);
        btn_staff.setBounds(140, 100, 124, 40);

        btn_customer.setBackground(new java.awt.Color(102, 23, 26));
        btn_customer.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_customer.setForeground(new java.awt.Color(226, 226, 229));
        btn_customer.setText("Customer");
        btn_customer.setBorder(null);
        btn_customer.setBorderPainted(false);
        btn_customer.setFocusPainted(false);
        btn_customer.setPreferredSize(new java.awt.Dimension(124, 40));
        jp_sideBar.add(btn_customer);
        btn_customer.setBounds(270, 100, 130, 40);

        btn_movie.setBackground(new java.awt.Color(102, 23, 26));
        btn_movie.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_movie.setForeground(new java.awt.Color(226, 226, 229));
        btn_movie.setText("Movie");
        btn_movie.setBorder(null);
        btn_movie.setBorderPainted(false);
        btn_movie.setFocusPainted(false);
        btn_movie.setPreferredSize(new java.awt.Dimension(124, 40));
        jp_sideBar.add(btn_movie);
        btn_movie.setBounds(10, 100, 124, 40);

        jp_filter.setOpaque(false);
        jp_filter.setLayout(new java.awt.CardLayout());

        findMoviePanel.setOpaque(false);
        findMoviePanel.setPreferredSize(new java.awt.Dimension(400, 510));
        findMoviePanel.setLayout(null);

        jl_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_title.setForeground(new java.awt.Color(226, 226, 229));
        jl_title.setText("Title:");
        jl_title.setPreferredSize(new java.awt.Dimension(120, 25));
        findMoviePanel.add(jl_title);
        jl_title.setBounds(10, 10, 120, 25);

        tf_title.setBackground(new java.awt.Color(226, 226, 229));
        tf_title.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        findMoviePanel.add(tf_title);
        tf_title.setBounds(130, 10, 262, 28);

        jl_movieID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_movieID.setForeground(new java.awt.Color(226, 226, 229));
        jl_movieID.setText("Movie ID:");
        jl_movieID.setPreferredSize(new java.awt.Dimension(120, 25));
        findMoviePanel.add(jl_movieID);
        jl_movieID.setBounds(10, 60, 120, 25);

        tf_movieID.setBackground(new java.awt.Color(226, 226, 229));
        tf_movieID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        findMoviePanel.add(tf_movieID);
        tf_movieID.setBounds(130, 60, 262, 28);

        jl_genre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_genre.setForeground(new java.awt.Color(226, 226, 229));
        jl_genre.setText("Genre:");
        jl_genre.setPreferredSize(new java.awt.Dimension(120, 25));
        findMoviePanel.add(jl_genre);
        jl_genre.setBounds(10, 110, 120, 25);

        jl_releaseYear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_releaseYear.setForeground(new java.awt.Color(226, 226, 229));
        jl_releaseYear.setText("Release Year:");
        jl_releaseYear.setPreferredSize(new java.awt.Dimension(120, 25));
        findMoviePanel.add(jl_releaseYear);
        jl_releaseYear.setBounds(10, 210, 120, 25);

        cb_releaseYear.setBackground(new java.awt.Color(226, 226, 229));
        cb_releaseYear.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        findMoviePanel.add(cb_releaseYear);
        cb_releaseYear.setBounds(130, 210, 262, 28);

        tf_genre.setBackground(new java.awt.Color(226, 226, 229));
        tf_genre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        findMoviePanel.add(tf_genre);
        tf_genre.setBounds(130, 110, 262, 28);

        jl_language.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_language.setForeground(new java.awt.Color(226, 226, 229));
        jl_language.setText("Language:");
        jl_language.setPreferredSize(new java.awt.Dimension(120, 25));
        findMoviePanel.add(jl_language);
        jl_language.setBounds(10, 160, 120, 25);

        tf_language.setBackground(new java.awt.Color(226, 226, 229));
        tf_language.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        findMoviePanel.add(tf_language);
        tf_language.setBounds(130, 160, 262, 28);

        btn_findMovie.setBackground(new java.awt.Color(102, 23, 26));
        btn_findMovie.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_findMovie.setForeground(new java.awt.Color(226, 226, 229));
        btn_findMovie.setText("Find");
        btn_findMovie.setBorder(null);
        btn_findMovie.setBorderPainted(false);
        btn_findMovie.setFocusPainted(false);
        btn_findMovie.setPreferredSize(new java.awt.Dimension(124, 40));
        findMoviePanel.add(btn_findMovie);
        btn_findMovie.setBounds(140, 450, 124, 40);

        jp_filter.add(findMoviePanel, "movie");

        findSatffPanel.setOpaque(false);
        findSatffPanel.setPreferredSize(new java.awt.Dimension(400, 510));
        findSatffPanel.setLayout(null);

        jl_staffID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_staffID.setForeground(new java.awt.Color(226, 226, 229));
        jl_staffID.setText("Staff ID:");
        jl_staffID.setPreferredSize(new java.awt.Dimension(120, 25));
        findSatffPanel.add(jl_staffID);
        jl_staffID.setBounds(10, 10, 120, 25);

        tf_staffID.setBackground(new java.awt.Color(226, 226, 229));
        tf_staffID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        findSatffPanel.add(tf_staffID);
        tf_staffID.setBounds(130, 10, 262, 28);

        jl_staffName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_staffName.setForeground(new java.awt.Color(226, 226, 229));
        jl_staffName.setText("Full name:");
        jl_staffName.setPreferredSize(new java.awt.Dimension(120, 25));
        findSatffPanel.add(jl_staffName);
        jl_staffName.setBounds(10, 60, 120, 25);

        tf_staffName.setBackground(new java.awt.Color(226, 226, 229));
        tf_staffName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        findSatffPanel.add(tf_staffName);
        tf_staffName.setBounds(130, 60, 262, 28);

        jl_role.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_role.setForeground(new java.awt.Color(226, 226, 229));
        jl_role.setText("Role:");
        jl_role.setPreferredSize(new java.awt.Dimension(120, 25));
        findSatffPanel.add(jl_role);
        jl_role.setBounds(10, 110, 120, 25);

        cb_role.setBackground(new java.awt.Color(226, 226, 229));
        cb_role.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        findSatffPanel.add(cb_role);
        cb_role.setBounds(130, 110, 262, 28);

        jl_salary.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_salary.setForeground(new java.awt.Color(226, 226, 229));
        jl_salary.setText("Salary:");
        jl_salary.setPreferredSize(new java.awt.Dimension(120, 25));
        findSatffPanel.add(jl_salary);
        jl_salary.setBounds(10, 160, 120, 25);

        tf_salary.setBackground(new java.awt.Color(226, 226, 229));
        tf_salary.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        findSatffPanel.add(tf_salary);
        tf_salary.setBounds(130, 160, 262, 28);

        jl_enrollYear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_enrollYear.setForeground(new java.awt.Color(226, 226, 229));
        jl_enrollYear.setText("Enroll Year:");
        jl_enrollYear.setPreferredSize(new java.awt.Dimension(120, 25));
        findSatffPanel.add(jl_enrollYear);
        jl_enrollYear.setBounds(10, 210, 120, 25);

        cb_enrollYear.setBackground(new java.awt.Color(226, 226, 229));
        cb_enrollYear.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        findSatffPanel.add(cb_enrollYear);
        cb_enrollYear.setBounds(130, 210, 262, 28);

        btn_findStaff.setBackground(new java.awt.Color(102, 23, 26));
        btn_findStaff.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_findStaff.setForeground(new java.awt.Color(226, 226, 229));
        btn_findStaff.setText("Find");
        btn_findStaff.setPreferredSize(new java.awt.Dimension(124, 40));
        findSatffPanel.add(btn_findStaff);
        btn_findStaff.setBounds(140, 450, 124, 40);

        jp_filter.add(findSatffPanel, "staff");

        findCustomerPanel.setBackground(new java.awt.Color(71, 15, 17));
        findCustomerPanel.setOpaque(false);
        findCustomerPanel.setPreferredSize(new java.awt.Dimension(400, 180));

        jl_cid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_cid.setForeground(new java.awt.Color(226, 226, 229));
        jl_cid.setText("Customer ID:");
        jl_cid.setPreferredSize(new java.awt.Dimension(120, 25));

        tf_cid.setBackground(new java.awt.Color(226, 226, 229));
        tf_cid.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jl_cname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_cname.setForeground(new java.awt.Color(226, 226, 229));
        jl_cname.setText("Name:");
        jl_cname.setPreferredSize(new java.awt.Dimension(120, 25));

        tf_cname.setBackground(new java.awt.Color(226, 226, 229));
        tf_cname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jl_cphone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_cphone.setForeground(new java.awt.Color(226, 226, 229));
        jl_cphone.setText("Phone number:");
        jl_cphone.setPreferredSize(new java.awt.Dimension(120, 25));

        tf_cphone.setBackground(new java.awt.Color(226, 226, 229));
        tf_cphone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        btn_findCustomer.setBackground(new java.awt.Color(102, 23, 26));
        btn_findCustomer.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_findCustomer.setForeground(new java.awt.Color(226, 226, 229));
        btn_findCustomer.setText("Find");
        btn_findCustomer.setPreferredSize(new java.awt.Dimension(124, 40));

        javax.swing.GroupLayout findCustomerPanelLayout = new javax.swing.GroupLayout(findCustomerPanel);
        findCustomerPanel.setLayout(findCustomerPanelLayout);
        findCustomerPanelLayout.setHorizontalGroup(
            findCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findCustomerPanelLayout.createSequentialGroup()
                .addGroup(findCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(findCustomerPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jl_cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(tf_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(findCustomerPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jl_cname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(tf_cname, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(findCustomerPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jl_cphone, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(tf_cphone, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(findCustomerPanelLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btn_findCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        findCustomerPanelLayout.setVerticalGroup(
            findCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findCustomerPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(findCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(findCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(findCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_cphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(305, 305, 305)
                .addComponent(btn_findCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jp_filter.add(findCustomerPanel, "customer");

        jp_sideBar.add(jp_filter);
        jp_filter.setBounds(0, 180, 400, 510);

        add(jp_sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 690));

        jp_table.setOpaque(false);
        jp_table.setLayout(new java.awt.CardLayout());

        jt_movie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie ID", "Title", "Genre", "Language", "Subtitle", "Duration", "Director", "Cast", "Release Date", "End Date", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sp_movie.setViewportView(jt_movie);
        font.setFontRoboto(jt_movie, 14f);

        jp_table.add(sp_movie, "movie");

        jt_staff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "Day of Birth", "Full name", "Email", "Phone", "Role", "Salary", "Enroll Date", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        font.setFontRoboto(jt_staff, 14f);
        sp_staff.setViewportView(jt_staff);

        jp_table.add(sp_staff, "staff");

        jt_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Full name", "Phone number", "Day of Birth", "Start date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        font.setFontRoboto(jt_customer, 14f);
        sp_customer.setViewportView(jt_customer);

        jp_table.add(sp_customer, "customer");

        add(jp_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 920, 630));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.png"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_customer;
    private javax.swing.JButton btn_findCustomer;
    private javax.swing.JButton btn_findMovie;
    private javax.swing.JButton btn_findStaff;
    private javax.swing.JButton btn_movie;
    private javax.swing.JButton btn_staff;
    private javax.swing.JComboBox<String> cb_enrollYear;
    private javax.swing.JComboBox<String> cb_releaseYear;
    private javax.swing.JComboBox<String> cb_role;
    private javax.swing.JPanel findCustomerPanel;
    private javax.swing.JPanel findMoviePanel;
    private javax.swing.JPanel findSatffPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jl_cid;
    private javax.swing.JLabel jl_cname;
    private javax.swing.JLabel jl_cphone;
    private javax.swing.JLabel jl_enrollYear;
    private javax.swing.JLabel jl_genre;
    private javax.swing.JLabel jl_language;
    private javax.swing.JLabel jl_movieID;
    private javax.swing.JLabel jl_releaseYear;
    private javax.swing.JLabel jl_role;
    private javax.swing.JLabel jl_salary;
    private javax.swing.JLabel jl_staffID;
    private javax.swing.JLabel jl_staffName;
    private javax.swing.JLabel jl_title;
    private javax.swing.JPanel jp_filter;
    private javax.swing.JPanel jp_sideBar;
    private javax.swing.JPanel jp_table;
    private javax.swing.JTable jt_customer;
    private javax.swing.JTable jt_movie;
    private javax.swing.JTable jt_staff;
    private javax.swing.JScrollPane sp_customer;
    private javax.swing.JScrollPane sp_movie;
    private javax.swing.JScrollPane sp_staff;
    private javax.swing.JTextField tf_cid;
    private javax.swing.JTextField tf_cname;
    private javax.swing.JTextField tf_cphone;
    private javax.swing.JTextField tf_genre;
    private javax.swing.JTextField tf_language;
    private javax.swing.JTextField tf_movieID;
    private javax.swing.JTextField tf_salary;
    private javax.swing.JTextField tf_staffID;
    private javax.swing.JTextField tf_staffName;
    private javax.swing.JTextField tf_title;
    // End of variables declaration//GEN-END:variables

    public void setActionListener(ActionListener ac){
        btn_findMovie.addActionListener(ac);
        btn_findStaff.addActionListener(ac);
        btn_findCustomer.addActionListener(ac);
        btn_movie.addActionListener(ac);
        btn_staff.addActionListener(ac);
        btn_customer.addActionListener(ac);
    }

    public JButton getBtn_findCustomer() {
        return btn_findCustomer;
    }

    public void setBtn_findCustomer(JButton btn_findCustomer) {
        this.btn_findCustomer = btn_findCustomer;
    }

    public JButton getBtn_findMovie() {
        return btn_findMovie;
    }

    public void setBtn_findMovie(JButton btn_findMovie) {
        this.btn_findMovie = btn_findMovie;
    }

    public JButton getBtn_findStaff() {
        return btn_findStaff;
    }

    public void setBtn_findStaff(JButton btn_findStaff) {
        this.btn_findStaff = btn_findStaff;
    }
    
    public void showPanel(String name) {
        CardLayout card1 = (CardLayout) jp_filter.getLayout();
        card1.show(jp_filter, name);
        CardLayout card2 = (CardLayout) jp_table.getLayout();
        card2.show(jp_table, name);
    }
    
    public void setMovieData(List<Movie> movies){
        DefaultTableModel tableModel = (DefaultTableModel) jt_movie.getModel();
        tableModel.setRowCount(0);
        
        for (Movie m : movies) {
            String[] rowData = {
                m.getMid(),
                m.getTitle(),
                m.getGenre(),
                m.getLanguage(),
                m.getSubtitle(),
                String.valueOf(m.getDuration()),
                m.getDirector(),
                m.getCast(),
                m.getRelease_date().toString(),
                m.getEnd_date().toString(),
                m.getDescription()
            };
            tableModel.addRow(rowData);
        
        }
    }
    
    public void setStaffData(List<Staff> staffs){
        DefaultTableModel tableModel = (DefaultTableModel) jt_staff.getModel();
        tableModel.setRowCount(0);
        
        for (Staff s : staffs) {
            String[] rowData = {
                s.getSid(),
                s.getPhone() + "",
                s.getName(),
                s.getEmail(),
                s.getPhone() + "",
                s.getRole(),
                s.getSalary() + "",
                s.getEnroll_date().toString(),
                s.getPassword()
            };
            tableModel.addRow(rowData);
        
        }
    }
    
    public void setCustomerData(List<Customer> customers){
        DefaultTableModel tableModel = (DefaultTableModel) jt_customer.getModel();
        tableModel.setRowCount(0);
        
        for (Customer c : customers) {
            String dob = c.getDob()!=null? c.getDob().toString() : "null";
            String startDate = c.getStart_Date()!=null? c.getStart_Date().toString() : "null";
            String[] rowData = {
                c.getCid(),
                c.getName(),
                c.getPhone() + "",
                dob,
                startDate,
            };
            tableModel.addRow(rowData);
        
        }
    }
    
    public void setDefaultData(){
        // Movie table
        List<Integer> releaseYears = FilterDAO.getReleaseYearData();
        cb_releaseYear.addItem("Choose release year");
        for (Integer releaseYear : releaseYears) {
            cb_releaseYear.addItem(releaseYear + "");
        }
        
        List<Movie> movies = FilterDAO.findMovie("", "", "", "", 0);
        setMovieData(movies);
        
        // Staff table
        List<String> roles = FilterDAO.getRoleData();
        cb_role.addItem("Choose role");
        for (String role : roles) {
            cb_role.addItem(role + "");
        }
        
        List<Integer> enrollYears = FilterDAO.getEnrollYearData();
        cb_enrollYear.addItem("Choose enroll year");
        for (Integer enrollYear : enrollYears) {
            cb_enrollYear.addItem(enrollYear + "");
        }
        
        List<Staff> staffs = FilterDAO.findStaff("", "", "", 0f, 0);
        setStaffData(staffs);
        
        // Customer table
        List<Customer> customers = FilterDAO.findCustomer("", "", 0);
        setCustomerData(customers);
    }
    
    public void findMovie(String title) {
        List<Movie> movies = FilterDAO.findMovie("", title, "", "", 0);
        setMovieData(movies);
    }


    public void findMovie() {
        int releaseYear = cb_releaseYear.getSelectedItem().toString().equals("Choose release year")? 0 : Integer.parseInt(cb_releaseYear.getSelectedItem().toString());
        List<Movie> movies = FilterDAO.findMovie(tf_movieID.getText(), tf_title.getText(), tf_genre.getText(), tf_language.getText(), releaseYear);
        setMovieData(movies);
    }

    public void findStaff() {
        int enrollYear = cb_enrollYear.getSelectedItem().toString().equals("Choose enroll year")? 0 : Integer.parseInt(cb_enrollYear.getSelectedItem().toString());
        String role = cb_role.getSelectedItem().toString().equals("Choose role")? "" : cb_role.getSelectedItem().toString();
        float salary = !tf_salary.getText().equals("") ? Float.parseFloat(tf_salary.getText()) : 0f;
        List<Staff> staffs = FilterDAO.findStaff(tf_staffID.getText(), tf_staffName.getText(), role, salary, enrollYear);
        setStaffData(staffs);
    }

    public void findCustomer() {
        int phone = !tf_cphone.getText().equals("") ? Integer.parseInt(tf_cphone.getText()) : 0;
        List<Customer> customers = FilterDAO.findCustomer(tf_cid.getText(), tf_cname.getText(), phone);
        setCustomerData(customers);    
    }

}

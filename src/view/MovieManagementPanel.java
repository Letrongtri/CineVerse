/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import DatabaseConnection.MovieManagementDAO;
import controller.MovieManagementController;
import font.SetFont;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Movie;

/**
 *
 * @author ADMIN
 */
public class MovieManagementPanel extends javax.swing.JPanel {
    private SetFont font;
    private MovieManagementDAO movieManagementDAO;
    
        
    public MovieManagementPanel() {
        font = new SetFont();
        movieManagementDAO = new MovieManagementDAO();
        
        initComponents();
        setActionListener(new MovieManagementController(this));
        setData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_insert = new javax.swing.JDialog();
        jp_insertInfor = new javax.swing.JPanel();
        jl_insertMovie = new javax.swing.JLabel();
        jl_title = new javax.swing.JLabel();
        tf_title = new javax.swing.JTextField();
        jl_movieID = new javax.swing.JLabel();
        tf_movieID = new javax.swing.JTextField();
        jl_genre = new javax.swing.JLabel();
        tf_genre = new javax.swing.JTextField();
        jl_language = new javax.swing.JLabel();
        tf_language = new javax.swing.JTextField();
        jl_subtitle = new javax.swing.JLabel();
        tf_subtitle = new javax.swing.JTextField();
        jl_duration = new javax.swing.JLabel();
        tf_duration = new javax.swing.JTextField();
        jl_releaseDate = new javax.swing.JLabel();
        tf_releaseDate = new javax.swing.JTextField();
        jl_endDate = new javax.swing.JLabel();
        tf_endDate = new javax.swing.JTextField();
        jl_director = new javax.swing.JLabel();
        tf_director = new javax.swing.JTextField();
        jl_cast = new javax.swing.JLabel();
        tf_cast = new javax.swing.JTextField();
        jl_description = new javax.swing.JLabel();
        sp_description = new javax.swing.JScrollPane();
        ta_description = new javax.swing.JTextArea();
        jp_insertBtn = new javax.swing.JPanel();
        btn_insertOK = new javax.swing.JButton();
        btn_insertCancel = new javax.swing.JButton();
        jd_edit = new javax.swing.JDialog();
        jp_editInfor = new javax.swing.JPanel();
        jl_editMovie = new javax.swing.JLabel();
        jl_title1 = new javax.swing.JLabel();
        tf_title1 = new javax.swing.JTextField();
        jl_movieID1 = new javax.swing.JLabel();
        tf_movieID1 = new javax.swing.JTextField();
        jl_genre1 = new javax.swing.JLabel();
        tf_genre1 = new javax.swing.JTextField();
        jl_language1 = new javax.swing.JLabel();
        tf_language1 = new javax.swing.JTextField();
        jl_subtitle1 = new javax.swing.JLabel();
        tf_subtitle1 = new javax.swing.JTextField();
        jl_duration1 = new javax.swing.JLabel();
        tf_duration1 = new javax.swing.JTextField();
        jl_releaseDate1 = new javax.swing.JLabel();
        tf_releaseDate1 = new javax.swing.JTextField();
        jl_endDate1 = new javax.swing.JLabel();
        tf_endDate1 = new javax.swing.JTextField();
        jl_director1 = new javax.swing.JLabel();
        tf_director1 = new javax.swing.JTextField();
        jl_cast1 = new javax.swing.JLabel();
        tf_cast1 = new javax.swing.JTextField();
        jl_description1 = new javax.swing.JLabel();
        sp_description1 = new javax.swing.JScrollPane();
        ta_description1 = new javax.swing.JTextArea();
        jp_editBtn = new javax.swing.JPanel();
        btn_editOK = new javax.swing.JButton();
        btn_editCancel = new javax.swing.JButton();
        jp_content = new javax.swing.JPanel();
        jp_infor = new javax.swing.JPanel();
        jl_movieManagement = new javax.swing.JLabel();
        sp_movie = new javax.swing.JScrollPane();
        jt_movie = new javax.swing.JTable();
        jp_button = new javax.swing.JPanel();
        btn_insert = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        jd_insert.setMinimumSize(new java.awt.Dimension(810, 500));
        jd_insert.setResizable(false);
        jd_insert.setSize(new java.awt.Dimension(820, 540));
        jd_insert.setType(java.awt.Window.Type.POPUP);
        jd_insert.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_insertInfor.setBackground(new java.awt.Color(255, 255, 255));
        jp_insertInfor.setOpaque(false);
        jp_insertInfor.setLayout(null);

        jl_insertMovie.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_insertMovie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_insertMovie.setText("Insert Movie");
        jp_insertInfor.add(jl_insertMovie);
        jl_insertMovie.setBounds(0, 10, 810, 32);

        jl_title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_title.setText("Title:");
        jl_title.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_insertInfor.add(jl_title);
        jl_title.setBounds(20, 60, 150, 30);

        tf_title.setBackground(new java.awt.Color(226, 226, 229));
        tf_title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_title.setBorder(null);
        tf_title.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_title.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_insertInfor.add(tf_title);
        tf_title.setBounds(170, 60, 620, 30);

        jl_movieID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_movieID.setText("Movie ID:");
        jl_movieID.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_insertInfor.add(jl_movieID);
        jl_movieID.setBounds(20, 100, 150, 30);

        tf_movieID.setBackground(new java.awt.Color(226, 226, 229));
        tf_movieID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_movieID.setBorder(null);
        tf_movieID.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_movieID.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_insertInfor.add(tf_movieID);
        tf_movieID.setBounds(170, 100, 220, 30);

        jl_genre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_genre.setText("Genre:");
        jl_genre.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_insertInfor.add(jl_genre);
        jl_genre.setBounds(420, 100, 150, 30);

        tf_genre.setBackground(new java.awt.Color(226, 226, 229));
        tf_genre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_genre.setBorder(null);
        tf_genre.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_genre.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_insertInfor.add(tf_genre);
        tf_genre.setBounds(570, 100, 220, 30);

        jl_language.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_language.setText("Language:");
        jl_language.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_insertInfor.add(jl_language);
        jl_language.setBounds(20, 140, 150, 30);

        tf_language.setBackground(new java.awt.Color(226, 226, 229));
        tf_language.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_language.setBorder(null);
        tf_language.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_language.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_insertInfor.add(tf_language);
        tf_language.setBounds(170, 140, 220, 30);

        jl_subtitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_subtitle.setText("Subtitle:");
        jl_subtitle.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_insertInfor.add(jl_subtitle);
        jl_subtitle.setBounds(420, 140, 150, 30);

        tf_subtitle.setBackground(new java.awt.Color(226, 226, 229));
        tf_subtitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_subtitle.setBorder(null);
        tf_subtitle.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_subtitle.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_insertInfor.add(tf_subtitle);
        tf_subtitle.setBounds(570, 140, 220, 30);

        jl_duration.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_duration.setText("Duration:");
        jl_duration.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_insertInfor.add(jl_duration);
        jl_duration.setBounds(20, 220, 150, 30);

        tf_duration.setBackground(new java.awt.Color(226, 226, 229));
        tf_duration.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_duration.setBorder(null);
        tf_duration.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_duration.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_insertInfor.add(tf_duration);
        tf_duration.setBounds(170, 220, 220, 30);

        jl_releaseDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_releaseDate.setText("Release date:");
        jl_releaseDate.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_insertInfor.add(jl_releaseDate);
        jl_releaseDate.setBounds(20, 180, 150, 30);

        tf_releaseDate.setBackground(new java.awt.Color(226, 226, 229));
        tf_releaseDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_releaseDate.setBorder(null);
        tf_releaseDate.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_releaseDate.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_insertInfor.add(tf_releaseDate);
        tf_releaseDate.setBounds(170, 180, 220, 30);

        jl_endDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_endDate.setText("End date:");
        jl_endDate.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_insertInfor.add(jl_endDate);
        jl_endDate.setBounds(420, 180, 150, 30);

        tf_endDate.setBackground(new java.awt.Color(226, 226, 229));
        tf_endDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_endDate.setBorder(null);
        tf_endDate.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_endDate.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_insertInfor.add(tf_endDate);
        tf_endDate.setBounds(570, 180, 220, 30);

        jl_director.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_director.setText("Director:");
        jl_director.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_insertInfor.add(jl_director);
        jl_director.setBounds(420, 220, 150, 30);

        tf_director.setBackground(new java.awt.Color(226, 226, 229));
        tf_director.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_director.setBorder(null);
        tf_director.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_director.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_insertInfor.add(tf_director);
        tf_director.setBounds(570, 220, 220, 30);

        jl_cast.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_cast.setText("Cast:");
        jl_cast.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_insertInfor.add(jl_cast);
        jl_cast.setBounds(20, 260, 150, 30);

        tf_cast.setBackground(new java.awt.Color(226, 226, 229));
        tf_cast.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_cast.setBorder(null);
        tf_cast.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_cast.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_insertInfor.add(tf_cast);
        tf_cast.setBounds(170, 260, 620, 30);

        jl_description.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_description.setText("Description:");
        jl_description.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_insertInfor.add(jl_description);
        jl_description.setBounds(20, 300, 150, 30);

        sp_description.setBorder(null);

        ta_description.setBackground(new java.awt.Color(226, 226, 229));
        ta_description.setColumns(20);
        ta_description.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ta_description.setRows(5);
        ta_description.setBorder(null);
        sp_description.setViewportView(ta_description);

        jp_insertInfor.add(sp_description);
        sp_description.setBounds(170, 300, 620, 110);

        jd_insert.getContentPane().add(jp_insertInfor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 430));

        jp_insertBtn.setOpaque(false);
        jp_insertBtn.setPreferredSize(new java.awt.Dimension(1196, 40));
        jp_insertBtn.setLayout(null);

        btn_insertOK.setBackground(new java.awt.Color(102, 23, 26));
        btn_insertOK.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_insertOK.setForeground(new java.awt.Color(226, 226, 229));
        btn_insertOK.setText("OK");
        btn_insertOK.setBorder(null);
        btn_insertOK.setFocusPainted(false);
        btn_insertOK.setPreferredSize(new java.awt.Dimension(100, 40));
        jp_insertBtn.add(btn_insertOK);
        btn_insertOK.setBounds(570, 0, 100, 40);

        btn_insertCancel.setBackground(new java.awt.Color(102, 23, 26));
        btn_insertCancel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_insertCancel.setForeground(new java.awt.Color(226, 226, 229));
        btn_insertCancel.setText("Cancel");
        btn_insertCancel.setBorder(null);
        btn_insertCancel.setFocusPainted(false);
        btn_insertCancel.setPreferredSize(new java.awt.Dimension(100, 40));
        jp_insertBtn.add(btn_insertCancel);
        btn_insertCancel.setBounds(695, 0, 100, 40);

        jd_insert.getContentPane().add(jp_insertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 810, -1));

        jd_edit.setMinimumSize(new java.awt.Dimension(810, 500));
        jd_edit.setSize(new java.awt.Dimension(820, 540));
        jd_edit.setType(java.awt.Window.Type.POPUP);
        jd_edit.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_editInfor.setBackground(new java.awt.Color(255, 255, 255));
        jp_editInfor.setOpaque(false);
        jp_editInfor.setLayout(null);

        jl_editMovie.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_editMovie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_editMovie.setText("Edit Movie");
        jp_editInfor.add(jl_editMovie);
        jl_editMovie.setBounds(0, 10, 810, 32);

        jl_title1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_title1.setText("Title:");
        jl_title1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_editInfor.add(jl_title1);
        jl_title1.setBounds(20, 60, 150, 30);

        tf_title1.setBackground(new java.awt.Color(226, 226, 229));
        tf_title1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_title1.setBorder(null);
        tf_title1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_title1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_editInfor.add(tf_title1);
        tf_title1.setBounds(170, 60, 620, 30);

        jl_movieID1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_movieID1.setText("Movie ID:");
        jl_movieID1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_editInfor.add(jl_movieID1);
        jl_movieID1.setBounds(20, 100, 150, 30);

        tf_movieID1.setBackground(new java.awt.Color(226, 226, 229));
        tf_movieID1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_movieID1.setBorder(null);
        tf_movieID1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_movieID1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_editInfor.add(tf_movieID1);
        tf_movieID1.setBounds(170, 100, 220, 30);

        jl_genre1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_genre1.setText("Genre:");
        jl_genre1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_editInfor.add(jl_genre1);
        jl_genre1.setBounds(420, 100, 150, 30);

        tf_genre1.setBackground(new java.awt.Color(226, 226, 229));
        tf_genre1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_genre1.setBorder(null);
        tf_genre1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_genre1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_editInfor.add(tf_genre1);
        tf_genre1.setBounds(570, 100, 220, 30);

        jl_language1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_language1.setText("Language:");
        jl_language1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_editInfor.add(jl_language1);
        jl_language1.setBounds(20, 140, 150, 30);

        tf_language1.setBackground(new java.awt.Color(226, 226, 229));
        tf_language1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_language1.setBorder(null);
        tf_language1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_language1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_editInfor.add(tf_language1);
        tf_language1.setBounds(170, 140, 220, 30);

        jl_subtitle1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_subtitle1.setText("Subtitle:");
        jl_subtitle1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_editInfor.add(jl_subtitle1);
        jl_subtitle1.setBounds(420, 140, 150, 30);

        tf_subtitle1.setBackground(new java.awt.Color(226, 226, 229));
        tf_subtitle1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_subtitle1.setBorder(null);
        tf_subtitle1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_subtitle1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_editInfor.add(tf_subtitle1);
        tf_subtitle1.setBounds(570, 140, 220, 30);

        jl_duration1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_duration1.setText("Duration:");
        jl_duration1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_editInfor.add(jl_duration1);
        jl_duration1.setBounds(20, 220, 150, 30);

        tf_duration1.setBackground(new java.awt.Color(226, 226, 229));
        tf_duration1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_duration1.setBorder(null);
        tf_duration1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_duration1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_editInfor.add(tf_duration1);
        tf_duration1.setBounds(170, 220, 220, 30);

        jl_releaseDate1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_releaseDate1.setText("Release date:");
        jl_releaseDate1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_editInfor.add(jl_releaseDate1);
        jl_releaseDate1.setBounds(20, 180, 150, 30);

        tf_releaseDate1.setBackground(new java.awt.Color(226, 226, 229));
        tf_releaseDate1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_releaseDate1.setBorder(null);
        tf_releaseDate1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_releaseDate1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_editInfor.add(tf_releaseDate1);
        tf_releaseDate1.setBounds(170, 180, 220, 30);

        jl_endDate1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_endDate1.setText("End date:");
        jl_endDate1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_editInfor.add(jl_endDate1);
        jl_endDate1.setBounds(420, 180, 150, 30);

        tf_endDate1.setBackground(new java.awt.Color(226, 226, 229));
        tf_endDate1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_endDate1.setBorder(null);
        tf_endDate1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_endDate1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_editInfor.add(tf_endDate1);
        tf_endDate1.setBounds(570, 180, 220, 30);

        jl_director1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_director1.setText("Director:");
        jl_director1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_editInfor.add(jl_director1);
        jl_director1.setBounds(420, 220, 150, 30);

        tf_director1.setBackground(new java.awt.Color(226, 226, 229));
        tf_director1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_director1.setBorder(null);
        tf_director1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_director1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_editInfor.add(tf_director1);
        tf_director1.setBounds(570, 220, 220, 30);

        jl_cast1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_cast1.setText("Cast:");
        jl_cast1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_editInfor.add(jl_cast1);
        jl_cast1.setBounds(20, 260, 150, 30);

        tf_cast1.setBackground(new java.awt.Color(226, 226, 229));
        tf_cast1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_cast1.setBorder(null);
        tf_cast1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_cast1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_editInfor.add(tf_cast1);
        tf_cast1.setBounds(170, 260, 620, 30);

        jl_description1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_description1.setText("Description:");
        jl_description1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_editInfor.add(jl_description1);
        jl_description1.setBounds(20, 300, 150, 30);

        sp_description1.setBorder(null);

        ta_description1.setBackground(new java.awt.Color(226, 226, 229));
        ta_description1.setColumns(20);
        ta_description1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ta_description1.setRows(5);
        ta_description1.setBorder(null);
        sp_description1.setViewportView(ta_description1);

        jp_editInfor.add(sp_description1);
        sp_description1.setBounds(170, 300, 620, 110);

        jd_edit.getContentPane().add(jp_editInfor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 430));

        jp_editBtn.setOpaque(false);
        jp_editBtn.setPreferredSize(new java.awt.Dimension(1196, 40));
        jp_editBtn.setLayout(null);

        btn_editOK.setBackground(new java.awt.Color(102, 23, 26));
        btn_editOK.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_editOK.setForeground(new java.awt.Color(226, 226, 229));
        btn_editOK.setText("OK");
        btn_editOK.setBorder(null);
        btn_editOK.setFocusPainted(false);
        btn_editOK.setPreferredSize(new java.awt.Dimension(100, 40));
        jp_editBtn.add(btn_editOK);
        btn_editOK.setBounds(570, 0, 100, 40);

        btn_editCancel.setBackground(new java.awt.Color(102, 23, 26));
        btn_editCancel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_editCancel.setForeground(new java.awt.Color(226, 226, 229));
        btn_editCancel.setText("Cancel");
        btn_editCancel.setBorder(null);
        btn_editCancel.setFocusPainted(false);
        btn_editCancel.setPreferredSize(new java.awt.Dimension(100, 40));
        jp_editBtn.add(btn_editCancel);
        btn_editCancel.setBounds(690, 0, 100, 40);

        jd_edit.getContentPane().add(jp_editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 810, -1));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_content.setBackground(new java.awt.Color(226, 226, 229));
        jp_content.setBackground(new java.awt.Color(226, 226, 229, 123));
        jp_content.setPreferredSize(new java.awt.Dimension(1200, 650));
        jp_content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_infor.setBackground(new java.awt.Color(255, 255, 255));
        jp_infor.setOpaque(false);
        jp_infor.setLayout(null);

        jl_movieManagement.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        font.setFontFutura(jl_movieManagement, 24f);
        jl_movieManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_movieManagement.setText("Movie Management");
        jp_infor.add(jl_movieManagement);
        jl_movieManagement.setBounds(7, 2, 1190, 32);

        sp_movie.setBorder(null);
        sp_movie.setDoubleBuffered(true);
        sp_movie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(sp_movie, 14f);

        jt_movie.setBackground(new java.awt.Color(226, 226, 229));
        jt_movie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(jt_movie, 14f);
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
                false, false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sp_movie.setViewportView(jt_movie);

        jp_infor.add(sp_movie);
        sp_movie.setBounds(20, 40, 1150, 550);

        jp_content.add(jp_infor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 590));

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
        btn_insert.setMaximumSize(new java.awt.Dimension(1000, 500));
        btn_insert.setPreferredSize(new java.awt.Dimension(150, 40));
        jp_button.add(btn_insert);
        btn_insert.setBounds(0, 0, 150, 40);

        btn_delete.setBackground(new java.awt.Color(102, 23, 26));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontRobotoBold(btn_delete, 20f);
        btn_delete.setForeground(new java.awt.Color(226, 226, 229));
        btn_delete.setText("Delete");
        btn_delete.setBorder(null);
        btn_delete.setFocusPainted(false);
        btn_delete.setPreferredSize(new java.awt.Dimension(150, 40));
        jp_button.add(btn_delete);
        btn_delete.setBounds(210, 0, 150, 40);

        btn_edit.setBackground(new java.awt.Color(102, 23, 26));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontRobotoBold(btn_edit, 20f);
        btn_edit.setForeground(new java.awt.Color(226, 226, 229));
        btn_edit.setText("Edit");
        btn_edit.setBorder(null);
        btn_edit.setFocusPainted(false);
        btn_edit.setPreferredSize(new java.awt.Dimension(150, 40));
        jp_button.add(btn_edit);
        btn_edit.setBounds(420, 0, 150, 40);

        jp_content.add(jp_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, 560, -1));

        add(jp_content, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 19, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.png"))); // NOI18N
        background.setText("jLabel2");
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_editCancel;
    private javax.swing.JButton btn_editOK;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_insertCancel;
    private javax.swing.JButton btn_insertOK;
    private javax.swing.JDialog jd_edit;
    private javax.swing.JDialog jd_insert;
    private javax.swing.JLabel jl_cast;
    private javax.swing.JLabel jl_cast1;
    private javax.swing.JLabel jl_description;
    private javax.swing.JLabel jl_description1;
    private javax.swing.JLabel jl_director;
    private javax.swing.JLabel jl_director1;
    private javax.swing.JLabel jl_duration;
    private javax.swing.JLabel jl_duration1;
    private javax.swing.JLabel jl_editMovie;
    private javax.swing.JLabel jl_endDate;
    private javax.swing.JLabel jl_endDate1;
    private javax.swing.JLabel jl_genre;
    private javax.swing.JLabel jl_genre1;
    private javax.swing.JLabel jl_insertMovie;
    private javax.swing.JLabel jl_language;
    private javax.swing.JLabel jl_language1;
    private javax.swing.JLabel jl_movieID;
    private javax.swing.JLabel jl_movieID1;
    private javax.swing.JLabel jl_movieManagement;
    private javax.swing.JLabel jl_releaseDate;
    private javax.swing.JLabel jl_releaseDate1;
    private javax.swing.JLabel jl_subtitle;
    private javax.swing.JLabel jl_subtitle1;
    private javax.swing.JLabel jl_title;
    private javax.swing.JLabel jl_title1;
    private javax.swing.JPanel jp_button;
    private javax.swing.JPanel jp_content;
    private javax.swing.JPanel jp_editBtn;
    private javax.swing.JPanel jp_editInfor;
    private javax.swing.JPanel jp_infor;
    private javax.swing.JPanel jp_insertBtn;
    private javax.swing.JPanel jp_insertInfor;
    private javax.swing.JTable jt_movie;
    private javax.swing.JScrollPane sp_description;
    private javax.swing.JScrollPane sp_description1;
    private javax.swing.JScrollPane sp_movie;
    private javax.swing.JTextArea ta_description;
    private javax.swing.JTextArea ta_description1;
    private javax.swing.JTextField tf_cast;
    private javax.swing.JTextField tf_cast1;
    private javax.swing.JTextField tf_director;
    private javax.swing.JTextField tf_director1;
    private javax.swing.JTextField tf_duration;
    private javax.swing.JTextField tf_duration1;
    private javax.swing.JTextField tf_endDate;
    private javax.swing.JTextField tf_endDate1;
    private javax.swing.JTextField tf_genre;
    private javax.swing.JTextField tf_genre1;
    private javax.swing.JTextField tf_language;
    private javax.swing.JTextField tf_language1;
    private javax.swing.JTextField tf_movieID;
    private javax.swing.JTextField tf_movieID1;
    private javax.swing.JTextField tf_releaseDate;
    private javax.swing.JTextField tf_releaseDate1;
    private javax.swing.JTextField tf_subtitle;
    private javax.swing.JTextField tf_subtitle1;
    private javax.swing.JTextField tf_title;
    private javax.swing.JTextField tf_title1;
    // End of variables declaration//GEN-END:variables
   
    public void setActionListener(ActionListener ac){
        btn_insert.addActionListener(ac);
        btn_edit.addActionListener(ac);
        btn_delete.addActionListener(ac);
        btn_insertOK.addActionListener(ac);
        btn_insertCancel.addActionListener(ac);
        btn_editOK.addActionListener(ac);
        btn_editCancel.addActionListener(ac);
    }

    public JTable getJt_movie() {
        return jt_movie;
    }

    public JButton getBtn_delete() {
        return btn_delete;
    }

    public void setBtn_delete(JButton btn_delete) {
        this.btn_delete = btn_delete;
    }

    public JButton getBtn_edit() {
        return btn_edit;
    }

    public void setBtn_edit(JButton btn_edit) {
        this.btn_edit = btn_edit;
    }

    public JButton getBtn_insert() {
        return btn_insert;
    }

    public void setBtn_insert(JButton btn_insert) {
        this.btn_insert = btn_insert;
    }

    public JButton getBtn_insertCancel() {
        return btn_insertCancel;
    }

    public void setBtn_insertCancel(JButton btn_insertCancel) {
        this.btn_insertCancel = btn_insertCancel;
    }

    public JButton getBtn_insertOK() {
        return btn_insertOK;
    }

    public void setBtn_insertOK(JButton btn_insertOK) {
        this.btn_insertOK = btn_insertOK;
    }

    public JButton getBtn_editCancel() {
        return btn_editCancel;
    }

    public void setBtn_editCancel(JButton btn_editCancel) {
        this.btn_editCancel = btn_editCancel;
    }

    public JButton getBtn_editOK() {
        return btn_editOK;
    }

    public void setBtn_editOK(JButton btn_editOK) {
        this.btn_editOK = btn_editOK;
    }
    
    // Function
    
    public void setData(){
        DefaultTableModel tableModel = (DefaultTableModel) jt_movie.getModel();
        tableModel.setRowCount(0);
        
        for (Movie m : movieManagementDAO.getMovies()) {
            String[] rowData = {
                m.getMid(),
                m.getTitle(),
                m.getGenre(),
                m.getLanguage(),
                m.getSubtitle(),
                String.valueOf(m.getDuration()),
                m.getDirector(),
                m.getCast(),
                m.getRelease_date().toString(), // Chuyển Date sang String
                m.getEnd_date().toString(),     // Chuyển Date sang String
                m.getDescription()
            };
            // Thêm dòng vào bảng
            tableModel.addRow(rowData);
        
        }
    }
    
    public void showInsertMovieDialog() {
        tf_movieID.setText("");
        tf_title.setText("");
        tf_genre.setText("");
        tf_language.setText("");
        tf_subtitle.setText("");
        tf_duration.setText("");
        tf_director.setText("");
        tf_cast.setText("");
        tf_releaseDate.setText("");
        tf_endDate.setText("");
        ta_description.setText("");
        
        jd_insert.setVisible(true);
    }

    public void showEditMovieDialog() {
        Movie movie = getSelectedRow();
        if (movie == null){
            JOptionPane.showMessageDialog(jd_edit,"Please choose a movie to edit!", "Edit Movie Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        tf_movieID1.setText(movie.getMid());
        tf_title1.setText(movie.getTitle());
        tf_genre1.setText(movie.getGenre());
        tf_language1.setText(movie.getLanguage());
        tf_subtitle1.setText(movie.getSubtitle());
        tf_duration1.setText(movie.getDuration() + "");
        tf_releaseDate1.setText(movie.getRelease_date() + "");
        tf_endDate1.setText(movie.getEnd_date() + "");
        tf_director1.setText(movie.getDirector());
        tf_cast1.setText(movie.getCast());
        ta_description1.setText(movie.getDescription());
        
        jd_edit.setVisible(true);
    }

    public void deleteMovie() {
        int confirm = JOptionPane.showConfirmDialog(this, "Do you want to delete this movie?", "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm != JOptionPane.YES_OPTION){
            return;
        }
        Movie m = getSelectedRow();
        if (m == null){
            JOptionPane.showMessageDialog(this,"Please choose a movie to delete!", "Delete Movie Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        boolean checkDelete = movieManagementDAO.deleteMovie(m);
        if(!checkDelete){
            JOptionPane.showMessageDialog(this,"Cannot delete this movie because the foreign key constraint fails!", "Delete Movie Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        setData();
    }
    
    private Movie getSelectedRow() {
        DefaultTableModel model = (DefaultTableModel) jt_movie.getModel();
        int selectedRow = jt_movie.getSelectedRow();
        if (selectedRow == -1){
            return null;
        }
        
        String movieID = model.getValueAt(selectedRow, 0) + "";
        String title = model.getValueAt(selectedRow, 1) + "";
        String genre = model.getValueAt(selectedRow, 2) + "";
        String language = model.getValueAt(selectedRow, 3) + "";
        String subtitle = model.getValueAt(selectedRow, 4) + "";
        int duration = Integer.parseInt(model.getValueAt(selectedRow, 5) + "");
        String director = model.getValueAt(selectedRow, 6) + "";
        String cast = model.getValueAt(selectedRow, 7) + "";
        
        LocalDate releaseDate = LocalDate.parse(model.getValueAt(selectedRow, 8) + "");
        LocalDate endDate = LocalDate.parse(model.getValueAt(selectedRow, 9) + "");
        String description = model.getValueAt(selectedRow, 10) + "";
        
        return new Movie(movieID, title, genre, language, subtitle, duration, director, cast, releaseDate, endDate, description);
    }
    
    public void cancelInsert() {
        int confirm = JOptionPane.showConfirmDialog(jd_insert, "Do you want to cancel?", "Cancel", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION){
            jd_insert.setVisible(false);
        }
    }
    
    public void cancelEdit() {
        int confirm = JOptionPane.showConfirmDialog(jd_edit, "Do you want to cancel?", "Cancel", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION){
            jd_edit.setVisible(false);
        }
    }

    public void insertMovie() {
        // Get movie's infor in the insert dialog
        try {
            int duration = Integer.parseInt(tf_duration.getText());
            LocalDate releaseDate = LocalDate.parse(tf_releaseDate.getText());
            LocalDate endDate = LocalDate.parse(tf_endDate.getText());

            Movie m = new Movie();
            m.setMid(tf_movieID.getText());
            m.setTitle(tf_title.getText());
            m.setGenre(tf_genre.getText());
            m.setLanguage(tf_language.getText());
            m.setSubtitle(tf_subtitle.getText());
            m.setDuration(duration);
            m.setDirector(tf_director.getText());
            m.setCast(tf_cast.getText());
            m.setRelease_date(releaseDate);
            m.setEnd_date(endDate);
            m.setDescription(ta_description.getText());

            if(movieManagementDAO.isExistMovie(m.getMid())){
                JOptionPane.showMessageDialog(jd_insert,"Movie ID is existed. Please enter again!", "Insert Movie Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean canInsert = movieManagementDAO.addMovie(m);
            if(canInsert) {
                setData();
                JOptionPane.showMessageDialog(jd_insert,"Movie has been added!", "Adding Successfully", JOptionPane.PLAIN_MESSAGE);
                jd_insert.setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(jd_insert,"Movie cannot be added!", "Adding Error", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_insert,"Syntax Error! Please enter again.", "Adding Error", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void editMovie() {
        // Get movie's infor in edit 
        try {
            int duration = Integer.parseInt(tf_duration1.getText());
            LocalDate releaseDate = LocalDate.parse(tf_releaseDate1.getText());
            LocalDate endDate = LocalDate.parse(tf_endDate1.getText());

            Movie m = new Movie();
            m.setMid(tf_movieID1.getText());
            m.setTitle(tf_title1.getText());
            m.setGenre(tf_genre1.getText());
            m.setLanguage(tf_language1.getText());
            m.setSubtitle(tf_subtitle1.getText());
            m.setDuration(duration);
            m.setDirector(tf_director1.getText());
            m.setCast(tf_cast1.getText());
            m.setRelease_date(releaseDate);
            m.setEnd_date(endDate);
            m.setDescription(ta_description1.getText());

            if(!movieManagementDAO.isExistMovie(m.getMid())){
                JOptionPane.showMessageDialog(jd_edit,"Movie ID is not existed. Please enter again!", "Insert Movie Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            movieManagementDAO.editMovie(m);
            setData();
            JOptionPane.showMessageDialog(jd_edit,"Movie has been editted!", "Editting successfully", JOptionPane.PLAIN_MESSAGE);
            jd_edit.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_edit,"Systax Error! Please enter again.", "Editting Error", JOptionPane.PLAIN_MESSAGE);
        }
    }
}

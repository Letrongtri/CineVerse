package view;

import DatabaseConnection.ScreenRoomManagementDAO;
import controller.ScreenRoomController;
import font.SetFont;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ScreenRoom;
import model.Seat;

public class ScreenRoomManagementPanel extends javax.swing.JPanel {
    private SetFont font;
    private ScreenRoomManagementDAO screenRoomManagementDAO;
    private List<Seat> seats1;
    private List<Seat> seats2;
    
    public ScreenRoomManagementPanel() {
        font = new SetFont();
        screenRoomManagementDAO = new ScreenRoomManagementDAO();
        initComponents();
        setActionListener(new ScreenRoomController(this));
        setData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_insert = new javax.swing.JDialog();
        jp_infor1 = new javax.swing.JPanel();
        jl_insertScreenRoom = new javax.swing.JLabel();
        jl_roomID1 = new javax.swing.JLabel();
        tf_roomID1 = new javax.swing.JTextField();
        jl_roomName1 = new javax.swing.JLabel();
        tf_roomName1 = new javax.swing.JTextField();
        jl_screenType1 = new javax.swing.JLabel();
        tf_screenType1 = new javax.swing.JTextField();
        jl_equipment1 = new javax.swing.JLabel();
        tf_equipment1 = new javax.swing.JTextField();
        jl_seats1 = new javax.swing.JLabel();
        tf_seats1 = new javax.swing.JTextField();
        btn_detail1 = new javax.swing.JButton();
        jl_note1 = new javax.swing.JLabel();
        sp_note1 = new javax.swing.JScrollPane();
        ta_note1 = new javax.swing.JTextArea();
        jl_status1 = new javax.swing.JLabel();
        rb_available1 = new javax.swing.JRadioButton();
        rb_notAvailable1 = new javax.swing.JRadioButton();
        jp_insertBtn = new javax.swing.JPanel();
        btn_insertCancel = new javax.swing.JButton();
        btn_insertOK = new javax.swing.JButton();
        jd_insertSeat = new javax.swing.JDialog();
        jl_detailSeats = new javax.swing.JLabel();
        sp_seats = new javax.swing.JScrollPane();
        jt_seats = new javax.swing.JTable();
        jp_seatBtn2 = new javax.swing.JPanel();
        btn_seatCancel = new javax.swing.JButton();
        btn_seatSave = new javax.swing.JButton();
        btn_seatInsert = new javax.swing.JButton();
        btn_seatDelete = new javax.swing.JButton();
        jd_edit = new javax.swing.JDialog();
        jp_infor2 = new javax.swing.JPanel();
        jl_editScreenRoom = new javax.swing.JLabel();
        jl_roomID2 = new javax.swing.JLabel();
        tf_roomID2 = new javax.swing.JTextField();
        jl_roomName2 = new javax.swing.JLabel();
        tf_roomName2 = new javax.swing.JTextField();
        jl_screenType2 = new javax.swing.JLabel();
        tf_screenType2 = new javax.swing.JTextField();
        jl_equipment2 = new javax.swing.JLabel();
        tf_equipment2 = new javax.swing.JTextField();
        jl_seats2 = new javax.swing.JLabel();
        tf_seats2 = new javax.swing.JTextField();
        btn_detail2 = new javax.swing.JButton();
        jl_note2 = new javax.swing.JLabel();
        sp_note2 = new javax.swing.JScrollPane();
        ta_note2 = new javax.swing.JTextArea();
        jl_status2 = new javax.swing.JLabel();
        rb_available2 = new javax.swing.JRadioButton();
        rb_notAvailable2 = new javax.swing.JRadioButton();
        jp_editBtn = new javax.swing.JPanel();
        btn_editOK = new javax.swing.JButton();
        btn_editCancel = new javax.swing.JButton();
        jd_editSeat = new javax.swing.JDialog();
        jl_detailSeats1 = new javax.swing.JLabel();
        sp_seats1 = new javax.swing.JScrollPane();
        jt_seats1 = new javax.swing.JTable();
        jp_seatBtn3 = new javax.swing.JPanel();
        btn_seatCancel1 = new javax.swing.JButton();
        btn_seatSave1 = new javax.swing.JButton();
        btn_seatInsert1 = new javax.swing.JButton();
        btn_seatDelete1 = new javax.swing.JButton();
        bg_insertStatus = new javax.swing.ButtonGroup();
        bg_editStatus = new javax.swing.ButtonGroup();
        jp_content = new javax.swing.JPanel();
        jp_infor = new javax.swing.JPanel();
        jl_screenRoomManagement = new javax.swing.JLabel();
        sp_screenRoom = new javax.swing.JScrollPane();
        jt_screenRoom = new javax.swing.JTable();
        jp_button = new javax.swing.JPanel();
        btn_insert = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        jd_insert.setSize(new java.awt.Dimension(820, 390));
        jd_insert.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_infor1.setBackground(new java.awt.Color(255, 255, 255));
        jp_infor1.setOpaque(false);
        jp_infor1.setPreferredSize(new java.awt.Dimension(810, 500));
        jp_infor1.setLayout(null);

        jl_insertScreenRoom.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_insertScreenRoom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_insertScreenRoom.setText("Insert Screen Room");
        jp_infor1.add(jl_insertScreenRoom);
        jl_insertScreenRoom.setBounds(0, 0, 810, 32);

        jl_roomID1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_roomID1.setText("Room ID:");
        jl_roomID1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor1.add(jl_roomID1);
        jl_roomID1.setBounds(30, 60, 150, 30);

        tf_roomID1.setBackground(new java.awt.Color(226, 226, 229));
        tf_roomID1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_roomID1.setBorder(null);
        tf_roomID1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_roomID1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor1.add(tf_roomID1);
        tf_roomID1.setBounds(180, 60, 220, 30);

        jl_roomName1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_roomName1.setText("Room name:");
        jl_roomName1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor1.add(jl_roomName1);
        jl_roomName1.setBounds(420, 60, 150, 30);

        tf_roomName1.setBackground(new java.awt.Color(226, 226, 229));
        tf_roomName1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_roomName1.setBorder(null);
        tf_roomName1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_roomName1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor1.add(tf_roomName1);
        tf_roomName1.setBounds(570, 60, 220, 30);

        jl_screenType1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_screenType1.setText("Screen Type:");
        jl_screenType1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor1.add(jl_screenType1);
        jl_screenType1.setBounds(30, 100, 150, 30);

        tf_screenType1.setBackground(new java.awt.Color(226, 226, 229));
        tf_screenType1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_screenType1.setBorder(null);
        tf_screenType1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_screenType1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor1.add(tf_screenType1);
        tf_screenType1.setBounds(180, 100, 220, 30);

        jl_equipment1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_equipment1.setText("Equipment:");
        jl_equipment1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor1.add(jl_equipment1);
        jl_equipment1.setBounds(420, 100, 150, 30);

        tf_equipment1.setBackground(new java.awt.Color(226, 226, 229));
        tf_equipment1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_equipment1.setBorder(null);
        tf_equipment1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_equipment1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor1.add(tf_equipment1);
        tf_equipment1.setBounds(570, 100, 220, 30);

        jl_seats1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_seats1.setText("Seats:");
        jl_seats1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor1.add(jl_seats1);
        jl_seats1.setBounds(30, 140, 150, 30);

        tf_seats1.setBackground(new java.awt.Color(226, 226, 229));
        tf_seats1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_seats1.setBorder(null);
        tf_seats1.setEnabled(false);
        tf_seats1.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_seats1.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor1.add(tf_seats1);
        tf_seats1.setBounds(180, 140, 110, 30);

        btn_detail1.setBackground(new java.awt.Color(102, 23, 26));
        btn_detail1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_detail1.setForeground(new java.awt.Color(226, 226, 229));
        btn_detail1.setText("Detail");
        btn_detail1.setBorder(null);
        btn_detail1.setFocusPainted(false);
        btn_detail1.setPreferredSize(new java.awt.Dimension(100, 40));
        jp_infor1.add(btn_detail1);
        btn_detail1.setBounds(300, 140, 100, 30);

        jl_note1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_note1.setText("Note:");
        jl_note1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor1.add(jl_note1);
        jl_note1.setBounds(30, 180, 150, 30);

        sp_note1.setBorder(null);

        ta_note1.setBackground(new java.awt.Color(226, 226, 229));
        ta_note1.setColumns(20);
        ta_note1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ta_note1.setRows(5);
        ta_note1.setBorder(null);
        ta_note1.setPreferredSize(new java.awt.Dimension(260, 80));
        sp_note1.setViewportView(ta_note1);

        jp_infor1.add(sp_note1);
        sp_note1.setBounds(180, 180, 610, 110);

        jl_status1.setBackground(new java.awt.Color(255, 255, 255));
        jl_status1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_status1.setText("Status:");
        jl_status1.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor1.add(jl_status1);
        jl_status1.setBounds(420, 140, 150, 30);

        bg_insertStatus.add(rb_available1);
        rb_available1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb_available1.setText("Available");
        rb_available1.setBorder(null);
        jp_infor1.add(rb_available1);
        rb_available1.setBounds(570, 140, 100, 30);

        bg_insertStatus.add(rb_notAvailable1);
        rb_notAvailable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb_notAvailable1.setText("Not Available");
        rb_notAvailable1.setBorder(null);
        jp_infor1.add(rb_notAvailable1);
        rb_notAvailable1.setBounds(680, 140, 110, 30);

        jd_insert.getContentPane().add(jp_infor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 280));

        jp_insertBtn.setOpaque(false);
        jp_insertBtn.setPreferredSize(new java.awt.Dimension(1196, 40));
        jp_insertBtn.setLayout(null);

        btn_insertCancel.setBackground(new java.awt.Color(102, 23, 26));
        btn_insertCancel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_insertCancel.setForeground(new java.awt.Color(226, 226, 229));
        btn_insertCancel.setText("Cancel");
        btn_insertCancel.setBorder(null);
        btn_insertCancel.setFocusPainted(false);
        btn_insertCancel.setPreferredSize(new java.awt.Dimension(100, 40));
        jp_insertBtn.add(btn_insertCancel);
        btn_insertCancel.setBounds(690, 0, 100, 40);

        btn_insertOK.setBackground(new java.awt.Color(102, 23, 26));
        btn_insertOK.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_insertOK.setForeground(new java.awt.Color(226, 226, 229));
        btn_insertOK.setText("OK");
        btn_insertOK.setBorder(null);
        btn_insertOK.setFocusPainted(false);
        btn_insertOK.setPreferredSize(new java.awt.Dimension(100, 40));
        jp_insertBtn.add(btn_insertOK);
        btn_insertOK.setBounds(570, 0, 100, 40);

        jd_insert.getContentPane().add(jp_insertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 810, -1));

        jd_insertSeat.setSize(new java.awt.Dimension(410, 540));
        jd_insertSeat.getContentPane().setLayout(null);

        jl_detailSeats.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_detailSeats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_detailSeats.setText("Detail Seats");
        jd_insertSeat.getContentPane().add(jl_detailSeats);
        jl_detailSeats.setBounds(0, 0, 400, 32);

        jt_seats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seat ID", "Seat Type", "Status", "Row", "Column"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sp_seats.setViewportView(jt_seats);

        jd_insertSeat.getContentPane().add(sp_seats);
        sp_seats.setBounds(0, 40, 400, 390);

        jp_seatBtn2.setOpaque(false);
        jp_seatBtn2.setPreferredSize(new java.awt.Dimension(1196, 40));
        jp_seatBtn2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_seatCancel.setBackground(new java.awt.Color(102, 23, 26));
        btn_seatCancel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_seatCancel.setForeground(new java.awt.Color(226, 226, 229));
        btn_seatCancel.setText("Cancel");
        btn_seatCancel.setBorder(null);
        btn_seatCancel.setFocusPainted(false);
        btn_seatCancel.setPreferredSize(new java.awt.Dimension(80, 40));
        jp_seatBtn2.add(btn_seatCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        btn_seatSave.setBackground(new java.awt.Color(102, 23, 26));
        btn_seatSave.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_seatSave.setForeground(new java.awt.Color(226, 226, 229));
        btn_seatSave.setText("Save");
        btn_seatSave.setBorder(null);
        btn_seatSave.setFocusPainted(false);
        btn_seatSave.setPreferredSize(new java.awt.Dimension(80, 40));
        jp_seatBtn2.add(btn_seatSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        btn_seatInsert.setBackground(new java.awt.Color(102, 23, 26));
        btn_seatInsert.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_seatInsert.setForeground(new java.awt.Color(226, 226, 229));
        btn_seatInsert.setText("Insert");
        btn_seatInsert.setBorder(null);
        btn_seatInsert.setFocusPainted(false);
        btn_seatInsert.setPreferredSize(new java.awt.Dimension(80, 40));
        jp_seatBtn2.add(btn_seatInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        btn_seatDelete.setBackground(new java.awt.Color(102, 23, 26));
        btn_seatDelete.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_seatDelete.setForeground(new java.awt.Color(226, 226, 229));
        btn_seatDelete.setText("Delete");
        btn_seatDelete.setBorder(null);
        btn_seatDelete.setFocusPainted(false);
        btn_seatDelete.setPreferredSize(new java.awt.Dimension(80, 40));
        jp_seatBtn2.add(btn_seatDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jd_insertSeat.getContentPane().add(jp_seatBtn2);
        jp_seatBtn2.setBounds(0, 450, 400, 40);

        jd_edit.setSize(new java.awt.Dimension(820, 390));
        jd_edit.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_infor2.setBackground(new java.awt.Color(255, 255, 255));
        jp_infor2.setOpaque(false);
        jp_infor2.setPreferredSize(new java.awt.Dimension(810, 500));
        jp_infor2.setLayout(null);

        jl_editScreenRoom.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_editScreenRoom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_editScreenRoom.setText("Edit Screen Room");
        jp_infor2.add(jl_editScreenRoom);
        jl_editScreenRoom.setBounds(0, 0, 810, 32);

        jl_roomID2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_roomID2.setText("Room ID:");
        jl_roomID2.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor2.add(jl_roomID2);
        jl_roomID2.setBounds(30, 60, 150, 30);

        tf_roomID2.setBackground(new java.awt.Color(226, 226, 229));
        tf_roomID2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_roomID2.setBorder(null);
        tf_roomID2.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_roomID2.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor2.add(tf_roomID2);
        tf_roomID2.setBounds(180, 60, 220, 30);

        jl_roomName2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_roomName2.setText("Room name:");
        jl_roomName2.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor2.add(jl_roomName2);
        jl_roomName2.setBounds(420, 60, 150, 30);

        tf_roomName2.setBackground(new java.awt.Color(226, 226, 229));
        tf_roomName2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_roomName2.setBorder(null);
        tf_roomName2.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_roomName2.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor2.add(tf_roomName2);
        tf_roomName2.setBounds(570, 60, 220, 30);

        jl_screenType2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_screenType2.setText("Screen Type:");
        jl_screenType2.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor2.add(jl_screenType2);
        jl_screenType2.setBounds(30, 100, 150, 30);

        tf_screenType2.setBackground(new java.awt.Color(226, 226, 229));
        tf_screenType2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_screenType2.setBorder(null);
        tf_screenType2.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_screenType2.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor2.add(tf_screenType2);
        tf_screenType2.setBounds(180, 100, 220, 30);

        jl_equipment2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_equipment2.setText("Equipment:");
        jl_equipment2.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor2.add(jl_equipment2);
        jl_equipment2.setBounds(420, 100, 150, 30);

        tf_equipment2.setBackground(new java.awt.Color(226, 226, 229));
        tf_equipment2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_equipment2.setBorder(null);
        tf_equipment2.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_equipment2.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor2.add(tf_equipment2);
        tf_equipment2.setBounds(570, 100, 220, 30);

        jl_seats2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_seats2.setText("Seats:");
        jl_seats2.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor2.add(jl_seats2);
        jl_seats2.setBounds(30, 140, 150, 30);

        tf_seats2.setBackground(new java.awt.Color(226, 226, 229));
        tf_seats2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_seats2.setBorder(null);
        tf_seats2.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_seats2.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor2.add(tf_seats2);
        tf_seats2.setBounds(180, 140, 110, 30);

        btn_detail2.setBackground(new java.awt.Color(102, 23, 26));
        btn_detail2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_detail2.setForeground(new java.awt.Color(226, 226, 229));
        btn_detail2.setText("Detail");
        btn_detail2.setBorder(null);
        btn_detail2.setFocusPainted(false);
        btn_detail2.setPreferredSize(new java.awt.Dimension(100, 40));
        jp_infor2.add(btn_detail2);
        btn_detail2.setBounds(300, 140, 100, 30);

        jl_note2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_note2.setText("Note:");
        jl_note2.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor2.add(jl_note2);
        jl_note2.setBounds(30, 180, 150, 30);

        sp_note2.setBorder(null);

        ta_note2.setBackground(new java.awt.Color(226, 226, 229));
        ta_note2.setColumns(20);
        ta_note2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ta_note2.setRows(5);
        ta_note2.setBorder(null);
        ta_note2.setPreferredSize(new java.awt.Dimension(260, 80));
        sp_note2.setViewportView(ta_note2);

        jp_infor2.add(sp_note2);
        sp_note2.setBounds(180, 180, 610, 110);

        jl_status2.setBackground(new java.awt.Color(255, 255, 255));
        jl_status2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_status2.setText("Status:");
        jl_status2.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor2.add(jl_status2);
        jl_status2.setBounds(420, 140, 150, 30);

        bg_editStatus.add(rb_available2);
        rb_available2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb_available2.setText("Available");
        rb_available2.setBorder(null);
        jp_infor2.add(rb_available2);
        rb_available2.setBounds(570, 140, 100, 30);

        bg_editStatus.add(rb_notAvailable2);
        rb_notAvailable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb_notAvailable2.setText("Not Available");
        rb_notAvailable2.setBorder(null);
        jp_infor2.add(rb_notAvailable2);
        rb_notAvailable2.setBounds(680, 140, 110, 30);

        jd_edit.getContentPane().add(jp_infor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 280));

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

        jd_edit.getContentPane().add(jp_editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 810, -1));

        jd_editSeat.setSize(new java.awt.Dimension(410, 540));
        jd_editSeat.getContentPane().setLayout(null);

        jl_detailSeats1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_detailSeats1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_detailSeats1.setText("Detail Seats");
        jd_editSeat.getContentPane().add(jl_detailSeats1);
        jl_detailSeats1.setBounds(0, 0, 400, 32);

        jt_seats1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seat ID", "Seat Type", "Status", "Row", "Column"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sp_seats1.setViewportView(jt_seats1);

        jd_editSeat.getContentPane().add(sp_seats1);
        sp_seats1.setBounds(0, 40, 400, 390);

        jp_seatBtn3.setOpaque(false);
        jp_seatBtn3.setPreferredSize(new java.awt.Dimension(1196, 40));
        jp_seatBtn3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_seatCancel1.setBackground(new java.awt.Color(102, 23, 26));
        btn_seatCancel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_seatCancel1.setForeground(new java.awt.Color(226, 226, 229));
        btn_seatCancel1.setText("Cancel");
        btn_seatCancel1.setBorder(null);
        btn_seatCancel1.setFocusPainted(false);
        btn_seatCancel1.setPreferredSize(new java.awt.Dimension(80, 40));
        jp_seatBtn3.add(btn_seatCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        btn_seatSave1.setBackground(new java.awt.Color(102, 23, 26));
        btn_seatSave1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_seatSave1.setForeground(new java.awt.Color(226, 226, 229));
        btn_seatSave1.setText("Save");
        btn_seatSave1.setBorder(null);
        btn_seatSave1.setFocusPainted(false);
        btn_seatSave1.setPreferredSize(new java.awt.Dimension(80, 40));
        jp_seatBtn3.add(btn_seatSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        btn_seatInsert1.setBackground(new java.awt.Color(102, 23, 26));
        btn_seatInsert1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_seatInsert1.setForeground(new java.awt.Color(226, 226, 229));
        btn_seatInsert1.setText("Insert");
        btn_seatInsert1.setBorder(null);
        btn_seatInsert1.setFocusPainted(false);
        btn_seatInsert1.setPreferredSize(new java.awt.Dimension(80, 40));
        jp_seatBtn3.add(btn_seatInsert1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        btn_seatDelete1.setBackground(new java.awt.Color(102, 23, 26));
        btn_seatDelete1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_seatDelete1.setForeground(new java.awt.Color(226, 226, 229));
        btn_seatDelete1.setText("Delete");
        btn_seatDelete1.setBorder(null);
        btn_seatDelete1.setFocusPainted(false);
        btn_seatDelete1.setPreferredSize(new java.awt.Dimension(80, 40));
        jp_seatBtn3.add(btn_seatDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jd_editSeat.getContentPane().add(jp_seatBtn3);
        jp_seatBtn3.setBounds(0, 450, 400, 40);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_content.setBackground(new java.awt.Color(226, 226, 229));
        jp_content.setBackground(new java.awt.Color(226, 226, 229, 123));
        jp_content.setPreferredSize(new java.awt.Dimension(1200, 650));
        jp_content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_infor.setBackground(new java.awt.Color(255, 255, 255));
        jp_infor.setOpaque(false);
        jp_infor.setLayout(null);

        jl_screenRoomManagement.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        font.setFontFutura(jl_screenRoomManagement, 24f);
        jl_screenRoomManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_screenRoomManagement.setText("Screen Room Management");
        jp_infor.add(jl_screenRoomManagement);
        jl_screenRoomManagement.setBounds(7, 2, 1190, 32);

        sp_screenRoom.setDoubleBuffered(true);
        sp_screenRoom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(sp_screenRoom, 14f);

        jt_screenRoom.setBackground(new java.awt.Color(226, 226, 229));
        jt_screenRoom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(jt_screenRoom, 14f);
        jt_screenRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ID", "Room Name", "Screen Type", "Equipment", "Seats", "Status", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sp_screenRoom.setViewportView(jt_screenRoom);

        jp_infor.add(sp_screenRoom);
        sp_screenRoom.setBounds(20, 40, 1150, 550);

        jp_content.add(jp_infor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 590));

        jp_button.setOpaque(false);
        jp_button.setPreferredSize(new java.awt.Dimension(1196, 40));
        jp_button.setLayout(null);

        btn_insert.setBackground(new java.awt.Color(102, 23, 26));
        btn_insert.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
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
        btn_delete.setForeground(new java.awt.Color(226, 226, 229));
        btn_delete.setText("Delete");
        btn_delete.setBorder(null);
        btn_delete.setFocusPainted(false);
        btn_delete.setPreferredSize(new java.awt.Dimension(150, 40));
        jp_button.add(btn_delete);
        btn_delete.setBounds(210, 0, 150, 40);

        btn_edit.setBackground(new java.awt.Color(102, 23, 26));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
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
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup bg_editStatus;
    private javax.swing.ButtonGroup bg_insertStatus;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_detail1;
    private javax.swing.JButton btn_detail2;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_editCancel;
    private javax.swing.JButton btn_editOK;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_insertCancel;
    private javax.swing.JButton btn_insertOK;
    private javax.swing.JButton btn_seatCancel;
    private javax.swing.JButton btn_seatCancel1;
    private javax.swing.JButton btn_seatDelete;
    private javax.swing.JButton btn_seatDelete1;
    private javax.swing.JButton btn_seatInsert;
    private javax.swing.JButton btn_seatInsert1;
    private javax.swing.JButton btn_seatSave;
    private javax.swing.JButton btn_seatSave1;
    private javax.swing.JDialog jd_edit;
    private javax.swing.JDialog jd_editSeat;
    private javax.swing.JDialog jd_insert;
    private javax.swing.JDialog jd_insertSeat;
    private javax.swing.JLabel jl_detailSeats;
    private javax.swing.JLabel jl_detailSeats1;
    private javax.swing.JLabel jl_editScreenRoom;
    private javax.swing.JLabel jl_equipment1;
    private javax.swing.JLabel jl_equipment2;
    private javax.swing.JLabel jl_insertScreenRoom;
    private javax.swing.JLabel jl_note1;
    private javax.swing.JLabel jl_note2;
    private javax.swing.JLabel jl_roomID1;
    private javax.swing.JLabel jl_roomID2;
    private javax.swing.JLabel jl_roomName1;
    private javax.swing.JLabel jl_roomName2;
    private javax.swing.JLabel jl_screenRoomManagement;
    private javax.swing.JLabel jl_screenType1;
    private javax.swing.JLabel jl_screenType2;
    private javax.swing.JLabel jl_seats1;
    private javax.swing.JLabel jl_seats2;
    private javax.swing.JLabel jl_status1;
    private javax.swing.JLabel jl_status2;
    private javax.swing.JPanel jp_button;
    private javax.swing.JPanel jp_content;
    private javax.swing.JPanel jp_editBtn;
    private javax.swing.JPanel jp_infor;
    private javax.swing.JPanel jp_infor1;
    private javax.swing.JPanel jp_infor2;
    private javax.swing.JPanel jp_insertBtn;
    private javax.swing.JPanel jp_seatBtn2;
    private javax.swing.JPanel jp_seatBtn3;
    private javax.swing.JTable jt_screenRoom;
    private javax.swing.JTable jt_seats;
    private javax.swing.JTable jt_seats1;
    private javax.swing.JRadioButton rb_available1;
    private javax.swing.JRadioButton rb_available2;
    private javax.swing.JRadioButton rb_notAvailable1;
    private javax.swing.JRadioButton rb_notAvailable2;
    private javax.swing.JScrollPane sp_note1;
    private javax.swing.JScrollPane sp_note2;
    private javax.swing.JScrollPane sp_screenRoom;
    private javax.swing.JScrollPane sp_seats;
    private javax.swing.JScrollPane sp_seats1;
    private javax.swing.JTextArea ta_note1;
    private javax.swing.JTextArea ta_note2;
    private javax.swing.JTextField tf_equipment1;
    private javax.swing.JTextField tf_equipment2;
    private javax.swing.JTextField tf_roomID1;
    private javax.swing.JTextField tf_roomID2;
    private javax.swing.JTextField tf_roomName1;
    private javax.swing.JTextField tf_roomName2;
    private javax.swing.JTextField tf_screenType1;
    private javax.swing.JTextField tf_screenType2;
    private javax.swing.JTextField tf_seats1;
    private javax.swing.JTextField tf_seats2;
    // End of variables declaration//GEN-END:variables
    
    
    
    public JTable getJt_seats() {
        return jt_seats;
    }

    public void setJt_seats(JTable jt_seats) {
        this.jt_seats = jt_seats;
    }

    public JTable getJt_seats1() {
        return jt_seats1;
    }

    public void setJt_seats1(JTable jt_seats1) {
        this.jt_seats1 = jt_seats1;
    }   

    public JButton getBtn_delete() {
        return btn_delete;
    }

    public void setBtn_delete(JButton btn_delete) {
        this.btn_delete = btn_delete;
    }

    public JButton getBtn_detail1() {
        return btn_detail1;
    }

    public void setBtn_detail1(JButton btn_detail1) {
        this.btn_detail1 = btn_detail1;
    }

    public JButton getBtn_detail2() {
        return btn_detail2;
    }

    public void setBtn_detail2(JButton btn_detail2) {
        this.btn_detail2 = btn_detail2;
    }

    public JButton getBtn_edit() {
        return btn_edit;
    }

    public void setBtn_edit(JButton btn_edit) {
        this.btn_edit = btn_edit;
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

    public JButton getBtn_seatCancel() {
        return btn_seatCancel;
    }

    public void setBtn_seatCancel(JButton btn_seatCancel) {
        this.btn_seatCancel = btn_seatCancel;
    }

    public JButton getBtn_seatCancel1() {
        return btn_seatCancel1;
    }

    public void setBtn_seatCancel1(JButton btn_seatCancel1) {
        this.btn_seatCancel1 = btn_seatCancel1;
    }

    public JButton getBtn_seatDelete() {
        return btn_seatDelete;
    }

    public void setBtn_seatDelete(JButton btn_seatDelete) {
        this.btn_seatDelete = btn_seatDelete;
    }

    public JButton getBtn_seatDelete1() {
        return btn_seatDelete1;
    }

    public void setBtn_seatDelete1(JButton btn_seatDelete1) {
        this.btn_seatDelete1 = btn_seatDelete1;
    }

    public JButton getBtn_seatInsert() {
        return btn_seatInsert;
    }

    public void setBtn_seatInsert(JButton btn_seatInsert) {
        this.btn_seatInsert = btn_seatInsert;
    }

    public JButton getBtn_seatInsert1() {
        return btn_seatInsert1;
    }

    public void setBtn_seatInsert1(JButton btn_seatInsert1) {
        this.btn_seatInsert1 = btn_seatInsert1;
    }

    public JButton getBtn_seatSave() {
        return btn_seatSave;
    }

    public void setBtn_seatSave(JButton btn_seatSave) {
        this.btn_seatSave = btn_seatSave;
    }

    public JButton getBtn_seatSave1() {
        return btn_seatSave1;
    }

    public void setBtn_seatSave1(JButton btn_seatSave1) {
        this.btn_seatSave1 = btn_seatSave1;
    }

    public JDialog getJd_edit() {
        return jd_edit;
    }

    public void setJd_edit(JDialog jd_edit) {
        this.jd_edit = jd_edit;
    }

    public JDialog getJd_editSeat() {
        return jd_editSeat;
    }

    public void setJd_editSeat(JDialog jd_editSeat) {
        this.jd_editSeat = jd_editSeat;
    }

    public JDialog getJd_insert() {
        return jd_insert;
    }

    public void setJd_insert(JDialog jd_insert) {
        this.jd_insert = jd_insert;
    }

    public JDialog getJd_insertSeat() {
        return jd_insertSeat;
    }

    public void setJd_insertSeat(JDialog jd_insertSeat) {
        this.jd_insertSeat = jd_insertSeat;
    }
    
    
    
    public void setActionListener(ActionListener ac){
        // screen room panel
        btn_insert.addActionListener(ac);
        btn_edit.addActionListener(ac);
        btn_delete.addActionListener(ac);
        
        // insert dialog
        btn_insertCancel.addActionListener(ac);
        btn_insertOK.addActionListener(ac);
        btn_detail1.addActionListener(ac);
        
        // edit dialog
        btn_editCancel.addActionListener(ac);
        btn_editOK.addActionListener(ac);
        btn_detail2.addActionListener(ac);
        
        // seat dialog in insert
        btn_seatCancel.addActionListener(ac);
        btn_seatSave.addActionListener(ac);
        btn_seatInsert.addActionListener(ac);
        btn_seatDelete.addActionListener(ac);
        
        // seat dialog in edit
        btn_seatCancel1.addActionListener(ac);
        btn_seatDelete1.addActionListener(ac);
        btn_seatInsert1.addActionListener(ac);
        btn_seatSave1.addActionListener(ac);
    }
    
    public void setData(){
        DefaultTableModel tableModel = (DefaultTableModel) jt_screenRoom.getModel();
        tableModel.setRowCount(0);
        
        for (ScreenRoom m : screenRoomManagementDAO.getScreenRooms()) {
            int seatCount = ScreenRoomManagementDAO.getSeatCount(m.getRid());
            String[] rowData = {
                m.getRid(),
                m.getRname(),
                m.getType(),
                m.getEquipment(),
                seatCount + "",
                m.isStatus()? "Available": "Not available",
                m.getNote()
            };
            tableModel.addRow(rowData);
        
        }
    }
    
    public ScreenRoom getSelectedRow(){
        ScreenRoom s = new ScreenRoom();
        DefaultTableModel model = (DefaultTableModel) jt_screenRoom.getModel();
        int selectedRow = jt_screenRoom.getSelectedRow();
        
        if (selectedRow == -1){
            return null;
        }
        
        String rid = model.getValueAt(selectedRow, 0) + "";
        String name = model.getValueAt(selectedRow, 1) + "";
        String type = model.getValueAt(selectedRow, 2) + "";
        String equipment = model.getValueAt(selectedRow, 3) + "";
        boolean status = (model.getValueAt(selectedRow, 5) + "").equals("Available");
        String note = model.getValueAt(selectedRow, 6) + "";
        List<Seat> seats = ScreenRoomManagementDAO.getSeats(rid);
        
        return new ScreenRoom(rid, name, type, equipment, seats, status, note);
    }

    public void showInsertScreenRoomDialog() {
        if (jd_insert.isShowing()){
            jd_insert.toFront();
            return;
        }
        tf_roomID1.setText("");
        tf_roomName1.setText("");
        tf_screenType1.setText("");
        tf_equipment1.setText("");
        tf_seats1.setText("");
        bg_insertStatus.clearSelection();
        ta_note1.setText("");
        
        jd_insert.setVisible(true);
    }

    public void showEditScreenRoomDialog() {
        if (jd_edit.isShowing()){
            jd_edit.toFront();
            return;
        }
        ScreenRoom s = getSelectedRow();
        if (s == null){
            JOptionPane.showMessageDialog(jd_edit,"Please choose a screen room to edit!", "Edit Screen Room Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        tf_roomID2.setText(s.getRid());
        tf_roomID2.setEnabled(false);
        tf_roomName2.setText(s.getRname());
        tf_screenType2.setText(s.getType());
        tf_equipment2.setText(s.getEquipment());
        tf_seats2.setText(ScreenRoomManagementDAO.getSeatCount(s.getRid()) + "");
        tf_seats2.setEnabled(false);
        seats2 = ScreenRoomManagementDAO.getSeats(s.getRid());
        if (s.isStatus()) {
            rb_available2.setSelected(true);
        } else { 
            rb_notAvailable2.setSelected(true);
        }
        ta_note2.setText(s.getNote());
        
        jd_edit.setVisible(true);
    }

    public void deleteScreenRoom() {
        ScreenRoom s = getSelectedRow();
        if (s == null){
            JOptionPane.showMessageDialog(this,"Please choose a screen room to delete!", "Delete Screen Room Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Do you want to delete this screen room?", "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm != JOptionPane.YES_OPTION){
            return;
        }
        
        boolean checkDelete = screenRoomManagementDAO.deleteScreenRoom(s);
        if(!checkDelete){
            JOptionPane.showMessageDialog(this,"Cannot delete this screen room because the foreign key constraint fails!", "Delete Screen Room Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        setData();
    }
    
    public void showSeatTable(JTable table, List<Seat> seats){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        for (Seat s : seats) {
            String[] rowData = {
                s.getSeat_id() + "",
                s.getType(),
                s.getStatus(),
                s.getSeat_row() + "",
                s.getSeat_column() + ""
            };
            model.addRow(rowData);
        }
    }
    
    public void showInsertSeatsDialog() {
        DefaultTableModel model = (DefaultTableModel) jt_seats.getModel();
        
        model.setRowCount(0);
        if (seats1 == null || seats1.isEmpty()){
            jd_insertSeat.setVisible(true);
        }
        else{
            showSeatTable(jt_seats, seats1);
            jd_insertSeat.setVisible(true);
        }
    }

    public void cancel(JDialog dialog) {
        int confirm = JOptionPane.showConfirmDialog(dialog, "Do you want to cancel?", "Cancel", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION){
            dialog.setVisible(false);
            if (!seats1.isEmpty()){
                seats1 = null;
            }
            
            if (!seats2.isEmpty()){
                seats2 = null;
            }
        }
    }
    
    public Seat getSelectedSeat(JTable table){
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int selectedRow = table.getSelectedRow();

            if (selectedRow == -1){
                JOptionPane.showMessageDialog(this,"Please choose seat!", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            Seat seat = new Seat();

            if (!(model.getValueAt(selectedRow, 0) + "").equals(""))
                seat.setSeat_id(Integer.parseInt(model.getValueAt(selectedRow, 0) + ""));

            if (!(model.getValueAt(selectedRow, 1) + "").equals(""))
                seat.setType(model.getValueAt(selectedRow, 1) + "");

            if (!(model.getValueAt(selectedRow, 2) + "").equals(""))
                seat.setStatus(model.getValueAt(selectedRow, 2) + "");

            if (!(model.getValueAt(selectedRow, 3) + "").equals(""))
                seat.setSeat_row(Integer.parseInt(model.getValueAt(selectedRow, 3) + ""));

            if (!(model.getValueAt(selectedRow, 4) + "").equals(""))
                seat.setSeat_column(Integer.parseInt(model.getValueAt(selectedRow, 4) + ""));

            return seat;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Please enter again!", "Syntax Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void insertScreenRoom() {
        // get screen room infor
        String rid = tf_roomID1.getText();
        if (rid == null || rid.equals("")){
            JOptionPane.showMessageDialog(jd_insert,"Please enter screen room ID to insert!", "Insert Screen Room Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String name = tf_roomName1.getText();
        String type = tf_screenType1.getText();
        String equipment = tf_equipment1.getText();
        List<Seat> seats;
        if (seats1 == null){
            seats = null;
            System.out.println("seat1 == null");
        }
        else {
            seats = new ArrayList<>(seats1);
        }
        boolean status = rb_available1.isSelected();
        String note = ta_note1.getText();
        
        ScreenRoom s =  new ScreenRoom(rid, name, type, equipment, seats, status, note);
        boolean canInsert = screenRoomManagementDAO.addScreenRoom(s);
        if (canInsert) {
            setData();
            JOptionPane.showMessageDialog(jd_insert,"Screen room has been added!", "Adding Successfully", JOptionPane.PLAIN_MESSAGE);
            jd_insert.setVisible(false);
            seats1 = null;
        }
        else{
            JOptionPane.showMessageDialog(jd_insert,"Screen room cannot be added!", "Adding Error", JOptionPane.PLAIN_MESSAGE);
        }
        
    }

    public void editScreenRoom() {
        String rid = tf_roomID2.getText();
        String name = tf_roomName2.getText();
        String type = tf_screenType2.getText();
        String equipment = tf_equipment2.getText();
        boolean status = rb_available2.isSelected();
        String note = ta_note2.getText();
        List<Seat> seats;
        if (seats2 == null){
            seats = null;
        }
        else {
            seats = new ArrayList<>(seats2);
        }
        boolean canEdit = screenRoomManagementDAO.editScreenRoom(new ScreenRoom(rid, name, type, equipment, seats, status, note));
        if (canEdit) {
            setData();
            JOptionPane.showMessageDialog(jd_edit,"Screen room has been editted!", "Editting successfully", JOptionPane.PLAIN_MESSAGE);
            jd_edit.setVisible(false);
            seats2 = null;
        }
        else{
            JOptionPane.showMessageDialog(jd_edit,"Screen room cannot be editted!", "Editting Error", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void addRowToSeatTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int max =  0;
        int length = model.getRowCount();
        if (length > 0){
            for (int i = 0; i < length; i++){
                int v = Integer.parseInt(model.getValueAt(i, 0).toString());
                if (v > max)
                        max = v;
            }
        }
        
        String[] rowData = {(max + 1) + "", "Standard", "Available"};
        model.addRow(rowData);
    }
    
    public void deleteRowInSeatTable(JTable table){
        Seat s = getSelectedSeat(table);
        
        if (s == null){
            return;
        }
        
        if (screenRoomManagementDAO.canDeleteSeat(s.getSeat_id())){
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.removeRow(table.getSelectedRow());
        }
        else {
            JOptionPane.showMessageDialog(this,"Cannot delete this seat!", "Delete Seat Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    public void saveInsertSeats() {
        try {
            seats1 = new ArrayList<>();

            DefaultTableModel model = (DefaultTableModel) jt_seats.getModel();
            for (int i = 0; i < jt_seats.getRowCount(); i++){
                int seatID = Integer.parseInt(model.getValueAt(i, 0).toString());
                String seatType = model.getValueAt(i, 1).toString();
                String status = model.getValueAt(i, 2).toString();
                int row = Integer.parseInt(model.getValueAt(i, 3).toString());
                int column = Integer.parseInt(model.getValueAt(i, 4).toString());
                seats1.add(new Seat(seatID, seatType, status, row, column));
            }
            tf_seats1.setText(jt_seats.getRowCount() + "");
            jd_insertSeat.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Please fulfill all information!", "Save Seat Error", JOptionPane.ERROR_MESSAGE);
            seats1 = null;
            return;
        }
    }

    public void showEditSeatsDialog() {
        DefaultTableModel model = (DefaultTableModel) jt_seats1.getModel();
        model.setRowCount(0);
        if (seats2 == null || seats2.isEmpty()){
            jd_editSeat.setVisible(true);
        }
        else{
            showSeatTable(jt_seats1, seats2);
            jd_editSeat.setVisible(true);
        }
    }

    public void saveEditSeats() {
        try {
            seats2 = new ArrayList<Seat>();

            DefaultTableModel model = (DefaultTableModel) jt_seats1.getModel();
            for (int i = 0; i < jt_seats1.getRowCount(); i++){
                int seatID = Integer.parseInt(model.getValueAt(i, 0).toString());
                String seatType = model.getValueAt(i, 1).toString();
                String status = model.getValueAt(i, 2).toString();
                int row = Integer.parseInt(model.getValueAt(i, 3).toString());
                int column = Integer.parseInt(model.getValueAt(i, 4).toString());

                seats2.add(new Seat(seatID, seatType, status, row, column));
            }
            tf_seats2.setText(jt_seats1.getRowCount() + "");
            jd_editSeat.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Please fulfill all information!", "Edit Seat Error", JOptionPane.ERROR_MESSAGE);
            seats2 = null;
            return;
        }
    }
    
}

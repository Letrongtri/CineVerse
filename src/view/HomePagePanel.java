/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import font.SetFont;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/**
 *
 * @author ADMIN
 */
public class HomePagePanel extends javax.swing.JPanel {
    private SetFont font;
    /**
     * Creates new form HomePagePanel
     */
    public HomePagePanel() {
        font = new SetFont();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitle = new javax.swing.JPanel();
        labelVerse = new javax.swing.JLabel();
        labelCine = new javax.swing.JLabel();
        jl_Pic = new javax.swing.JLabel();
        jl_Where = new javax.swing.JLabel();
        jl_Welcome = new javax.swing.JLabel();
        jp_sideBar = new javax.swing.JPanel();
        btn_home = new javax.swing.JLabel();
        btn_findMovie = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_screenRoom = new javax.swing.JLabel();
        btn_staff = new javax.swing.JLabel();
        btn_showTime = new javax.swing.JLabel();
        btn_ticket = new javax.swing.JLabel();
        btn_account = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btn_statistic = new javax.swing.JLabel();
        btn_movie = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitle.setOpaque(false);

        labelVerse.setFont(new java.awt.Font("Segoe UI", 0, 72)); // NOI18N
        font.setFontHagrid(labelVerse, 72f);
        labelVerse.setForeground(new java.awt.Color(213, 60, 56));
        labelVerse.setText("Ciné");

        labelCine.setFont(new java.awt.Font("Segoe UI", 0, 72)); // NOI18N
        font.setFontHagrid(labelCine, 72f);
        labelCine.setForeground(new java.awt.Color(226, 226, 229));
        labelCine.setText("Verse");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelVerse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCine)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVerse)
                    .addComponent(labelCine)))
        );

        add(panelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 420, 100));

        jl_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pic2.png"))); // NOI18N
        add(jl_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jl_Where.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        font.setFontFutura(jl_Where, 32f);
        jl_Where.setForeground(new java.awt.Color(226, 226, 229));
        jl_Where.setText("Where Every Film Finds its Galaxy");
        add(jl_Where, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, -1));

        jl_Welcome.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        font.setFontFutura(jl_Welcome, 32f);
        jl_Welcome.setForeground(new java.awt.Color(226, 226, 229));
        jl_Welcome.setText("Welcome to the CinéVerse – ");
        add(jl_Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, -1, -1));

        jp_sideBar.setBackground(new java.awt.Color(71, 15, 17));

        btn_home.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontFuturaDisplay(btn_home, 28f);
        btn_home.setForeground(new java.awt.Color(226, 226, 229));
        btn_home.setText("Home");

        btn_findMovie.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontFuturaDisplay(btn_findMovie, 28f);
        btn_findMovie.setForeground(new java.awt.Color(226, 226, 229));
        btn_findMovie.setText("Find Movies");

        btn_screenRoom.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontFuturaDisplay(btn_screenRoom, 28f);
        btn_screenRoom.setForeground(new java.awt.Color(226, 226, 229));
        btn_screenRoom.setText("Screen Rooms");

        btn_staff.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontFuturaDisplay(btn_staff, 28f);
        btn_staff.setForeground(new java.awt.Color(226, 226, 229));
        btn_staff.setText("Staffs");

        btn_showTime.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontFuturaDisplay(btn_showTime, 28f);
        btn_showTime.setForeground(new java.awt.Color(226, 226, 229));
        btn_showTime.setText("Show Time");

        btn_ticket.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontFuturaDisplay(btn_ticket, 28f);
        btn_ticket.setForeground(new java.awt.Color(226, 226, 229));
        btn_ticket.setText("Ticket");

        btn_account.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontFuturaDisplay(btn_account, 28f);
        btn_account.setForeground(new java.awt.Color(226, 226, 229));
        btn_account.setText("Account");

        btn_statistic.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontFuturaDisplay(btn_statistic, 28f);
        btn_statistic.setForeground(new java.awt.Color(226, 226, 229));
        btn_statistic.setText("Statistic");

        btn_movie.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontFuturaDisplay(btn_movie, 28f);
        btn_movie.setForeground(new java.awt.Color(226, 226, 229));
        btn_movie.setText("Movies");

        javax.swing.GroupLayout jp_sideBarLayout = new javax.swing.GroupLayout(jp_sideBar);
        jp_sideBar.setLayout(jp_sideBarLayout);
        jp_sideBarLayout.setHorizontalGroup(
            jp_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_sideBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jp_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_findMovie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_screenRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_staff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_movie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_showTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_account, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ticket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_statistic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_sideBarLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jp_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jp_sideBarLayout.setVerticalGroup(
            jp_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_sideBarLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btn_findMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_movie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btn_screenRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btn_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btn_showTime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btn_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btn_account, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_statistic, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        add(jp_sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 690));

        background.setFont(new java.awt.Font("Segoe UI", 0, 72)); // NOI18N
        background.setForeground(new java.awt.Color(103, 23, 26));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.png"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void setMouseListener(MouseListener ml){
        btn_findMovie.addMouseListener(ml);
        btn_home.addMouseListener(ml);
        btn_movie.addMouseListener(ml);
        btn_screenRoom.addMouseListener(ml);
        btn_showTime.addMouseListener(ml);
        btn_account.addMouseListener(ml);
        btn_staff.addMouseListener(ml);
        btn_statistic.addMouseListener(ml);
        btn_ticket.addMouseListener(ml);
        
    }
    
    public JLabel getBtn_account() {
        return btn_account;
    }

    public JLabel getBtn_findMovie() {
        return btn_findMovie;
    }

    public JLabel getBtn_home() {
        return btn_home;
    }

    public JLabel getBtn_movie() {
        return btn_movie;
    }

    public JLabel getBtn_screenRoom() {
        return btn_screenRoom;
    }

    public JLabel getBtn_showTime() {
        return btn_showTime;
    }

    public JLabel getBtn_staff() {
        return btn_staff;
    }

    public JLabel getBtn_statistic() {
        return btn_statistic;
    }

    public JLabel getBtn_ticket() {
        return btn_ticket;
    }

    public void setBtn_account(JLabel btn_account) {
        this.btn_account = btn_account;
    }

    public void setBtn_findMovie(JLabel btn_findMovie) {
        this.btn_findMovie = btn_findMovie;
    }

    public void setBtn_home(JLabel btn_home) {
        this.btn_home = btn_home;
    }

    public void setBtn_movie(JLabel btn_movie) {
        this.btn_movie = btn_movie;
    }

    public void setBtn_screenRoom(JLabel btn_screenRoom) {
        this.btn_screenRoom = btn_screenRoom;
    }

    public void setBtn_showTime(JLabel btn_showTime) {
        this.btn_showTime = btn_showTime;
    }

    public void setBtn_staff(JLabel btn_staff) {
        this.btn_staff = btn_staff;
    }

    public void setBtn_statistic(JLabel btn_statistic) {
        this.btn_statistic = btn_statistic;
    }

    public void setBtn_ticket(JLabel btn_ticket) {
        this.btn_ticket = btn_ticket;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btn_account;
    private javax.swing.JLabel btn_findMovie;
    private javax.swing.JLabel btn_home;
    private javax.swing.JLabel btn_movie;
    private javax.swing.JLabel btn_screenRoom;
    private javax.swing.JLabel btn_showTime;
    private javax.swing.JLabel btn_staff;
    private javax.swing.JLabel btn_statistic;
    private javax.swing.JLabel btn_ticket;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jl_Pic;
    private javax.swing.JLabel jl_Welcome;
    private javax.swing.JLabel jl_Where;
    private javax.swing.JPanel jp_sideBar;
    private javax.swing.JLabel labelCine;
    private javax.swing.JLabel labelVerse;
    private javax.swing.JPanel panelTitle;
    // End of variables declaration//GEN-END:variables
}

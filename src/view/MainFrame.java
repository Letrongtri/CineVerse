package view;

import controller.HomePageController;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MainFrame extends javax.swing.JFrame {
    
    public MainFrame() {
        
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(getClass().getResource("/img/logo1.png")));
        sideBarPanel.setVisible(false);
        
        // Set mouse listener
        HomePageController homePageController = new HomePageController(this);
        sideBar.setMouseListener(homePageController);
        this.setHeaderMouseListener(homePageController);
        homePagePanel.setMouseListener(homePageController);
        
        sideBarPanel.addMouseListener(new MouseAdapter() {});
        sideBarPanel.addMouseMotionListener(new MouseMotionAdapter() {});
        //set visible
//        this.setVisible(true);
    }
    
    public void showPanel(String name) {
        if (name.equals("statistic")){
            dashboard.refresh();
            System.out.println("view.MainFrame.showPanel()");
        }
        CardLayout card = (CardLayout) contentPanel.getLayout();
        card.show(contentPanel, name);
        inactiveSideBar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideBarPanel = new javax.swing.JPanel();
        sideBar = new view.SideBar();
        header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        tf_Find = new javax.swing.JTextField();
        btn_find = new javax.swing.JButton();
        btn_menu = new javax.swing.JLabel();
        jl_admin = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        homePagePanel = new view.HomePagePanel();
        filterPanel = new view.FilterPanel();
        movieManagementPanel = new view.MovieManagementPanel();
        screenRoomManagementPanel = new view.ScreenRoomManagementPanel();
        staffManagement = new view.StaffManagement();
        ticketPanel = new view.Ticketpanel();
        schedulePanel = new view.Schedulepanel();
        dashboard = new view.Dashboard();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CinéVerse");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBarPanel.setBackground(new java.awt.Color(0, 0, 0));
        sideBarPanel.setBackground(new java.awt.Color(0, 0, 0, 130));
        sideBarPanel.setPreferredSize(new java.awt.Dimension(1366, 688));
        sideBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sideBarPanel.add(sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(sideBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        header.setBackground(new java.awt.Color(226, 226, 229));
        header.setPreferredSize(new java.awt.Dimension(1370, 80));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo181x60.png"))); // NOI18N

        tf_Find.setBackground(new java.awt.Color(102, 23, 26));
        tf_Find.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_Find.setForeground(new java.awt.Color(226, 226, 229));
        tf_Find.setBorder(null);
        tf_Find.setOpaque(true);
        tf_Find.setPreferredSize(new java.awt.Dimension(700, 30));

        btn_find.setBackground(new java.awt.Color(103, 26, 23));
        btn_find.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_find.setForeground(new java.awt.Color(226, 226, 229));
        btn_find.setText("Find");
        btn_find.setBorder(null);
        btn_find.setBorderPainted(false);
        btn_find.setFocusPainted(false);

        btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconMenu.png"))); // NOI18N
        btn_menu.setText("jLabel1");

        jl_admin.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jl_admin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_admin.setText("Admin");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(tf_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_find, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jl_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_find, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addComponent(btn_menu)
                        .addGap(10, 10, 10)))
                .addGap(7, 7, 7))
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        contentPanel.setLayout(new java.awt.CardLayout());
        contentPanel.add(homePagePanel, "homePage");
        contentPanel.add(filterPanel, "filter");
        contentPanel.add(movieManagementPanel, "movies");
        contentPanel.add(screenRoomManagementPanel, "screenRoom");
        contentPanel.add(staffManagement, "staff");
        contentPanel.add(ticketPanel, "ticket");
        contentPanel.add(schedulePanel, "schedule");
        contentPanel.add(dashboard, "statistic");

        getContentPane().add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1370, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void setHeaderMouseListener(MouseListener ml){
        btn_menu.addMouseListener(ml);
        btn_find.addMouseListener(ml);
    }
    
    public void activeSideBar(){
        sideBarPanel.setVisible(true);
        sideBarPanel.setEnabled(true);
        sideBar.showSideBar();
    }
    
    public void inactiveSideBar(){
        sideBarPanel.setVisible(false);
        sideBarPanel.setEnabled(false);
        sideBar.hideSidebar();
    }

    public HomePagePanel getHomePagePanel() {
        return homePagePanel;
    }

    public JLabel getBtn_menu() {
        return btn_menu;
    }

    public SideBar getSideBar() {
        return sideBar;
    }

    public MovieManagementPanel getMovieManagementPanel() {
        return movieManagementPanel;
    }

    public ScreenRoomManagementPanel getScreenRoomManagementPanel() {
        return screenRoomManagementPanel;
    }

    public JButton getBtn_find() {
        return btn_find;
    }

    public void setBtn_find(JButton btn_find) {
        this.btn_find = btn_find;
    }
    
    
    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Window".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_find;
    private javax.swing.JLabel btn_menu;
    private javax.swing.JPanel contentPanel;
    private view.Dashboard dashboard;
    private view.FilterPanel filterPanel;
    private javax.swing.JPanel header;
    private view.HomePagePanel homePagePanel;
    private javax.swing.JLabel jl_admin;
    private javax.swing.JLabel logo;
    private view.MovieManagementPanel movieManagementPanel;
    private view.Schedulepanel schedulePanel;
    private view.ScreenRoomManagementPanel screenRoomManagementPanel;
    private view.SideBar sideBar;
    private javax.swing.JPanel sideBarPanel;
    private view.StaffManagement staffManagement;
    private javax.swing.JTextField tf_Find;
    private view.Ticketpanel ticketPanel;
    // End of variables declaration//GEN-END:variables

    public void findMovie() {
        showPanel("filter");
        filterPanel.findMovie(tf_Find.getText());
    }
    
    public void setAdmin(String admin){
        jl_admin.setText(admin);
    }
}

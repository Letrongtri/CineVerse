
package view;

import DatabaseConnection.DatabaseConnection;
import DatabaseConnection.StaffManagementDAO;
import java.sql.*;
import font.SetFont;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {
    private SetFont font ;
    
    public LoginFrame() {
        font = new SetFont();
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(getClass().getResource("/img/logo1.png")));
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        password = new javax.swing.JLabel();
        staffID = new javax.swing.JLabel();
        txtstaffID = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(226, 226, 229));
        jPanel5.setPreferredSize(new java.awt.Dimension(600, 300));
        //jPanel5.setBackground(new java.awt.Color(195, 170, 170, 123));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(193, 168, 168));
        jPanel6.setOpaque(false);
        jPanel6.setBackground(new java.awt.Color(255, 255, 255 , 0));
        jPanel6.setLayout(null);

        password.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        font.setFontRoboto(password, 20f);
        password.setText("Password:");
        password.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel6.add(password);
        password.setBounds(60, 50, 100, 30);

        staffID.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        font.setFontRoboto(staffID, 20f);
        staffID.setText("Staff ID:");
        staffID.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel6.add(staffID);
        staffID.setBounds(60, 0, 140, 30);

        font.setFontRoboto(txtstaffID, 20f);
        txtstaffID.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtstaffID.setPreferredSize(new java.awt.Dimension(350, 30));
        jPanel6.add(txtstaffID);
        txtstaffID.setBounds(200, 0, 350, 30);

        font.setFontRoboto(txtpass, 20f);
        txtpass.setPreferredSize(new java.awt.Dimension(350, 30));
        jPanel6.add(txtpass);
        txtpass.setBounds(200, 50, 350, 30);

        btn_login.setBackground(new java.awt.Color(102, 23, 26));
        btn_login.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        font.setFontFutura(btn_login, 20f);
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText(" Log in ");
        btn_login.setAlignmentX(0.5F);
        btn_login.setFocusPainted(false);
        btn_login.setPreferredSize(new java.awt.Dimension(150, 40));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel6.add(btn_login);
        btn_login.setBounds(220, 120, 150, 40);

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 600, 200));

        login.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        font.setFontFuturaDisplay(login, 50f);
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Log in");
        jPanel5.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 600, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        try {
            Connection con = DatabaseConnection.getConnection();
           
            
             String staffID =  txtstaffID.getText();
             String password =  txtpass.getText();
             
            if (staffID.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both Staff ID and Password.");
                return;        
        }
    
             PreparedStatement p = con.prepareStatement("select count(*) from Staff where sid = ? and  password= ?");
             p.setString(1, staffID);
             p.setString(2, password);
             
             ResultSet result =  p.executeQuery();
             
             if(result.next() && result.getInt(1) == 1){
                 dispose(); // close login page 
                 MainFrame homepage = new MainFrame();
                 String staffName = StaffManagementDAO.getStaffName(staffID);
                 if (staffName != null)
                    homepage.setAdmin(staffName);
                  homepage.setVisible(true); 
             }else {
                  JOptionPane.showMessageDialog(this, " username or password wrong");
                  txtstaffID.setText("");
                  txtpass.setText(""); 
             }
             con.close();
             
      
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel login;
    private javax.swing.JLabel password;
    private javax.swing.JLabel staffID;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtstaffID;
    // End of variables declaration//GEN-END:variables
}

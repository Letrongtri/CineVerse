package cineverse;


import javax.swing.UnsupportedLookAndFeelException;
import view.LoginFrame;

public class CineVerse {
    
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
        }
        
        java.awt.EventQueue.invokeLater(LoginFrame::new);
    }
    
}

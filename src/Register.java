
import com.sun.jdi.connect.spi.Connection;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jf1 = new javax.swing.JTextField();
        jf6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jb2 = new javax.swing.JRadioButton();
        jb3 = new javax.swing.JRadioButton();
        jf5 = new javax.swing.JPasswordField();
        jf4 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jf1ActionPerformed(evt);
            }
        });
        getContentPane().add(jf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 154, 30));

        jf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jf6ActionPerformed(evt);
            }
        });
        getContentPane().add(jf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 154, 30));

        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jLabel2.setText("Gender");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));

        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 20));

        jLabel5.setText("Age");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 20));

        jButton2.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 170, 70));

        jb2.setText("MALE");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        getContentPane().add(jb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 20));

        jb3.setText("FEMALE");
        getContentPane().add(jb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, 20));
        getContentPane().add(jf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 154, 30));

        jf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jf4ActionPerformed(evt);
            }
        });
        getContentPane().add(jf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 154, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/registerisko.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
        close();
        StartUp1 su = new StartUp1();
        su.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jf1ActionPerformed

    private void jf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jf6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jf6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    String username = jf1.getText();
    String password = new String(jf4.getPassword());
    String cpassword = new String(jf5.getPassword());
    int age = Integer.parseInt(jf6.getText());
    String gender = (jb2.isSelected()) ? "MALE" : "FEMALE";

    if (username.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Username required");
    } else if (password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Password required");
    } else if (!password.equals(cpassword)) {
        JOptionPane.showMessageDialog(this, "Passwords do not match");
    } else {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "jefflopez");
            PreparedStatement s1 = con.prepareStatement("INSERT INTO users (user, password, gender, age) VALUES (?, ?, ?, ?)");

            s1.setString(1, username);
            s1.setString(2, password);
            s1.setString(3, gender);
            s1.setInt(4, age);

            s1.executeUpdate();
            con.close();

            JOptionPane.showMessageDialog(this, "REGISTERED");
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }    
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb2ActionPerformed

    private void jf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jf4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jb2;
    private javax.swing.JRadioButton jb3;
    private javax.swing.JTextField jf1;
    private javax.swing.JPasswordField jf4;
    private javax.swing.JPasswordField jf5;
    private javax.swing.JTextField jf6;
    // End of variables declaration//GEN-END:variables

    private void close() {
    WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
}


import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author User
 */
public class PersonalInfo extends javax.swing.JFrame {

    /**
     * Creates new form PersonalInfo
     */
    public PersonalInfo() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        j5 = new javax.swing.JTextField();
        j7 = new javax.swing.JTextField();
        j8 = new javax.swing.JTextField();
        j9 = new javax.swing.JTextField();
        j10 = new javax.swing.JTextField();
        j6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        j11 = new javax.swing.JTextField();
        j12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        j1 = new javax.swing.JTextField();
        j2 = new javax.swing.JTextField();
        j3 = new javax.swing.JTextField();
        j4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setText("Full Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setText("Date of Birth");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 104, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setText("Age");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 144, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 178, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel5.setText("Contact Information");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 222, -1, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel6.setText("Street address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel7.setText("Personal Information");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 18, -1, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel8.setText("Barangay");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel9.setText("City");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel10.setText("Province");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel11.setText("Postal");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel12.setText("Zip Code");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 290, -1, -1));

        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });
        getContentPane().add(j5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 310, 97, -1));

        j7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7ActionPerformed(evt);
            }
        });
        getContentPane().add(j7, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 310, 95, -1));
        getContentPane().add(j8, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 310, 109, -1));

        j9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9ActionPerformed(evt);
            }
        });
        getContentPane().add(j9, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 310, 76, -1));

        j10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j10ActionPerformed(evt);
            }
        });
        getContentPane().add(j10, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 310, 80, -1));

        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });
        getContentPane().add(j6, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 310, 67, -1));

        jLabel13.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel13.setText("Phone No#");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 378, -1, -1));

        j11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j11ActionPerformed(evt);
            }
        });
        getContentPane().add(j11, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 398, 97, -1));

        j12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j12ActionPerformed(evt);
            }
        });
        getContentPane().add(j12, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 398, 114, -1));

        jLabel14.setText("Email Address");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 376, -1, -1));

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, 32));
        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 65, 103, -1));
        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 99, 103, -1));
        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 139, 103, -1));
        getContentPane().add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 173, 103, -1));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/register 1.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j7ActionPerformed

    private void j9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j9ActionPerformed

    private void j11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j11ActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        
        
// Retrieve the input from the form fields
    String name = j1.getText();
    String dob = j2.getText();
    int age = Integer.parseInt(j3.getText());
    String gender = j4.getText();
    String staddress = j5.getText();
    String brgy = j6.getText();
    String city = j7.getText();
    String province = j8.getText();
    int postal = Integer.parseInt(j9.getText());
    int zip = Integer.parseInt(j10.getText());
    String phone = (j11.getText());
    String email = j12.getText();

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "jefflopez");

        // Corrected SQL statement with the right number of placeholders
        String query = "INSERT INTO personalinfo (name, dob, age, gender, staddress, brgy, city, province, postal, zip, phone, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement s1 = con.prepareStatement(query);

        // Set the parameters for the query
        s1.setString(1, name);
        s1.setString(2, dob);
        s1.setInt(3, age);
        s1.setString(4, gender);
        s1.setString(5, staddress);
        s1.setString(6, brgy);
        s1.setString(7, city);
        s1.setString(8, province);
        s1.setInt(9, postal);
        s1.setInt(10, zip);
        s1.setString(11, phone);
        s1.setString(12, email);

        // Execute the update
        s1.executeUpdate();
        con.close();

        JOptionPane.showMessageDialog(this, "REGISTERED");
    } catch (SQLException ex) {
        Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
    }

this.dispose();
        NextInfo m = new NextInfo();
                m.setVisible(true);
                m.pack();
                m.setLocationRelativeTo(null);
    
    }//GEN-LAST:event_nextButtonActionPerformed

    private void j10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j10ActionPerformed

    private void j12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j12ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j5ActionPerformed

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 this.dispose();
        AAAMain jb = new AAAMain();
                jb.setVisible(true);
                jb.pack();
                jb.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField j1;
    private javax.swing.JTextField j10;
    private javax.swing.JTextField j11;
    private javax.swing.JTextField j12;
    private javax.swing.JTextField j2;
    private javax.swing.JTextField j3;
    private javax.swing.JTextField j4;
    private javax.swing.JTextField j5;
    private javax.swing.JTextField j6;
    private javax.swing.JTextField j7;
    private javax.swing.JTextField j8;
    private javax.swing.JTextField j9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
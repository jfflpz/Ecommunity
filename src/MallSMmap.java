
import java.awt.Desktop;
import java.net.URL;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author QCU
 */
public class MallSMmap extends javax.swing.JInternalFrame {

    /**
     * Creates new form Foodmap
     */
    public MallSMmap() {
        initComponents();
        
        jTextArea3.setEditable(false);
        jTextArea2.setEditable(false);
        jTextArea1.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(724, 547));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("C");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 10, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("SM City Fairview - Parkway\n\nAddress: P3M6+W64, Novaliches, Quezon City, Metro Manila\nHours: \nOpen ⋅ Closes 10 PM");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 70));

        jButton3.setText("Click for more information");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 270, 120));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 51, 51));
        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("B");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 10, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("SM City Sta. Mesa\n\nAddress: Brgy, R. Magsaysay, Cor Gregorio Araneta Ave, Quezon City, 1113\nHours: Open ⋅ Closes 10 PM\nOpened: September 28, 1990");
        jScrollPane2.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 70));

        jButton2.setText("Click for more information");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 250, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 270, 100));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 51, 51));
        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("A");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 10, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("SM North Edsa\n\nAddress: North Avenue, corner Epifanio de los Santos Ave, Quezon City, 1100 Metro Manila\nHours: Open ⋅ Closes 10 PM\nOpened: November 8, 1985");
        jScrollPane3.setViewportView(jTextArea3);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 70));

        jButton1.setText("Click for more information");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 250, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 90));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 270, 380);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/SMmap.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/dir//North+Avenue,+corner+Epifanio+de+los+Santos+Ave,+Quezon+City,+1100+Metro+Manila/@14.6568048,120.9480639,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3397b7c7722bc6f1:0xdc87cf9ed19d652e!2m2!1d121.0304657!2d14.6568193?entry=ttu").toURI());
       }catch(Exception e){
       
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("  https://www.google.com/maps/dir//P3M6%2BW64,+Novaliches,+Quezon+City,+Metro+Manila/@14.7347389,120.9781636,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3397b16f9bf23a17:0x95fb6c8b2d0799c5!2m2!1d121.0605654!2d14.7347535?entry=ttu").toURI());
        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL(" https://www.google.com/maps/dir//Brgy,+R.+Magsaysay,+Cor+Gregorio+Araneta+Ave,+Quezon+City,+1113/@14.6043468,120.9364272,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3397c9d88f26aacb:0xbef2321dbaf8db90!2m2!1d121.018829!2d14.6043613?entry=ttu").toURI());
        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}

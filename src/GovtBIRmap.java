
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
public class GovtBIRmap extends javax.swing.JInternalFrame {

    /**
     * Creates new form Foodmap
     */
    public GovtBIRmap() {
        initComponents();
        
        jTextArea3.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(724, 547));
        getContentPane().setLayout(null);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("BIR Revenue District Office – Cubao, Quezon City\n\nAddress: 5th Floor (roof deck) FISHER MALL, Quezon Avenue cor. Roosevelt Junction, Quezon City\nHours: Closed ⋅ Opens 8 AM Mon\nPhone: (02) 8863 4000");
        jScrollPane3.setViewportView(jTextArea3);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 90));

        jButton1.setText("Click for more information");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 250, -1));

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 30, 270, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/BIRMap.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/dir//5th+Floor+FISHER+MALL,+Quezon+Avenue+cor.+Roosevelt+Junction,+Quezon+City/@14.6336494,120.9372603,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3397b653d0e18a83:0xab465159f4cf7fe2!2m2!1d121.0196621!2d14.6336639?entry=ttu").toURI());
        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}

import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gayatri
 */
public class updateDetailsDonor extends javax.swing.JFrame {

    /**
     * Creates new form updateDetailsDonor
     */
    public updateDetailsDonor() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        N12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        N13 = new javax.swing.JTextField();
        N14 = new javax.swing.JTextField();
        N15 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        N16 = new javax.swing.JTextField();
        N17 = new javax.swing.JTextField();
        N18 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 48)); // NOI18N
        jLabel1.setText("UPDATE DONOR DETAILS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("ITF Devanagari", 1, 22)); // NOI18N
        jLabel2.setText("Donor Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 155, -1, -1));

        N12.setFont(new java.awt.Font("Arima Koshi", 1, 20)); // NOI18N
        N12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N12ActionPerformed(evt);
            }
        });
        getContentPane().add(N12, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 157, 170, 34));

        jButton1.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("/Users/gayatri/Desktop/bb/search1.png")); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("ITF Devanagari", 1, 22)); // NOI18N
        jLabel3.setText("Full Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 316, 122, -1));

        jLabel4.setFont(new java.awt.Font("ITF Devanagari", 1, 22)); // NOI18N
        jLabel4.setText("Mobile No.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 456, -1, -1));

        jLabel5.setFont(new java.awt.Font("ITF Devanagari", 1, 22)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 601, 106, -1));

        jLabel6.setFont(new java.awt.Font("ITF Devanagari", 1, 22)); // NOI18N
        jLabel6.setText("Age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 316, 153, -1));

        jLabel7.setFont(new java.awt.Font("ITF Devanagari", 1, 22)); // NOI18N
        jLabel7.setText("Blood Group");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 456, -1, -1));

        jLabel8.setFont(new java.awt.Font("ITF Devanagari", 1, 22)); // NOI18N
        jLabel8.setText("Donated Earlier");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 601, -1, -1));

        N13.setFont(new java.awt.Font("Arima Koshi", 1, 20)); // NOI18N
        getContentPane().add(N13, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 319, 170, 32));

        N14.setFont(new java.awt.Font("Arima Koshi", 1, 20)); // NOI18N
        getContentPane().add(N14, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 459, 170, 32));

        N15.setFont(new java.awt.Font("Arima Koshi", 1, 20)); // NOI18N
        getContentPane().add(N15, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 604, 170, 32));

        jButton2.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("/Users/gayatri/Desktop/bb/save.png")); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 730, -1, -1));

        jButton3.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("/Users/gayatri/Desktop/bb/Update details.png")); // NOI18N
        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 728, -1, -1));

        jButton4.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("/Users/gayatri/Desktop/bb/Exit application.png")); // NOI18N
        jButton4.setText("CLOSE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 728, -1, -1));

        N16.setFont(new java.awt.Font("Arima Koshi", 1, 20)); // NOI18N
        getContentPane().add(N16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 319, 170, 32));

        N17.setFont(new java.awt.Font("Arima Koshi", 1, 20)); // NOI18N
        getContentPane().add(N17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 459, 170, 32));

        N18.setFont(new java.awt.Font("Arima Koshi", 1, 20)); // NOI18N
        getContentPane().add(N18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 604, 170, 32));

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/gayatri/Downloads/Untitled design/2.png")); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel10ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void N12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new updateDetailsDonor().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String d_id= N12.getText();
        try{
           Connection con = ConnectionProvider.getCon();
           Statement st=con.createStatement();
           ResultSet rs= st.executeQuery("select * from donor where d_id='"+d_id+"'");
           if(rs.next()){
               N13.setText(rs.getString(2));
               N14.setText(rs.getString(3));
               N15.setText(rs.getString(4));
               N16.setText(rs.getString(5));
               N17.setText(rs.getString(6));
               N18.setText(rs.getString(7));
               N12.setEditable(false);
               
           }
           else{
               JOptionPane.showMessageDialog(null,"Donor does not exist");
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connection Error");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String d_id = N12.getText();
        String name = N13.getText();
        String phno = N14.getText();
        String loc = N15.getText();
        String age = N16.getText();
        String blood_grp = N17.getText();
        String donated_earlier = N18.getText();
        try{
            Connection con= ConnectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("update donor set name='"+name+"',phno='"+phno+"',loc='"+loc+"',age='"+age+"',blood_grp='"+blood_grp+"',donated_earlier='"+donated_earlier+"' where d_id='"+d_id+"'");
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            setVisible(false);
            new updateDetailsDonor().setVisible(true);
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel10ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel10ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(updateDetailsDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateDetailsDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateDetailsDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateDetailsDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateDetailsDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField N12;
    private javax.swing.JTextField N13;
    private javax.swing.JTextField N14;
    private javax.swing.JTextField N15;
    private javax.swing.JTextField N16;
    private javax.swing.JTextField N17;
    private javax.swing.JTextField N18;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    private static class setVisible {

        public setVisible(boolean b) {
        }
    }
}

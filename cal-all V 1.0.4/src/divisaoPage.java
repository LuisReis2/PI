/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kayoc
 */
public class divisaoPage extends javax.swing.JFrame {

    /**
     * Creates new form divisaoPage
     */
    public divisaoPage() {
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

        div1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        div2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        divisaoresul = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setTitle("Divisão");
        getContentPane().setLayout(null);

        div1.setBackground(new java.awt.Color(51, 51, 255));
        div1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        div1.setForeground(new java.awt.Color(0, 0, 0));
        div1.setText("0");
        div1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div1ActionPerformed(evt);
            }
        });
        getContentPane().add(div1);
        div1.setBounds(20, 180, 100, 38);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("/");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 170, 30, 48);

        div2.setBackground(new java.awt.Color(51, 51, 255));
        div2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        div2.setForeground(new java.awt.Color(0, 0, 0));
        div2.setText("0");
        div2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div2ActionPerformed(evt);
            }
        });
        getContentPane().add(div2);
        div2.setBounds(170, 180, 100, 38);

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("=");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 180, 40, 48);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 260, 90, 23);

        divisaoresul.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        divisaoresul.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(divisaoresul);
        divisaoresul.setBounds(290, 110, 90, 70);

        jLabel5.setFont(new java.awt.Font("Leelawadee", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Divisão");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 50, 382, 89);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis\\Downloads\\page1.png")); // NOI18N
        jLabel6.setText("jLabel2");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 450, 420);

        setSize(new java.awt.Dimension(457, 411));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void div1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_div1ActionPerformed

    private void div2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_div2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        double vdiv1, vdiv2, vdivisaoresul;
        vdiv1 = Integer.parseInt(div1.getText());
        vdiv2 = Integer.parseInt(div2.getText());

        vdivisaoresul = vdiv1 / vdiv2;// TODO add your handling code here:

        divisaoresul.setText(String.valueOf(vdivisaoresul));
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
            java.util.logging.Logger.getLogger(divisaoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(divisaoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(divisaoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(divisaoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new divisaoPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField div1;
    private javax.swing.JTextField div2;
    private javax.swing.JLabel divisaoresul;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kaique.acabral
 */
public class subtraPage extends javax.swing.JFrame {

    /**
     * Creates new form subtraPage
     */
    public subtraPage() {
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

        jButton1 = new javax.swing.JButton();
        sub1 = new javax.swing.JTextField();
        sub2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        subresul = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Subtração");
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 290, 76, 26);

        sub1.setBackground(new java.awt.Color(51, 51, 255));
        sub1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        sub1.setForeground(new java.awt.Color(0, 0, 0));
        sub1.setText("0");
        sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub1ActionPerformed(evt);
            }
        });
        getContentPane().add(sub1);
        sub1.setBounds(20, 180, 100, 38);

        sub2.setBackground(new java.awt.Color(51, 51, 255));
        sub2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        sub2.setForeground(new java.awt.Color(0, 0, 0));
        sub2.setText("0");
        sub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub2ActionPerformed(evt);
            }
        });
        getContentPane().add(sub2);
        sub2.setBounds(160, 180, 100, 38);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("=");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 180, 30, 38);

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("-");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 180, 30, 38);

        jLabel1.setFont(new java.awt.Font("Leelawadee", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Subtração");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 30, 382, 89);

        subresul.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        subresul.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(subresul);
        subresul.setBounds(320, 170, 160, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/imagens/page1.png"))); // NOI18N
        jLabel5.setText("jLabel2");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 500, 420);

        setSize(new java.awt.Dimension(504, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub1ActionPerformed

    private void sub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 double vsub1, vsub2, vsubResult;
       try{
        vsub1 = Double.parseDouble(sub1.getText());
        vsub2 = Double.parseDouble(sub2.getText());
        
        vsubResult = vsub1 - vsub2;// TODO add your handling code here:
        
        subresul.setText(String.valueOf(vsubResult));  
       }catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "Digite apenas valores validos");
       }// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(subtraPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subtraPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subtraPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subtraPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subtraPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField sub1;
    private javax.swing.JTextField sub2;
    private javax.swing.JLabel subresul;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author luis.hrevangelista
 */
public class powPage extends javax.swing.JFrame {

    /**
     * Creates new form powPage
     */
    public powPage() {
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

        potv = new javax.swing.JTextField();
        numv = new javax.swing.JTextField();
        expoente = new javax.swing.JLabel();
        base = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        R = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        potv.setText("0");
        potv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                potvFocusLost(evt);
            }
        });
        getContentPane().add(potv);
        potv.setBounds(140, 60, 50, 30);

        numv.setText("0");
        numv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numvFocusLost(evt);
            }
        });
        getContentPane().add(numv);
        numv.setBounds(30, 60, 50, 30);

        expoente.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        expoente.setText("0");
        getContentPane().add(expoente);
        expoente.setBounds(70, 140, 120, 80);

        base.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        base.setText("0");
        getContentPane().add(base);
        base.setBounds(40, 190, 80, 80);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("=");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 190, 34, 15);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 240, 73, 25);

        R.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        R.setText("Result");
        getContentPane().add(R);
        R.setBounds(220, 160, 90, 80);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    double num, pot, result;
    num = Double.parseDouble(numv.getText());
    pot = Double.parseDouble(potv.getText());
    result = Math.pow(num, pot);
    R.setText(String.valueOf(result));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numvFocusLost
       int basev;
       basev = Integer.parseInt(numv.getText());
             base.setText(String.valueOf(basev));
       
    }//GEN-LAST:event_numvFocusLost

    private void potvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_potvFocusLost
        int expo; 
        expo = Integer.parseInt(potv.getText());
        expoente.setText(String.valueOf(expo));       // TODO add your handling code here:
    }//GEN-LAST:event_potvFocusLost

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
            java.util.logging.Logger.getLogger(powPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(powPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(powPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(powPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new powPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel R;
    private javax.swing.JLabel base;
    private javax.swing.JLabel expoente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField numv;
    private javax.swing.JTextField potv;
    // End of variables declaration//GEN-END:variables
}

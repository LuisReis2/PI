
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author luis.hrevangelista
 */
public class pageNivel2 extends javax.swing.JFrame {

    /**
     * Creates new form pageNivel2
     */
    public pageNivel2() {
        initComponents();
        btnCalcular.requestFocus();
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
        decimalv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        octalv = new javax.swing.JTextField();
        hexav = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        binariov = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Decimal");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 110, 70, 20);

        decimalv.setBackground(new java.awt.Color(255, 51, 51));
        decimalv.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        decimalv.setForeground(new java.awt.Color(0, 0, 0));
        decimalv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                decimalvFocusLost(evt);
            }
        });
        decimalv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalvActionPerformed(evt);
            }
        });
        getContentPane().add(decimalv);
        decimalv.setBounds(200, 110, 80, 22);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Hexadecimal");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 170, 110, 20);

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Binário");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 80, 50, 20);

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Octal");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 140, 50, 20);

        octalv.setBackground(new java.awt.Color(255, 51, 51));
        octalv.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        octalv.setForeground(new java.awt.Color(0, 0, 0));
        octalv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                octalvFocusLost(evt);
            }
        });
        octalv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octalvActionPerformed(evt);
            }
        });
        getContentPane().add(octalv);
        octalv.setBounds(200, 140, 80, 22);

        hexav.setBackground(new java.awt.Color(255, 51, 51));
        hexav.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        hexav.setForeground(new java.awt.Color(0, 0, 0));
        hexav.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                hexavFocusLost(evt);
            }
        });
        hexav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexavActionPerformed(evt);
            }
        });
        getContentPane().add(hexav);
        hexav.setBounds(200, 170, 80, 22);

        btnCalcular.setBackground(new java.awt.Color(255, 51, 51));
        btnCalcular.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(130, 210, 73, 23);

        binariov.setBackground(new java.awt.Color(255, 51, 51));
        binariov.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        binariov.setForeground(new java.awt.Color(0, 0, 0));
        binariov.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                binariovFocusLost(evt);
            }
        });
        getContentPane().add(binariov);
        binariov.setBounds(200, 80, 80, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis\\Downloads\\page2.png")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 400, 320);

        setSize(new java.awt.Dimension(416, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void decimalvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decimalvActionPerformed

    private void octalvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octalvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_octalvActionPerformed

    private void hexavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexavActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hexavActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String binario, octal, hexa, decimals;
        int decimal;
        binario = binariov.getText();
        decimals = decimalv.getText();
        octal = octalv.getText();
        hexa = hexav.getText();
        //Se preencher binario

        try {

            if (!binario.equals("")) {
                decimal = Integer.parseInt(binario, 2);
                octal = Integer.toOctalString(decimal);
                hexa = Integer.toHexString(decimal);
                decimalv.setText(String.valueOf(decimal));
                octalv.setText(String.valueOf(octal));
                hexav.setText(String.valueOf(hexa));
                //se preencher decimal
            } else if (!decimals.equals("")) {
                decimal = Integer.parseInt(decimals);
                binario = Integer.toBinaryString(decimal);
                octal = Integer.toOctalString(decimal);
                hexa = Integer.toHexString(decimal);
                binariov.setText(String.valueOf(binario));
                octalv.setText(String.valueOf(octal));
                hexav.setText(String.valueOf(hexa));
            } else if (!octal.equals("")) {
                decimal = Integer.parseInt(octal, 8);
                binario = Integer.toBinaryString(decimal);
                hexa = Integer.toHexString(decimal);
                decimalv.setText(String.valueOf(decimal));
                hexav.setText(String.valueOf(hexa));
                binariov.setText(String.valueOf(binario));
            } else if (!hexa.equals("")) {
                decimal = Integer.parseInt(hexa, 16);
                binario = Integer.toBinaryString(decimal);
                octal = Integer.toOctalString(decimal);
                binariov.setText(String.valueOf(binario));
                decimalv.setText(String.valueOf(decimal));
                octalv.setText(String.valueOf(octal));
            }
        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "Digite apenas validos");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void decimalvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_decimalvFocusLost
       
    }//GEN-LAST:event_decimalvFocusLost

    private void octalvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_octalvFocusLost
       
    }//GEN-LAST:event_octalvFocusLost

    private void hexavFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hexavFocusLost
    
    }//GEN-LAST:event_hexavFocusLost

    private void binariovFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_binariovFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_binariovFocusLost

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
            java.util.logging.Logger.getLogger(pageNivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pageNivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pageNivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pageNivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pageNivel2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField binariov;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField decimalv;
    private javax.swing.JTextField hexav;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField octalv;
    // End of variables declaration//GEN-END:variables
}

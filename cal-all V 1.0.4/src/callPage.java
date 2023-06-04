
import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author luis.hrevangelista
 */
public class callPage extends javax.swing.JFrame {

    /**
     * Creates new form callPage
     */
    public callPage() {
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
        genero = new javax.swing.JComboBox<>();
        xv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        R = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnexp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Escolha um gênero");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 110, 120, 16);

        genero.setBackground(new java.awt.Color(51, 51, 255));
        genero.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        genero.setForeground(new java.awt.Color(0, 0, 0));
        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "homem", "mulher" }));
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });
        getContentPane().add(genero);
        genero.setBounds(140, 140, 100, 22);

        xv.setBackground(new java.awt.Color(51, 51, 255));
        xv.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        xv.setForeground(new java.awt.Color(0, 0, 0));
        xv.setText("0");
        xv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xvActionPerformed(evt);
            }
        });
        getContentPane().add(xv);
        xv.setBounds(150, 200, 71, 30);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("peso");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 170, 80, 20);

        jToggleButton1.setBackground(new java.awt.Color(51, 51, 255));
        jToggleButton1.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setText("Calcular");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(130, 240, 110, 23);

        R.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        getContentPane().add(R);
        R.setBounds(0, 270, 350, 30);

        jLabel3.setFont(new java.awt.Font("Leelawadee", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Calorias");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 10, 382, 89);

        btnexp.setBackground(new java.awt.Color(51, 51, 255));
        btnexp.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        btnexp.setForeground(new java.awt.Color(0, 0, 0));
        btnexp.setText("explicação");
        btnexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexpActionPerformed(evt);
            }
        });
        getContentPane().add(btnexp);
        btnexp.setBounds(250, 240, 100, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis\\Downloads\\page1.png")); // NOI18N
        jLabel4.setText("jLabel2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 410, 360);

        setSize(new java.awt.Dimension(410, 354));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoActionPerformed

    private void xvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xvActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String msg, gr, caloriaReduzida;
        double x, peso; 
        gr = genero.getSelectedItem().toString();
        peso = Double.parseDouble(xv.getText());
         DecimalFormat df = new DecimalFormat("0.00");
       
        if(gr.equals("homem")){
            x = (0.063 * peso + 2.896)*239;
           caloriaReduzida = df.format(x);
            msg = "Você gasta " +  caloriaReduzida + " calorias por dia";
            R.setText(String.valueOf(msg));
        }else if(gr.equals("mulher")){
            x = (0.062 * peso + 2.036) * 239;
           caloriaReduzida = df.format(x);
            msg = "Você gasta " +  caloriaReduzida + " calorias por dia";
            R.setText(String.valueOf(msg));
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexpActionPerformed
        new expPage().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnexpActionPerformed

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
            java.util.logging.Logger.getLogger(callPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(callPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(callPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(callPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new callPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel R;
    private javax.swing.JButton btnexp;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField xv;
    // End of variables declaration//GEN-END:variables
}

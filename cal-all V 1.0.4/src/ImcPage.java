
import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kaique.acabral
 */
public class ImcPage extends javax.swing.JFrame {

    /**
     * Creates new form ImcPage
     */
    public ImcPage() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        altura = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        IMC = new javax.swing.JLabel();
        Cl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setTitle("IMC");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Informe sua altura:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 160, 110, 30);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Informe seu peso:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 120, 100, 30);

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("IMC");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 30, 110, 30);

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("IMC");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 220, 40, 30);

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Classificação:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 260, 100, 30);

        altura.setBackground(new java.awt.Color(51, 51, 255));
        altura.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(altura);
        altura.setBounds(120, 160, 100, 30);

        peso.setBackground(new java.awt.Color(51, 51, 255));
        peso.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(peso);
        peso.setBounds(120, 120, 100, 30);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 140, 150, 40);
        getContentPane().add(IMC);
        IMC.setBounds(80, 220, 70, 30);

        Cl.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        Cl.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(Cl);
        Cl.setBounds(100, 260, 160, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis\\Downloads\\page1.png")); // NOI18N
        jLabel6.setText("jLabel2");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -20, 520, 420);

        setSize(new java.awt.Dimension(532, 376));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        float vpeso, valtura, vIMC, vCL;
        String vIMCReduzido;
     vpeso = Float.parseFloat(peso.getText());
     valtura = Float.parseFloat(altura.getText());


        vIMC = vpeso / (valtura * valtura);// TODO add your handling code here:

        DecimalFormat df = new DecimalFormat("0.00");
        
        vIMCReduzido = df.format(vIMC);
        
        
        IMC.setText(vIMCReduzido);

        if (vIMC < 18.5) {
            Cl.setText("Você abaixo do peso");
            //Cl.setEditable(false);
        }else if (vIMC >= 18.5 && vIMC < 24.9){
            Cl.setText("Peso normal");
        } else if (vIMC >=25.0 && vIMC <=29.9){
            Cl.setText("Sobrepeso");
        } else if (vIMC >29.9){
            Cl.setText("Obesidade");
        }
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
            java.util.logging.Logger.getLogger(ImcPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImcPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImcPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImcPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImcPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cl;
    private javax.swing.JLabel IMC;
    private javax.swing.JTextField altura;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField peso;
    // End of variables declaration//GEN-END:variables
}

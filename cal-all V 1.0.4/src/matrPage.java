
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Luis
 */
public class matrPage extends javax.swing.JFrame {

    /**
     * Creates new form matrPage
     */
    public matrPage() {
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

        x1v = new javax.swing.JTextField();
        y1v = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        x2v = new javax.swing.JTextField();
        y2v = new javax.swing.JTextField();
        R = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        z1v = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        z2v = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        x3v = new javax.swing.JTextField();
        y3v = new javax.swing.JTextField();
        plus1 = new javax.swing.JLabel();
        z3v = new javax.swing.JTextField();
        plus2 = new javax.swing.JLabel();
        jbox = new javax.swing.JComboBox<>();
        btnexp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        x1v.setBackground(new java.awt.Color(0, 153, 51));
        x1v.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        x1v.setForeground(new java.awt.Color(255, 255, 255));
        x1v.setText("X");
        getContentPane().add(x1v);
        x1v.setBounds(50, 70, 40, 30);

        y1v.setBackground(new java.awt.Color(0, 153, 51));
        y1v.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        y1v.setForeground(new java.awt.Color(255, 255, 255));
        y1v.setText("Y");
        getContentPane().add(y1v);
        y1v.setBounds(150, 70, 40, 30);

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("+");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 70, 50, 30);

        x2v.setBackground(new java.awt.Color(0, 153, 51));
        x2v.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        x2v.setForeground(new java.awt.Color(255, 255, 255));
        x2v.setText("X");
        getContentPane().add(x2v);
        x2v.setBounds(50, 130, 40, 30);

        y2v.setBackground(new java.awt.Color(0, 153, 51));
        y2v.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        y2v.setForeground(new java.awt.Color(255, 255, 255));
        y2v.setText("Y");
        getContentPane().add(y2v);
        y2v.setBounds(150, 130, 40, 30);

        R.setFont(new java.awt.Font("Leelawadee", 3, 24)); // NOI18N
        R.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(R);
        R.setBounds(0, 250, 300, 40);

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("+");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 130, 50, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setFont(new java.awt.Font("Leelawadee UI", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 255, 153));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 230, 100, 26);

        z1v.setBackground(new java.awt.Color(0, 153, 51));
        z1v.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        z1v.setForeground(new java.awt.Color(255, 255, 255));
        z1v.setText("Z");
        getContentPane().add(z1v);
        z1v.setBounds(240, 70, 40, 30);

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("+");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 70, 50, 30);

        z2v.setBackground(new java.awt.Color(0, 153, 51));
        z2v.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        z2v.setForeground(new java.awt.Color(255, 255, 255));
        z2v.setText("Z");
        getContentPane().add(z2v);
        z2v.setBounds(240, 130, 40, 30);

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("+");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 130, 50, 30);

        x3v.setBackground(new java.awt.Color(0, 153, 51));
        x3v.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        x3v.setForeground(new java.awt.Color(255, 255, 255));
        x3v.setText("X");
        getContentPane().add(x3v);
        x3v.setBounds(50, 190, 40, 30);

        y3v.setBackground(new java.awt.Color(0, 153, 51));
        y3v.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        y3v.setForeground(new java.awt.Color(255, 255, 255));
        y3v.setText("Y");
        getContentPane().add(y3v);
        y3v.setBounds(150, 190, 40, 30);

        plus1.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        plus1.setForeground(new java.awt.Color(0, 102, 0));
        plus1.setText("+");
        getContentPane().add(plus1);
        plus1.setBounds(110, 190, 50, 30);

        z3v.setBackground(new java.awt.Color(0, 153, 51));
        z3v.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        z3v.setForeground(new java.awt.Color(255, 255, 255));
        z3v.setText("Z");
        getContentPane().add(z3v);
        z3v.setBounds(240, 190, 40, 30);

        plus2.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        plus2.setForeground(new java.awt.Color(0, 102, 0));
        plus2.setText("+");
        getContentPane().add(plus2);
        plus2.setBounds(200, 190, 50, 30);

        jbox.setBackground(new java.awt.Color(0, 153, 51));
        jbox.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jbox.setForeground(new java.awt.Color(255, 255, 255));
        jbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3x3", "2x2" }));
        jbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxActionPerformed(evt);
            }
        });
        getContentPane().add(jbox);
        jbox.setBounds(160, 20, 70, 20);

        btnexp.setBackground(new java.awt.Color(0, 153, 51));
        btnexp.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        btnexp.setForeground(new java.awt.Color(153, 255, 153));
        btnexp.setText("explicação");
        btnexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexpActionPerformed(evt);
            }
        });
        getContentPane().add(btnexp);
        btnexp.setBounds(290, 260, 100, 26);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/imagens/page3.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 410, 320);

        setSize(new java.awt.Dimension(416, 329));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    double x1, x2, x3, y1, y2, y3, z1, z2, z3;
    String result, op;
    try{
    op = jbox.getSelectedItem().toString();
   if(op.equals("2x2")){
    x1 = Double.parseDouble(x1v.getText());
    x2 = Double.parseDouble(x2v.getText());
    y1 = Double.parseDouble(y1v.getText());
    y2 = Double.parseDouble(y2v.getText());
    result = mat2(x1, x2, y1, y2);
    R.setText(String.valueOf(result));
   }else{
    x1 = Double.parseDouble(x1v.getText());
    x2 = Double.parseDouble(x2v.getText());
    x3 = Double.parseDouble(x3v.getText());
    y1 = Double.parseDouble(y1v.getText());
    y2 = Double.parseDouble(y2v.getText());
    y3 = Double.parseDouble(y3v.getText());
    z1 = Double.parseDouble(z1v.getText());
    z2 = Double.parseDouble(z2v.getText());
    z3 = Double.parseDouble(z3v.getText());
    result = mat3(x1, x2, x3, y1, y2, y3, z1, z2, z3);
    R.setText(String.valueOf(result));
    
   }
    }catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "Digite apenas valores validos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxActionPerformed
       String op;
       op = jbox.getSelectedItem().toString();
       if(op.equals("3x3")){
          x3v.setVisible(true);
      y3v.setVisible(true);
      z1v.setVisible(true);
      z2v.setVisible(true);
      z3v.setVisible(true);
      plus1.setVisible(true);
      plus2.setVisible(true);
       }else{
      x3v.setVisible(false);
      y3v.setVisible(false);
      z1v.setVisible(false);
      z2v.setVisible(false);
      z3v.setVisible(false);
      plus1.setVisible(false);
      plus2.setVisible(false);
       }
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxActionPerformed

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
            java.util.logging.Logger.getLogger(matrPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(matrPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(matrPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(matrPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new matrPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel R;
    private javax.swing.JButton btnexp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jbox;
    private javax.swing.JLabel plus1;
    private javax.swing.JLabel plus2;
    private javax.swing.JTextField x1v;
    private javax.swing.JTextField x2v;
    private javax.swing.JTextField x3v;
    private javax.swing.JTextField y1v;
    private javax.swing.JTextField y2v;
    private javax.swing.JTextField y3v;
    private javax.swing.JTextField z1v;
    private javax.swing.JTextField z2v;
    private javax.swing.JTextField z3v;
    // End of variables declaration//GEN-END:variables

    private String mat2(double x1, double x2, double y1, double y2) {
        double D =  (x1 * y2) - (x2 * y1);
        

String msg = "Determinante: " + D;

return msg;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String mat3(double x1, double x2, double x3, double y1, double y2, double y3, double z1, double z2, double z3) {
        double D = ((x1 * y2 * z3) + (y1 * z2 * x3 ) + (z1 * x2 * y3)) - ((x3 * y2 * z1) + (y3 * z2 * x1) + (z3 * x2 * y1)) ;
 String msg = "Determinante: " + D;
 return msg;
    }
}


import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author luis.hrevangelista
 */
public class Tpage extends javax.swing.JFrame {

    /**
     * Creates new form Tpage
     */
    public Tpage() {
        initComponents();
        labella.setVisible(false);
            lado.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form = new javax.swing.JComboBox<>();
        basev = new javax.swing.JTextField();
        alturav = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        R = new javax.swing.JLabel();
        labelh = new javax.swing.JLabel();
        labelb = new javax.swing.JLabel();
        lado = new javax.swing.JTextField();
        labella = new javax.swing.JLabel();
        btnexp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        form.setBackground(new java.awt.Color(0, 153, 51));
        form.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        form.setForeground(new java.awt.Color(153, 255, 153));
        form.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "área", "perimetro", "volume" }));
        form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formActionPerformed(evt);
            }
        });
        getContentPane().add(form);
        form.setBounds(140, 30, 91, 20);

        basev.setBackground(new java.awt.Color(0, 153, 51));
        basev.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        basev.setForeground(new java.awt.Color(153, 255, 153));
        basev.setText("0");
        basev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basevActionPerformed(evt);
            }
        });
        getContentPane().add(basev);
        basev.setBounds(140, 120, 60, 30);

        alturav.setBackground(new java.awt.Color(0, 153, 51));
        alturav.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        alturav.setForeground(new java.awt.Color(153, 255, 153));
        alturav.setText("0");
        alturav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturavActionPerformed(evt);
            }
        });
        getContentPane().add(alturav);
        alturav.setBounds(140, 170, 60, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 255, 153));
        jButton1.setText("calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 170, 75, 23);

        R.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        R.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(R);
        R.setBounds(0, 250, 400, 40);

        labelh.setFont(new java.awt.Font("Leelawadee UI", 3, 12)); // NOI18N
        labelh.setForeground(new java.awt.Color(0, 102, 0));
        labelh.setText("Tamanho da altura");
        getContentPane().add(labelh);
        labelh.setBounds(10, 180, 140, 16);

        labelb.setFont(new java.awt.Font("Leelawadee UI", 3, 12)); // NOI18N
        labelb.setForeground(new java.awt.Color(0, 102, 0));
        labelb.setText("tamanho da base");
        getContentPane().add(labelb);
        labelb.setBounds(20, 130, 100, 16);

        lado.setBackground(new java.awt.Color(0, 153, 51));
        lado.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        lado.setForeground(new java.awt.Color(153, 255, 153));
        lado.setText("0");
        lado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ladoActionPerformed(evt);
            }
        });
        getContentPane().add(lado);
        lado.setBounds(140, 210, 60, 30);

        labella.setFont(new java.awt.Font("Leelawadee UI", 3, 12)); // NOI18N
        labella.setForeground(new java.awt.Color(0, 102, 0));
        labella.setText("tamanho dos lados");
        getContentPane().add(labella);
        labella.setBounds(10, 220, 140, 16);

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
        btnexp.setBounds(238, 200, 88, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis\\Downloads\\menupage.png")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-10, 0, 410, 320);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formActionPerformed
        String op;

        op = form.getSelectedItem().toString();
        if (op.equals("área")){
            labelb.setVisible(true);
            basev.setVisible(true);
            labella.setVisible(false);
            lado.setVisible(false);
            alturav.setVisible(true);
            labelh.setVisible(true);
        }else if(op.equals("volume")){
            labelb.setVisible(false);
            basev.setVisible(false);
            alturav.setVisible(true);
            labelh.setVisible(true);
            labella.setVisible(true);
            lado.setVisible(true);
        }else{
           labelb.setVisible(true);
            basev.setVisible(true);
            alturav.setVisible(true);
            labelh.setVisible(true);
            labella.setVisible(true);
            lado.setVisible(true);
        }// TODO add your handling code here:
    }//GEN-LAST:event_formActionPerformed

    private void basevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_basevActionPerformed

    private void alturavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturavActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturavActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String op, msg, areac;
        double  b, h, l, ab, area,  vol, peri;
        //arestav.setText("0");
        b = Double.parseDouble(basev.getText());
        h = Double.parseDouble(alturav.getText());
        DecimalFormat df = new DecimalFormat("0.00");
        op = form.getSelectedItem().toString();
        if(op.equals("área")){
            area = (b*h)/2;
            areac = df.format(area);
            msg = "A área do triângulo é " +  areac + "cm²";
            R.setText(String.valueOf(msg));
        }else if(op.equals("perimetro")){
            l = Integer.parseInt(lado.getText());
            peri = l*3;
            msg = "O perimetro do triângulo é " + peri + "cm";
            R.setText(String.valueOf(msg));
        } else if(op.equals("volume")){
            l = Integer.parseInt(lado.getText());
            ab = l*l;
            vol =  (ab*h)/3;
            msg = "O volume da piramide é " + vol + "cm³";
            R.setText(String.valueOf(msg));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ladoActionPerformed

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
            java.util.logging.Logger.getLogger(Tpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel R;
    private javax.swing.JTextField alturav;
    private javax.swing.JTextField basev;
    private javax.swing.JButton btnexp;
    private javax.swing.JComboBox<String> form;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelb;
    private javax.swing.JLabel labelh;
    private javax.swing.JLabel labella;
    private javax.swing.JTextField lado;
    // End of variables declaration//GEN-END:variables
}

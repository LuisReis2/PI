/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author luis.hrevangelista
 */
public class Rpage extends javax.swing.JFrame {

    /**
     * Creates new form Rpage
     */
    public Rpage() {
        initComponents();
        labelb.setVisible(true);
            basev.setVisible(true);
            alturav.setVisible(true);
            labelh.setVisible(true);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        form.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "área", "perimetro", "volume" }));
        form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formActionPerformed(evt);
            }
        });
        getContentPane().add(form);
        form.setBounds(140, 30, 73, 20);

        basev.setText("0");
        basev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basevActionPerformed(evt);
            }
        });
        getContentPane().add(basev);
        basev.setBounds(140, 120, 60, 30);

        alturav.setText("0");
        alturav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturavActionPerformed(evt);
            }
        });
        getContentPane().add(alturav);
        alturav.setBounds(140, 170, 60, 30);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 230, 73, 25);

        R.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(R);
        R.setBounds(20, 240, 340, 40);

        labelh.setText("Tamanho da altura");
        getContentPane().add(labelh);
        labelh.setBounds(10, 180, 140, 15);

        labelb.setText("tamanho da base");
        getContentPane().add(labelb);
        labelb.setBounds(20, 130, 100, 15);

        lado.setText("0");
        lado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ladoActionPerformed(evt);
            }
        });
        getContentPane().add(lado);
        lado.setBounds(140, 210, 60, 30);

        labella.setText("tamanho dos lados");
        getContentPane().add(labella);
        labella.setBounds(10, 220, 140, 15);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formActionPerformed
        String op;

        op = form.getSelectedItem().toString();
        if (op.equals("volume")){
            labelb.setVisible(true);
            basev.setVisible(true);
            labella.setVisible(true);
            lado.setVisible(true);
            alturav.setVisible(true);
            labelh.setVisible(true);
        }else{
            labelb.setVisible(true);
            basev.setVisible(true);
            alturav.setVisible(true);
            labelh.setVisible(true);
            labella.setVisible(false);
            lado.setVisible(false);
        }            // TODO add your handling code here:
    }//GEN-LAST:event_formActionPerformed

    private void basevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_basevActionPerformed

    private void alturavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturavActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturavActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String op, msg;
        int  b, h, l,area,  vol, peri;
        //arestav.setText("0");
        b = Integer.parseInt(basev.getText());
        h = Integer.parseInt(alturav.getText());
        
        op = form.getSelectedItem().toString();
        if(op.equals("área")){
            area = b*h;
            msg = "A área do retângulo é " +  area + "cm²";
            R.setText(String.valueOf(msg));
        }else if(op.equals("perimetro")){
            peri = (b+b)+(h+h);
            msg = "O perimetro do retângulo é " + peri + "cm";
            R.setText(String.valueOf(msg));
        } else if(op.equals("volume")){
            l = Integer.parseInt(lado.getText());
            vol =  h*b*l;
            msg = "O volume do paralelepipedo é " + vol + "cm³";
            R.setText(String.valueOf(msg));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ladoActionPerformed

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
            java.util.logging.Logger.getLogger(Rpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel R;
    private javax.swing.JTextField alturav;
    private javax.swing.JTextField basev;
    private javax.swing.JComboBox<String> form;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelb;
    private javax.swing.JLabel labelh;
    private javax.swing.JLabel labella;
    private javax.swing.JTextField lado;
    // End of variables declaration//GEN-END:variables
}

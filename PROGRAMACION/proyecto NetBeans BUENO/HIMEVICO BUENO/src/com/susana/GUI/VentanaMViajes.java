/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.susana.GUI;

/**
 *
 * @author acer
 */
public class VentanaMViajes extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMViajes
     */
    public VentanaMViajes() {
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
        jRSi = new javax.swing.JRadioButton();
        jRNo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("¿Quiere añadir otro viaje?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 93, 138, 55));

        jRSi.setText("Si");
        jRSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRSiActionPerformed(evt);
            }
        });
        getContentPane().add(jRSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 93, -1, -1));

        jRNo.setText("No");
        jRNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRNoActionPerformed(evt);
            }
        });
        getContentPane().add(jRNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRSiActionPerformed
      //decidir esta opción o mensaje que invite a añadir más viajes (reutilizando el numparte)
        
        if (jRSi.isSelected()){
            
        
        }
    }//GEN-LAST:event_jRSiActionPerformed

    private void jRNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRNoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMViajes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRNo;
    private javax.swing.JRadioButton jRSi;
    // End of variables declaration//GEN-END:variables
}

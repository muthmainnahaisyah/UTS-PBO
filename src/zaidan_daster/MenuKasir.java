package zaidan_daster;

public class MenuKasir extends javax.swing.JFrame {

    public MenuKasir() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tombol_pelanggan = new javax.swing.JButton();
        tombol_transaksi = new javax.swing.JButton();
        tombol_logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tombol_pelanggan.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        tombol_pelanggan.setText("PELANGGAN");
        tombol_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_pelangganActionPerformed(evt);
            }
        });
        getContentPane().add(tombol_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 100, -1));

        tombol_transaksi.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        tombol_transaksi.setText("TRANSAKSI");
        tombol_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(tombol_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 90, -1));

        tombol_logout.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        tombol_logout.setText("LOGOUT");
        tombol_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(tombol_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Menu_Kasir.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tombol_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_logoutActionPerformed
        // TODO add your handling code here:
        MenuLogin ml = new MenuLogin();
        ml.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombol_logoutActionPerformed

    private void tombol_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_transaksiActionPerformed
        // TODO add your handling code here:
        MenuTransaksi mt = new MenuTransaksi();
        mt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombol_transaksiActionPerformed

    private void tombol_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_pelangganActionPerformed
        // TODO add your handling code here:
        MenuPelanggan mp = new MenuPelanggan();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombol_pelangganActionPerformed

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
            java.util.logging.Logger.getLogger(MenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton tombol_logout;
    private javax.swing.JButton tombol_pelanggan;
    private javax.swing.JButton tombol_transaksi;
    // End of variables declaration//GEN-END:variables
}

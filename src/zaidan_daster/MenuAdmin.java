package zaidan_daster;

public class MenuAdmin extends javax.swing.JFrame {

    public MenuAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tombol_produk = new javax.swing.JButton();
        tombol_user = new javax.swing.JButton();
        tombol_logout = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tombol_produk.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        tombol_produk.setText("PRODUK");
        tombol_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_produkActionPerformed(evt);
            }
        });
        getContentPane().add(tombol_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 90, -1));

        tombol_user.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        tombol_user.setText("USER");
        tombol_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_userActionPerformed(evt);
            }
        });
        getContentPane().add(tombol_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 100, -1));

        tombol_logout.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        tombol_logout.setText("LOGOUT");
        tombol_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(tombol_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 90, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Menu_Admin.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tombol_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_userActionPerformed
        // TODO add your handling code here:
        MenuUser mu = new MenuUser();
        mu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombol_userActionPerformed

    private void tombol_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_produkActionPerformed
        // TODO add your handling code here:
        MenuProduk mp = new MenuProduk();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombol_produkActionPerformed

    private void tombol_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_logoutActionPerformed
        // TODO add your handling code here:
        MenuLogin ml = new MenuLogin();
        ml.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombol_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton tombol_logout;
    private javax.swing.JButton tombol_produk;
    private javax.swing.JButton tombol_user;
    // End of variables declaration//GEN-END:variables
}

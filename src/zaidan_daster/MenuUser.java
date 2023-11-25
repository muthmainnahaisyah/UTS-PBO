package zaidan_daster;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuUser extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    public MenuUser() {
        initComponents();
        k.connect();
        refreshTable();
    }
    
    public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("id_user");
        model.addColumn("nama_user");
        model.addColumn("username");
        model.addColumn("password");
        model.addColumn("role");
        tabel_user.setModel(model);
        
        try{
            this.stat = k.getCon().prepareStatement("SELECT * FROM user");
            this.rs = stat.executeQuery();
            while(rs.next()){
                Object[] data = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                };
                model.addRow(data);
            }                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        txt_id.setText("");
        txt_nama.setText("");
        txt_username.setText("");
        txt_password.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teks_judul = new javax.swing.JLabel();
        tombol_create = new javax.swing.JButton();
        tombol_update = new javax.swing.JButton();
        tombol_delete = new javax.swing.JButton();
        tombol_view = new javax.swing.JButton();
        tombol_exit = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        nama = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        role = new javax.swing.JLabel();
        role_box = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_user = new javax.swing.JTable();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        teks_judul.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        teks_judul.setForeground(new java.awt.Color(255, 255, 255));
        teks_judul.setText(" USER");
        getContentPane().add(teks_judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 60, 30));

        tombol_create.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        tombol_create.setText("CREATE");
        tombol_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_createActionPerformed(evt);
            }
        });
        getContentPane().add(tombol_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, -1));

        tombol_update.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        tombol_update.setText("UPDATE");
        tombol_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_updateActionPerformed(evt);
            }
        });
        getContentPane().add(tombol_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, -1));

        tombol_delete.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        tombol_delete.setText("DELETE");
        tombol_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(tombol_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, -1));

        tombol_view.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        tombol_view.setText("VIEW");
        tombol_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_viewActionPerformed(evt);
            }
        });
        getContentPane().add(tombol_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, -1));

        tombol_exit.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        tombol_exit.setText("EXIT");
        tombol_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_exitActionPerformed(evt);
            }
        });
        getContentPane().add(tombol_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 50, -1));

        user.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        user.setText("ID USER");
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, 30));

        txt_id.setEnabled(false);
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 140, 30));

        nama.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        nama.setText("NAMA");
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, 30));

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 140, 30));

        username.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        username.setText("USERNAME");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, 30));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 140, 30));

        password.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        password.setText("PASSWORD");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, 30));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 130, 30));

        role.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        role.setText("ROLE");
        getContentPane().add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, 30));

        role_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "kasir" }));
        role_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                role_boxActionPerformed(evt);
            }
        });
        getContentPane().add(role_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 130, 30));

        tabel_user.setBackground(new java.awt.Color(102, 0, 0));
        tabel_user.setForeground(new java.awt.Color(255, 255, 255));
        tabel_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_user);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 460, 130));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Menu.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tombol_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_createActionPerformed
        // TODO add your handling code here:
        try{
            this.stat = k.getCon().prepareStatement("INSERT INTO user VALUES (?, ?, ?, ?, ?)");
            stat.setInt(1, 0);
            stat.setString(2, txt_nama.getText());
            stat.setString(3, txt_username.getText());
            stat.setString(4, txt_password.getText());
            stat.setString(5, role_box.getSelectedItem().toString());
            stat.executeUpdate();
            refreshTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tombol_createActionPerformed

    private void tombol_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_updateActionPerformed
        // TODO add your handling code here:
        try{
            this.stat = k.getCon().prepareStatement("UPDATE user set nama_user=?, username=?, password=?, role=? WHERE id_user=?");
            stat.setString(1, txt_nama.getText());
            stat.setString(2, txt_username.getText());
            stat.setString(3, txt_password.getText());
            stat.setString(4, role_box.getSelectedItem().toString());
            stat.setString(5, txt_id.getText());
            stat.executeUpdate();
            refreshTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tombol_updateActionPerformed

    private void tombol_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_deleteActionPerformed
        // TODO add your handling code here:
        try{
            this.stat = k.getCon().prepareStatement("DELETE FROM user WHERE id_user=?");
            stat.setString(1, txt_id.getText());
            stat.executeUpdate();
            refreshTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tombol_deleteActionPerformed

    private void tombol_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_exitActionPerformed
        // TODO add your handling code here:
        MenuAdmin ma = new MenuAdmin();
        ma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombol_exitActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void role_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_role_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_role_boxActionPerformed

    private void tabel_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_userMouseClicked
        // TODO add your handling code here:
        txt_id.setText(model.getValueAt(tabel_user.getSelectedRow(), 0).toString());
        txt_nama.setText(model.getValueAt(tabel_user.getSelectedRow(), 1).toString());
        txt_username.setText(model.getValueAt(tabel_user.getSelectedRow(), 2).toString());
        txt_password.setText(model.getValueAt(tabel_user.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tabel_userMouseClicked

    private void tombol_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_viewActionPerformed
        // TODO add your handling code here:
        DataUser du = new DataUser();
        du.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombol_viewActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel password;
    private javax.swing.JLabel role;
    private javax.swing.JComboBox<String> role_box;
    private javax.swing.JTable tabel_user;
    private javax.swing.JLabel teks_judul;
    private javax.swing.JButton tombol_create;
    private javax.swing.JButton tombol_delete;
    private javax.swing.JButton tombol_exit;
    private javax.swing.JButton tombol_update;
    private javax.swing.JButton tombol_view;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    private javax.swing.JLabel user;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}

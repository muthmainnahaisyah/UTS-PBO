package zaidan_daster;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuProduk extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    public MenuProduk() {
        initComponents();
        k.connect();
        refreshTable();
        refreshUserBox();
    }
    
    public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("id_produk");
        model.addColumn("nama_produk");
        model.addColumn("jenis");
        model.addColumn("harga");
        model.addColumn("ukuran");
        model.addColumn("id_user");
        tabel_produk.setModel(model);
        
        try{
            this.stat = k.getCon().prepareStatement("SELECT * FROM produk");
            this.rs = stat.executeQuery();
            while(rs.next()){
                Object[] data = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)
                };
                model.addRow(data);
            }                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        txt_id.setText("");
        txt_nama.setText("");
        txt_harga.setText("");
    }
    
    public void refreshUserBox(){
        try{
            this.stat = k.getCon().prepareStatement("SELECT * FROM user WHERE role = 'admin'");
            this.rs = this.stat.executeQuery();
            while(rs.next()){
                user_box.addItem(rs.getString("id_user"));
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        teks_judul = new javax.swing.JLabel();
        tombol_create = new javax.swing.JButton();
        tombol_update = new javax.swing.JButton();
        tombol_delete = new javax.swing.JButton();
        tombol_view = new javax.swing.JButton();
        tombol_exit = new javax.swing.JButton();
        produk = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        nama = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        user = new javax.swing.JLabel();
        user_box = new javax.swing.JComboBox<>();
        harga = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        jenis = new javax.swing.JLabel();
        jenis_box = new javax.swing.JComboBox<>();
        ukuran = new javax.swing.JLabel();
        ukuran_box = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_produk = new javax.swing.JTable();
        background = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        teks_judul.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        teks_judul.setForeground(new java.awt.Color(255, 255, 255));
        teks_judul.setText("PRODUK");
        getContentPane().add(teks_judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, 30));

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

        produk.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        produk.setText("ID PRODUK");
        getContentPane().add(produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, 30));

        txt_id.setEnabled(false);
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 150, 30));

        nama.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        nama.setText("NAMA");
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, 30));

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 150, 30));

        user.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        user.setText("ID USER");
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, 30));

        user_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_boxActionPerformed(evt);
            }
        });
        getContentPane().add(user_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 140, 30));

        harga.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        harga.setText("HARGA");
        getContentPane().add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, 30));

        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 140, 30));

        jenis.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jenis.setText("JENIS");
        getContentPane().add(jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, 30));

        jenis_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "daster payung", "daster panjang", "daster anak", "setelan dewasa", "setelan anak" }));
        jenis_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenis_boxActionPerformed(evt);
            }
        });
        getContentPane().add(jenis_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 150, 30));

        ukuran.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        ukuran.setText("UKURAN");
        getContentPane().add(ukuran, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, 30));

        ukuran_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all size", "big size", "s", "m", "l", "xl", "xxl" }));
        ukuran_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukuran_boxActionPerformed(evt);
            }
        });
        getContentPane().add(ukuran_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 140, 30));

        tabel_produk.setBackground(new java.awt.Color(102, 0, 0));
        tabel_produk.setForeground(new java.awt.Color(255, 255, 255));
        tabel_produk.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_produkMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_produk);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 460, 140));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Menu.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tombol_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_exitActionPerformed
        // TODO add your handling code here:
        MenuAdmin ma = new MenuAdmin();
        ma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombol_exitActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void jenis_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenis_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenis_boxActionPerformed

    private void user_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_boxActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void ukuran_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukuran_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ukuran_boxActionPerformed

    private void tombol_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_createActionPerformed
        // TODO add your handling code here:
        try{
            this.stat = k.getCon().prepareStatement("INSERT INTO produk VALUES (?, ?, ?, ?, ?, ?)");
            stat.setInt(1, 000);
            stat.setString(2, txt_nama.getText());
            stat.setString(3, jenis_box.getSelectedItem().toString());
            stat.setString(4, txt_harga.getText());
            stat.setString(5, ukuran_box.getSelectedItem().toString());
            stat.setString(6, user_box.getSelectedItem().toString());
            stat.executeUpdate();
            refreshTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tombol_createActionPerformed

    private void tombol_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_updateActionPerformed
        // TODO add your handling code here:
        try{
            stat = k.getCon().prepareStatement("UPDATE produk SET nama_produk=?, jenis=?, harga=?, ukuran=?, id_user=? WHERE id_produk=?");
            stat.setString(1, txt_nama.getText());
            stat.setString(2, jenis_box.getSelectedItem().toString());
            stat.setString(3, txt_harga.getText());
            stat.setString(4, ukuran_box.getSelectedItem().toString());
            stat.setString(5, user_box.getSelectedItem().toString());
            stat.setString(6, txt_id.getText());
            stat.executeUpdate();
            refreshTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tombol_updateActionPerformed

    private void tombol_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_deleteActionPerformed
        // TODO add your handling code here:
        try{
            stat = k.getCon().prepareStatement("DELETE FROM produk WHERE id_produk=?");
            stat.setString(1, txt_id.getText());
            stat.executeUpdate();
            refreshTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tombol_deleteActionPerformed

    private void tabel_produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_produkMouseClicked
        // TODO add your handling code here:
        txt_id.setText(model.getValueAt(tabel_produk.getSelectedRow(), 0).toString());
        txt_nama.setText(model.getValueAt(tabel_produk.getSelectedRow(), 1).toString());
        txt_harga.setText(model.getValueAt(tabel_produk.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tabel_produkMouseClicked

    private void tombol_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_viewActionPerformed
        // TODO add your handling code here:
        DataProduk dp = new DataProduk();
        dp.setVisible(true);
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
            java.util.logging.Logger.getLogger(MenuProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuProduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel harga;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel jenis;
    private javax.swing.JComboBox<String> jenis_box;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel produk;
    private javax.swing.JTable tabel_produk;
    private javax.swing.JLabel teks_judul;
    private javax.swing.JButton tombol_create;
    private javax.swing.JButton tombol_delete;
    private javax.swing.JButton tombol_exit;
    private javax.swing.JButton tombol_update;
    private javax.swing.JButton tombol_view;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JLabel ukuran;
    private javax.swing.JComboBox<String> ukuran_box;
    private javax.swing.JLabel user;
    private javax.swing.JComboBox<String> user_box;
    // End of variables declaration//GEN-END:variables
}
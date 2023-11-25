package zaidan_daster;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    private String url = "jdbc:mysql://localhost/zaidandaster";
    private String username = "root";
    private String password = "";
    private Connection con;
    
    public void connect(){
        try{
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi Berhasil");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public Connection getCon(){
        return con;
    }
}

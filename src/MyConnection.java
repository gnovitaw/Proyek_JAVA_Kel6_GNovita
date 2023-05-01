
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucyr
 */
public class MyConnection {
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datatoko", "root", "");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
           // JOptionPane.showMessageDialog(null, "tes");
        }
        
        return con;
    }
}

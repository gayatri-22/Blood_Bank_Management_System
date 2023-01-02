/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author gayatri
 */
public class ConnectionProvider {
        public static Connection getCon() { 
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank","root","Gayatri@22");
                return con;
            }
            
                catch (Exception e) {
                    throw new RuntimeException("unhandled", e);
                }       
      
        
    }
}


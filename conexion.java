/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviciosytitulacion;

/**
 *
 * @author 52434
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
public class conexion {
    
    Connection cn;
    public Connection conectar(){
        String host ="jdbc:mysql://190.1.0.131";
        String user = "22progb31";
        String pass = "user31";
        String bd = "22progb31";
        
        try{
            cn=DriverManager.getConnection(host+bd, user, pass);
            JOptionPane.showMessageDialog(null, "conexion exitosa");
            System.out.println("conexion exitosa");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR!!"+ex.getMessage());
            System.out.println(ex.getCause()+"ERROR!!");
        }
        
        return cn;
    }
    
}

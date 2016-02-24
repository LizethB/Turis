/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

/**
 *
 * @author NAYO
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    static Connection cn=null;
    public static Connection Conexi(Connection cn) throws SQLException{
        String ruta="turismo.sqlite";
        try{
         Class.forName("org.sqlite.JDBC");  
         cn=DriverManager.getConnection("jdbc:sqlite:"+ruta);
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    return cn;
    }
    
}

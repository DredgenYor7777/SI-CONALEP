
package com.si.baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String USUARIO = "root";
    private static final String PASSWORD = "guardian117";
    private static final String BD = "biblioNet";
    private static final String url = "jdbc:mysql://localhost:3306/" +BD+"?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true"; //host de la bse de datos 
    
    public static Connection conexion;
    //declaracion de metodos y funciones
    
    public static Connection iniciar() throws SQLException {
        Conexion.conexion = null;
        
        try{
            //indicar que existe un conector para una base de datos
            Class.forName("com.mysql.jdbc.Driver");
            Conexion.conexion=(Connection)DriverManager.getConnection(
                    Conexion.url,
                    Conexion.USUARIO,
                    Conexion.PASSWORD
                    
            
            );
            //JOptionPane.showMessageDialog(null, "Conexion ala BD exitosa");
            
            
        }catch(ClassNotFoundException | SQLException e){
            
       
            //System.out.println("Error de conexion: "+e.getMessage());
        }
        
         return Conexion.conexion;
   
    
}//cierra metodo iniciar
  
    
}

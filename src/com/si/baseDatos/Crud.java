/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.si.baseDatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author berny
 */
public class Crud {
    
    PreparedStatement pst;
    Statement st;
    int filaAefctada;

    
    public Crud(){
        
        this.st = null;
        this.filaAefctada = 0;
    }
    
    public boolean insertar(String sql){  
        
        try{
            this.pst = (PreparedStatement) Conexion.conexion.prepareStatement(sql,
                        Statement.RETURN_GENERATED_KEYS);
            this.filaAefctada = pst.executeUpdate();  //este metodo devuelve el numero de filas afectadas
            System.out.println("Insertando correctamente...");
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar: " +ex.getMessage());
            return false;
        }
    }//cierra llave insertar
    
    //metodo seleccionar 
    
     public ResultSet seleccionar (String sql){
        
        try {
            //preparando la conexion
            this.st = Conexion.conexion.createStatement();
            //ejecutamos el sql y obtenemos resultados
            return this.st.executeQuery(sql);
            
        } catch (SQLException | ClassCastException e) {
            
            System.err.println("Error al seleccionar: " +e.getMessage());
            return null;
        }
    }//cierra metodo seleccionar
    
    
 public boolean actualizarEliminar(String sql)   {   //metodo que permite actualizar y eliminar 
     
     try {
         this.st = Conexion.conexion.createStatement();
         this.st.executeUpdate(sql);
         return true;
     } catch (SQLException | ClassCastException e) {
         
         System.err.println("Error al realizar la accion: "+e.getMessage());
         return false;
     }
 }//cierra metodo 

    
}

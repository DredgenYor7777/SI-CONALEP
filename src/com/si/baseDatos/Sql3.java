
package com.si.baseDatos;

import com.si.inventario.InventarioLibros;

public class Sql3 {
    
    public static String insertarInventario(InventarioLibros inventario){ //Devuelve la sentencia SQL para insertar en entidad alumno
       
       return "INSERT INTO inventario  VALUES (NULL, ' "
               +",' "+inventario.getStock()     +" ', ' "
               +inventario.getCantDisponible()  +" ', ' "
               +inventario.getEstado()+"',";
   }
   
   public static String seleccionarInventario(){  //metodo para seleccionar un registro
       return "SELECT * FROM inventario";
   }
   
   public static String eliminarInventario(int id){  //metodo para eliminar un registro
      return "DELETE FROM inventario WHERE id_inventario = " +id;
   }
   
   public static String selectInventario(int id){
         return "SELECT * FROM inventario WHERE id_inventario="+id;
   }
   
   public static String actualizarinventario(InventarioLibros inventario){
       
       return "UPDATE inventario SET id_inventario= ' "
               +",' "+inventario.getStock()     +" ', ' "
               +inventario.getCantDisponible()  +" ', ' "
               +inventario.getEstado()+"',"+
               " ' WHERE id_inventario=" +inventario.getId_inventario();
   }
    
}

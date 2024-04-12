
package com.si.baseDatos;

import com.si.inventario.InventarioLibros;
import com.si.inventario.Libro;

public class Sql4 {
    
    public static String insertarLibro(Libro libro){ //Devuelve la sentencia SQL para insertar en entidad alumno
       
       return "INSERT INTO libro  VALUES (NULL, ' "
               +",' "+libro.getNombreLibro()     +" ', ' "
               +libro.getCategoriaLibro()  +" ', ' "
               +libro.getAutor()  +" ', ' "
               +libro.getEditorial()  +" ', ' "
               +libro.getAutor()  +" ', ' "
               +libro.getNumPagina()  +" ', ' "
               +libro.getCantidad()+"',";
   }
   
   public static String seleccionarLibro(){  //metodo para seleccionar un registro
       return "SELECT * FROM libro";
   }
   
   public static String eliminarLibro(int id){  //metodo para eliminar un registro
      return "DELETE FROM libro WHERE id_libro = " +id;
   }
   
   public static String selectLibro(int id){
         return "SELECT * FROM libro WHERE id_libro="+id;
   }
   
   public static String actualizarLibro(Libro libro){
       
       return "UPDATE libro SET id_libro= ' "
               +",' "+libro.getNombreLibro() +" ', ' "
               +libro.getCategoriaLibro()  +" ', ' "
               +libro.getAutor()  +" ', ' "
               +libro.getEditorial()  +" ', ' "
               +libro.getAutor()  +" ', ' "
               +libro.getNumPagina()  +" ', ' "
               +libro.getCantidad()+"'," +
               " ' WHERE id_libro=" +libro.getId_libro();
   }
    
}

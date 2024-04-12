
package com.si.baseDatos;

import com.si.usuario.Alumno;

public class Sql2 {
    
    public static String insertarAlumno(Alumno alumno){ //Devuelve la sentencia SQL para insertar en entidad alumno
       
       return "INSERT INTO alumnos  VALUES (NULL, ' "
               +",' "+alumno.getNombre()     +" ', ' "
               +alumno.getApellido()  +" ', ' "
               +alumno.getDireccion()+"',"
               +alumno.getTelefono()   +")"    
               +alumno.getEdad()       +",";
   }
   
   public static String seleccionarAlumnos(){  //metodo para seleccionar un registro
       return "SELECT * FROM alumno";
   }
   
   public static String eliminarAlumno(int id){  //metodo para eliminar un registro
      return "DELETE FROM alumno WHERE id_alumno = " +id;
   }
   
   public static String selectAlumno(int id){
         return "SELECT * FROM alumno WHERE id_alumno="+id;
   }
   
   public static String actualizarAlumno(Alumno alumno){
       
       return "UPDATE alumno SET id_alumno= ' "
               +",' "+alumno.getNombre()     +" ', ' "
               +alumno.getApellido()  +" ', ' "
               +alumno.getDireccion()+"',"
               +alumno.getTelefono()   +")"    
               +alumno.getEdad()       +","+
               " ' WHERE id_alumno=" +alumno.getId_alumno();
               
       
   }
    
}

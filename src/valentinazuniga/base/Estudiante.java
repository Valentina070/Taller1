/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valentinazuniga.base;

/**
 *
 * @author zunig
 */
public class Estudiante {
     String nombre;
    String edad;
    String curso;
    
    //Constructor por defecto
    public Estudiante(){
    this.nombre = "Desconocido";
    this.edad = "Edad desconocida";
    this.curso = "Curso desconocido";
    }
    //Constructor por parametro para edad y nombre
     public Estudiante(String nombre,String edad){
         this.nombre=nombre;
         this.edad=edad;
         this.curso="Desconocido";
        } 
    //Constructor para todos los parametros
     public Estudiante(String nombre,String edad, String curso){
         this.nombre=nombre;
         this.edad=edad;
         this.curso= curso;
     }
    @Override
    public String toString() {
        return "Estudiante: " + nombre + ", Edad: " + edad + ", Curso: " + curso;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valentinazuniga.base;

/**
 *
 * @author zunig
 */
public class Libro {
     String titulo;
    String autor;
    int numeroPaginas;
    
    //Constructor por defecto

    public Libro(){
    this.titulo = "Desconocido";
    this.autor = "autor desconocida";
    this.numeroPaginas =0;
    }
    //Constructor por parametro
     public Libro(String titulo,String autor,int numeroPaginas){
         this.titulo=titulo;
         this.autor=autor;
         this.numeroPaginas=numeroPaginas;
        } 
    @Override
    public String toString() {
        return "Libro: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas;}
  }



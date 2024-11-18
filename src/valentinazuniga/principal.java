/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valentinazuniga;

import java.util.Scanner;
import valentinazuniga.base.CuentaBancaria;
import valentinazuniga.base.Libro;
import valentinazuniga.base.Estudiante;
/**
 *
 * @author zunig
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
         System.out.println("Libro");
         System.out.println("Escriba el titulo del libro:  ");
         String titulo = Entrada.nextLine();
         System.out.println("Escriba el autor:  ");
         String autor = Entrada.nextLine();
         System.out.println("Escriba el numero de paginas: ");
         int numeroPaginas = Entrada.nextInt();
         Entrada.nextLine();
        Libro libro = new Libro(titulo, autor, numeroPaginas);
        System.out.println(libro);
        
        System.out.println("\n CuentaBancaria");
         System.out.println("Escriba la cuenta bancaria:  ");
         int numeroCuenta = Entrada.nextInt();
         System.out.println("Escriba el saldo:  ");
         double saldo = Entrada.nextDouble();
         System.out.println("Escriba el tipo de cuenta ");
         String tipoCuenta = Entrada.nextLine();
         Entrada.nextLine();
        CuentaBancaria cuentabancaria = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
        System.out.println(cuentabancaria);
        
        System.out.println("\n Estudiante");
         System.out.println("Escriba el nombre:  ");
         String nombre = Entrada.nextLine();
         System.out.println("Escriba la edad:  ");
         String edad = Entrada.nextLine();
         System.out.println("Escriba el curso:  ");
         String curso = Entrada.nextLine();
         Entrada.nextLine();
        Estudiante estudiante = new Estudiante(nombre, edad, curso);
        System.out.println(estudiante);
    }
    
    }
    


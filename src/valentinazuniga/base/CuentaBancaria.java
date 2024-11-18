/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valentinazuniga.base;
/**
 *
 * @author zunig
 */
public class CuentaBancaria {
    int numeroCuenta;
    double saldo;
    String tipoCuenta;
 
  
    //Constructor por defecto
    public CuentaBancaria(){
    this.numeroCuenta = 0;
    this.saldo = 00000.0;
    this.tipoCuenta = "desconocido";
    }
    //Constructor por parametro para numeroCuenta y tipoCuenta
     public CuentaBancaria(int numeroCuenta,String tipoCuenta){
         this.numeroCuenta=numeroCuenta;
         this.saldo=0;
         this.tipoCuenta=tipoCuenta;
        } 
    //Constructor para todos los parametros
     public CuentaBancaria(int numeroCuenta,double saldo,String tipoCuenta){
         this.numeroCuenta=numeroCuenta;
         this.saldo=saldo;
         this.tipoCuenta=tipoCuenta;
     }
    @Override
    public String toString() {
        return "CuentaBancaria: " + numeroCuenta + ", Saldo: " + saldo + ", Tipo de cuenta: " + tipoCuenta;
    }
}

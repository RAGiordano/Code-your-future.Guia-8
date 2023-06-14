/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.ejercicio5;

/**
 *
 * @author Usuario
 */
public class MainEj5 {

    /**
     * @param args the command line arguments
     */
//        this.numeroCuenta = numeroCuenta;
//        this.dni = dni;
//        this.saldoActual = saldoActual;
//        this.interes = interes;
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        
        cuenta1.crearCuenta();
        System.out.println("Cuenta creada.");
        System.out.println("Saldo después de ingresar 100000");
        cuenta1.ingresar(100000);
        cuenta1.consultarSaldo();
        System.out.println("Saldo después de retirar 50000");
        cuenta1.retirar(50000);
        cuenta1.consultarSaldo();
        cuenta1.extraccionRapida();
        System.out.println("Saldo después de la extracción rápida:");
        cuenta1.consultarSaldo();
        System.out.println("Datos de la cuenta:");
        cuenta1.consultarDatos();
    }
    
}

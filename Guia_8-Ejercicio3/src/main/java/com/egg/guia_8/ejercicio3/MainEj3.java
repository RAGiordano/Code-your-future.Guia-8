/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.ejercicio3;

/**
 *
 * @author Usuario
 */
public class MainEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion op1 = new Operacion();
        
        op1.crearOperacion();
        System.out.println("Suma: " + op1.sumar());
        System.out.println("Resta: " + op1.restar());
        System.out.println("Multiplicación: " + op1.multiplicar());
        System.out.println("División: " + op1.dividir());
    }
    
}

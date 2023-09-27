/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_excepciones.ejercicio3;

import entities.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese dos números");
        String numStr1 = read.next();
        String numStr2 = read.next();
        
        int numInt1 = Integer.parseInt(numStr1);
        int numInt2 = Integer.parseInt(numStr2);
        
        double cociente = 0;
        
        try {
            cociente = DivisionNumero.dividir(numInt1, numInt2);
            System.out.println("El cociente de la división es: " + cociente);
        } catch (Exception e){
            System.out.println("Excepción con el siguiente mensaje: " + e.getMessage());
        }
        
        
        
        
        
    }
    
}

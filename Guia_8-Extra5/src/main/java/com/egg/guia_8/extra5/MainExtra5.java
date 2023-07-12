/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.extra5;

import Services.JavaService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaService javaS = new JavaService();
        String mes;
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        mes = read.next();
        while (!javaS.adivinar(mes)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            mes = read.next();
        }
        System.out.println("¡Adivinaste!");
        
    }
    
}

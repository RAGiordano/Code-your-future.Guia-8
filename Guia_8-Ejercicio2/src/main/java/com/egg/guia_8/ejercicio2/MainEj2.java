/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double radio;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia:");
        radio = leer.nextDouble();
        
        Circunferencia circunf1 = new Circunferencia(radio);
        
        System.out.println("Área de la circunferencia: " + circunf1.area());
        System.out.println("Perímetro de la circunferencia: " + circunf1.perimetro());
    }
    
}

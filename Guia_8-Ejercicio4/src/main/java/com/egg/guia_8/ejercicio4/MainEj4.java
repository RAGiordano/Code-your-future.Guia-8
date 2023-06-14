/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.ejercicio4;

/**
 *
 * @author Usuario
 */
public class MainEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo();
        
        rect1.crearRectangulo();
        System.out.println("La superficie del rectángulo es: " + rect1.calcularSuperficie());
        System.out.println("El perímetro del rectángulo es: " + rect1.calcularPerimetro());
        rect1.dibujarRectangulo();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Cafetera cafetera1 = new Cafetera(2000, 800);
        System.out.println("Capacidad: " + cafetera1.getCapacidadMaxima() + ". Cantidad actual: " + cafetera1.getCantidadActual());
        
        System.out.println("Llenado de cafetera");
        cafetera1.llenarCafetera();
        System.out.println("Capacidad: " + cafetera1.getCapacidadMaxima() + ". Cantidad actual: " + cafetera1.getCantidadActual());
        
        System.out.println("Servimos taza con 250 ml.");
        cafetera1.servirTaza(250);
        System.out.println("Capacidad: " + cafetera1.getCapacidadMaxima() + ". Cantidad actual: " + cafetera1.getCantidadActual());
        
        System.out.println("Servimos taza con 1000 ml.");
        cafetera1.servirTaza(1000);
        System.out.println("Capacidad: " + cafetera1.getCapacidadMaxima() + ". Cantidad actual: " + cafetera1.getCantidadActual());
        
        System.out.println("Servimos taza con 1000 ml.");
        cafetera1.servirTaza(1000);
        System.out.println("Capacidad: " + cafetera1.getCapacidadMaxima() + ". Cantidad actual: " + cafetera1.getCantidadActual());
        
        System.out.println("Ingrese la cantidad de café que desea agregar a la cafetera:");
        cafetera1.agregarCafe(leer.nextInt());
        System.out.println("Capacidad: " + cafetera1.getCapacidadMaxima() + ". Cantidad actual: " + cafetera1.getCantidadActual());
        
        System.out.println("Se vacía la cafetera:");
        cafetera1.vaciarCafetera();
        System.out.println("Capacidad: " + cafetera1.getCapacidadMaxima() + ". Cantidad actual: " + cafetera1.getCantidadActual());
    }
    
}

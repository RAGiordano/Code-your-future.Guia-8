/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.extra2;

import Services.PuntosService;

/**
 *
 * @author Usuario
 */
public class MainExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntosService puntosS = new PuntosService();
        
        puntosS.crearPuntos();
        System.out.println("La distancia entre los dos puntos es: " + puntosS.calcular());
    }
    
}

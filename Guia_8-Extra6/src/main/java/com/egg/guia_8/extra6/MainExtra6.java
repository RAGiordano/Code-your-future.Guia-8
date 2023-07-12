/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.extra6;

import Services.AhorcadoService;

/**
 *
 * @author Usuario
 */
public class MainExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoService ahorcadoS = new AhorcadoService();
        
        System.out.println("¡Bienvenido al juego del ahorcado!");
        System.out.println("");
        ahorcadoS.crearJuego();
        ahorcadoS.juego();
    }
    
}

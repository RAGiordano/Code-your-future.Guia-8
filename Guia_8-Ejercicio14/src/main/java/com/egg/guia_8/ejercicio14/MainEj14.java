/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.ejercicio14;

import Services.MovilService;

/**
 *
 * @author Usuario
 */
public class MainEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MovilService movilService = new MovilService();
        
        movilService.cargarCelular();
        movilService.mostrarCelular();
    }
    
}

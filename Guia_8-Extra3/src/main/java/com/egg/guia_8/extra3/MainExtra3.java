/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.extra3;

import Services.RaicesService;

/**
 *
 * @author Usuario
 */
public class MainExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesService raicesS = new RaicesService();
        
        raicesS.crearRaices();
        raicesS.calcular();
    }
    
}

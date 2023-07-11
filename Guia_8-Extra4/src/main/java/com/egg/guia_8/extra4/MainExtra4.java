/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.extra4;

import Services.NIFService;

/**
 *
 * @author Usuario
 */
public class MainExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFService nifS = new NIFService();
        
        nifS.crearNif();
        nifS.mostrar();
    }
    
}

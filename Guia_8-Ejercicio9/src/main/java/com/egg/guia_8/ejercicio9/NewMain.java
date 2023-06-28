/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.ejercicio9;

import Servicios.MatematicaService;

/**
 *
 * @author Usuario
 */
public class Main9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            MatematicaService mats = new MatematicaService();
    
    mats.crearMatematica();
        System.out.println("Objeto mats creado");
        System.out.println("Los números son: " + mats.devolverMenor() + " y " + mats.devolverMayor());
        System.out.println("Resultado de potencia: " + mats.calcularPotencia());
        System.out.println("Resultado de raiz: " + mats.calcularRaiz());
        
    
    mats.calcularRaiz();
    }
    
}

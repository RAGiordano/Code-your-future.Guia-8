/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.pruebasjunit;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Coche p = new Coche ("Audi A3", 10000);
        Coche.impuesto = 20f;
        System.out.println ("Precio final " + p.precioFinal(10f));
    }
    
}

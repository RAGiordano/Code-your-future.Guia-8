/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Puntos;
import servicio.PuntoService;

/**
 *
 * @author Yesika Simijaca
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PuntoService punto = new PuntoService();
        
        Puntos punto1 = punto.crearPunto() ;
        
        System.out.println("La distancia entre los puntos es: " + punto.calcularDistancia(punto1)); 
        
        
        
    }
    
}

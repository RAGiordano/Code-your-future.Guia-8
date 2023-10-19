/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.ejercicio12;

import Entidades.Persona;
import Servicios.PersonaService;

/**
 *
 * @author Usuario
 */
public class MainEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        String nombre = null;
        
        try {
            if (!nombre.equals(null)) {
                p1.setNombre(nombre);
            }
        } catch (Exception e) {
            System.out.println("El nombre no puede ser nulo");
        }
        
        System.out.println("-- FIN --");
        
        PersonaService personaS = new PersonaService();
        
        personaS.crearPersona();
        System.out.println("Persona creada");
        System.out.println("Edad: " + personaS.calcularEdad() + " años");
        
        System.out.println("¿" + personaS.getNombre() + " tiene menos de 50 años? " + personaS.menorQue(50));
    }
    
}

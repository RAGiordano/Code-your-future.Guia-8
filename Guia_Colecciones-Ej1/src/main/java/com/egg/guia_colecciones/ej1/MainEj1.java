/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_colecciones.ej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<String> perros = new ArrayList();
        
        String opcion;
        System.out.println("Ingrese una raza de perro:");
        perros.add(read.next());
        System.out.println("¿Desea agregar otra raza?");
        opcion = read.next();
        while (!opcion.toLowerCase().equals("n")) {
            System.out.println("Ingrese otra raza de perro:");
            perros.add(read.next());
            System.out.println("¿Desea agregar otra raza?");
            opcion = read.next();
        }
        System.out.println("Usted ha salido.");
        System.out.println("Lista de razas registradas:");
        for (int i = 0; i < perros.size(); i++) {
            System.out.println(perros.get(i));
        }
        System.out.println("--- Fin de la lista ---");
        
    }
    
}

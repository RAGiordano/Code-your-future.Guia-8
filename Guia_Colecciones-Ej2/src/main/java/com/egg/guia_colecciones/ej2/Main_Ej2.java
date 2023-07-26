/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_colecciones.ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main_Ej2 {

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
        System.out.println("");
        System.out.println("Lista de razas registradas:");
        for (int i = 0; i < perros.size(); i++) {
            System.out.println(perros.get(i));
        }
        System.out.println("--- Fin de la lista ---");
        System.out.println("");
        
        System.out.println("Ingrese un perro para quitar de la lista:");
        String perroBorrar = read.next();
        
        Iterator<String> iterator = perros.iterator();
        
        String auxiliar;
        boolean hallado = false;
        
        while (iterator.hasNext()){
            auxiliar = iterator.next();
            if (auxiliar.equals(perroBorrar)){
                iterator.remove();
                hallado = true;
            }
        }
        Collections.sort(perros);
        if (hallado){
            System.out.println(perros.toString());
        } else {
            System.out.println("El perro no se encuentra en la lista");
            System.out.println(perros.toString());
        }
        
    }
    
}

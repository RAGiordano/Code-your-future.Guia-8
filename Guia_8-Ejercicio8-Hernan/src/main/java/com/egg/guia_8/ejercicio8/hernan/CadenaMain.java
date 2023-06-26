/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.ejercicio8.hernan;

import Services.CadenaService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CadenaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        CadenaService cs1 = new CadenaService();
        
        cs1.crearFrase();
        cs1.mostrarVocales();
        cs1.invertirFrase();
        
        System.out.println("Ingrese una letra para buscar en la frase");
        String letra = sc.nextLine();
        cs1.vecesRepetidas(letra);
        
        System.out.println("Ingrese una frase nueva para comparar con la anterior");
        String frase = sc.nextLine();
        cs1.compararLongitud(frase);
        
        System.out.println("Ingrese una frase nueva para unir con la anterior");
        frase = sc.nextLine();
        cs1.unirFrase(frase);
        
        System.out.println("Ingrese una letra para ser reemplazada por las letra 'a' de la frase");
        letra = sc.nextLine();
        cs1.reemplazar(letra);
        
        System.out.println("Ingrese una letra para ser buscada en la frase");
        letra = sc.nextLine();
        if(cs1.contiene(letra) == true)
            System.out.println("La frase si contiene la letra: " + letra);
        else    System.out.println("La frase no contiene la letra: " + letra);
        
    }
    
}
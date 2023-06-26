/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.ejercicio8;

import Entidades.Cadena;
import Servicios.CadenaService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cadena cadena = new Cadena("Un nuevo acorde te hace mirarme a los ojos. Aún tengo al sol para besar tu sombra.");
        CadenaService cadService = new CadenaService();
        Scanner scanner = new Scanner(System.in);
        String caracter;
        String cadena2 = "Me verás caer en la ciudad de la furia, donde nadie sabe de mí y yo soy parte de todos.";
        String letra;
        
        System.out.print("Frase: " + cadena.getFrase());
        System.out.println("");
        System.out.println("Longitud: " + cadena.getLongitud());
        System.out.println("");
        System.out.println("");
        
        System.out.println("Método mostrarVocales:");
        System.out.print("Cantidad de vocales: " + cadService.mostrarVocales(cadena));
        System.out.println("");
        System.out.println("");
        
        System.out.println("Método invertirFrase:");
        cadService.invertirFrase(cadena);
        System.out.println("");
        
        System.out.println("Método vecesRepetido:");
        System.out.println("Ingrese en caracter cuyas apariciones quiere contabilizar:");
        caracter = scanner.next();
        cadService.vecesRepetido(cadena, caracter);
        System.out.println("");
        
        System.out.println("Método compararLongitud:");
        System.out.println("Cadena a comparar: " + cadena2);
        System.out.print("¿Son iguales ambas cadenas? ");
        System.out.println(cadService.compararLongitud(cadena, cadena2));
        System.out.println("");
        System.out.println("");
        
        System.out.println("Método unirFrases:");
        cadService.unirFrases(cadena, "¡Hola, mundo!");
        System.out.println("");
        
        System.out.println("Método reemplazar:");
        cadService.reemplazar(cadena, "$");
        System.out.println("");
        
        System.out.println("Método contiene:");
        System.out.println("Ingrese la letra que quiere saber si está en la frase:");
        letra = scanner.next();
        System.out.print("¿Contiene la letra " + letra + "? " + cadService.contiene(cadena, letra));
        
        
    }
    
}

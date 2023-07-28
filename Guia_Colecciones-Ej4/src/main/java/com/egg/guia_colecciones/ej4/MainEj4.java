/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_colecciones.ej4;

import Services.PeliculaService;

/**
 *
 * @author Usuario
 */
public class MainEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService peliService = new PeliculaService();
        
        System.out.println("Agregando películas:");
        peliService.agregarPeliculas();
        
        System.out.println("");
        System.out.println("Mostrando lista de películas:");
        peliService.mostrarPeliculas();
        
        System.out.println("");
        System.out.println("Mostrando lista de películas que duran más de una hora:");
        peliService.mostrarPeliculas(1);
        
        System.out.println("");
        System.out.println("Ordenar películas por duración descendente y mostrar lista");
        peliService.ordenarDescendente("duracion");
        peliService.mostrarPeliculas();
        
        System.out.println("");
        System.out.println("Ordenar películas por duración ascendente y mostrar lista");
        peliService.ordenarAscendente("duracion");
        peliService.mostrarPeliculas();
        
        System.out.println("");
        System.out.println("Ordenar películas por título y mostrar lista");
        peliService.ordenarAscendente("titulo");
        peliService.mostrarPeliculas();
        
        System.out.println("");
        System.out.println("Ordenar películas por director y mostrar lista");
        peliService.ordenarAscendente("director");
        peliService.mostrarPeliculas();
    }
    
}

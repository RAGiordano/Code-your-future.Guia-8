/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.actividadextra2;

import Services.AlquilerService;
import Services.PeliculaService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainActividadExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService peliculaService = new PeliculaService();
        AlquilerService alquilerService = new AlquilerService();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int opcion = 100;
        
        // Carga inicial de películas
        PeliculaService.crearPelicula("Conan, el bárbaro", "acción", 2004, 120, 3);
        PeliculaService.crearPelicula("Alicia en el país de las maravillas", "infantiles", 1985, 115, 4);
        PeliculaService.crearPelicula("Rambo", "acción", 1986, 122, 4);
        PeliculaService.crearPelicula("Depredador", "acción", 1993, 129, 2);
        PeliculaService.crearPelicula("Titanic", "románticas", 2000, 180, 5);
        
        do {
            System.out.println("                __________________");
            System.out.println("               |                  |");
            System.out.println("               |  MENU PRINCIPAL  |");
            System.out.println("               |__________________|");
            System.out.println("");
            System.out.println("(1) Registrar nueva película");
            System.out.println("(2) Nuevo alquiler");
            System.out.println("(3) Listar todas las películas");
            System.out.println("(4) Listar películas disponibles");
            System.out.println("(5) Listar películas alquiladas");
            System.out.println("(6) Buscar película por título");
            System.out.println("(7) Buscar película por género");
            System.out.println("(8) Mostrar alquileres");
            System.out.println("(9) Mostrar alquileres de una fecha determinada");
            System.out.println("(0) Salir");
            System.out.println("");
            System.out.println("Ingrese la opción:");
            
            opcion = Integer.parseInt(read.next());
            
            switch (opcion){
                case 1: peliculaService.crearPelicula();
                    break;
                case 2: alquilerService.crearAlquiler();
                    break;
                case 3: peliculaService.listarPeliculas();
                    break;
                case 4: peliculaService.listarDisponibles();
                    break;
                case 5: peliculaService.listarAlquiladas();
                    break;
                case 6: peliculaService.buscarPeliculaPorTitulo();
                    break;
                case 7: peliculaService.buscarPeliculaPorGenero();
                    break;
                case 8: alquilerService.listarAlquileres();
                    break;
                case 9: alquilerService.buscarAlquilerPorFecha();
                    break;
            }
            
            if (opcion >= 1 && opcion <= 9){
                System.out.println("Presione <ENTER> para continuar");
                read.next();
            }
            
            
        } while (opcion != 0);
        
        System.out.println("");
        System.out.println("Usted ha salido del sistema");
        read.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PeliculaService {

    private static ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    private static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static Pelicula crearPelicula() {
        String titulo;
        String genero;
        int anio;
        int duracion;
        int cantidadCopias;

        System.out.println("AGREGAR PELÍCULA");
        System.out.println("");
        System.out.println("Título:");
        titulo = read.next();
        while (buscarPeliculaPorTitulo(titulo)){
            System.out.println("El título ya existe. Ingrese un título nuevo:");
            titulo = read.next();
        }
        System.out.println("Género:");
        genero = read.next();
        System.out.println("Año:");
        anio = Integer.parseInt(read.next());
        System.out.println("Duración:");
        duracion = Integer.parseInt(read.next());
        System.out.println("Cantidad de copias:");
        cantidadCopias = Integer.parseInt(read.next());

        Pelicula pelicula = new Pelicula(titulo, genero, anio, duracion, cantidadCopias);
        listaPeliculas.add(pelicula);

        return pelicula;
    }

    public static Pelicula crearPelicula(String titulo, String genero, int anio, int duracion, int cantidadCopias) {
        Pelicula pelicula = new Pelicula(titulo, genero, anio, duracion, cantidadCopias);
        listaPeliculas.add(pelicula);

        return pelicula;
    }

    public static void listarPeliculas() {
        System.out.println("LISTADO DE PELÍCULAS DISPONIBLES");
        System.out.println("");
        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getDisponibles() > 0) {
                System.out.println(listaPeliculas.get(i).toString());
                System.out.println("");
            }

        }
    }

    public static boolean buscarPeliculaPorTitulo() {
        String titulo;
        boolean retorno = false;
        int coincidencias = 0;

        System.out.println("BUSCAR PELÍCULAS POR TÍTULO");
        System.out.println("");
        System.out.println("Ingrese el título:");
        titulo = read.next();
        System.out.println("");

        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getTitulo().toLowerCase().equals(titulo.toLowerCase())) {
                System.out.println(listaPeliculas.get(i).toString());
                System.out.println("");
                coincidencias++;
                retorno = true;
            }
        }
        System.out.println("Coincidencias: " + coincidencias);
        return retorno;
    }

    public static boolean buscarPeliculaPorTitulo(String titulo) {
        boolean retorno = false;

        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getTitulo().toLowerCase().equals(titulo.toLowerCase())) {
                retorno = true;
            }
        }
        return retorno;
    }

    public static boolean buscarPeliculaPorGenero() {
        String genero;
        boolean retorno = false;
        int coincidencias = 0;

        System.out.println("BUSCAR PELÍCULAS POR GÉNERO");
        System.out.println("");
        System.out.println("Ingrese el género:");
        genero = read.next();
        System.out.println("");

        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getGenero().toLowerCase().equals(genero.toLowerCase())) {
                System.out.println(listaPeliculas.get(i).toString());
                System.out.println("");
                coincidencias++;
                retorno = true;
            }
        }
        System.out.println("Coincidencias: " + coincidencias);
        return retorno;
    }

    public static boolean restarDisponibles(String titulo) {
        boolean retorno = false;

        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getTitulo().equals(titulo)) {
                if (listaPeliculas.get(i).getDisponibles() > 0) {
                    listaPeliculas.get(i).setDisponibles(listaPeliculas.get(i).getDisponibles() - 1);
                    retorno = true;
                }
                break;
            }
        }
        return retorno;
    }

    public static void listarAlquiladas() {
        int contador = 0;
        System.out.println("");
        System.out.println("PELÍCULAS ALQUILADAS");
        System.out.println("");
        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getCantidadCopias() != listaPeliculas.get(i).getDisponibles()) {
                System.out.println(listaPeliculas.get(i).toString());
                contador++;
            }
        }
        System.out.println(contador + " películas alquiladas.");
    }

    public static void listarDisponibles() {
        int contador = 0;
        System.out.println("");
        System.out.println("PELÍCULAS DISPONIBLES");
        System.out.println("");
        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getDisponibles() > 0) {
                System.out.println(listaPeliculas.get(i).toString());
                contador++;
            }
        }
        System.out.println(contador + " películas disponibles.");
    }

}

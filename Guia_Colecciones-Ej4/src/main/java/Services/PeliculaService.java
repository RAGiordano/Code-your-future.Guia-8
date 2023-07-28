/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PeliculaService {

    private List<Pelicula> listaPeliculas;

    public PeliculaService() {
        listaPeliculas = new ArrayList();
    }

    public void agregarPeliculas() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Pelicula pelicula;
        String titulo;
        String director;
        double duracion;
        String opcion = "";

        System.out.println("");
        System.out.println("AGREGAR PELÍCULAS");
        System.out.println("");
        do {
            System.out.println("Ingrese los datos de la película");
            System.out.println("Título:");
            titulo = read.next();
            System.out.println("Director:");
            director = read.next();
            System.out.println("Duración (horas):");
            duracion = Double.parseDouble(read.next());
            pelicula = new Pelicula(titulo, director, duracion);
            listaPeliculas.add(pelicula);

            System.out.println("¿Desea agregar otra película?");
            opcion = read.next();
        } while (!opcion.toLowerCase().equals("n"));

    }
    
    public void mostrarPeliculas(){
        listaPeliculas.forEach((e)->System.out.println(e.toString()));
    }
    
    public void mostrarPeliculas(double duracionMinima){
        listaPeliculas.forEach((e)-> {if (e.getDuracion() > duracionMinima) {
                System.out.println(e.toString());
        }});
//        for (int i = 0; i < listaPeliculas.size(); i++) {
//            if (listaPeliculas.get(i).getDuracion == 5){}
//        }
    }
    
    public void ordenarDescendente(String criterio){
        switch (criterio){
            case "duracion":
                listaPeliculas.sort(Pelicula.compararDuracionDescendente);
                break;
            case "titulo":
                listaPeliculas.sort(Pelicula.compararTituloDescendente);
                break;
            case "director":
                listaPeliculas.sort(Pelicula.compararDirectorDescendente);
                break;
        }
    }
    
    public void ordenarAscendente(String criterio){
        switch (criterio){
            case "duracion":
                listaPeliculas.sort(Pelicula.compararDuracionAscendente);
                break;
            case "titulo":
                listaPeliculas.sort(Pelicula.compararTituloAscendente);
                break;
            case "director":
                listaPeliculas.sort(Pelicula.compararDirectorAscendente);
                break;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Pelicula {

    private String titulo;
    private String director;
    private double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

    public static Comparator<Pelicula> compararDuracionDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            // Convertir los valores double a objetos Double para poder utilizar compareTo()
            Double duracionP1 = Double.valueOf(p1.getDuracion());
            Double duracionP2 = Double.valueOf(p2.getDuracion());

            return duracionP2.compareTo(duracionP1);
        }
    };
    
    public static Comparator<Pelicula> compararTituloDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getTitulo().compareTo(p1.getTitulo());
        }
    };
        
    public static Comparator<Pelicula> compararDirectorDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDirector().compareTo(p1.getDirector());
        }
    };
    
    public static Comparator<Pelicula> compararDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            // Convertir los valores double a objetos Double para poder utilizar compareTo()
            Double duracionP1 = Double.valueOf(p1.getDuracion());
            Double duracionP2 = Double.valueOf(p2.getDuracion());

            return duracionP1.compareTo(duracionP2);
        }
    };
    
    public static Comparator<Pelicula> compararTituloAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
        
    public static Comparator<Pelicula> compararDirectorAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Usuario
 */
public class Pelicula {
    private String titulo;
    private String genero;
    private int anio;
    private int duracion;
    private int cantidadCopias;
    private int disponibles;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int anio, int duracion, int cantidadCopias) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
        this.cantidadCopias = cantidadCopias;
        this.disponibles = cantidadCopias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    @Override
    public String toString() {
        return " Titulo: " + titulo + "\n Género: " + genero + "\n Año: " + anio + "\n Duración: " + duracion + "\n Cantidad de copias: " + cantidadCopias + "\n Copias disponibles: " + disponibles + "\n";
    }
    
    
}

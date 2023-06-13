/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.guia_8.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int cantPaginas;
    
    //Constructor vacío
    public Libro() {
    }
    
    //Constructor por parámetros
    public Libro(String isbn, String titulo, String autor, int cantPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
    }
    
    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el código ISBN:");
        this.isbn = leer.nextLine();
        System.out.println("Ingrese el título del libro:");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese el apellido y nombre del autor:");
        this.autor = leer.nextLine();
        System.out.println("Ingrese la cantidad de páginas:");
        this.cantPaginas = leer.nextInt();
        
    }
    
    public void mostrarLibro() {
        System.out.println("Número de ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Cantidad de páginas: " + this.cantPaginas);
    }
    
}

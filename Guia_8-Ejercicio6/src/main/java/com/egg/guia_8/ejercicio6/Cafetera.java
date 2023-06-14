/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.guia_8.ejercicio6;

/**
 *
 * @author Usuario
 */
public class Cafetera {
    int capacidadMaxima;
    int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }
    
    public void servirTaza(int tamanoTaza) {
        //Si alcanza para servir la taza completa
        if (tamanoTaza <= cantidadActual) {
            this.cantidadActual -= tamanoTaza;
            System.out.println("Se llenó la taza de café.");
        } else {  //Si no alcanza para servir la taza
            System.out.println("No hay suficiente café para llenar la taza. Se sirvieron " + cantidadActual + " ml.");
            this.cantidadActual = 0;
        }
    }
    
    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }
    
    public void agregarCafe(int cantidad) {
        int sobraron;
        //Si entra lo que se pretende agregar
        if (this.cantidadActual + cantidad <= this.capacidadMaxima) {
            this.cantidadActual += cantidad;
        } else {  //Si no entra lo que se pretende agregar
            sobraron = this.cantidadActual + cantidad - this.capacidadMaxima;
            this.cantidadActual = this.capacidadMaxima;
            System.out.println("Se llenó la cafetera y sobraron " + sobraron + " ml de café." );
        }
    }
}

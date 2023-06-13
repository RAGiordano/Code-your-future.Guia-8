/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.guia_8.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Circunferencia {
    private double radio;

    //Constructor que inicializa el radio pasado como parámetro
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        this.radio = leer.nextDouble();
        
    }
    
    public Double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }
    
    public Double perimetro() {
        return 2 * Math.PI * this.radio;
    }
}

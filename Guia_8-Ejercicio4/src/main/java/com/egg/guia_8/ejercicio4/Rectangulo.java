/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.guia_8.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Rectangulo {

    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la base del rectángulo:");
        this.base = leer.nextDouble();

        System.out.println("Ingrese la altura del rectángulo:");
        this.altura = leer.nextDouble();
    }

    public Double calcularSuperficie() {
        return this.base * this.altura;
    }

    public Double calcularPerimetro() {
        return (this.base + this.altura) * 2;
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i == 0 || i == this.altura - 1 || j == 0 || j == this.base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}

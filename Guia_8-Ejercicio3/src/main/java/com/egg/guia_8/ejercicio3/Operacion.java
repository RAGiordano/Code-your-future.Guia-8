/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.guia_8.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros:");
        this.numero1 = leer.nextInt();
        this.numero2 = leer.nextInt();
        
    }
    
    public int sumar() {
        return this.numero1 + this.numero2;
    }
    
    public int restar() {
        return this.numero1 - this.numero2;
    }
    
    public int multiplicar() {
        if(numero1 == 0 || numero2 == 0) {
            System.out.println("Multiplicación por cero");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }
    
    public double dividir() {
        if(numero2 == 0) {
            System.out.println("¡Error! No está definida la división por cero");
            return 0;
        } else {
            return (double) numero1 / (double) numero2;
        }
    }
}

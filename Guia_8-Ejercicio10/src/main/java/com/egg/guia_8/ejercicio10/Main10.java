/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.ejercicio10;

/**
 *
 * @author Usuario
 */
public class Main10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] a = new double[50];
        double[] b = new double[20];
        for (int i = 0; i < 50; i++) {
            a[i] = Math.random() * 100;
        }
        
        for (int i = 0; i < 10; i++) {
            b[i] = a[i];
        }
        
        for (int i = 10; i < 20; i++) {
            b[i] = 0.5;
        }
        
        System.out.println("Array 1:");
        for (int i = 0; i < 50; i++) {
            System.out.println("Elemento " + i + ": " + a[i]);
        }
        
        System.out.println("Array 2:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Elemento " + i + ": " + b[i]);
        }
    }
    
}

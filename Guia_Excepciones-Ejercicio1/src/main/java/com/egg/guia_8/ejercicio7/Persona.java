/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.guia_8.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Persona {

    String nombre;
    int edad;
    char sexo;
    double peso;
    double estatura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void crearPersona() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Nombre:");
        this.nombre = leer.nextLine();
        System.out.println("Edad:");
        this.edad = leer.nextInt();
        System.out.println("Sexo ('H', 'M' u 'O'):");
        do {
            this.sexo = Character.toUpperCase(leer.next().charAt(0));
            if (this.sexo != 'H' && this.sexo != 'M' && this.sexo != 'O') {
                System.out.println("El valor ingresado es incorrecto. Inténtelo nuevamente:");
            }
        } while (this.sexo != 'H' && this.sexo != 'M' && this.sexo != 'O');
        System.out.println("Peso: ");
        this.peso = leer.nextDouble();
        System.out.println("Estatura: ");
        this.estatura = leer.nextDouble();
    }
    
    public int calcularIMC() {
        //Si la persona está por debajo de su peso ideal
        if (this.peso / Math.pow(this.estatura, 2) < 20) {
            return -1;
        // Si la persona está en su peso ideal
        } else if (this.peso / Math.pow(this.estatura, 2) >= 20 && this.peso / Math.pow(this.estatura, 2) <= 25 ) {
            return 0;
        //Si la persona está por encima de su peso ideal
        } else {
            return 1;
        }
    }
    
    public boolean esMayorDeEdad() {
        if (edad >= 21) {
            return true;
        } else {
            return false;
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.ejercicio7;

/**
 *
 * @author Usuario
 */
public class MainEj7 {

    /**
     * @param args the command line arguments
     */
//        this.nombre = nombre;
//        this.edad = edad;
//        this.sexo = sexo;
//        this.peso = peso;
//        this.estatura = estatura;
    public static void main(String[] args) {
        Persona persona0;
        persona0 = null;
        Persona persona1 = new Persona("Juan", 23, 'M', 85, 1.75);
        Persona persona2 = new Persona("Federico", 33, 'M', 77, 1.79);
        Persona persona3 = new Persona("Guzman", 25, 'M', 74, 1.77);
        Persona persona4 = new Persona("Matías", 20, 'M', 50, 1.72);
        
        System.out.println("Persona 0:");
        try {
            if (persona0.esMayorDeEdad()) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Error");
        }
        
        
        System.out.println("");
        
        System.out.println("Persona 1:");
        switch (persona1.calcularIMC()) {
            case -1:
                System.out.println("Bajo peso");
                break;
            case 0:
                System.out.println("Peso ideal");
                break;
            case 1:
                System.out.println("Sobrepeso");
        }
        if (persona1.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("");
        
        System.out.println("Persona 2:");
        switch (persona2.calcularIMC()) {
            case -1:
                System.out.println("Bajo peso");
                break;
            case 0:
                System.out.println("Peso ideal");
                break;
            case 1:
                System.out.println("Sobrepeso");
        }
        if (persona2.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("");
        
        System.out.println("Persona 3:");
        switch (persona3.calcularIMC()) {
            case -1:
                System.out.println("Bajo peso");
                break;
            case 0:
                System.out.println("Peso ideal");
                break;
            case 1:
                System.out.println("Sobrepeso");
        }
        if (persona3.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("");
        
        System.out.println("Persona 4:");
        switch (persona4.calcularIMC()) {
            case -1:
                System.out.println("Bajo peso");
                break;
            case 0:
                System.out.println("Peso ideal");
                break;
            case 1:
                System.out.println("Sobrepeso");
        }
        if (persona4.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("");
        
    }
    
}

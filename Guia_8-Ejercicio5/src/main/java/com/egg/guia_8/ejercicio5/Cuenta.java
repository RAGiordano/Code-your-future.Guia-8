/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.guia_8.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    int numeroCuenta;
    long dni;
    double saldoActual;
    double interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void crearCuenta() {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el número de cuenta:");
        this.numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el DNI:");
        this.dni = leer.nextLong();
        System.out.println("Ingrese el saldo actual:");
        this.saldoActual = leer.nextDouble();
        System.out.println("Ingrese el interés:");
        this.interes = leer.nextDouble();
    }
    
    public void ingresar(double ingreso) {
        this.saldoActual += ingreso;
    }
    
    public void retirar(double retiro) {
        if (this.saldoActual < retiro) {
            this.saldoActual = 0;
        } else {
            this.saldoActual -= retiro;
        }
    }
    
    public void extraccionRapida() {
        double monto;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el monto a extraer:");
        monto = leer.nextDouble();
        if (monto > this.saldoActual * 0.2) {
            System.out.println("Error. No puede extraer más del 20% de su saldo.");
        } else {
            saldoActual -= monto;
        }
    }
    
    public void consultarSaldo() {
        System.out.println(this.saldoActual);
    }
    
    public void consultarDatos() {
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("DNI: " + this.dni);
        System.out.println("Saldo actual: " + this.saldoActual);
        System.out.println("Interés: " + this.interes);
    }
    
    
    
}

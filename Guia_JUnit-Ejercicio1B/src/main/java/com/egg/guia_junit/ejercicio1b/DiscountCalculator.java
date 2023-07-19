/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.guia_junit.ejercicio1b;

/**
 *
 * @author Usuario
 */
public class DiscountCalculator {
    public double precio;
    public double porcentajeDescuento;
    public double resultado;

    public DiscountCalculator() {
    }

    public DiscountCalculator(double precio, double porcentajeDescuento) {
        this.precio = precio;
        this.porcentajeDescuento = porcentajeDescuento;
        this.resultado = precio - precio * porcentajeDescuento / 100;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}

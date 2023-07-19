/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Usuario
 */
public class TemperatureConverter {
    private String tipo1;
    private String tipo2;

    public TemperatureConverter() {
    }

    public TemperatureConverter(String tipo1, String tipo2) {
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    @Override
    public String toString() {
        return "TemperatureConverter{" + "tipo1=" + tipo1 + ", tipo2=" + tipo2 + '}';
    }
}

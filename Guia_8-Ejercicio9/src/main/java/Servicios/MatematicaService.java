/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Matematica;

/**
 *
 * @author Usuario
 */
public class MatematicaService {
    
    Matematica mat = new Matematica();
    
    public Matematica crearMatematica() {
        
        mat.setNum1(Math.random() * 10);
        mat.setNum2(Math.random() * 10);
        return mat;
    }
    
    public double devolverMayor() {
        if (mat.getNum1() > mat.getNum2()) {
            return mat.getNum1();
        } else {
            return mat.getNum2();
        }
    }
    
    public double devolverMenor() {
        if (mat.getNum1() < mat.getNum2()) {
            return mat.getNum1();
        } else {
            return mat.getNum2();
        }
    }
    
    public double calcularPotencia() {
        double mayor = Math.round(devolverMayor());
        double menor = Math.round(devolverMenor());
        return Math.pow(mayor, menor);
    }
    
    public double calcularRaiz() {
        return Math.sqrt(Math.abs(devolverMenor()));
    }
}

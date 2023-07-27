/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Alumno {
    private String nombre;
    private List<Double> notas;

    public Alumno() {
    }

    public Alumno(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        notas = new ArrayList();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

    
    
    
}

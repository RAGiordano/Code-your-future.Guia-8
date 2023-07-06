/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_8.ejercicio13;

import Services.CursoService;

/**
 *
 * @author Usuario
 */
public class MainEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoService cursoServ = new CursoService();
        cursoServ.crearCurso();
        System.out.println("Ganancias semanales del curso: " + cursoServ.calcularGananciaSemanal());
        cursoServ.mostrarInfo();
    }
    
}

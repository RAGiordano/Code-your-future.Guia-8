/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_colecciones.ej3;

import Services.AlumnoService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoService aluServ = new AlumnoService();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String opcion = "";
        String nombreAlumno = "";
        double notaFinal = 0;
        
        System.out.println("Agregar alumnos:");
        aluServ.agregarAlumnos();
        
        aluServ.listarAlumnos();
        
        
        System.out.println("");
        System.out.println("Ver notas finales");
        
        do {
            System.out.println("Ingrese el nombre del estudiante:");
            nombreAlumno = read.next();
            notaFinal = aluServ.notaFinal(nombreAlumno);
            System.out.println("Nota final de " + nombreAlumno + ": " + notaFinal);
            System.out.println("");
            System.out.println("¿Desea ver las notas de otro estudiante? (s/n)");
            opcion = read.next();
        } while (!opcion.toLowerCase().equals("n"));
        System.out.println("");
        System.out.println("Usted ha salido del sistema.");
    }
    
}

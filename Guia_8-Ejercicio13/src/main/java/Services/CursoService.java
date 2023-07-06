/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Curso;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CursoService {
    private Curso curso = new Curso();
    
    private Curso cargarAlumnos(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String alumnos[] = new String[5];
        
        System.out.println("Ingrese los nombres de los alumnos que asisten al curso:");
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = leer.next();
        }
        curso.setAlumnos(alumnos);
        
        return curso;
    }
    
    public Curso crearCurso(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
//    private String nombreCurso;
//    private int cantidadHorasPorDia;
//    private int cantidadDiasPorSemana;
//    private String turno;
//    private float precioPorHora;
//    public String[] alumnos = new String[5];

        System.out.println("Ingrese el nombre del curso:");
        curso.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas de clase por día:");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de días de clase por semana:");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el turno:");
        curso.setTurno(leer.next());
        System.out.println("Ingrese el precio por hora:");
        curso.setPrecioPorHora(leer.nextFloat());
        cargarAlumnos();
        
        return curso;
    }
    
    public double calcularGananciaSemanal(){
        double ganancia;
        ganancia = curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana() * curso.getPrecioPorHora();
        return ganancia;
    }

    public void mostrarInfo() {
        System.out.println(curso.toString());
    }
}

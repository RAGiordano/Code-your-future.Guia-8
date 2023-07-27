/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlumnoService {
    private List<Alumno> listaAlumnos;

    public AlumnoService() {
        listaAlumnos = new ArrayList();
    }

    
    public void agregarAlumnos() {
        String opcion = "";
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        

        Alumno alumno;
        int c = 0;
        String nombre;
        double nota1, nota2, nota3;
        
        do{
            c++;
            
            System.out.println("Ingrese el nombre del alumno número " + c);
            nombre = read.next();
            
            System.out.println("Ingrese la nota número 1 de " + nombre);
            nota1 = Integer.parseInt(read.next());
            System.out.println("Ingrese la nota número 2 de " + nombre);
            nota2 = Integer.parseInt(read.next());
            System.out.println("Ingrese la nota número 3 de " + nombre);
            nota3 = Integer.parseInt(read.next());
            

            alumno = new Alumno(nombre, nota1, nota2, nota3);
            listaAlumnos.add(alumno);
            
            System.out.println("¿Desea agregar otro alumno?");
            opcion = read.next();
            
        } while(!opcion.toLowerCase().equals("n"));

    }
    
    
    public double notaFinal(String alumno){
        double promedio = 0;
        boolean hallado = false;
        
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if(listaAlumnos.get(i).getNombre().equals(alumno)){
                System.out.println(listaAlumnos.get(i).getNotas().get(0));
                System.out.println(listaAlumnos.get(i).getNotas().get(1));
                System.out.println(listaAlumnos.get(i).getNotas().get(2));
                promedio = (double)((listaAlumnos.get(i).getNotas().get(0)
                        + listaAlumnos.get(i).getNotas().get(1)
                        + listaAlumnos.get(i).getNotas().get(2)) / 3);
                hallado = true;
            }
        }
        
        if (!hallado){
            System.out.println("No existen registros de " + alumno);
        }
        
        return promedio;
    }
    
    public void listarAlumnos(){
        System.out.println("");
        System.out.println("LISTA DE ALUMNOS Y CALIFICACIONES");
        System.out.println("");
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(listaAlumnos.get(i).toString());
        }
        System.out.println("");
        System.out.println("--- FIN DE LA LISTA ---");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Persona;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaService {
    Persona person = new Persona();
    
    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int dia, mes, anio;
        
        
        
        System.out.println("Ingrese el nombre de la persona: ");
        person.setNombre(leer.next());
        System.out.println("Ingrese día, mes y año de nacimiento, respectivamente: ");
        dia = leer.nextInt();
        mes = leer.nextInt() - 1;
        anio = leer.nextInt();
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes, dia);
        
        person.setFechaNacimiento(calendar.getTime());
        
//        System.out.println(person.toString());
        mostrarPersona();
        return person;
    }
    
    public int calcularEdad() {
        LocalDate fechaNacimiento = person.getFechaNacimiento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    
    }
    
    public boolean menorQue(int edad) {
        return calcularEdad() < edad;
    }
    
    public void mostrarPersona() {
        System.out.println("Nombre: " + person.getNombre());
        System.out.println("Fecha de nacimiento: " + new SimpleDateFormat("dd/MM/yyyy").format(person.getFechaNacimiento()));
    }
    
    public String getNombre(){
        return person.getNombre();
    }
}

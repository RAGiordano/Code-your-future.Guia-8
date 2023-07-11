/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Raices;
import static java.lang.Double.parseDouble;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RaicesService {
    Raices raices = new Raices();
    
    public Raices crearRaices(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese los coeficientes de la ecuación de segundo grado:");
        raices.setA(parseDouble(read.next()));
        raices.setB(parseDouble(read.next()));
        raices.setC(parseDouble(read.next()));
        
        return raices;
    }
    
    public double getDiscriminante(){
        return (Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC());
    }
    
    public boolean tieneRaices(){
        return getDiscriminante() >= 0;
    }
    
    public boolean tieneRaiz(){
        return getDiscriminante() == 0;
    }
    
    public void obtenerRaices(){
        if (tieneRaices()){
            double raiz1 = (-raices.getB() + Math.sqrt(raices.getB() * raices.getB() - 4 * raices.getA() * raices.getC())) / (2 * raices.getA());
            double raiz2 = (-raices.getB() - Math.sqrt(raices.getB() * raices.getB() - 4 * raices.getA() * raices.getC())) / (2 * raices.getA());
            System.out.println("Las raíces de la función son " + raiz1 + " y " + raiz2);
        }
    }
    
    public void obtenerRaiz(){
        if (tieneRaiz()){
            double raiz = (-raices.getB()) / (2 * raices.getA());
            System.out.println("La raíz doble de la función es " + raiz);
        }
    }
    
    public void calcular(){
        if (tieneRaiz()){
            obtenerRaiz();
        } else if (tieneRaices()) {
            obtenerRaices();
        } else {
            System.out.println("No existen raíces reales para los coeficientes dados.");
        }
        
    }
}

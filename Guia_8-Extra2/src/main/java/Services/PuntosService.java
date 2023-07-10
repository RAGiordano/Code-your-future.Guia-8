/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Puntos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PuntosService {
    Puntos puntos = new Puntos();
    
    public Puntos crearPuntos(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese las coordenadas (x;y) del primer punto:");
        puntos.setX1(Double.parseDouble(read.next()));
        puntos.setY1(Double.parseDouble(read.next()));
        System.out.println("Ingrese las coordenadas (x;y) del segundo punto:");
        puntos.setX2(Double.parseDouble(read.next()));
        puntos.setY2(Double.parseDouble(read.next()));
        
        return puntos;
    }
    
    
    public double calcular(){
        return Math.sqrt(Math.pow(puntos.getX2() - puntos.getX1(), 2) + Math.pow(puntos.getY2() - puntos.getY1(), 2));
    }
}

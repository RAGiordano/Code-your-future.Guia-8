/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_11.ejercicio11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anio, mes, dia;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese año, mes y día, respectivamente:");
        anio = leer.nextInt();
        mes = leer.nextInt() - 1;
        dia = leer.nextInt();
        Calendar fecha = Calendar.getInstance();
        fecha.set(anio, mes, dia);
        
        Calendar fechaActual = Calendar.getInstance();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formato.format(fecha.getTime());
        
        System.out.println("Fecha ingresada: " + fechaFormateada);
        
        System.out.println("La diferencia de años entre la fecha ingresada y la fecha actual es de: " + (fechaActual.get(Calendar.YEAR) - fecha.get(Calendar.YEAR)) + " años");
    }
    
}

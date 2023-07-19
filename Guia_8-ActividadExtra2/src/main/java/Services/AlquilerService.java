/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Alquiler;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlquilerService {

    private static ArrayList<Alquiler> listaAlquileres = new ArrayList<>();
    private static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static boolean crearAlquiler() {
        boolean alquilada = false;
        String peliculaAlquilada;

        System.out.println("NUEVO ALQUILER");
        System.out.println("");

        System.out.println("Ingrese el título de la película:");
        peliculaAlquilada = read.next();
        while (!PeliculaService.buscarPeliculaPorTitulo(peliculaAlquilada)) {
            System.out.println("No se encuentra el título.");
            System.out.println("Ingrese el título nuevamente:");
            peliculaAlquilada = read.next();
        }

        if (PeliculaService.restarDisponibles(peliculaAlquilada)) {
            Date fechaInicio = Calendar.getInstance().getTime();
            Date fechaFin;

            // fechaInicio
            System.out.println("¿Colocar la fecha de hoy? (s/n)");
            if (!read.next().toLowerCase().equals("s")) {
                System.out.println("Ingrese la fecha en formato dd/mm/aaaa");
                String fechaIngresada = read.next();
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

                try {
                    fechaInicio = formatoFecha.parse(fechaIngresada);
                } catch (ParseException e) {
                    System.out.println("Error con el formato ingresado. Se usará la fecha actual.");
                    e.printStackTrace();
                }
            }

            // fechaFin
            System.out.println("¿Por cuántos días se va a alquilar la película?");
            int diasAlquiler = Integer.parseInt(read.next());

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaInicio);
            calendar.add(Calendar.DAY_OF_YEAR, diasAlquiler);
            fechaFin = calendar.getTime();

            Alquiler alquiler = new Alquiler(peliculaAlquilada, fechaInicio, fechaFin);
            listaAlquileres.add(alquiler);
            alquilada = true;
        } else {
            System.out.println("La película \"" + peliculaAlquilada + "\" no está disponible.");
        }

        return alquilada;
    }

    public static void listarAlquileres() {
        System.out.println("");
        System.out.println("ALQUILERES");
        System.out.println("");
        for (int i = 0; i < listaAlquileres.size(); i++) {
            System.out.println(listaAlquileres.get(i).toString());
        }
    }

        
    public static void buscarAlquilerPorFecha() {
        Date fechaIngresada = Calendar.getInstance().getTime();
        int encontrados = 0;

        System.out.println("BUSCAR ALQUILER POR FECHA");
        System.out.println("");
        System.out.println("Ingrese la fecha en formato dd/mm/aaaa");
        String fechaString = read.next();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        try {
            fechaIngresada = formatoFecha.parse(fechaString);
        } catch (ParseException e) {
            System.out.println("Error con el formato ingresado. Se usará la fecha actual.");
            e.printStackTrace();
        }
        
        // Convertir la fecha ingresada a LocalDate
        LocalDate fechaI = fechaIngresada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        for (int i = 0; i < listaAlquileres.size(); i++) {
            // Convertir la fecha del alquiler a LocalDate
            LocalDate fechaA = listaAlquileres.get(i).getFechaInicio().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            // Comparar si la fecha ingresada fechaI coincide en el mismo día con la fecha del alquiler (i) de la lista
            if (fechaI.isEqual(fechaA)){
                encontrados++;
                System.out.println(listaAlquileres.get(i).toString());
            }
        }
        if (encontrados > 0){
            System.out.println(encontrados + " alquileres registrados con fecha " + fechaString);
        } else {
            System.out.println("No se encontraron alquileres registrados el día " + fechaString);
        }
        
    }
    
    
}

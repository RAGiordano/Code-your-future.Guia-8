/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Alquiler {

    private String peliculaAlquilada;
    private Date fechaInicio;
    private Date fechaFin;
    private int diasAlquiler;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(String peliculaAlquilada, Date fechaInicio, Date fechaFin) {
        int diasExtra = 0;
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;

        // Crear instancias de Calendar y establecer las fechas
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(fechaInicio);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(fechaFin);

        // Calcular la diferencia en días
        long diferenciaEnMilisegundos = calendar2.getTimeInMillis() - calendar1.getTimeInMillis();
        this.diasAlquiler = (int) (diferenciaEnMilisegundos / (24 * 60 * 60 * 1000)); // Milisegundos en un día
        
        if (this.diasAlquiler > 3){
            diasExtra = this.diasAlquiler - 3;
        }
        
        //Calcular el precio
        this.precio = 10;
        for (int i = 0; i < diasExtra; i++) {
            this.precio += this.precio * 0.1;
        }
        
    }

    public String getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public void setPeliculaAlquilada(String peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    
    @Override
    public String toString() {
        return "Película Alquilada: " + peliculaAlquilada + "\n Fecha alquiler: " + formatearFecha(fechaInicio) + "\n Alquilado hasta: " + formatearFecha(fechaFin) + "\n Precio: $" + String.format("%.2f", precio) + '\n';
    }

    private String formatearFecha(Date fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(fecha);
    }
}

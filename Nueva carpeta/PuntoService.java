/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Yesika Simijaca
 */
public class PuntoService {

    Scanner leer = new Scanner(System.in);

    public Puntos crearPunto() {

        System.out.println("Ingresa las cordenadas x1, y1, x2, y2 ");
        int x1 = leer.nextInt();
        int y1 = leer.nextInt();
        int x2 = leer.nextInt();
        int y2 = leer.nextInt();

        Puntos punto = new Puntos(x1, y1, x2, y2);

        return punto;

    }

    public double calcularDistancia(Puntos punto) {

        double distancia = Math.sqrt(Math.pow(punto.getX2() - punto.getX1(), 2) + Math.pow(punto.getY2() - punto.getY1(), 2));

        return distancia;
    }

}

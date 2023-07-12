/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Ahorcado;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;

/**
 *
 * @author Usuario
 */
public class AhorcadoService {
    Ahorcado ahorcado;
    
    public Ahorcado crearJuego(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        int cantidadDeJugadas;
        
        System.out.println("Ingrese la palabra:");
        palabra = read.next();
        System.out.println("¿Cuál es la cantidad máxima de jugadas?");
        cantidadDeJugadas = parseInt(read.next());
        
        ahorcado = new Ahorcado(palabra, cantidadDeJugadas);
        
        return ahorcado;
    }
    
    public int longitud(){
        return ahorcado.getPalabra().length;
    }
    
    public boolean buscar(char letra){
        boolean encontrado = false;
        for (int i = 0; i < longitud(); i++) {
            if (ahorcado.getPalabra()[i] == letra){
                encontrado = true;
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
            }
        }
        if (encontrado) {
            System.out.println("Se encontró la letra.");
        } else {
            System.out.println("La letra no forma parte de la palabra.");
            ahorcado.setOportunidades(ahorcado.getOportunidades() - 1);
        }
        return encontrado;
    }
    
    public boolean encontradas(char letra){
        boolean encontrada = buscar(letra);
        System.out.println("Letras encontradas: " + ahorcado.getLetrasEncontradas());
        System.out.println("Faltan " + (length(ahorcado.getPalabra())) + " letras.");
        System.out.println("Quedan " + ahorcado.getOportunidades() + " oportunidades.");
        return encontrada;
    }
    
    public int intentos(){
        return ahorcado.getOportunidades();
    }
    
    public void juego(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        char letra;
        System.out.println("El ahorcado");
        while((longitud() - ahorcado.getLetrasEncontradas()) > 0 && ahorcado.getOportunidades() > 0){
            System.out.println("");
            System.out.println("Ingrese una letra:");
            letra = read.next().charAt(0);
            System.out.println("Longitud de la palabra: " + longitud());
            buscar(letra);
            System.out.println("Número de letras (encontradas, faltantes): (" + ahorcado.getLetrasEncontradas() + "," + (longitud() - ahorcado.getLetrasEncontradas()) + ")");
            System.out.println("Número de oportunidades restantes: " + ahorcado.getOportunidades());
        }
        if (!((longitud() - ahorcado.getLetrasEncontradas()) > 0)){
            System.out.println("¡Ganaste! ¡Felicitaciones!");
            
        } else {
            System.out.println("Lo siento. No hay más oportunidades. Game over.");
        }
        
    }
}

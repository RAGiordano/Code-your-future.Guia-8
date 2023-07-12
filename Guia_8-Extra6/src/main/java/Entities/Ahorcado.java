/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Usuario
 */
public class Ahorcado {
    private char[] palabra;
    private int letrasEncontradas;
    private int cantidadMaximaDeJugadas;
    private int oportunidades;

    public Ahorcado() {
    }

    public Ahorcado(String palabra, int cantidadMaximaDeJugadas) {
        this.palabra = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            this.palabra[i] = palabra.charAt(i);
        }
        this.letrasEncontradas = 0;
        this.oportunidades = cantidadMaximaDeJugadas;
        this.cantidadMaximaDeJugadas = cantidadMaximaDeJugadas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadMaximaDeJugadas() {
        return cantidadMaximaDeJugadas;
    }

    public void setCantidadMaximaDeJugadas(int cantidadMaximaDeJugadas) {
        this.cantidadMaximaDeJugadas = cantidadMaximaDeJugadas;
    }
    
    public int getOportunidades() {
        return oportunidades;
    }
    
    public void setOportunidades(int oportunidades) {
        this.oportunidades = oportunidades;
    }
    
}

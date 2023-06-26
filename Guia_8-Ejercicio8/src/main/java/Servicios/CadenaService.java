/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cadena;

/**
 *
 * @author Usuario
 */
public class CadenaService {

    public int mostrarVocales(Cadena cad) {
        int contador = 0;
        for (int i = 0; i < cad.getFrase().length(); i++) {
            char letra = cad.getFrase().toLowerCase().charAt(i);
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++;
            }
        }
        return contador;
    }

    public void invertirFrase(Cadena cad) {
        StringBuilder invertida = new StringBuilder(cad.getFrase()).reverse();
        System.out.println("Cadena invertida: " + invertida.toString());
    }

    public void vecesRepetido(Cadena cad, String letra) {
        int contador = 0;
        for (int i = 0; i < cad.getFrase().length(); i++) {
            char letraComp = cad.getFrase().toLowerCase().charAt(i);
            if (letra.equals(String.valueOf(letraComp))) {
                contador++;
            }
        }
        System.out.println("El caracter " + letra + " Se repite " + contador + " veces");
    }

    public boolean compararLongitud(Cadena cad, String frase) {
        return cad.getFrase().length() == frase.length();
    }

    public void unirFrases(Cadena cad, String frase) {
        String nuevaFrase = cad.getFrase() + " " + frase;
        System.out.println("Frase completa: " + nuevaFrase);
    }

    public void reemplazar(Cadena cad, String letra) {
        String nuevaFrase = cad.getFrase().replace("a", letra);
        System.out.println("La frase luego de reemplazar las letras 'a' por " + letra + " queda así: " + nuevaFrase);
    }

    public boolean contiene(Cadena cad, String letra) {
        return cad.getFrase().contains(letra);
    }
}

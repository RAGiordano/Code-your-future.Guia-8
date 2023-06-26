/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Cadena;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CadenaService {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Cadena c = new Cadena();
    
    public Cadena crearFrase(){
        System.out.println("Ingrese una frase");
        c.setFrase(sc.nextLine());
        String frase = c.getFrase();
        c.setLongitud(frase.length());
        return c;
    }
    
    public void mostrarVocales(){
        int cont = 0;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            String subfrase = c.getFrase().substring(i, i+1);
            if(subfrase.equalsIgnoreCase("a") || subfrase.equalsIgnoreCase("e") || subfrase.equalsIgnoreCase("i")  || subfrase.equalsIgnoreCase("o") ||
            subfrase.equalsIgnoreCase("u"))
                cont += 1;
        }
        System.out.println("El numero de vocales de la frase ingresada es: " + cont);
    }
    
    public void invertirFrase(){
        String reverseFrase = "";
        
        for (int i = c.getLongitud(); i > 0; i--) {
            String subFrase = c.getFrase().substring(i-1, i);
            reverseFrase = reverseFrase.concat(subFrase);
        }
        System.out.println("La frase ingresada al reves es: " + reverseFrase);
    }
    
    public void vecesRepetidas(String letra){
        int cont = 0;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            String subfrase = c.getFrase().substring(i, i+1);
            if(subfrase.equalsIgnoreCase(letra))
                cont += 1;
        }
        System.out.println("El caracter '" + letra + "' se repite " + cont + " veces");
        
    }
    
    public void compararLongitud(String frase){
        if(c.getLongitud() == frase.length())
            System.out.println("La longitu de la frase es igual a la anterior");
        else
            System.out.println("Las frases tienen diferente longitud");
    }
    
    public void unirFrase(String frase){
        System.out.println(c.getFrase().concat(frase));
    }
    
    public void reemplazar(String letra){
        String fraseNueva = c.getFrase().replace("a", letra);
        System.out.println(fraseNueva);
    }
    
    public boolean contiene(String letra){
        boolean con = c.getFrase().contains(letra);
        
        return con;
    }
}
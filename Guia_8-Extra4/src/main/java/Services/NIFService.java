/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.NIF;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NIFService {
    NIF nif = new NIF();
    
    public NIF crearNif(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        long dni;
        int posicionLetra;
        char[] arrayLetras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        char letra;
        
        System.out.println("Ingrese el DNI:");
        dni = Long.parseLong(read.next());
        nif.setDNI(dni);
        posicionLetra = (int) dni % 23;
        letra = arrayLetras[posicionLetra];
        nif.setLetra(letra);
        return nif;
    }
    
    public void mostrar(){
        System.out.println("Los datos guardados son:");
        System.out.println("DNI: " + nif.getDNI());
        System.out.println("NIF: " + nif.getLetra());
    }
}

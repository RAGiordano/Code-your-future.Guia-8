/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MovilService {
    private Movil movil = new Movil();
    
    public void cargarCelular () {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la marca del teléfono: ");
        movil.setMarca(read.next());
        System.out.println("Ingrese el precio: ");
        movil.setPrecio(read.nextFloat());
        System.out.println("Ingrese el modelo: ");
        movil.setModelo(read.next());
        System.out.println("Ingrese la cantidad de memoria RAM: ");
        movil.setMemoriaRam(read.nextInt());
        System.out.println("Ingrese la cantidad de GB de almacenamiento: ");
        movil.setAlmacenamiento(read.nextInt());
        ingresarCodigo();
        
    }
    
    private void ingresarCodigo(){
        int[] codigo = new int[7];
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese uno a uno los dígitos del código:");
        for (int i = 0; i < movil.getCodigo().length; i++) {
            codigo[i] = read.nextInt();
        
        movil.setCodigo(Arrays.copyOf(codigo, codigo.length));
            
        }
    }

    public void mostrarCelular() {
        System.out.println("Datos del celular:");
        System.out.println(movil.toString());
    }
}

//    private String marca;
//    private float precio;
//    private String modelo;
//    private int memoriaRam;
//    private int almacenamiento;
//    private int[] codigo = new int[7];
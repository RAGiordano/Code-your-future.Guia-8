/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.desafiogrupal3;

import Services.ClienteService;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainDesafioGrupal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteService clienteS = new ClienteService();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int cantClientes = 2;
        
        
        System.out.println("VAMOS A REGISTRAR " + cantClientes + " CLIENTES");
        for (int i = 0; i < cantClientes; i++) {
            clienteS.registrarCliente();
        }
        
        System.out.println("MOSTRAR LOS DATOS DE LOS CLIENTES REGISTRADOS");
        System.out.println("");
        clienteS.obtenerClientes();
        
        System.out.println("MODIFICAR UN CLIENTE");
        System.out.println("");
        System.out.println("Ingrese el Id del cliente a modificar:");
        int id = Integer.parseInt(read.next());
        System.out.println("Ingrese el nombre del cliente");
        String nombre = read.next();
        System.out.println("Ingrese la edad:");
        int edad = parseInt(read.next());
        System.out.println("Ingrese la altura:");
        double altura = Double.parseDouble(read.next());
        System.out.println("Ingrese el peso:");
        double peso = Double.parseDouble(read.next());
        System.out.println("Ingrese el objetivo:");
        String objetivo = read.next();
        clienteS.actualizarCliente(id, nombre, cantClientes, cantClientes, cantClientes, objetivo);
        System.out.println("");
        
        
        System.out.println("MOSTRAR LOS DATOS DE LOS CLIENTES REGISTRADOS");
        System.out.println("");
        clienteS.obtenerClientes();
        
        
        System.out.println("BORRAR UN CLIENTE");
        System.out.println("");
        System.out.println("Ingrese el Id del cliente a borrar:");
        id = Integer.parseInt(read.next());
        clienteS.eliminarCliente(id);
        
        System.out.println("MOSTRAR LOS DATOS DE LOS CLIENTES REGISTRADOS");
        System.out.println("");
        clienteS.obtenerClientes();
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Cliente;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClienteService {
    private Cliente cliente = new Cliente();
    private static Scanner read = new Scanner(System.in).useDelimiter("\n");
    private static int id = 0;
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    
    private static int generarId(){
        id++;
        return id;
    }
    
    
    public static Cliente registrarCliente(){
        System.out.println("REGISTRO DE CLIENTE");
        System.out.println("");
        int id = generarId();
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
        Cliente cliente = new Cliente(id, nombre, edad, altura, peso, objetivo);
        listaClientes.add(cliente);
        System.out.println("");
        System.out.println("Cliente registrado exitosamente.");
        System.out.println("");
        return cliente;
    }
    
    public static ArrayList obtenerClientes(){
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println("LISTA DE CLIENTES");
            System.out.println("");
            System.out.println(listaClientes.get(i).toString());
        }
        return listaClientes;
    }
    
    public static void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo){
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getId() == id){
                listaClientes.get(i).setNombre(nombre);
                listaClientes.get(i).setEdad(edad);
                listaClientes.get(i).setAltura(altura);
                listaClientes.get(i).setPeso(peso);
                listaClientes.get(i).setObjetivo(objetivo);
                System.out.println("Se actualizaron los datos del cliente.");
            }
        }
    }
    
    public static void eliminarCliente(int id){
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getId() == id){
                listaClientes.remove(i);
                System.out.println("Se eliminó el cliente con id " + id);
            }
        }
    }
}

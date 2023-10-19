/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import tienda.entidades.Producto;
import tienda.servicios.ProductoService;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia_JDBCEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws Exception{
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        String option = "";
        String enter = "";
        
        do {
            System.out.println(" ____________________");
            System.out.println("|                    |");
            System.out.println("|        MENÚ        |");
            System.out.println("|____________________|");
            System.out.println("");
            System.out.println("a) Lista el nombre de todos los productos que hay en la tabla producto");
            System.out.println("b) Lista los nombres y los precios de todos los productos de la tabla producto");
            System.out.println("c) Listar aquellos productos cuyo precio esté entre 120 y 202");
            System.out.println("d) Buscar y listar todos los Portátiles de la tabla producto");
            System.out.println("e) Listar el nombre y el precio del producto más barato");
            System.out.println("f) Ingresar un producto a la base de datos");
            System.out.println("g) Ingresar un fabricante a la base de datos");
            System.out.println("h) Editar un producto con datos a elección");
            System.out.println("i) Salir del sistema");
            
            option = read.next().toLowerCase();
            
            switch (option) {
                case "a":
                    listarNombresProductos();
                    System.out.println("");
                    System.out.println("Presione <ENTER> para continuar");
                    enter = read.next();
                    break;
                case "b":
                    listarNombresYPreciosProductos();
                    System.out.println("");
                    System.out.println("Presione <ENTER> para continuar");
                    enter = read.next();
                    break;
            }
            
        } while (!option.equals("i"));
        
        System.out.println("");
        System.out.println("Usted ha salido del sistema."); 
    }
    
    private static void listarNombresProductos () throws Exception {
        ProductoService ps = new ProductoService();
        
        Collection<Producto> productos = ps.listarProductos();
        
        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
        }
    }
    
    private static void listarNombresYPreciosProductos () throws Exception {
        ProductoService ps = new ProductoService();
        
        Collection<Producto> productos = ps.listarProductos();
        
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + ". Precio: $ " + producto.getPrecio());
        }
    }
    
}

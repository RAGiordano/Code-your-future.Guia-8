
package tienda;

import java.util.Collection;
import tienda.entidades.Producto;
import tienda.servicios.ProductoService;

public class Principal {

    public static void main(String[] args) throws Exception {
        
        ProductoService ps = new ProductoService();
        Producto producto = new Producto();
        
        //Collection<Producto> productos = ps.listarProductos();
        
        //for (Producto producto : productos) {
            //System.out.println(producto.getNombre());
            
        //}
        
        System.out.println(producto.getNombre());
    }
    
}

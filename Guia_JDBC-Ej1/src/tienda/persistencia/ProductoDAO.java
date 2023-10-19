/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import tienda.entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Usuario
 */
public final class ProductoDAO extends DAO{
    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM Producto ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                
                //Producto producto = usuarioService.buscarUsuarioPorId(idUsuario);
                //producto.setUsuario(usuario);
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
}

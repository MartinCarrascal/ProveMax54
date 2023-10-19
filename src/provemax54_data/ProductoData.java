/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax54_data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import provemax54_entidades.ProductoEntidades;
import provemax54_entidades.ProveedorEntidades;

/**
 *
 * @author Ideapad 5
 */
public class ProductoData {

    Connection connection = null;

    public ProductoData() {

        connection = Conexion.getConexion();
    }

    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void guardarProducto(ProductoEntidades producto) {

        String sql = "INSERT INTO producto (nombreProducto, descripcion, precioActual, stock, estado) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                mensaje("Se agregó el producto exitosamente ");
                ps.close();
                rs.close();

            } else {
                mensaje("No se pudo agregar el producto ");
            }

        } catch (SQLException e) {
            mensaje("No se puedo acceder a la table" + e.getMessage());
        }

    }

    public void modificarProducto(ProductoEntidades producto) {

        String sql = "UPDATE producto SET nombreProducto = ?, descripcion = ?, precioActual = ?, stock = ? WHERE idProducto = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setInt(5, producto.getIdProducto());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                mensaje("El producto " + producto.getNombreProducto() + " fue modificado exitosamente");
            } else {
                mensaje("El producto no se pudo modificar");
            }
            ps.close();

        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla producto " + e.getMessage());
        }

    }
    
    public void eliminarProducto(ProductoEntidades producto) {
        
        String sql = "UPDATE producto SET estado = 0 WHERE idProducto = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, producto.getIdProducto());
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                mensaje("El producto fue eliminado exitosamente");
            }else {
                mensaje("El producto no se pudo eliminar");
            }
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla producto " + e.getMessage());
        }
    }
    
        public ProductoEntidades buscarProductoPorId(int id) {

        ProductoEntidades producto = null;
        String sql = "SELECT nombreProducto, descripcion, precioActual, stock FROM producto WHERE idProducto = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                producto = new ProductoEntidades();
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
               

            } else {
                mensaje("No exixte el producto");
                ps.close();
            }
            
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla producto" + e.getMessage());
        }
        return producto;
    }

          public List<ProductoEntidades> listarProductos() {
        ArrayList<ProductoEntidades> productos = new ArrayList<>();
        String sql = "SELECT * FROM producto WHERE estado = 1 ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProductoEntidades prod = new ProductoEntidades();

                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estado"));

                productos.add(prod);
                ps.close();

            }
        } catch (Exception e) {
            mensaje("Error al acceder a la tabla Proveedor" + e.getMessage());
        }
        return productos;

    }
          
         public boolean consultarStock( int id, int cant) {

        int stock = 0;
      
        String sql = "SELECT stock FROM producto WHERE idProducto = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                stock = rs.getInt("stock");
                if (stock >= cant) {
                    return true;
                } else {
                    return false;
                }

            } else {
                mensaje("No exixte el producto");
                ps.close();
            }
            
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla producto" + e.getMessage());
        }
        return false;
    }
}

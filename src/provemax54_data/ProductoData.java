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
import javax.swing.JOptionPane;
import provemax54_entidades.ProductoEntidades;

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

            }

        } catch (SQLException e) {
            mensaje("No se puedo acceder a la table" + e.getMessage());
        }

    }

    public void modificarProducto(ProductoEntidades producto) {

        String sql = "UPDATE producto SET nombreProducto = ?, descripcion = ?, precioActual = ?, stock = ?, estado =  ? WHERE idProducto = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdProducto());

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
    
        public ProductoEntidades buscarProductoPorId(int dni) {

        ProductoEntidades producto = null;
        String sql = "SELECT nombreProducto, descripcion, precioActual, stock FROM producto WHERE idProducto = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
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

}

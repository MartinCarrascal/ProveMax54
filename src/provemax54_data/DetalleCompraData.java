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
import provemax54_entidades.CompraEntidades;
import provemax54_entidades.DetalleCompraEntidades;
import provemax54_entidades.ProductoEntidades;
import provemax54_entidades.ProveedorEntidades;

/**
 *
 * @author Ideapad 5
 */
public class DetalleCompraData {
    
    Connection connection = null;

    public DetalleCompraData() {

        connection = Conexion.getConexion();
    }

    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public DetalleCompraEntidades guardarDetalleCompra(DetalleCompraEntidades detalleCompra) {

        String sql = "INSERT INTO  detallecompra ( idCompra , idProducto ,  cantidad ,  precioCosto , estado) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalleCompra.getCompra().getIdCompra());
            ps.setInt(2, detalleCompra.getProducto().getIdProducto());
            ps.setInt(3, detalleCompra.getCantidad());
            ps.setDouble(4, detalleCompra.getPrecioCosto());
            ps.setBoolean(5, detalleCompra.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                detalleCompra.setIdDetalle(rs.getInt(1));
                mensaje("Se agregó el producto exitosamente ");
                ps.close();
                rs.close();

            }

        } catch (SQLException e) {
            mensaje("No se puedo acceder a la tabla" + e.getMessage());
        }
            return detalleCompra;
    }
    
    public DetalleCompraEntidades obtenerDetalleCompra(DetalleCompraEntidades det, CompraEntidades compra, ProveedorEntidades prov){
  
          String sql = "SELECT detallecompra ( idCompra , idProducto ,  cantidad ,  precioCosto , estado) FROM detallecompra WHERE idProveedor = ?";

         PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, prov.getIdProveedor());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                DetalleCompraEntidades detalle = new DetalleCompraEntidades();
//               detalle.setNombreProducto(rs.getString("nombreProducto"));
//                detalle.setDescripcion(rs.getString("descripcion"));
//                producto.setPrecioActual(rs.getDouble("precioActual"));
//                producto.setStock(rs.getInt("stock"));

detalle.setCompra(compra); //verificar si recibe
detalle.setCantidad(Integer.parseInt(rs.getString("idCompra")));
detalle.setPrecioCosto((rs.getDouble("precioCosto")));

//detalle.setCantidad();
               

            } else {
                mensaje("No existe la compra");
                ps.close();
            }
            
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla compra" + e.getMessage());
        }
        return det;
      
    }
    
}

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
import provemax54_entidades.DetalleCompraEntidades;
import provemax54_entidades.ProductoEntidades;

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

        String sql = "INSERT INTO  detallecompra ( idCompra , idProducto ,  cantidad ,  precioCosto ) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalleCompra.getIdCompra());
            ps.setInt(2, detalleCompra.getProducto().getIdProducto());
            ps.setInt(3, detalleCompra.getCantidad());
            ps.setDouble(4, detalleCompra.getPrecioCosto());
      
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                detalleCompra.setIdDetalle(rs.getInt(1));
               // mensaje("Se agregó el producto exitosamente ");
                ps.close();
                rs.close();

            }

        } catch (SQLException e) {
            mensaje("No se puedo acceder a la table" + e.getMessage());
        }
            return detalleCompra;
    }
    
    
    
}

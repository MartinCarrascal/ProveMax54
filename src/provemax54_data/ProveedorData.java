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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import provemax54_entidades.ProveedorEntidades;

/**
 *
 * @author Ideapad 5
 */
public class ProveedorData {
    
    private Connection connection = null;
    
    public ProveedorData() {
        
        connection = Conexion.getConexion();
    }
    
    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public void agregarProveedor(ProveedorEntidades proveedor) {
        
        String sql = "INSERT INTO proveedor( razonSocial ,  domicilio,  telefono,  estado ) VALUES (?,?,?,?)";
        
        try {
            
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setBoolean(4, proveedor.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                proveedor.setIdProveedor(rs.getInt(1));
                mensaje("Se agregó un proveedor exitosamente");
                ps.close();
                rs.close();
            }
            
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla proveedor " + e.getMessage());
        }
    }
    
    public void modificarProveedor(ProveedorEntidades proveedor) {
        
        String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono = ?, estado = ? WHERE idProveedor = ?";
         PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setBoolean(4, proveedor.isEstado());
            ps.setInt(5, proveedor.getIdProveedor());
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                mensaje("El proveedor " + proveedor.getRazonSocial() + " fue modificado exitosamente");
            } else{
                mensaje("El proveedor no se pudo modificar");
            }
            
            ps.close();
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla proveedor " + e.getMessage());
        }
    }
    
    public void eliminarProveedor(ProveedorEntidades proveedor) {
        
        String sql = "UPDATE proveedor SET estado = 0 WHERE idProveedor = ?";
        
        try(PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, proveedor.getIdProveedor());
             int exito = ps.executeUpdate();
           
            if (exito ==1) {
                mensaje("Se elimino el proveedor");
            }else {
                mensaje("El proveedor no se pudo eliminar");
            }
            
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla proveedor " + e.getMessage());
        }
    }
    
}

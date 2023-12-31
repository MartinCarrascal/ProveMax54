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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
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

        String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono = ? WHERE idProveedor = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
 //           ps.setBoolean(4, proveedor.isEstado());
          ps.setInt(4, proveedor.getIdProveedor());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                mensaje("El proveedor " + proveedor.getRazonSocial() + " fue modificado exitosamente");
            } else {
                mensaje("El proveedor no se pudo modificar");
            }

            ps.close();
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla proveedor " + e.getMessage());
        }
    }

    public void eliminarProveedor(ProveedorEntidades proveedor) {

        String sql = "UPDATE proveedor SET estado = 0 WHERE idProveedor = ?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, proveedor.getIdProveedor());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                mensaje("Se elimino el proveedor");
            } else {
                mensaje("El proveedor no se pudo eliminar");
            }

        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla proveedor " + e.getMessage());
        }
    }
    
        public void eliminarProveedorPorId(int id) {

        String sql = "UPDATE proveedor SET estado = 0 WHERE idProveedor = ?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                mensaje("Se elimino el proveedor");
            } else {
                mensaje("El proveedor no se pudo eliminar");
            }

        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla proveedor " + e.getMessage());
        }
    }
    

    public ProveedorEntidades buscarPorID(int id) {

        ProveedorEntidades proveedor = null;
        String sql = "SELECT * FROM `proveedor` WHERE idProveedor = ?";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                proveedor = new ProveedorEntidades();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setEstado(rs.getBoolean("estado"));

            } else {
                mensaje("No existe el Proveedor");

            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla Proveedor" + e.getMessage());
        }
        return proveedor;
    }

    public List<ProveedorEntidades> listarProveedor() {
        ArrayList<ProveedorEntidades> proveedor = new ArrayList<>();
        String sql = "SELECT * FROM proveedor WHERE estado = 1 ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProveedorEntidades prov = new ProveedorEntidades();

                prov.setIdProveedor(rs.getInt("idProveedor"));
                prov.setRazonSocial(rs.getString("razonSocial"));
                prov.setDomicilio(rs.getString("domicilio"));
                prov.setTelefono(rs.getString("telefono"));
                prov.setEstado(rs.getBoolean("estado"));

                proveedor.add(prov);
                ps.close();

            }
        } catch (Exception e) {
            mensaje("Error al acceder a la tabla Proveedor" + e.getMessage());
        }
        return proveedor;

    }
    
    
    public ProveedorEntidades buscarProveedor (String proveedor){
        
        ProveedorEntidades prov = null;
        String sql = "SELECT idProveedor, razonSocial, domicilio, telefono, estado FROM `proveedor` WHERE razonSocial = ? AND = 1";
        PreparedStatement ps = null;
        
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(2, "razonSocial");
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                prov.setIdProveedor(rs.getInt("idProveedor"));
                prov.setRazonSocial("razonSocial");
                prov.setDomicilio(rs.getString("domicilio"));
                prov.setTelefono(rs.getString("Telefono"));
                prov.setEstado(true);
                
            }else{
                mensaje("No existe el proveedor");
                ps.close();
            }
        } catch (Exception e) {
                mensaje("Error al acceder a la tabla Proveedor" + e.getMessage());
        }
        return prov;
    }
}



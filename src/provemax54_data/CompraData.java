/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax54_data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import provemax54_entidades.CompraEntidades;

/**
 *
 * @author Ideapad 5
 */
public class CompraData {

    Connection connection = null;
    ProveedorData proveedor = null;

    public CompraData() {

        connection = Conexion.getConexion();
        proveedor = new ProveedorData();
    }

    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public CompraEntidades guardarCompra(CompraEntidades compra) {

        String sql = "INSERT INTO compra(idProveedor, fecha, estado) VALUES (?,?,?) ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(compra.getFecha()));
            ps.setBoolean(3, compra.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                compra.setIdCompra(rs.getInt(1));
                mensaje("Se agrego la compra exitosamente");
                ps.close();
            }
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla Compra" + e.getMessage());
        }
        return compra;
    }

    public List<CompraEntidades> comprasProveedor(int idProveedor) {

        ArrayList<CompraEntidades> compra = new ArrayList<>();
        CompraEntidades compraE = new CompraEntidades();
//        String sql = "SELECT COUNT(*) AS total_compras FROM compra WHERE idProveedor = ?";
        String sql = "SELECT * FROM `compra` WHERE idProveedor = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                compraE.setProveedor(proveedor.buscarPorID(rs.getInt("idProveedor")));
                compraE.setIdCompra(rs.getInt("idCompra"));
                compraE.setEstado(rs.getBoolean("estado"));
                compraE.setFecha(rs.getDate("fecha").toLocalDate());

                compra.add(compraE);
            }

            ps.close();

        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla Compra" + e.getMessage());
        }
        return compra;
    }
    
    
    

//    public CompraEntidades buscarCompra(int id) {
//        
//        CompraEntidades compra = null;
//        String sql = "SELECT idProveedor, fecha FROM compra WHERE idCompra = ? AND estado = 1";
//        PreparedStatement ps = null;
//
//        ps = connection.prepareStatement(sql);
//        ps.setInt(1, id);
//        ResultSet rs = ps.executeQuery();
//
//        if (rs.next()) {
//            compra = new CompraEntidades();
//        }
//        compra.setIdCompra(id);
//        compra.setIdProveedor(rs.getInt(id));
//        compra.setEstado(true);
//        
//    }else{
//    mensaje ("No existe la compra");
//    ps.close();
//    
//
}

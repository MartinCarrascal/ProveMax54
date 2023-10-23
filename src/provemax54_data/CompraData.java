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
import provemax54_entidades.ProductoEntidades;

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
    

    // 2 Todas las compras a un Proveedor 
    public List<CompraEntidades> comprasProveedor(int idProveedor) {

        ArrayList<CompraEntidades> compra = new ArrayList<>();
        CompraEntidades compraE;
        
//        String sql = "SELECT COUNT(*) AS total_compras FROM compra WHERE idProveedor = ?";
        String sql = "SELECT * FROM `compra` WHERE idProveedor = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                compraE = new CompraEntidades();
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

    public void eliminarCompra(int id) {
        //Paso el id del alumno que quiero eliminar en el metodo 

        String sql = "UPDATE compra SET estado = 0 WHERE idCompra = ? ";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                mensaje("Se elimino la compra");
            } else {
                mensaje("La compra no se pudo eliminar");
            }

        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla compra " + e.getMessage());
        }
    }

    // 1 y 3 Todos los productos de una fecha / todos los productos de una compra en particular
    public List<ProductoEntidades> compraPorFecha(Date fecha) {

        ArrayList<ProductoEntidades> productos = new ArrayList<>();
        ProductoEntidades prod = new ProductoEntidades();

        String sql = "SELECT p.* FROM producto AS p JOIN detallecompra AS dc ON p.idProducto = dc.idProducto JOIN compra AS c ON dc.idCompra = c.idCompra WHERE DATE(c.fecha) = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDate(1, fecha);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));

                productos.add(prod);
            }
            ps.close();
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla " + e.getMessage());
        }
        return productos;
    }

    //5 Productos mas comprados entre dos fechas
    public List<String[]> productoEntreFechas(Date fecha1, Date fecha2) {
        List<String[]> productos = new ArrayList<>();
        String sql = "SELECT p.descripcion, SUM(d.cantidad) AS cantidadT FROM compra c JOIN detallecompra d USING(idCompra) JOIN producto p USING (idProducto) WHERE c.fecha BETWEEN ? AND ? GROUP BY  d.idProducto ORDER BY cantidad DESC;";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setDate(1, fecha1);
            ps.setDate(2, fecha2);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                productos.add(new String[]{rs.getString("p.descripcion"), "" + rs.getInt("cantidadT")});
            }
        } catch (Exception e) {
        }
        return productos;
    }
    
   // 5 Productos por debajo del stock 
    public List<ProductoEntidades> stockMinimo(int stock) {

        ArrayList<ProductoEntidades> productos = new ArrayList<>();
        ProductoEntidades prod;
        
       // String sql = "SELECT p.* FROM producto p JOIN detallecompra dc ON p.idProducto = dc.idProducto JOIN compra c ON dc.idCompra = c.idCompra WHERE p.estado = 1 AND p.stock < ?;";
       String sql = "SELECT * FROM producto  WHERE estado = 1 AND stock < ?;"; 
       
        try(PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, stock);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {      
                prod = new ProductoEntidades();
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estado"));
                
                productos.add(prod);
            }
            
        } catch (Exception e) {
            mensaje("Error al acceder a la tabla " + e.getMessage());
        }
        return productos;
    }
    
   

}

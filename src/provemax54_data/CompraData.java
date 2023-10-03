/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax54_data;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.JOptionPane;
import provemax54_entidades.CompraEntidades;

/**
 *
 * @author Ideapad 5
 */
public class CompraData {
    
    Conexion connection = null;
    
    public CompraData() {
        
       connection =  Conexion.getConexion();
    }
    
    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    
    public void guardarCompra(CompraEntidades compra) {
        
        String sql = " ";
        
    }
    
}

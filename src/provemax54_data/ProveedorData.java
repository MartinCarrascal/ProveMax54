/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax54_data;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ideapad 5
 */
public class ProveedorData {
     private Connection connection = null;

    public ProveedorData() {
        
        try {
            connection = Conexion.getConexion();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProveedorData.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

       

    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    
    
}

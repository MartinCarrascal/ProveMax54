/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax54_data;

import java.sql.Connection;
import javax.swing.JOptionPane;

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
    
    
    
}

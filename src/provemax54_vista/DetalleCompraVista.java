
package provemax54_vista;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import provemax54_data.Conexion;
import provemax54_data.ProveedorData;
import provemax54_entidades.ProveedorEntidades;



public class DetalleCompraVista extends javax.swing.JInternalFrame {

    private ProveedorData provD;
    private DefaultComboBoxModel comboModel;
    private DefaultTableModel modelo;
    List<ProveedorEntidades> listarProveedor;
    ProveedorEntidades provE;
 Connection connection = Conexion.getConexion();
 
 
    public DetalleCompraVista() {
        
        initComponents();
//        modelo = new DefaultTableModel();
        comboModel = new DefaultComboBoxModel();
        provE = new ProveedorEntidades();
        provD = new ProveedorData();
        cargarCombo();

    
    
        modelo = new DefaultTableModel(new Object[]{"Marca", "descripcion", "cantidad", "PrecioActual", "Subtotal"}, 0);
        //Asignar el modelo de la tabla a la tabla de la vista. La tabla no se mostró hasta que coloque el código de asignación de abajo.
         jTDetalleComp.setModel(modelo); 
        
        
         
     //Hago un evento que escuche al seleccinar un item
        jCProveedor.addItemListener((ItemEvent ie) -> {
            if(ie.getStateChange()==ItemEvent.SELECTED){
                provE = (ProveedorEntidades)jCProveedor.getSelectedItem();
//                    cargarTabla;
            }
        });
    }
    
     private void cargarCombo() {
        //Remuevo para limpiar 
        jCProveedor.removeAllItems();
        //Voy recorriendo la lista de proveedores y cada proveedor lo cargo en el combo
        for (ProveedorEntidades  pro: provD.listarProveedor()) {
            jCProveedor.addItem(pro);
        }
        //Pregunto si tiene cargado algun proveedor y el primero seleccinado lo guardo en la variable
        if (jCProveedor.getItemCount()>0) {
            provE =(ProveedorEntidades)jCProveedor.getSelectedItem();
        }
    }
     
     
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDetalleComp = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jTTotalCompra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jCProveedor = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("DETALLE DE COMPRA");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Fecha por Compra ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Compra");

        jBBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTDetalleComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Marca", "Descripcion", "Cantidad", "Precio Unit.", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(jTDetalleComp);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("  Detalle");

        jBLimpiar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jTTotalCompra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Total Compra");

        jBSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCProveedor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jCProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCProveedorActionPerformed(evt);
            }
        });

        jDateChooser1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
                jDateChosser1PropertyChangeListener(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(jCProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(233, 233, 233)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(311, 311, 311)
                                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(jBLimpiar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(jLabel1)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(546, 546, 546)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBBuscar)
                        .addComponent(jBLimpiar))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(129, 129, 129)
                .addComponent(jLabel7)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(62, 62, 62)
                .addComponent(jBSalir)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
         java.util.Date fechaSeleccionada = jDateChooser1.getDate();
        
         // Obtener ID Proveedor seleccionado
    ProveedorEntidades proveedorSeleccionado = (ProveedorEntidades) jCProveedor.getSelectedItem();
    int idProveedor = provE.getIdProveedor();
        
//    //Conectar... 
//  Connection conexion = null;
//    
//  conexion = Conexion.getConexion();
    
    //Consulta con los parámetros de fecha e idProveedor
     String consultaSQL = "SELECT p.nombreProducto, p.descripcion, dc.cantidad, p.precioActual, (dc.Cantidad * p.precioActual) AS Subtotal " +
                         "FROM producto p " +
                         "INNER JOIN detalleCompra dc ON p.idProducto = dc.idProducto " +
                         "INNER JOIN compra c ON dc.idCompra = c.idCompra " +
                         "WHERE c.fecha = ? AND c.idProveedor = ?";
    
           
         try ( PreparedStatement statement = connection.prepareStatement(consultaSQL)) {
        // Parámetros de la consulta
        statement.setDate(1, new java.sql.Date(fechaSeleccionada.getTime()));
        statement.setInt(2, idProveedor);

        // Ejecuta la consulta y obtiene los resultados
        ResultSet resultado = statement.executeQuery();

        // Limpia el modelo de la tabla antes de agregar nuevos datos
        modelo.setRowCount(0);

        // Itera a través de los resultados y agrega filas a la tabla
        while (resultado.next()) {
            String nombreProducto = resultado.getString("nombreProducto");
            String descripcion = resultado.getString("descripcion");
            int cantidad = resultado.getInt("cantidad");
            double precioActual = resultado.getDouble("precioActual");
            double subtotal = resultado.getDouble("Subtotal");

            // Agrega una fila a la tabla con los datos
            modelo.addRow(new Object[]{nombreProducto, descripcion, cantidad, precioActual, subtotal});
           
        }

        // Calcula y muestra el total de la compra
        double total = calcularTotalCompra();
        jTTotalCompra.setText(String.valueOf(total));
    } catch (SQLException e) {
        e.printStackTrace();
  }          
    }
    
    
          private double calcularTotalCompra() {
    double total = 0.0;
    for (int row = 0; row < modelo.getRowCount(); row++) {
        double subtotal = (double) modelo.getValueAt(row, 4);
        total += subtotal;
    }
    return total;

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
      DefaultTableModel modelo = (DefaultTableModel) jTDetalleComp.getModel();
         modelo.setRowCount(0); 
        // Limpiar la tabla antes de llenarla con datos nuevos.
         jTTotalCompra.setText("");
         jDateChooser1.setCalendar(null);
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCProveedorActionPerformed
//        llenar();
    }//GEN-LAST:event_jCProveedorActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
    
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jDateChosser1PropertyChangeListener(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChosser1PropertyChangeListener
         jDateChooser1.addPropertyChangeListener(new PropertyChangeListener() {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = jDateChooser1.getDate();
            
            if (selectedDate != null) {
                Date currentDate = new Date(); // Fecha actual
                  if (selectedDate.after(currentDate)) {
                JOptionPane.showMessageDialog(null, "La fecha seleccionada supera la fecha actual.");
//                jDateChooser2.setDate(currentDate); // Establece la fecha actual en el JDateChooser 
                jDateChooser1.setDate(null); //o borro la fecha selecciona 
            }
            }          
        }
    }
         });
    }//GEN-LAST:event_jDateChosser1PropertyChangeListener


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<ProveedorEntidades> jCProveedor;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDetalleComp;
    private javax.swing.JTextField jTTotalCompra;
    // End of variables declaration//GEN-END:variables

    
}

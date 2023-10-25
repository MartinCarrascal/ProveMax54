package provemax54_vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;


import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import provemax54_data.CompraData;

import provemax54_data.DetalleCompraData;

import provemax54_entidades.CompraEntidades;
import provemax54_entidades.DetalleCompraEntidades;


public class DetalleCompraVista extends javax.swing.JInternalFrame {


    private List<CompraEntidades> listaCompras;
    private final CompraData COMPD = new CompraData();
    private CompraEntidades compraSeleccionada;
    private final DetalleCompraData DETCOMP = new DetalleCompraData();
    private DefaultComboBoxModel comboModel;
    private DefaultTableModel modeloTabla;



    public DetalleCompraVista() {
        //trae el metodo
         listaCompras = COMPD.ultimaCompra();
         //En el For lleno con el metodo cada elemento de la lista
        listaCompras.forEach(compra -> compra.setListaDetalleCompra(DETCOMP.listarDetalleXCompra(compra.getIdCompra())));
        initComponents();
        comboModel = new DefaultComboBoxModel();
        jCCompras.setModel(comboModel);
       //  compraSeleccionada = (CompraEntidades) jCCompras.getSelectedItem();
        cargarCombo();
        modeloTabla = (DefaultTableModel) jTDetalleComp.getModel();
       
     //   llenarTabla();

        jCCompras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCCompras.getItemCount() > 0) {
                    compraSeleccionada = (CompraEntidades) jCCompras.getSelectedItem();
                }
                llenarTabla();
                jTTotalCompra.setText("" + compraSeleccionada.devolverTotal());
            }
        });
       
    }

    private void cargarCombo() {
          jCCompras.removeAllItems(); //Remuevo para limpiar 
          if (jDFecha.getDate()!= null) {
             LocalDate fechaSeleccionada = jDFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        for (CompraEntidades compra : listaCompras.stream().filter(compra -> compra.getFecha().equals(fechaSeleccionada)).collect(Collectors.toList())) {
            jCCompras.addItem(compra);
        }

        if (jCCompras.getItemCount() > 0) {
            compraSeleccionada = (CompraEntidades) jCCompras.getSelectedItem();
        }
        }
       
    }

    private void llenarTabla() {
        if (modeloTabla.getRowCount() != 0) {
            modeloTabla.setRowCount(0);
        }
        
        if (compraSeleccionada != null) {
               
        for (DetalleCompraEntidades detCompra : compraSeleccionada.getListaDetalleCompra()) {
            modeloTabla.addRow(new Object[]{detCompra.getProducto().getNombreProducto(), detCompra.getProducto().getDescripcion(),
                detCompra.getCantidad(), detCompra.getPrecioCosto(), detCompra.devolverSubtotal()});
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDetalleComp = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jTTotalCompra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jCCompras = new javax.swing.JComboBox<>();
        jDFecha = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("DETALLE DE COMPRA");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Fecha por Compra ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Compra");

        jTDetalleComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Descripcion", "Cantidad", "Precio Unit.", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTDetalleComp.getTableHeader().setReorderingAllowed(false);
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

        jCCompras.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jDFecha.setDate(Date.from(Instant.now()));
        jDFecha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jDFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDFechaPropertyChange(evt);
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
                        .addComponent(jCCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                    .addComponent(jDFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(475, 475, 475)
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
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jCCompras.removeAllItems();
        modeloTabla.setRowCount(0);
        // Limpiar la tabla antes de llenarla con datos nuevos.
        jTTotalCompra.setText("");
        jDFecha.setCalendar(null);
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jDFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDFechaPropertyChange

         if (jDFecha.getDate() != null) {
            LocalDate fechaSeleccionada = jDFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (fechaSeleccionada.compareTo(LocalDate.now()) > 0) {
                JOptionPane.showMessageDialog(this, "No es posible elegir una fecha mayor al corriente dia");
                jDFecha.setDate(Date.from(Instant.now()));
            }
            cargarCombo();
            llenarTabla();
        }
   
    }//GEN-LAST:event_jDFechaPropertyChange

    private void jDateChosser1PropertyChangeListener(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChosser1PropertyChangeListener


    }//GEN-LAST:event_jDateChosser1PropertyChangeListener


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<CompraEntidades> jCCompras;
    private com.toedter.calendar.JDateChooser jDFecha;
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

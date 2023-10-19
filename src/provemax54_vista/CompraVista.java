/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax54_vista;

import java.awt.Font;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import provemax54_data.ProductoData;
import provemax54_data.ProveedorData;
import provemax54_entidades.CompraEntidades;
import provemax54_entidades.DetalleCompraEntidades;
import provemax54_entidades.ProductoEntidades;
import provemax54_entidades.ProveedorEntidades;

/**
 *
 * @author Ideapad 5
 */
public class CompraVista extends javax.swing.JInternalFrame {

    private ProveedorEntidades provSeleccionado;
    private ProveedorData pd;
    private ProductoEntidades prodSeleccionado;
    private ProductoData produ;
    private DefaultTableModel modelo;
    private List<DetalleCompraEntidades> detalles;
    private CompraEntidades compra;

    /**
     * Creates new form CompraVista
     */
    public CompraVista() {
        compra = new CompraEntidades();
        pd = new ProveedorData();
        produ = new ProductoData();
        
        initComponents();
        jDFecha.setDateFormatString("dd MMMM yyyy");
        jDFecha.setDate(Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        cargarComboProveedor();
        cargarComboProducto();
        SpinnerNumberModel modelCantidad = new SpinnerNumberModel(0, 0, 1000, 1);
        jSCantidad.setModel(modelCantidad);
        dibujarTabla();
    }

    private void cargarComboProveedor() {
        jCProveedor.removeAllItems();
        //Cargo el comboBox con lista de proveedores
        for (ProveedorEntidades pro : pd.listarProveedor()) {
            jCProveedor.addItem(pro);
        }
        //Cargo los tField con datos del proveedor seleccionado
        if (jCProveedor.getItemCount() > 0) {
            provSeleccionado = (ProveedorEntidades) jCProveedor.getSelectedItem();
            jTDomicilio.setText(provSeleccionado.getDomicilio());
            jTTelefono.setText(provSeleccionado.getTelefono());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jSpinField1 = new com.toedter.components.JSpinField();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jYearChooser2 = new com.toedter.calendar.JYearChooser();
        jSpinField2 = new com.toedter.components.JSpinField();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jMonthChooser2 = new com.toedter.calendar.JMonthChooser();
        jLocaleChooser2 = new com.toedter.components.JLocaleChooser();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDayChooser2 = new com.toedter.calendar.JDayChooser();
        jLocaleChooser3 = new com.toedter.components.JLocaleChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTTelefono = new javax.swing.JTextField();
        jCProveedor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTDomicilio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jBCargarProd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jBGuardarCompra = new javax.swing.JButton();
        jBEliminarProd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCProducto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jDFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSCantidad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jTTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("COMPRA");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Razon Social");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Domicilio");

        jTTelefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTTelefono.setEnabled(false);
        jTTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTelefonoActionPerformed(evt);
            }
        });

        jCProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jCProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCProveedorActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Teléfono");

        jTDomicilio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTDomicilio.setEnabled(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Descripcion", "Cantidad", "Precio Unit.", "SubTotal", "Producto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(5).setMinWidth(0);
            table.getColumnModel().getColumn(5).setPreferredWidth(0);
            table.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jBCargarProd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBCargarProd.setText("Cargar  ");
        jBCargarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargarProdActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Salir");

        jBGuardarCompra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBGuardarCompra.setText("Guardar Compra");
        jBGuardarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarCompraActionPerformed(evt);
            }
        });

        jBEliminarProd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBEliminarProd.setText("Eliminar");
        jBEliminarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarProdActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Detalle de Compra");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Datos del Proveedor");

        jCProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCProductoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Producto");

        jDFecha.setAlignmentX(1.0F);
        jDFecha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Fecha");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Limpiar");

        jSCantidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad");

        jLabel4.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jDFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(185, 185, 185))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(456, 456, 456)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCargarProd)
                    .addComponent(jBEliminarProd))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(454, 454, 454)
                        .addComponent(jBGuardarCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addComponent(jLabel7))
                                .addGap(53, 53, 53)
                                .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTDomicilio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jCProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jSCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jSCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(40, 40, 40)
                                .addComponent(jButton2)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jBGuardarCompra)
                                .addGap(87, 87, 87))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jBCargarProd)
                        .addGap(29, 29, 29)
                        .addComponent(jBEliminarProd)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEliminarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEliminarProdActionPerformed

    private void jTTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTelefonoActionPerformed

    //Accion del comboBox para ir cargando los tField con los datos del proveedor a medida que elije item
    private void jCProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCProveedorActionPerformed
        provSeleccionado = (ProveedorEntidades) jCProveedor.getSelectedItem();
        jTDomicilio.setText(provSeleccionado.getDomicilio());
        jTTelefono.setText(provSeleccionado.getTelefono());
    }//GEN-LAST:event_jCProveedorActionPerformed

    private void cargarComboProducto() {
        jCProducto.removeAllItems();
        //Cargo el comboBox con lista de proveedores
        for (ProductoEntidades pro : produ.listarProductos()) {
            jCProducto.addItem(pro);
        }
        //Cargo los tField con datos del proveedor seleccionado
        if (jCProducto.getItemCount() > 0) {
            prodSeleccionado = (ProductoEntidades) jCProducto.getSelectedItem();

        }
    }
    private void jBGuardarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBGuardarCompraActionPerformed

    private void jCProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCProductoActionPerformed
        prodSeleccionado = (ProductoEntidades) jCProducto.getSelectedItem();
    }//GEN-LAST:event_jCProductoActionPerformed

    private void jBCargarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargarProdActionPerformed
        if (produ.consultarStock(prodSeleccionado.getIdProducto(), (int) jSCantidad.getValue())&&(int)jSCantidad.getValue()>0) {
            DetalleCompraEntidades detalle = new DetalleCompraEntidades(0, prodSeleccionado, (int)jSCantidad.getValue(), prodSeleccionado.getPrecioActual());
                compra.addListaDetalleCompra(detalle);
                modelo.addRow(new Object[]{prodSeleccionado.getNombreProducto(),prodSeleccionado.getDescripcion(),jSCantidad.getValue(),prodSeleccionado.getPrecioActual(),detalle.devolverSubtotal(),detalle});
              jTTotal.setText(""+ compra.devolverTotal() );
        }
    }//GEN-LAST:event_jBCargarProdActionPerformed

    private void dibujarTabla() {
        // Personalizar la alineación y la fuente de la cabecera
        JTableHeader tableHeader = table.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) tableHeader.getDefaultRenderer();

        // Cambiar la alineación de la cabecera (izquierda en este caso)
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Cambiar la fuente de la cabecera
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));

        // Crear renderizadores personalizados para diferentes alineaciones
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(JLabel.LEFT);

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);

        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);  
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer); 
        table.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);  
        table.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        modelo = (DefaultTableModel) table.getModel();

    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCargarProd;
    private javax.swing.JButton jBEliminarProd;
    private javax.swing.JButton jBGuardarCompra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<ProductoEntidades> jCProducto;
    private javax.swing.JComboBox<ProveedorEntidades> jCProveedor;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private com.toedter.calendar.JDateChooser jDFecha;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private com.toedter.calendar.JDayChooser jDayChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private com.toedter.components.JLocaleChooser jLocaleChooser2;
    private com.toedter.components.JLocaleChooser jLocaleChooser3;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private com.toedter.calendar.JMonthChooser jMonthChooser2;
    private javax.swing.JSpinner jSCantidad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.components.JSpinField jSpinField1;
    private com.toedter.components.JSpinField jSpinField2;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTextField jTTotal;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private com.toedter.calendar.JYearChooser jYearChooser2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

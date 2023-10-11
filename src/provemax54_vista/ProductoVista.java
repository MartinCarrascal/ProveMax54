/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax54_vista;

import javax.swing.JOptionPane;
import provemax54_data.ProductoData;
import provemax54_entidades.ProductoEntidades;

/**
 *
 * @author Ideapad 5
 */
public class ProductoVista extends javax.swing.JInternalFrame {

    private boolean esNuevo;
    ProductoData prodD;
    ProductoEntidades prodE;

    public ProductoVista() {
        initComponents();
        prodD = new ProductoData();
        prodE = new ProductoEntidades();
        esNuevo = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTMarca = new javax.swing.JTextField();
        jTDescripcion = new javax.swing.JTextField();
        jTPrecioActual = new javax.swing.JTextField();
        jTStock = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jREstado = new javax.swing.JRadioButton();
        jTIdProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("PRODUCTO");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Marca ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Descripcion");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Precio Actual");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Stock");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Estado");

        jTMarca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTMarca.setEnabled(false);

        jTDescripcion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTDescripcion.setEnabled(false);
        jTDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDescripcionActionPerformed(evt);
            }
        });

        jTPrecioActual.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTPrecioActual.setEnabled(false);

        jTStock.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTStock.setEnabled(false);

        jBGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jBModificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBNuevo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jREstado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jTIdProducto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTIdProducto.setToolTipText("");
        jTIdProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Id Producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBGuardar)
                                .addGap(71, 71, 71)
                                .addComponent(jBModificar)
                                .addGap(54, 54, 54)
                                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTIdProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                    .addComponent(jTDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jREstado)
                                    .addComponent(jTStock, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(jTPrecioActual))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 109, Short.MAX_VALUE)
                        .addComponent(jBuscar)
                        .addContainerGap(162, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jBEliminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jBuscar)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jREstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBSalir)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBGuardar)
                            .addComponent(jBNuevo)
                            .addComponent(jBModificar)
                            .addComponent(jBEliminar))
                        .addGap(71, 71, 71))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDescripcionActionPerformed

    }//GEN-LAST:event_jTDescripcionActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        esNuevo = false;
        int idProducto;

        String input = jTIdProducto.getText();

        // Validar que input sea un número y tenga hasta 4 caracteres.      
        if (input.matches("\\d{1,4}")) {

            idProducto = Integer.parseInt(input);

            idProducto = Integer.parseInt(jTIdProducto.getText());

            ProductoEntidades produ = prodD.buscarProductoPorId(idProducto);

            jBModificar.setEnabled(true);
            jTMarca.setEnabled(false);
            jTDescripcion.setEnabled(false);
            jTPrecioActual.setEnabled(false);
            jTStock.setEnabled(false);
            jREstado.setSelected(true);
            jREstado.setEnabled(false);

            jTMarca.setText(produ.getNombreProducto());
            jTDescripcion.setText(produ.getDescripcion());
            jTPrecioActual.setText(String.valueOf(produ.getPrecioActual()));
            jTStock.setText(String.valueOf(produ.getStock()));

            jBEliminar.setEnabled(true);
            jBGuardar.setEnabled(true);
            jBuscar.setEnabled(true);
            jBNuevo.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "El número de id del proveedor no es válido, debe contener solo números hasta 4 dígitos");
        }


    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        int idProducto = Integer.parseInt(jTIdProducto.getText());
        ProductoEntidades prod = prodD.buscarProductoPorId(idProducto);
        prod.setIdProducto(idProducto);

//        int idProd = prod.getIdProducto();
        prodD.eliminarProducto(prod);

        limpiar();
        jREstado.setSelected(false);
        jBEliminar.setEnabled(false);
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        limpiar();
        jREstado.setSelected(true);
        jREstado.setEnabled(false);
        jTIdProducto.setEnabled(false);
        jTStock.setEnabled(true);
        jTMarca.setEnabled(true);
        jTDescripcion.setEnabled(true);
        jTPrecioActual.setEnabled(true);

        jBuscar.setEnabled(false);
        jBGuardar.setEnabled(true);
        jBEliminar.setEnabled(false);
        jBModificar.setEnabled(false);
        jBNuevo.setEnabled(true);
        esNuevo = true;

    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        jTIdProducto.setEnabled(false);
        jREstado.setEnabled(false);
        jREstado.setSelected(true);
        jTMarca.setEnabled(true);
        jTDescripcion.setEnabled(true);
        jTPrecioActual.setEnabled(true);
        jTStock.setEnabled(true);
        esNuevo = false;

    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
//        String input = jTIdProducto.getText();

        if (esNuevo) {
            String nombreProducto = jTMarca.getText();
            String descripcion = jTDescripcion.getText();
            double precioActual = Double.parseDouble(jTPrecioActual.getText());
            int stock = Integer.parseInt(jTStock.getText());
            ProductoEntidades prod = new ProductoEntidades(nombreProducto, descripcion, precioActual, stock, true);

            prodD.guardarProducto(prod);

        } else {
            int idProducto = Integer.parseInt(jTIdProducto.getText());
            ProductoEntidades produc = prodD.buscarProductoPorId(idProducto);

            produc.setNombreProducto(jTMarca.getText());
            produc.setDescripcion(jTDescripcion.getText());
            produc.setPrecioActual(Double.parseDouble(jTPrecioActual.getText()));
            produc.setStock(Integer.parseInt(jTStock.getText()));
            produc.setEstado(true);
            produc.setIdProducto(idProducto);

            prodD.modificarProducto(produc);
        }

        limpiar();
        jTIdProducto.setEnabled(true);
        jTMarca.setEnabled(false);
        jTDescripcion.setEnabled(false);
        jTStock.setEnabled(false);
        jTPrecioActual.setEnabled(false);
        jREstado.setEnabled(false);
        jBuscar.setEnabled(true);


    }//GEN-LAST:event_jBGuardarActionPerformed

    private void limpiar() {
        jTIdProducto.setText("");
        jTMarca.setText("");
        jTDescripcion.setText("");
        jTPrecioActual.setText("");
        jTStock.setText("");
        jREstado.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTIdProducto;
    private javax.swing.JTextField jTMarca;
    private javax.swing.JTextField jTPrecioActual;
    private javax.swing.JTextField jTStock;
    // End of variables declaration//GEN-END:variables
}

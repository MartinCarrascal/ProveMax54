/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax54_vista;

import javax.swing.JOptionPane;
import provemax54_data.ProveedorData;
import provemax54_entidades.ProveedorEntidades;

/**
 *
 * @author Ideapad 5
 */
public class ProveedorVista extends javax.swing.JInternalFrame {

    private boolean esNuevo;
    ProveedorData provD;
    ProveedorEntidades provE;

    public ProveedorVista() {
        initComponents();
        provD = new ProveedorData();
        provE = new ProveedorEntidades();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTRazonSocial = new javax.swing.JTextField();
        jTDomicilio = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jREstado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTIdProveedor = new javax.swing.JTextField();
        jBCancelar = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("PROVEEDOR");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Razon Social");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Domicilio");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Telefono");

        jTRazonSocial.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTRazonSocial.setEnabled(false);

        jTDomicilio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTDomicilio.setEnabled(false);
        jTDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDomicilioActionPerformed(evt);
            }
        });

        jTTelefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTTelefono.setEnabled(false);

        jBGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setEnabled(false);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setEnabled(false);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
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
        jBModificar.setEnabled(false);
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jREstado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jREstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jREstadoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Estado");

        jBNuevo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Id Proveedor");

        jTIdProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jBCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBGuardar)
                                .addGap(28, 28, 28)
                                .addComponent(jBModificar)
                                .addGap(41, 41, 41)
                                .addComponent(jBNuevo)
                                .addGap(54, 54, 54)
                                .addComponent(jBCancelar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(69, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jREstado)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBEliminar)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jREstado)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBModificar)
                    .addComponent(jBEliminar)
                    .addComponent(jBNuevo)
                    .addComponent(jBCancelar))
                .addGap(28, 28, 28)
                .addComponent(jBSalir)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDomicilioActionPerformed


    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed

        limpiar();
        jREstado.setSelected(true);
        jREstado.setEnabled(false);
        jTIdProveedor.setEnabled(true);
        jTRazonSocial.setEnabled(true);
        jTDomicilio.setEnabled(true);
        jTTelefono.setEnabled(true);

        jBuscar.setEnabled(false);
        jBGuardar.setEnabled(true);
        jBEliminar.setEnabled(false);
        jBModificar.setEnabled(false);
        jBNuevo.setEnabled(false);
        esNuevo = true;
        jTIdProveedor.setEnabled(false);

    }//GEN-LAST:event_jBNuevoActionPerformed


    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

//        String input = jTIdProveedor.getText();
        if (esNuevo) {
            String razonSocial = jTRazonSocial.getText();
            String domicilio = jTDomicilio.getText();
            String telefono = jTTelefono.getText();
            ProveedorEntidades prove = new ProveedorEntidades(razonSocial, domicilio, telefono, true);
            provD.agregarProveedor(prove);

        } else {
            int idProveedor = Integer.parseInt(jTIdProveedor.getText());

            ProveedorEntidades prove = provD.buscarPorID(idProveedor);
            prove.setRazonSocial(jTRazonSocial.getText());
            prove.setDomicilio(jTDomicilio.getText());
            prove.setTelefono(jTTelefono.getText());
            prove.setEstado(true);
            provD.modificarProveedor(prove);
        }

        limpiar();
        jTRazonSocial.setEnabled(false);
        jTDomicilio.setEnabled(false);
        jTTelefono.setEnabled(false);
        jREstado.setSelected(false);
        jREstado.setEnabled(false);

        jBuscar.setEnabled(true);
        jBGuardar.setEnabled(false);
        jBEliminar.setEnabled(false);
        jBNuevo.setEnabled(true);
        jBModificar.setEnabled(false);
        jTIdProveedor.setEnabled(true);

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

        jTRazonSocial.setEnabled(true);
        jTDomicilio.setEnabled(true);
        jTTelefono.setEnabled(true);
        jREstado.setEnabled(true);

        jBuscar.setEnabled(false);
        jBGuardar.setEnabled(true);
        jBEliminar.setEnabled(true);
        jBNuevo.setEnabled(false);
        jBModificar.setEnabled(false);
        jBCancelar.setEnabled(true);
        jTIdProveedor.setEnabled(false);

    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        int idProveedor = Integer.parseInt(jTIdProveedor.getText());
        ProveedorEntidades pro = provD.buscarPorID(idProveedor);

        int idProvi = pro.getIdProveedor();
//        provD.eliminarProveedor(idProvi);
        provD.eliminarProveedorPorId(idProvi);

        limpiar();
        jTRazonSocial.setEnabled(false);
        jTDomicilio.setEnabled(false);
        jTTelefono.setEnabled(false);
        jREstado.setEnabled(false);

        jREstado.setSelected(false);
        jBEliminar.setEnabled(false);
        jBuscar.setEnabled(true);
        jBGuardar.setEnabled(false);
        jBNuevo.setEnabled(true);
        jBModificar.setEnabled(false);
        jTIdProveedor.setEnabled(true);

    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed

        esNuevo = false;
        int idProveedor;

        String input = jTIdProveedor.getText();

        // Validar que input sea un número y tenga hasta 4 caracteres.      
        if (input.matches("\\d{1,4}")) {

            idProveedor = Integer.parseInt(input);

            idProveedor = Integer.parseInt(jTIdProveedor.getText());

            ProveedorEntidades provee = provD.buscarPorID(idProveedor);

            jBModificar.setEnabled(true);
            jTRazonSocial.setEnabled(false);
            jTDomicilio.setEnabled(false);
            jTTelefono.setEnabled(false);
            jREstado.setEnabled(false);

            try {
                jREstado.setEnabled(true);
                jTRazonSocial.setText(provee.getRazonSocial());
                jTDomicilio.setText(provee.getDomicilio());
                jTTelefono.setText(provee.getTelefono());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Intente nuevamente");
            }

            jBEliminar.setEnabled(true);
            jREstado.setSelected(provee.isEstado());
            jBGuardar.setEnabled(false);
            jBModificar.setEnabled(true);
            jBuscar.setEnabled(true);
            jBNuevo.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "El número de id del proveedor no es válido, debe contener solo números hasta 4 dígitos");
        }

    }//GEN-LAST:event_jBuscarActionPerformed

    private void jREstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jREstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jREstadoActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        limpiar();
        jREstado.setSelected(false);
        jREstado.setEnabled(false);
        jTIdProveedor.setEnabled(true);
        jTRazonSocial.setEnabled(false);
        jTDomicilio.setEnabled(false);
        jTTelefono.setEnabled(false);

        jBuscar.setEnabled(true);
        jBGuardar.setEnabled(false);
        jBEliminar.setEnabled(false);
        jBModificar.setEnabled(false);
        jBNuevo.setEnabled(true);
        esNuevo = false;
        jTIdProveedor.setEnabled(true);

    }//GEN-LAST:event_jBCancelarActionPerformed

    private void limpiar() {
        jTIdProveedor.setText(title);
        jTRazonSocial.setText("");
        jTDomicilio.setText("");
        jTTelefono.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTIdProveedor;
    private javax.swing.JTextField jTRazonSocial;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables
}

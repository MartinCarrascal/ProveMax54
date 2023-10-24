/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax54_vista;

/**
 *
 * @author Ideapad 5
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        JMProveedor = new javax.swing.JMenu();
        jMCargarProveedor = new javax.swing.JMenuItem();
        jMProducto = new javax.swing.JMenu();
        jMCargarProducto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMDetalleCompra = new javax.swing.JMenu();
        jMDetalleDeCompra = new javax.swing.JMenuItem();
        jMDetalleProducto = new javax.swing.JMenu();
        jMDetalleProductoPorProveedor = new javax.swing.JMenuItem();
        jMDCompraPorProveedor = new javax.swing.JMenu();
        jMCompraPorProveedor = new javax.swing.JMenuItem();
        jStock = new javax.swing.JMenu();
        jMProductoConMenorStock = new javax.swing.JMenuItem();
        jMProdMasComprado = new javax.swing.JMenu();
        jMProductoMasComprado = new javax.swing.JMenuItem();
        jMUltimaCompra = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMCompra = new javax.swing.JMenu();
        jMCargarCompra = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1310, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu2.setText("ENTIDADES");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        JMProveedor.setText("Proveedor");
        JMProveedor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JMProveedor.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                JMProveedorComponentAdded(evt);
            }
        });
        JMProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMProveedorActionPerformed(evt);
            }
        });

        jMCargarProveedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMCargarProveedor.setText("Cargar Proveedor");
        jMCargarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCargarProveedorActionPerformed(evt);
            }
        });
        JMProveedor.add(jMCargarProveedor);

        jMenu2.add(JMProveedor);

        jMProducto.setText("Producto");
        jMProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMProductoActionPerformed(evt);
            }
        });

        jMCargarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMCargarProducto.setText("Cargar Producto");
        jMCargarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCargarProductoActionPerformed(evt);
            }
        });
        jMProducto.add(jMCargarProducto);

        jMenu2.add(jMProducto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("CONSULTAS");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMDetalleCompra.setText("Detalle Compra");
        jMDetalleCompra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMDetalleDeCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMDetalleDeCompra.setText("Detalle Compra");
        jMDetalleDeCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMDetalleDeCompraActionPerformed(evt);
            }
        });
        jMDetalleCompra.add(jMDetalleDeCompra);

        jMenu3.add(jMDetalleCompra);

        jMDetalleProducto.setText("Detalle Producto Por Proveedor");
        jMDetalleProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMDetalleProductoPorProveedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMDetalleProductoPorProveedor.setText("Detalle Producto Por Proveedor");
        jMDetalleProductoPorProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMDetalleProductoPorProveedorActionPerformed(evt);
            }
        });
        jMDetalleProducto.add(jMDetalleProductoPorProveedor);

        jMenu3.add(jMDetalleProducto);

        jMDCompraPorProveedor.setText("Compra Por Proveedor");
        jMDCompraPorProveedor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMDCompraPorProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMDCompraPorProveedorActionPerformed(evt);
            }
        });

        jMCompraPorProveedor.setText("Compra Por Proveedor");
        jMCompraPorProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCompraPorProveedorActionPerformed(evt);
            }
        });
        jMDCompraPorProveedor.add(jMCompraPorProveedor);

        jMenu3.add(jMDCompraPorProveedor);

        jStock.setText("Buscar Producto Con Menor Stock");
        jStock.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStockActionPerformed(evt);
            }
        });

        jMProductoConMenorStock.setText("Buscar Producto con Menor Stock");
        jMProductoConMenorStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMProductoConMenorStockActionPerformed(evt);
            }
        });
        jStock.add(jMProductoConMenorStock);

        jMenu3.add(jStock);

        jMProdMasComprado.setText("Buscar Producto Mas Comprado");
        jMProdMasComprado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMProdMasComprado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMProdMasCompradoActionPerformed(evt);
            }
        });

        jMProductoMasComprado.setText("Buscar producto Mas Comprado");
        jMProductoMasComprado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMProductoMasCompradoActionPerformed(evt);
            }
        });
        jMProdMasComprado.add(jMProductoMasComprado);

        jMenu3.add(jMProdMasComprado);

        jMUltimaCompra.setText("ULTIMAS COMPRAS");
        jMUltimaCompra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMUltimaCompra.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jMUltimaCompraComponentAdded(evt);
            }
        });
        jMUltimaCompra.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMUltimaCompraMenuSelected(evt);
            }
        });
        jMUltimaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMUltimaCompraActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Ultima compra");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMUltimaCompra.add(jMenuItem1);

        jMenu3.add(jMUltimaCompra);

        jMenuBar1.add(jMenu3);

        jMCompra.setText("COMPRA");
        jMCompra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMCargarCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMCargarCompra.setText("Crear Compra");
        jMCargarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCargarCompraActionPerformed(evt);
            }
        });
        jMCompra.add(jMCargarCompra);

        jMenuBar1.add(jMCompra);

        jMenu1.setText("Salir");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMProveedorComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_JMProveedorComponentAdded

    }//GEN-LAST:event_JMProveedorComponentAdded

    private void JMProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMProveedorActionPerformed

    private void jMDetalleDeCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMDetalleDeCompraActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        DetalleCompraVista vistaDetCom = new DetalleCompraVista();
        vistaDetCom.setVisible(true);
        escritorio.add(vistaDetCom);
        escritorio.moveToFront(vistaDetCom);
    }//GEN-LAST:event_jMDetalleDeCompraActionPerformed


    private void jMCargarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCargarProveedorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ProveedorVista vistaProv = new ProveedorVista();
        vistaProv.setVisible(true);
        escritorio.add(vistaProv);
        escritorio.moveToFront(vistaProv);

    }//GEN-LAST:event_jMCargarProveedorActionPerformed


    private void jMProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMProductoActionPerformed

    }//GEN-LAST:event_jMProductoActionPerformed

    private void jMCargarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCargarCompraActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CompraVista vistaCom = new CompraVista();
        vistaCom.setVisible(true);
        escritorio.add(vistaCom);
        escritorio.moveToFront(vistaCom);
    }//GEN-LAST:event_jMCargarCompraActionPerformed

    private void jMDetalleProductoPorProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMDetalleProductoPorProveedorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        DetalleProductoPorProveedorVista vistaDetProd = new DetalleProductoPorProveedorVista();
        vistaDetProd.setVisible(true);
        escritorio.add(vistaDetProd);
        escritorio.moveToFront(vistaDetProd);
    }//GEN-LAST:event_jMDetalleProductoPorProveedorActionPerformed

    private void jMCargarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCargarProductoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ProductoVista vistaProd = new ProductoVista();
        vistaProd.setVisible(true);
        escritorio.add(vistaProd);
        escritorio.moveToFront(vistaProd);
    }//GEN-LAST:event_jMCargarProductoActionPerformed

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jMSalirActionPerformed

    private void jStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStockActionPerformed

    }//GEN-LAST:event_jStockActionPerformed

    private void jMProdMasCompradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMProdMasCompradoActionPerformed

    }//GEN-LAST:event_jMProdMasCompradoActionPerformed

    private void jMProductoMasCompradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMProductoMasCompradoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ProductoMasComprado comprado = new ProductoMasComprado();
        comprado.setVisible(true);
        escritorio.add(comprado);
        escritorio.moveToFront(comprado);
    }//GEN-LAST:event_jMProductoMasCompradoActionPerformed

    private void jMProductoConMenorStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMProductoConMenorStockActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ProductoConMenorStock stockVista = new ProductoConMenorStock();
        stockVista.setVisible(true);
        escritorio.add(stockVista);
        escritorio.moveToFront(stockVista);
    }//GEN-LAST:event_jMProductoConMenorStockActionPerformed

    private void jMCompraPorProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCompraPorProveedorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CompraPorProveedor comProV = new CompraPorProveedor();
        comProV.setVisible(true);
        escritorio.add(comProV);
        escritorio.moveToFront(comProV);
    }//GEN-LAST:event_jMCompraPorProveedorActionPerformed

    private void jMDCompraPorProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMDCompraPorProveedorActionPerformed

    }//GEN-LAST:event_jMDCompraPorProveedorActionPerformed

    private void jMUltimaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMUltimaCompraActionPerformed
      
    }//GEN-LAST:event_jMUltimaCompraActionPerformed

    private void jMUltimaCompraMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMUltimaCompraMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMUltimaCompraMenuSelected

    private void jMUltimaCompraComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jMUltimaCompraComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMUltimaCompraComponentAdded

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        UltimaCompraVista comProV = new UltimaCompraVista();
        comProV.setVisible(true);
        escritorio.add(comProV);
        escritorio.moveToFront(comProV);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMProveedor;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMCargarCompra;
    private javax.swing.JMenuItem jMCargarProducto;
    private javax.swing.JMenuItem jMCargarProveedor;
    private javax.swing.JMenu jMCompra;
    private javax.swing.JMenuItem jMCompraPorProveedor;
    private javax.swing.JMenu jMDCompraPorProveedor;
    private javax.swing.JMenu jMDetalleCompra;
    private javax.swing.JMenuItem jMDetalleDeCompra;
    private javax.swing.JMenu jMDetalleProducto;
    private javax.swing.JMenuItem jMDetalleProductoPorProveedor;
    private javax.swing.JMenu jMProdMasComprado;
    private javax.swing.JMenu jMProducto;
    private javax.swing.JMenuItem jMProductoConMenorStock;
    private javax.swing.JMenuItem jMProductoMasComprado;
    private javax.swing.JMenuItem jMSalir;
    private javax.swing.JMenu jMUltimaCompra;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jStock;
    // End of variables declaration//GEN-END:variables
}

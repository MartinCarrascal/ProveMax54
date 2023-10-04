/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax54_data;

import java.time.LocalDate;
import java.time.Month;
import provemax54_entidades.CompraEntidades;
import provemax54_entidades.ProveedorEntidades;

/**
 *
 * @author Ideapad 5
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProveedorEntidades prov1 = new ProveedorEntidades("razonSocial", "domicilio", "454444455", true);
        ProveedorData proveedor = new ProveedorData();

        CompraEntidades compraE = new CompraEntidades(prov1, LocalDate.MIN.of(2023, Month.MARCH, 10), true);
        CompraData compraD  = new CompraData();

//        proveedor.agregarProveedor(prov1);
          compraD.guardarCompra(compraE);
          
      



    }

    
}

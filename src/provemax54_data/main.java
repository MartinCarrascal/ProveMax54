/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax54_data;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import provemax54_entidades.CompraEntidades;
import provemax54_entidades.DetalleCompraEntidades;
import provemax54_entidades.ProductoEntidades;
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

        ProveedorEntidades prov1 = new ProveedorEntidades(1, "Telefonos", "av San marito", "555 5555", true);
        CompraEntidades compraE = new CompraEntidades(prov1, LocalDate.MIN.of(2023, Month.MARCH, 10), true);
    
        ProductoEntidades galletas = new ProductoEntidades(2,"Don satur", "galletitas", 250, 2, true);
        ProductoEntidades lapiz = new ProductoEntidades(1, "Micros", " micro sd", 4000, 1, true);
        DetalleCompraData detalle = new DetalleCompraData();
       // DetalleCompraEntidades deta = new DetalleCompraEntidades(1, 100, compraE , lapiz, true);
        
        ProveedorData proveedor = new ProveedorData();
        ProductoData producto = new ProductoData();
        CompraData compra = new CompraData();
        ProveedorEntidades prov2 = new ProveedorEntidades("Samsung", "Azul 234", "4565 5948", true);
        
 
        
        
        
//         proveedor.agregarProveedor(prov2);

//        proveedor.agregarProveedor(prov1);
//          producto.guardarProducto(lapiz);
//          producto.guardarProducto(galletas);
//          proveedor.modificarProveedor(prov1);
//          proveedor.eliminarProveedor(prov1);
//          producto.modificarProducto(lapiz);
//          producto.eliminarProducto(galletas);

//            compra.guardarCompra(compraE);

//       for (CompraEntidades inscripcion : compra.comprasProveedor(1)) {
//                System.out.println(inscripcion);
//                
//        }
            //Devuelve la lista de compras de un proveedor y lo pongo en una variable
            // para poder poner size y que me de la cantidad
//         List<CompraEntidades> compraLista = compra.comprasProveedor(1);
//         
//         System.out.println(compraLista.size());
//        
//   
//              for (CompraEntidades c : compraLista) {
//                System.out.println(c);
//                
//        }



    }

    
}

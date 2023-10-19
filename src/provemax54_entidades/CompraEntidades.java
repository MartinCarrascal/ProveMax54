/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax54_entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ideapad 5
 */
public class CompraEntidades {
    
    private int idCompra;
    private ProveedorEntidades proveedor;
    private LocalDate fecha;
    private boolean estado;
    private List<DetalleCompraEntidades> listaDetalleCompra;

    public CompraEntidades() {
        listaDetalleCompra = new ArrayList<>();
    }

    public CompraEntidades(ProveedorEntidades proveedor, LocalDate fecha, boolean estado) {
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.estado = estado;
        listaDetalleCompra = new ArrayList<>();
    }

    public CompraEntidades(int idCompra, ProveedorEntidades proveedor, LocalDate fecha, boolean estado) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.estado = estado;
        listaDetalleCompra = new ArrayList<>();
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public ProveedorEntidades getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorEntidades proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<DetalleCompraEntidades> getListaDetalleCompra() {
        return listaDetalleCompra;
    }

    public void addListaDetalleCompra(DetalleCompraEntidades detalle) {
        listaDetalleCompra.add(detalle);
    }

    public double devolverTotal() {
        double total = 0;
        
        for (DetalleCompraEntidades detalle : listaDetalleCompra) {
            total += detalle.devolverSubtotal();
        }
        return total;
    }
 
    @Override
    public String toString() {
        return "CompraEntidades{" + "idCompra=" + idCompra + ", proveedor=" + proveedor + ", fecha=" + fecha + ", estado=" + estado + ", listaDetalleCompra=" + listaDetalleCompra + '}';
    }

  
}

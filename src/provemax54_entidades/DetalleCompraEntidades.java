/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax54_entidades;

/**
 *
 * @author Ideapad 5
 */
public class DetalleCompraEntidades {
    private int idDetalle;
    private int cantidad;
    private double precioCosto;
    private CompraEntidades compra;
    private ProductoEntidades producto; 
    private boolean estado;

    public DetalleCompraEntidades() {
    }

    public DetalleCompraEntidades(int cantidad, double precioCosto, CompraEntidades compra, ProductoEntidades producto, boolean estado) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = compra;
        this.producto = producto;
        this.estado = estado;
    }

    public DetalleCompraEntidades(int idDetalle, int cantidad, double precioCosto, CompraEntidades compra, ProductoEntidades producto, boolean estado) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = compra;
        this.producto = producto;
        this.estado = estado;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public CompraEntidades getCompra() {
        return compra;
    }

    public void setCompra(CompraEntidades compra) {
        this.compra = compra;
    }

    public ProductoEntidades getProducto() {
        return producto;
    }

    public void setProducto(ProductoEntidades producto) {
        this.producto = producto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DetalleCompraEntidades{" + "idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", precioCosto=" + precioCosto + ", compra=" + compra + ", producto=" + producto + ", estado=" + estado + '}';
    }

  
    
}





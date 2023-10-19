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
    private int idCompra;
    private ProductoEntidades producto;
    private int cantidad;
    private double precioCosto;

    public DetalleCompraEntidades() {
    }

    public DetalleCompraEntidades(int idCompra, ProductoEntidades producto, int cantidad, double precioCosto) {
        this.idCompra = idCompra;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
    }

    public DetalleCompraEntidades(int idDetalle, int idCompra, ProductoEntidades producto, int cantidad, double precioCosto) {
        this.idDetalle = idDetalle;
        this.idCompra = idCompra;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public ProductoEntidades getProducto() {
        return producto;
    }

    public void setProducto(ProductoEntidades producto) {
        this.producto = producto;
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

    @Override
    public String toString() {
        return producto.getDescripcion() + " - " + cantidad + " : " + devolverSubtotal();
    }

    public double devolverSubtotal() {
        return cantidad * precioCosto;
    }
    
}

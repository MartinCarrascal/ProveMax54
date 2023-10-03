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
public class ProductoEntidades {
    private int idProducto;
    private String nombreProducto;
    private String descripcion;
    private String precioActual;
    private int stock;
    private boolean estado;

    public ProductoEntidades() {
    }

    public ProductoEntidades(String nombreProducto, String descripcion, String precioActual, int stock, boolean estado) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(String precioActual) {
        this.precioActual = precioActual;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ProductoEntidades{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", descripcion=" + descripcion + ", precioActual=" + precioActual + ", stock=" + stock + ", estado=" + estado + '}';
    }

  
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * @version 2.1
 * @since 2019
 * Clase "Hija" que hereda los atributos de la clase Empleado, ademas determina las
 * acciones de un cajero
 * @author jonnathan
 */
public class Cajero {
    
    private String descripcionProducto ;
    private int cantidadPedido;
    private String comprobarStoock;
    private String valorVenta;

    public Cajero() {
    }

    public Cajero(String descripcionProducto, int cantidadPedido) {
        this.descripcionProducto = descripcionProducto;
        this.cantidadPedido = cantidadPedido;
    }

    public Cajero(String descripcionProducto, int cantidadPedido, String comprobarStoock, String valorVenta) {
        this.descripcionProducto = descripcionProducto;
        this.cantidadPedido = cantidadPedido;
        this.comprobarStoock = comprobarStoock;
        this.valorVenta = valorVenta;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(int cantidadPedido) {
        this.cantidadPedido = cantidadPedido;
    }

    public String getComprobarStoock() {
        return comprobarStoock;
    }

    public void setComprobarStoock(String comprobarStoock) {
        this.comprobarStoock = comprobarStoock;
    }

    public String getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(String valorVenta) {
        this.valorVenta = valorVenta;
    }

    @Override
    public String toString() {
        return "Cajero{" + "descripcionProducto="
                + descripcionProducto + ", cantidadPedido=" + cantidadPedido + ","
                + " comprobarStoock=" + comprobarStoock + ", valorVenta=" + valorVenta + '}';
    }
    
    
    
    
    
}

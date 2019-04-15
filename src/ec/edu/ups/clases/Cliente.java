/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Clase "padre" que hereda a las clases ClienteMayorista y ClienteMinorista, y a su
 * vez hereda los atributos de la clase Persona, ademas determina las acciones
 * de un cliente en general
 * @author jonnathan
 */
public abstract class Cliente extends Persona {

    
    
    private String pedido;
    private int cantidad;
    private String proforma;
    
    public Cliente() {
    }

    public Cliente(String pedido, int cantidad, String proforma) {
        this.pedido = pedido;
        this.cantidad = cantidad;
        this.proforma = proforma;
    }

    public Cliente(String pedido, int cantidad, String proforma, int codigo, String cedula) {
        super(codigo, cedula);
        this.pedido = pedido;
        this.cantidad = cantidad;
        this.proforma = proforma;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProforma() {
        return proforma;
    }

    public void setProforma(String proforma) {
        this.proforma = proforma;
    }

    @Override
    public String toString() {
        return "Cliente{" + "pedido=" + pedido + ", cantidad=" + cantidad + ", proforma=" + proforma + '}';
    }
    
     public String ocacional() {
        return "La seccion " + super.getNombre() + "unidades.";
    }

    public String temporal() {
        return "La seccion " + super.getNombre() + "por docenas.";
    }

    public String frecuente() {
        return "La seccion " + super.getNombre() + "por grandes cantidades";
    }
     
    
    

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 * @version 2.1
 * @since 2019
 * Clase "padre" que hereda a las clases Empleado y Cliente, y a su vez hereda los
 * atributos de la clase Persona, ademas determina las acciones de un Cajero
 * @author jonnathan
 */

    
    public abstract class Empleado {

   
   
    private int codigo;
    private String cedula;
    private String nombre;
    private Date fechaContratacion;
    private double salario;
    private String email;

    public Empleado() {
    }

    public Empleado(int codigo, String cedula, String nombre, Date fechaContratacion, double salario) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.email= email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double calcularSalarioFinal();
    
    
    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", fechaContratacion=" + fechaContratacion + ", salario=" + salario + '}';
    }
}
    


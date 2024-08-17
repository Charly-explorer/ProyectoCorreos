/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

import static Paquetes.EnumEstadoPaquete.Almacenado;
import Personas.Cliente;
import Personas.Empleado;
/**
 *
 * @author emman
 */
public class Paquete {
    
    private int codigo;
    private String descripcion;
    private double peso;
    private Empleado remitente;
    private Cliente destinatario;
    private EnumEstadoPaquete estado;

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Empleado getRemitente() {
        return remitente;
    }

    public void setRemitente(Empleado remitente) {
        this.remitente = remitente;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }

    public EnumEstadoPaquete getEstado() {
        return estado;
    }

    public void setEstado(EnumEstadoPaquete Almacenado) {
        this.estado = Almacenado;
    }

    public Paquete(int codigo, String descripcion, double peso, Empleado remitente, Cliente destinatario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.estado = Almacenado;
    }

    public Paquete() {
        this(0,"",0,new Empleado(),new Cliente());
    }   
    
}

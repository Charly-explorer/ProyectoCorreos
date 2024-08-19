/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

import static Paquetes.EnumEstadoPaquete.Almacenado;
import Personas.Destinatario;
import Personas.Remitente;
/**
 *
 * @author emman
 */
public class Paquete {
    
    private int codigo;
    private String descripcion;
    private double peso;
    private Remitente remitente;
    private Destinatario destinatario;
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

    public Remitente getRemitente() {
        return remitente;
    }

    public void setRemitente(Remitente remitente) {
        this.remitente = remitente;
    }
    
    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public EnumEstadoPaquete getEstado() {
        return estado;
    }

    public void setEstado(EnumEstadoPaquete Almacenado) {
        this.estado = Almacenado;
    }

    public Paquete(String descripcion,int codigo, double peso,Destinatario destinatario, Remitente remitente) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.peso = peso;
        this.destinatario = destinatario;
        this.estado = Almacenado;
        this.remitente = remitente;
    }

    public Paquete() {
        this("",0,0,new Destinatario(), new Remitente());
    }   
    
}

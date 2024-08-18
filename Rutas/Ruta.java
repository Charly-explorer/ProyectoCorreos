/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rutas;

import java.util.ArrayList;

/**
 *
 * @author emman
 */
public class Ruta {
    
    private int codigo ;
    private String nombre;
    private String descripcion;
    private ArrayList<String> listaDestinos;

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    public ArrayList<String> getListaDestinos() {
        return listaDestinos;
    }

    public void setListaDestinos(ArrayList<String> listaDestinos) {
        this.listaDestinos = listaDestinos;
    }

    public Ruta(int codigo, String nombre, String descripcion, ArrayList<String> listaDestinos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.listaDestinos = listaDestinos;
    }

    public Ruta() {
        this(0,"","",new ArrayList<>());
    }
    
    public void agregarDestino(String destino){
        listaDestinos.add(destino);
    }
    
    public void eliminarDestino(String destino){
        listaDestinos.remove(destino);
    }
        
}

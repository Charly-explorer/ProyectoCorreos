
package Rutas;

import java.util.HashSet;

/**
 *
 * @author emman
 */
public class Ruta {
    
    private int codigo ;
    private String nombre;
    private String descripcion;
    private HashSet<String> listaDestinos;

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
    

    public HashSet<String> getListaDestinos() {
        return listaDestinos;
    }

    public void setListaDestinos(HashSet<String> listaDestinos) {
        this.listaDestinos = listaDestinos;
    }

    public Ruta(int codigo, String nombre, String descripcion, HashSet<String> listaDestinos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.listaDestinos = listaDestinos;
    }

    public Ruta() {
        this(0,"","",new HashSet<>());
    }
    
    public void agregarDestino(String destino){
        listaDestinos.add(destino);
    }
    
    public void eliminarDestino(String destino){
        listaDestinos.remove(destino);
    }
        
}

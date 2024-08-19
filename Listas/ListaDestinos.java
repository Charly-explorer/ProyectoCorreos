/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.util.HashSet;

/**
 *
 * @author emman
 */
public class ListaDestinos {

    private HashSet<String> listaDestinos;

    private static ListaDestinos instance = new ListaDestinos();

    public ListaDestinos() {
        listaDestinos = new HashSet<>();
    }

    public static ListaDestinos getInstance() {
        if (instance == null) {
            instance = new ListaDestinos();
        }
        return instance;
    }

    public HashSet<String> getListaDestinos() {
        return listaDestinos;
    }
    

    public void agregar(String txt) {
        listaDestinos.add(txt);
    }

    public void eliminar(String txt) {
        listaDestinos.remove(txt);
    }

    public String buscar(String txt) {
        for (String destino : this.listaDestinos) {
            if (destino.equals(txt)) {
                return destino;
            }
        }
        return null;
    }

}

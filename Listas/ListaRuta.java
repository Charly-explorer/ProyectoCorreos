/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Rutas.Ruta;
import java.util.ArrayList;

/**
 *
 * @author emman
 */
public class ListaRuta {

    private ArrayList<Ruta> listaRutas;

    private static ListaRuta instance = new ListaRuta();

    public ListaRuta() {
        listaRutas = new ArrayList<>();
    }

    public static ListaRuta getInstance() {
        if (instance == null) {
            instance = new ListaRuta();
        }
        return instance;
    }

    public void agregar(Ruta ruta) {
        listaRutas.add(ruta);
    }

    public void eliminar(Ruta ruta) {
        listaRutas.remove(ruta);
    }

    public Ruta buscar(String nombre) {
        for (Ruta ruta : this.listaRutas) {
            if (ruta.getNombre() == nombre) {
                return ruta;
            }
        }
        return null;
    }

}

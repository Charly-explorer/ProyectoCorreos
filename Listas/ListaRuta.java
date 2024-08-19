/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Personas.Empleado;
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

    public void eliminar(int codigo) {
        for (Ruta ruta : this.listaRutas) {
            if (ruta.getCodigo() == codigo) {
                this.listaRutas.remove(ruta);
                break;
            }
        }
    }

    public Ruta buscar(String nombre) {
        for (Ruta ruta : this.listaRutas) {
            if (ruta.getNombre() == nombre) {
                return ruta;
            }
        }
        return null;
    }

    public ArrayList<Ruta> Filtrar(String filtro) {

        if (filtro.equals("")) {
            return listaRutas;
        }
        ArrayList<Ruta> ruta = new ArrayList<>();

        for (Ruta objeto : listaRutas) {
            if (objeto == null) {
                continue;
            }
            if (objeto.getNombre().toLowerCase().contains(filtro.toLowerCase())) {
                ruta.add(objeto);
            }
        }
        return ruta;
    }

}

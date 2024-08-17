/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;


import Personas.Remitente;
import java.util.ArrayList;

/**
 *
 * @author emman
 */
public class ListaRemitente {

    private ArrayList<Remitente> listaRemitentes;

    private static ListaRemitente instance = new ListaRemitente();

    public ListaRemitente() {
        listaRemitentes = new ArrayList<>();
    }

    public static ListaRemitente getInstance() {
        if (instance == null) {
            instance = new ListaRemitente();
        }
        return instance;
    }

    public void agregar(Remitente remitente) {
        listaRemitentes.add(remitente);
    }

    public void eliminar(Remitente remitente) {
        listaRemitentes.remove(remitente);
    }

    public Remitente buscar(int cedula) {
        for (Remitente remitente : this.listaRemitentes) {
            if (remitente.getCedula() == cedula) {
                return remitente;
            }
        }
        return null;
    }

}

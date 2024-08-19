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

     public void eliminar(int cedula) {
        Remitente RemitenteAEliminar = null;

        for (Remitente remitente : this.listaRemitentes) {
            if (remitente.getCedula() == cedula) {
                RemitenteAEliminar = remitente;
                break;
            }
        }
        
        if (RemitenteAEliminar != null) {
            this.listaRemitentes.remove(RemitenteAEliminar);
        }
    }

    public Remitente buscar(int cedula) {
        for (Remitente remitente : this.listaRemitentes) {
            if (remitente.getCedula() == cedula) {
                return remitente;
            }
        }
        return null;
    }

    public ArrayList<Remitente> Filtrar(String filtro) {

        if (filtro.equals("")) {
            return listaRemitentes;
        }
        ArrayList<Remitente> remitente = new ArrayList<>();

        for (Remitente objeto : listaRemitentes) {
            if (objeto == null) {
                continue;
            }
            if (objeto.getNombre().toLowerCase().contains(filtro.toLowerCase())) {
                remitente.add(objeto);
            }
        }
        return remitente;
    }

}

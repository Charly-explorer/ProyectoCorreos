/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Envios.Envio;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author emman
 */
public class ListaEnvios {

    private Queue<Envio> listaEnvios;

    private static ListaEnvios instance = new ListaEnvios();

    public ListaEnvios() {
        listaEnvios = new LinkedList<>();
    }

    public static ListaEnvios getInstance() {
        if (instance == null) {
            instance = new ListaEnvios();
        }
        return instance;
    }

    public void agregar(Envio envio) {
        listaEnvios.add(envio);
    }

    public void eliminar(int codigo) {
        for (Envio envio1 : listaEnvios) {
            if (envio1.getNumeroEnvio() == codigo) {
                listaEnvios.remove(envio1);
            }
        }
    }

    public void obtenerPrimero() {
        listaEnvios.peek();
    }

    public Envio obtenerEnvio(int num) {
        for (Envio envio1 : listaEnvios) {
            if (num == envio1.getNumeroEnvio()) {
                return envio1;
            }

        }
        return null;
    }
    
        public Queue<Envio> Filtrar(int filtro) {

        if (filtro == 0) {
            return listaEnvios;
        }
        Queue<Envio> envios = new LinkedList<>();

        for (Envio objeto : listaEnvios) {
            if (objeto == null) {
                continue;
            }
            if (objeto.getNumeroEnvio()== filtro) {
                envios.add(objeto);
            }
        }
        return envios;
    }

}

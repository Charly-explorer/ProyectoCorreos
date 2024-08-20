/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import static Paquetes.EnumEstadoPaquete.Almacenado;
import static Paquetes.EnumEstadoPaquete.Cancelado;
import static Paquetes.EnumEstadoPaquete.Despachado;
import static Paquetes.EnumEstadoPaquete.Entregado;
import Paquetes.Paquete;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author emman
 */
public class ListaPaquetes {

    private HashMap<Integer, Paquete> listaPaquetes;

    private static ListaPaquetes instance = new ListaPaquetes();

    public ListaPaquetes() {
        listaPaquetes = new HashMap<>();
    }

    public static ListaPaquetes getInstance() {
        if (instance == null) {
            instance = new ListaPaquetes();
        }
        return instance;
    }

    public void agregar(Paquete paquete) {
        listaPaquetes.put(paquete.getCodigo(), paquete);
    }

    public void eliminar(int code) {
        HashMap<Integer, Paquete> paquetes = new HashMap<>();

        for (Map.Entry<Integer, Paquete> entry : listaPaquetes.entrySet()) {
            Paquete objeto = entry.getValue();
            if (objeto.getCodigo() == code) {
                if (objeto.getEstado() == Almacenado) {
                    listaPaquetes.remove(code, objeto);
                }
            }
        }

    }

    public Paquete buscarPaquete(int codigo) {

        for (Paquete objeto : this.listaPaquetes.values()) {
            if (objeto.getCodigo() == codigo) {
                return objeto;
            }
        }
        return null;

    }

    public HashMap<Integer, Paquete> Filtrar(int filtro) {

        if (filtro == 0) {
            return listaPaquetes;
        }
        HashMap<Integer, Paquete> paquetes = new HashMap<>();

        for (Map.Entry<Integer, Paquete> entry : listaPaquetes.entrySet()) {
            Paquete objeto = entry.getValue();
            if (objeto == null) {
                continue;
            }
            if (objeto.getCodigo() == filtro) {
                paquetes.put(filtro, objeto);
            }
        }
        return paquetes;
    }

    public void despachar(Paquete paquete) {
        if (paquete.getEstado().equals(Almacenado)) {
            paquete.setEstado(Despachado);
        } else {
            System.out.println("El envio a despachar no esta almacenado");
        }
    }

    public void entregar(Paquete paquete) {
        if (paquete.getEstado().equals(Despachado)) {
            paquete.setEstado(Entregado);
        } else {
            System.out.println("El envio a entregar no ha sido despachado");
        }
    }

    public void cancelar(Paquete paquete) {
        if (paquete.getEstado().equals(Almacenado)) {
            paquete.setEstado(Cancelado);
        } else {
            System.out.println("El envio a cancelar no esta almacenado o ya ha sido entregado");
        }
    }
}

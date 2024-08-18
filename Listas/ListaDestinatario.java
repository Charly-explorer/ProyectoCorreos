/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;


import Personas.Destinatario;
import java.util.ArrayList;

/**
 *
 * @author emman
 */
public class ListaDestinatario {

    private ArrayList<Destinatario> listaDestinatarios;

    private static ListaDestinatario instance = new ListaDestinatario();

    public ListaDestinatario() {
        listaDestinatarios = new ArrayList<>();
    }
    
    public static ListaDestinatario getInstance(){
        if (instance == null) {
            instance = new ListaDestinatario();
        }
        return instance;
    }
    
    public void agregar(Destinatario destinatario){
        listaDestinatarios.add(destinatario);
    }
    
    public void eliminar(Destinatario destinatario){
        listaDestinatarios.remove(destinatario);
    }
    
    public Destinatario buscar(int cedula) {
        for (Destinatario destinatario : this.listaDestinatarios) {
            if (destinatario.getCedula() == cedula) {  
                return destinatario; 
            }
        }
        return null;  
    }
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import static Paquetes.EnumEstadoPaquete.Almacenado;
import Paquetes.Paquete;
import java.util.HashMap;

/**
 *
 * @author emman
 */
public class ListaPaquetes {
    
    private HashMap<Integer, Paquete> listaPaquetes;
    
    private static ListaPaquetes instance = new ListaPaquetes();
    
    public ListaPaquetes(){
        listaPaquetes = new HashMap<>();
    }
    
    public static ListaPaquetes getInstance(){
        if (instance == null) {
            instance = new ListaPaquetes();
        }
        return instance;
    }
    
    public void agregar(Paquete paquete){
        listaPaquetes.put(paquete.getCodigo(), paquete);
    }
    
    public void eliminar(Paquete paquete) throws Exception{
        if(paquete.getEstado()== Almacenado){
            listaPaquetes.remove(paquete.getCodigo(), paquete);
        }else{
            throw new Exception("No existe el paquete");
        }
    }
    
    public Paquete buscar(Paquete paquete){
        
        return listaPaquetes.get(paquete.getCodigo());
        
    }
}

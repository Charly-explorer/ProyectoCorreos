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
    
    HashMap<Integer, Paquete> paquetes = new HashMap<>();
    
    public void agregarPaquete(Paquete paquete){
        paquetes.put(paquete.getCodigo(), paquete);
    }
    
    public void eliminarPaquete(Paquete paquete) throws Exception{
        if(paquete.getEstado()== Almacenado){
            paquetes.remove(paquete.getCodigo(), paquete);
        }else{
            throw new Exception("No existe el paquete");
        }
    }
    
    public Paquete buscarPaquete(Paquete paquete){
        
        return paquetes.get(paquete.getCodigo());
        
    }
}

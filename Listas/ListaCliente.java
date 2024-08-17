/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Personas.Cliente;
import java.util.ArrayList;
//import java.util.List;

public class ListaCliente {
    
    private ArrayList<Cliente> cliente = new ArrayList<>();
  

   
    public void agregar(Cliente cliente) {
        this.cliente.add(cliente);
    }

  
    public void eliminarCliente(Cliente cliente) {
        this.cliente.remove(cliente);
    }

   
    public Cliente buscarEmpleado(int id) {
        for (Cliente cliente : this.cliente) {
            if (cliente.getId() == id) {  
                return cliente; 
            }
        }
        return null;  
    }

    
    public ArrayList<Cliente> getListaClientes() {
        return this.cliente;  
    }

  
    public boolean actualizar(int id, int telefono, String nuevoCorreo) {
        Cliente cliente = buscarEmpleado(id); 
        if (cliente != null) {
            cliente.setTelefono(telefono);  
            cliente.setCorreo(nuevoCorreo);  
 
            return true;
        }
        return false;  
    }
}

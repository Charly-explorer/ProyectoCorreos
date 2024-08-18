/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Personas.Cliente;
import java.util.ArrayList;
//import java.util.List;

public class ListaCliente {

    private ArrayList<Cliente> listaCliente;

    private static ListaCliente instance = new ListaCliente();

    public ListaCliente() {
        listaCliente = new ArrayList<>();
    }

    public static ListaCliente getInstance() {
        if (instance == null) {
            instance = new ListaCliente();
        }
        return instance;
    }

    public void agregar(Cliente cliente) {
        this.listaCliente.add(cliente);
    }

    public void eliminar(Cliente cliente) {
        this.listaCliente.remove(cliente);
    }

    public Cliente buscar(int id) {
        for (Cliente cliente : this.listaCliente) {
            if (cliente.getCedula() == id) {
                return cliente;
            }
        }
        return null;
    }

    public ArrayList<Cliente> getListaClientes() {
        return this.listaCliente;
    }

    public boolean actualizar(int id, int telefono, String nuevoCorreo) {
        Cliente cliente = buscar(id);
        if (cliente != null) {
            cliente.setTelefono(telefono);
            cliente.setCorreo(nuevoCorreo);

            return true;
        }
        return false;
    }

    public ArrayList<Cliente> Filtrar(String filtro) {
        ListaCliente Clientes = ListaCliente.getInstance();
        if (filtro.equals("")) {
            return Clientes.getListaClientes();
        }
        ArrayList<Cliente> cliente = new ArrayList<>();
        int cont = 0;
        for (Cliente objeto : Clientes.getListaClientes()) {
            if (objeto == null) {
                continue;
            }
            if (objeto.getNombre().toLowerCase().contains(filtro.toLowerCase())) {
                Clientes.getListaClientes().set(cont++, objeto);
            }
        }
        return cliente;
    }
}

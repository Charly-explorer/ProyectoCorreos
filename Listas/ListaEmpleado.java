/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Empleados.Empleado;
import java.util.ArrayList;



/**
 *
 * @author user
 */
public class ListaEmpleado {
     ArrayList<Empleado> empleados = new ArrayList<>();

     public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
     
     public boolean actualizarEmpleadoPorId(int id) {
     for (Empleado empleado: empleados) {
        if (empleado.getId() == id) {
            empleado.setTelefono(empleado.getTelefono()); // Da el error xq lo hereda del de thy
            empleado.setCorreo(empleado.getCorreo());  // Da el error xq lo hereda del de thy
            empleado.setPuesto(empleado.getPuesto());
            empleado.setSalario(empleado.getSalario());
               return true;
               }
        }
            return false;
    }
     
     public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }
     
     public Empleado buscarEmpleado(int id) {
        for (Empleado empleado : empleados) {
        if (empleado.gitId() == id) {
            return empleado;
        }
    }
        return null;
    }
     
     
     
    }
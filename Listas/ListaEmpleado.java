package Listas;

import Personas.Empleado;
import java.util.ArrayList;

public class ListaEmpleado {

    private ArrayList<Empleado> listaEmpleados;

    private static ListaEmpleado instance = new ListaEmpleado();

    public ListaEmpleado() {
        listaEmpleados = new ArrayList<>();
    }

    public static ListaEmpleado getInstance() {
        if (instance == null) {
            instance = new ListaEmpleado();
        }
        return instance;
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public boolean actualizarEmpleadoPorId(int id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getCedula() == id) {
                empleado.setTelefono(empleado.getTelefono());
                empleado.setCorreo(empleado.getCorreo());
                empleado.setPuesto(empleado.getPuesto());
                empleado.setSalario(empleado.getSalario());
                return true;
            }
        }
        return false;
    }

    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
    }

    public Empleado buscarEmpleado(int id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getCedula() == id) {
                return empleado;
            }
        }
        return null;
    }

}

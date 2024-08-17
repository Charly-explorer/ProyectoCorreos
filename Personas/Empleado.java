
package Personas;

import java.time.LocalDate;


public class Empleado extends PersonaDetallada {
    private String puesto;
    private double salario;

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado(String puesto, double salario, int telefono, String correo, LocalDate fechaNacimiento, String nombre, int cedula) {
        super(telefono, correo, fechaNacimiento, nombre, cedula);
        this.puesto = puesto;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "puesto=" + puesto + ", salario=" + salario + '}';
    }
   
}

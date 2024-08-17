/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.time.LocalDate;


/**
 *
 * @author user
 */
public class Empleado extends Cliente {
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

    public Empleado(String puesto, double salario, int id, String nombre, LocalDate fechaNacimiento, int telefono, String correo, int edad) {
        super(id, nombre, fechaNacimiento, telefono, correo, edad);
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado(String puesto, double salario) {
        this.puesto = puesto;
        this.salario = salario;
    }
        
    public Empleado() {
        this("",0);
    }

    @Override
    public String toString() {
        return "Empleado{" + "puesto=" + puesto + ", salario=" + salario + '}';
    }

    
    
}

package Personas;

import java.time.LocalDate;


public class PersonaDetallada extends Persona {
    private int telefono;
    private String correo;
    private LocalDate fechaNacimiento;

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public PersonaDetallada(int telefono, String correo, LocalDate fechaNacimiento, String nombre, int cedula) {
        super(nombre, cedula);
        this.telefono = telefono;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "PersonaDetallada{" + "telefono=" + telefono + ", correo=" + correo + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
      
}

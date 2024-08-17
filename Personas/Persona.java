package Personas;


public class Persona {
   private String nombre;
   private int cedula;

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + '}';
    }
   
   
}

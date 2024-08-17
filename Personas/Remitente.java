package Personas;

public class Remitente extends Persona {

    public Remitente(String nombre, int cedula) {
        super(nombre, cedula);
    }
    
    public Remitente(){
        this("",0);
    }
}

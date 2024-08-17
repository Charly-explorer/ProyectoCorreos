package Personas;


public class Destinatario extends Persona {

    public Destinatario(String nombre, int cedula) {
        super(nombre, cedula);
    }
   
    public Destinatario(){
        this("",0);
    }
}

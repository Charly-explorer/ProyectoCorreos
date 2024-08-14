package Excepciones;
//Clase la cual se encarga tirar un mensaje personalizado
public class Excepciones extends Exception{
    public Excepciones(String mensaje) {
        super(mensaje);
    }
}

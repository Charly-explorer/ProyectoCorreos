package Personas;

import java.time.LocalDate;


public class Cliente extends PersonaDetallada{

    public Cliente(int telefono, String correo, LocalDate fechaNacimiento, String nombre, int cedula) {
        super(telefono, correo, fechaNacimiento, nombre, cedula);
    }
    
    public Cliente(){
        this(0,"",LocalDate.now(),"",0);
    }
 
}

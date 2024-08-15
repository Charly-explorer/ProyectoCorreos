
import Empleados.Empleado;
import java.time.LocalDate;

/**
 *
 * @author thyfa
 */
public class Cliente extends Empleado{
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int telefono;
    private String correo;
    private int edad;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Cliente(int id, String nombre,LocalDate fechaNacimiento, int telefono, String correo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
    }

    public Cliente() {
        this(0,"",LocalDate.now(),0,"",0);
    }

    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", correo=" + correo + ", edad=" + edad + '}';
    }
   
}

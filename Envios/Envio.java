package Envios;


import Paquetes.Paquete;
import Personas.Cliente;
import java.time.LocalDate;


public class Envio {
    
    private int numeroEnvio;
    private Cliente cliente;
    private Paquete paquete;
    private String ruta;
    private LocalDate fechaEnvio;
    private LocalDate fechaEntrega;
    private double precio;
    
    private static int cont = 1;

    public int getNumeroEnvio() {
        return numeroEnvio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public String getRuta() {
        return ruta;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public Envio(Cliente cliente, Paquete paquete, String ruta, LocalDate fechaEnvio, LocalDate fechaEntrega, double precio) {
        this.numeroEnvio = cont++;
        this.cliente = cliente;
        this.paquete = paquete;
        this.ruta = ruta;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
        this.precio = precio;
    }

    public Envio() {
        this(new Cliente(),new Paquete(),"",LocalDate.now(),LocalDate.now(),0);
    }

    @Override
    public String toString() {
        return "Envio{" + "numeroEnvio=" + numeroEnvio + ", cliente=" + cliente + ", paquete=" + paquete + ", ruta=" + ruta + ", fechaEnvio=" + fechaEnvio + ", fechaEntrega=" + fechaEntrega + ", precio=" + precio + '}';
    }

}

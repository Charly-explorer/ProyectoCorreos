package Envios;


import java.time.LocalDate;


public class Envio {
    
    private int numeroEnvio;
    private int cliente;
    private int paquete;
    private String ruta;
    private LocalDate fechaEnvio;
    private LocalDate fechaEntrega;
    private double precio;
    
    private static int cont = 0;

    public int getNumeroEnvio() {
        return numeroEnvio;
    }

    public int getCliente() {
        return cliente;
    }

    public int getPaquete() {
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

    
    public Envio(int cliente, int paquete, String ruta, LocalDate fechaEnvio, LocalDate fechaEntrega, double precio) {
        this.numeroEnvio = cont++;
        this.cliente = cliente;
        this.paquete = paquete;
        this.ruta = ruta;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
        this.precio = precio;
    }

    public Envio() {
        this(0,0,"",LocalDate.now(),LocalDate.now(),0);
    }

    @Override
    public String toString() {
        return "Envio{" + "numeroEnvio=" + numeroEnvio + ", cliente=" + cliente + ", paquete=" + paquete + ", ruta=" + ruta + ", fechaEnvio=" + fechaEnvio + ", fechaEntrega=" + fechaEntrega + ", precio=" + precio + '}';
    }

}

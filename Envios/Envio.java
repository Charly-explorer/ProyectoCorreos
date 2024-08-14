package Envios;

import java.time.LocalDate;

public class Envio {
    //private Cliente cliente;
    //private Paquete paquete;
    //private Ruta ruta;

    private LocalDate fechaEnvio;
    private LocalDate fechaEntrega;
    private double precioEnvio;
    private int contador=1;
    private int numeroEnvio;
    
    //No implemento setter and getter de cliente, paquete y ruta ya que no cuento con las clases.

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public int getNumeroEnvio() {
        return numeroEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setPrecioEnvio(double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public Envio(LocalDate fechaEnvio, LocalDate fechaEntrega, double precioEnvio ) {
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
        this.precioEnvio = precioEnvio;
        this.numeroEnvio= contador++;
    }
    
//  ?  public void despachar() {
//        if (estado.equals("El paquete se encuentra en el almacen")) {
//            estado = "Despachado";
//        }
//    }
//
//    public void entregar() {
//        if (estado.equals("Despachado")) {
//            estado = "Entregado";
//        }
//    }
//
//    public void cancelar() {
//        if (estado.equals("El paquete se encuentra en el almacen")) {
//            estado = "Cancelado";
//        }
//    }
//
//    public double calcularPrecio() {
//        return paquete.calcularPrecioEnvio();
//    }
}

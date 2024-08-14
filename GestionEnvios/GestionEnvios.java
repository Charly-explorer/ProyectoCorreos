package GestionEnvios;


import Excepciones.Excepciones;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

//public class GestionEnvios {
//    private HashMap<String, Cliente> clientes;
//    private HashMap<Integer, Paquete> paquetes;
//    private HashMap<Integer, Ruta> rutas;
//    private Queue<Envio> colaEnvios;
//
//    public GestionEnvios() {
//        clientes = new HashMap<>();
//        paquetes = new HashMap<>();
//        rutas = new HashMap<>();
//        colaEnvios = new LinkedList<>();
//    }
//
//    public void registrarCliente(String cedula, String nombre) {
//        clientes.put(cedula, new Cliente(cedula, nombre));
//    }
//
//    public void registrarEnvio(String cedula, int idPaquete, int idRuta, LocalDate fechaEnvio, LocalDate fechaEntrega) throws Excepciones {
//        Cliente cliente = clientes.get(cedula);
//        if (cliente == null) {
//            throw new Excepciones("El cliente con cédula " + cedula + " no está registrado.");
//        }
//
//        Paquete paquete = paquetes.get(idPaquete);
//        Ruta ruta = rutas.get(idRuta);
//
//        if (paquete != null && ruta != null) {
//            Envio envio = new Envio(cliente, paquete, ruta, fechaEnvio, fechaEntrega);
//            colaEnvios.add(envio);
//        } else {
//            throw new EnvioInvalidoException("Paquete o Ruta no válidos.");
//        }
//    }
//}
package patronesddi.Observer.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Compania implements ITelefonia {
    private String nombre;
    private List<ICliente> clientes = new ArrayList<>();
    private List<Notificaciones> notificaciones = new ArrayList<>();
    
    @Override
    public void notify(Notificaciones notificaciones) {
        for(ICliente cliente : clientes){
            if(notificaciones.getTitulo().equals(cliente.getTituloNotificacion())){
                cliente.update(nombre, notificaciones);
            }
        }
    }

    @Override
    public void removeSubscription(ICliente cliente) {
        clientes.remove(cliente);
    }

    @Override
    public void subscription(ICliente cliente, String titulo) {
        cliente.setTituloNotificacion(titulo);
        clientes.add(cliente);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ICliente> getClientes() {
        return clientes;
    }
    public void setClientes(List<ICliente> clientes) {
        this.clientes = clientes;
    }

    public List<Notificaciones> getNotificaciones() {
        return notificaciones;
    }
    public void setNotificaciones(List<Notificaciones> notificaciones) {
        this.notificaciones = notificaciones;
    }
    
}

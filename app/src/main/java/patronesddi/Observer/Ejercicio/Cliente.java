package patronesddi.Observer.Ejercicio;

public class Cliente implements ICliente {
    private String nombre;
    private String tituloNotificacion;
    
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getTituloNotificacion() {
        return tituloNotificacion;
    }

    @Override
    public void setTituloNotificacion(String titulo) {
        this.tituloNotificacion=titulo;
    }

    @Override
    public void update(String message, Notificaciones notificaciones) {
        System.out.println("Notificacion nueva....");
        System.out.println("Nombre: " + nombre);
        System.out.println("Notificacion: " + tituloNotificacion);
        System.out.println(message);
        notificaciones.showInfo();
    }
    
}

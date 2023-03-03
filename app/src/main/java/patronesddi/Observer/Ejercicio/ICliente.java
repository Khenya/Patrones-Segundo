package patronesddi.Observer.Ejercicio;

public interface ICliente {
    void  update(String message,Notificaciones notificaciones);
    void setTituloNotificacion(String titulo);
    String getTituloNotificacion();
}

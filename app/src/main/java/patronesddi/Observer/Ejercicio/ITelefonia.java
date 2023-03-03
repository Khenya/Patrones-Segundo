package patronesddi.Observer.Ejercicio;

public interface ITelefonia {
    void subscription(ICliente cliente, String titulo);
    void removeSubscription(ICliente cliente);
    void notify(Notificaciones notificaciones);
}

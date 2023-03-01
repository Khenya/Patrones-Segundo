package patronesddi.ChainOfResponsability.Ejercicio;

public class Cliente {
    public static void main(String[] args) {
        ServicioAlCliente servicioAlCliente = new ServicioAlCliente();

        servicioAlCliente.criteriaHandler(new Falla("Falla log-in", "BAJA", "No logro hacer log-in"));
        servicioAlCliente.criteriaHandler(new Falla("Falla suma", "MEDIA", "No logro sumar 25 números diferentes."));
        servicioAlCliente.criteriaHandler(new Falla("Falla reloj", "ALTA", "No logro ver la hora cuando estoy en la aplicación."));
        servicioAlCliente.criteriaHandler(new Falla("Falla notificaciones", "CRITICA", "No me llegan notificaciones."));
    }
}

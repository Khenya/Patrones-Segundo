package patronesddi.Observer.Ejercicio;

public class Client {
    public static void main(String[] args) {
       Compania compania1 = new Compania();
       compania1.setNombre("Viva");
       
       Cliente cliente1 = new Cliente("Brenda");
       Cliente cliente2 = new Cliente("Pedro");
       Cliente cliente3 = new Cliente("Diana");

       //cliente1
       compania1.subscription(cliente1, "premos");
       compania1.subscription(cliente1, "promosiones");

       // cliente 2
       compania1.subscription(cliente2, "noticia");

       // cliente 3
       compania1.subscription(cliente3, "precio llamadas");
       compania1.subscription(cliente3, "promosiones");
       compania1.subscription(cliente3, "premios");
       compania1.subscription(cliente3, "noticia");
       
       compania1.notify(new Notificaciones("Ganaste un premio", "premios"));
    }
}

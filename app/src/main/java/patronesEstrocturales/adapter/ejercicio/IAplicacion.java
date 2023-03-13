package patronesEstrocturales.adapter.ejercicio;

public interface IEjercicio {
    // metodos familia original
    void login();
    void logout();
    void reportes();

    // metodo adaptador
    void generacionDatos();
}

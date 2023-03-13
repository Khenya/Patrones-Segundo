package patronesEstrocturales.adapter.ejercicio;

public class AplicacionWeb implements IApliacionesB{

    @Override
    public void cerrarSesion() {
        System.out.println("cerrar sesion -----> web");
    }

    @Override
    public void gerneracionDatos() {
        System.out.println("generacion de datos -----> web");
    }

    @Override
    public void iniciarSesion() {
        System.out.println("iniciar sesion -----> web");
    }

    
}

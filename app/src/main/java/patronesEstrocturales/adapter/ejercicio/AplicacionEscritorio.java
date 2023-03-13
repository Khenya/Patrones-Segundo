package patronesEstrocturales.adapter.ejercicio;

public class AplicacionEscritorio implements IApliacionesB{

    @Override
    public void cerrarSesion() {
        System.out.println("cerrar sesion -----> escritorio");
    }

    @Override
    public void gerneracionDatos() {
        System.out.println("generarcion de datos -----> escritorio");
    }

    @Override
    public void iniciarSesion() {
        
        System.out.println("iniciar sesion -----> escritorio");
    }

    
    
}

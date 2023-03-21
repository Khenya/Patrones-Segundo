package parcialFinal.e5Adapter;

public class AplicacionWeb implements IAplicacionesB {
    @Override
    public void cerrarSesion() {
        System.out.println("cerrar sesion -----> web");
    }

    @Override
    public void gerneracionDatos() {
        System.out.println("generarcion de datos -----> web");
    }

    @Override
    public void iniciarSesion() {
        
        System.out.println("iniciar sesion -----> web");
    }
}

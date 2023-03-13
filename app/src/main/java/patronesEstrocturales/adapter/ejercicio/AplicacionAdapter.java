package patronesEstrocturales.adapter.ejercicio;

public class AplicacionAdapter implements IAplicacion{

    private AplicacionWeb aplicacion = new AplicacionWeb();


    public AplicacionAdapter(AplicacionWeb aplicacion) {
        this.aplicacion = aplicacion;
    }


    @Override
    public void login() {
        aplicacion.iniciarSesion();
    }


    @Override
    public void logout() {
        aplicacion.cerrarSesion();
    }


    @Override
    public void reportes() {
        aplicacion.gerneracionDatos();
    }

    
    
}

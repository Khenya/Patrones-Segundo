package parcialFinal.e5Adapter;

public class AplicacionAdapter implements IAplicacion{
    


    private IAplicacionesB aplicacionesB;

    public AplicacionAdapter(IAplicacionesB iAplicacionesB) {
        this.aplicacionesB = iAplicacionesB;
    }
   

    @Override
    public void login() {
        aplicacionesB.iniciarSesion();
    }


    @Override
    public void logout() {
        aplicacionesB.cerrarSesion();
    }


    @Override
    public void reportes() {
        aplicacionesB.gerneracionDatos();
    }
}

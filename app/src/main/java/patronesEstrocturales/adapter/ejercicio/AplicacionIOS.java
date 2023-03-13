package patronesEstrocturales.adapter.ejercicio;

public class AplicacionIOS implements IAplicacion{


    @Override
    public void login() {
        System.out.println("Log-in realizado -----> IOS");
    }

    @Override
    public void logout() {
        System.out.println("Log-out realizado -----> IOS");
    }

    @Override
    public void reportes() {
        System.out.println("reportes -----> IOS");
    }

    
}

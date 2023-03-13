package patronesEstrocturales.adapter.ejercicio;

public class AplicacionAndroid implements IAplicacion{

    

    @Override
    public void login() {
        System.out.println("Log-in realizado -----> andrid");
    }

    @Override
    public void logout() {
        System.out.println("Log-out realizado -----> andrid");
    }

    @Override
    public void reportes() {
        System.out.println("Reporte -----> andrid");
    }

    
}

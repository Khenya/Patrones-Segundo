package parcialFinal.e5Adapter;

public class AplicacionWindowsPhone implements IAplicacion{
    @Override
    public void login() {
        System.out.println("Log-in realizado -----> Windows Phone");
    }

    @Override
    public void logout() {
        System.out.println("Log-out realizado -----> Windows Phone");
    }

    @Override
    public void reportes() {
        System.out.println("Log-out realizado -----> Windows Phone");
    }

}

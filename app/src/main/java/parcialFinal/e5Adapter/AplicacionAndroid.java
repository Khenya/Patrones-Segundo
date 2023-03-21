package parcialFinal.e5Adapter;

public class AplicacionAndroid implements IAplicacion{
    @Override
    public void login() {
        System.out.println("Log-in realizado -----> Android");
    }

    @Override
    public void logout() {
        System.out.println("Log-out realizado -----> Android");
    }

    @Override
    public void reportes() {
        System.out.println("Log-out realizado -----> Android");
    }

}

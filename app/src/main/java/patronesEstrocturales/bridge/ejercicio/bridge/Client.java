package patronesEstrocturales.bridge.ejercicio.bridge;

public class Client {
    public static void main(String[] args) {
        Windows7 w = new Windows7(new x64());

        w.arquitectura();
        w.setArquitectura(new x86());
        w.arquitectura();

        Linux linux = new Linux(new x86());
        linux.arquitectura();
        linux.setArquitectura(new x64());
        linux.arquitectura();
    }

}

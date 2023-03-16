package patronesEstrocturales.bridge.ejercicio.nobridge;

public class Client {
    public static void main(String[] args) {
        Windows windows = new Windows();
        windows.x64();
        Linux linux = new Linux();
        linux.x86();
    }
}

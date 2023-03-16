package patronesEstrocturales.bridge.ejercicio.nobridge;

public class Linux implements IPataforma{
 

    @Override
    public void x64() {
        System.out.println("Linux x 64");
    }

    @Override
    public void x86() {
        System.out.println("Linux x 86");
    }

    @Override
    public void x128() {
        System.out.println("Linux x 128");
    }
}

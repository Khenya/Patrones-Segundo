package patronesEstrocturales.bridge.ejercicio.nobridge;

public class Mac implements IPataforma{

    @Override
    public void x64() {
        System.out.println("Mac x 64");
    }

    @Override
    public void x86() {
        System.out.println("Mac x 86");
    }

    @Override
    public void x128() {
        System.out.println("Linux x 128");
    }
    
}

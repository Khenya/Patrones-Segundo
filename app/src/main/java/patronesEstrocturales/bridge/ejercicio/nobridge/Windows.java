package patronesEstrocturales.bridge.ejercicio.nobridge;

public class Windows implements IPataforma{

    

    @Override
    public void x64() {
        System.out.println("Windows7 x 128");
    }

    @Override
    public void x86() {
        System.out.println("Windows7 x 86");
    }
    
}

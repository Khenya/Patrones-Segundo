package patronesEstrocturales.bridge.ejercicio.bridge;

public class Mac implements IPlataforma{

    private IArquitectura arquitectura;


    public Mac(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }
    
    
    public IArquitectura getArquitectura() {
        return arquitectura;
    }
    public void setArquitectura(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }
    @Override
    public void arquitectura() {
        System.out.print("Mac ");
        this.arquitectura.arquitectura();
    }
    
}

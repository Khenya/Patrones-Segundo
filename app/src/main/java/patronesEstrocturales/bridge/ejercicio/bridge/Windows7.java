package patronesEstrocturales.bridge.ejercicio.bridge;

public class Windows7 implements IPlataforma {

    private IArquitectura arquitectura;


    public Windows7(IArquitectura arquitectura) {
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
        System.out.print("Windows 7 ");
        this.arquitectura.arquitectura();
    }
    
}

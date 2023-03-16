package patronesEstrocturales.bridge.ejercicio.bridge;

public class Linux implements IPlataforma {

    private IArquitectura arquitectura;
    

    public Linux(IArquitectura arquitectura) {
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
        System.out.print("Linux ");
        this.arquitectura.arquitectura();
    }
    
}

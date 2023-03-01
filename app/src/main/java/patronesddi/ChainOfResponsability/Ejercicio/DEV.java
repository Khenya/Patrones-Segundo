package patronesddi.ChainOfResponsability.Ejercicio;

public class DEV implements IHandler {
    private IHandler next;
    @Override
    public void criteriaHandler(Falla falla) {
        if(falla.getSeveridad().equals("CRITICA")){
            System.out.println("El problema sera solucionado por DEV");
            falla.showInfo();
        } else{
            System.out.println("El problema no puede ser resuelto por el DEV.");
        }
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }
    
}

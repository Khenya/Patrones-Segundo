package patronesddi.ChainOfResponsability.Ejercicio;


public class QA implements IHandler {
    private IHandler next;

    @Override
    public void criteriaHandler(Falla falla) {
        if(falla.getSeveridad().equals("ALTA")){
            System.out.println("El problema sera solucionado por el QA");
            falla.showInfo();
        } else{
            System.out.println("El problema no puede ser resuelto por el QA.");
            this.next.criteriaHandler(falla);
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

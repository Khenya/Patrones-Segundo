package patronesddi.ChainOfResponsability.Ejercicio;

public class PO implements IHandler {
    private IHandler next;
    @Override
    public void criteriaHandler(Falla falla) {
       if(falla.getSeveridad().equals("MEDIA")){
            System.out.println("El problema sera solucionado por el PO");
            falla.showInfo();
        } else{
            System.out.println("El problema no puede ser resuelto por el PO.");
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

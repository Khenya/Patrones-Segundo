package patronesddi.ChainOfResponsability.Ejercicio;

public class EquipoSoporte implements IHandler {
    private IHandler next;
    @Override
    public void criteriaHandler(Falla falla) {
       if(falla.getSeveridad().equals("BAJA")){
            System.out.println("El problema sera solucionado por el equipo de soporte");
            falla.showInfo();
        } else{
            System.out.println("El problema no puede ser resuelto por el equipo de soporte.");
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
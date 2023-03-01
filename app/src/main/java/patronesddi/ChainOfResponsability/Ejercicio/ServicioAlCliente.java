package patronesddi.ChainOfResponsability.Ejercicio;

public class ServicioAlCliente implements IHandler {
    private IHandler next;
    @Override
    public void criteriaHandler(Falla falla) {
       EquipoSoporte equipoSoporte = new EquipoSoporte();
       PO po = new PO();
       QA qa = new QA();
       DEV dev = new DEV();

       this.setNext(equipoSoporte);
       equipoSoporte.setNext(po);
       po.setNext(qa);
       qa.setNext(dev);

       this.next.criteriaHandler(falla);
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


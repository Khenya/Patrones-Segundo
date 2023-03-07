package Practica2.E2;

public class Militar implements IHandler{
    private IHandler next;


    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void ordenMilitar(String orden) {
       General general = new General();
       Teniente teniente = new Teniente();
       Coronel coronel = new Coronel();
       Cabo cabo = new Cabo();

       this.setNext(cabo);
       cabo.setNext(coronel);
       coronel.setNext(teniente);
       teniente.setNext(general);
       this.next.ordenMilitar(orden);
    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
        
    }
    
}

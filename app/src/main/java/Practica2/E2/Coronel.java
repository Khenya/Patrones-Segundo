package Practica2.E2;

public class Coronel implements IHandler{
    private IHandler next;

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void ordenMilitar(String orden) {
        if(orden.toLowerCase().equals("desbloqueos") || orden.toLowerCase().equals("manifestaciones") ){
            System.out.println("Orden: " + orden);
            System.out.println("tu orden sera resuelta por el Coronel");
        } else{
            System.out.println("La orden no puede ser resuelta por el Coronel ");
            next.ordenMilitar(orden);
        }
    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
        
    }
    
}

package Practica2.E2;

public class Teniente implements IHandler{
    private IHandler next;

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void ordenMilitar(String orden) {
        if(orden.toLowerCase().equals("disciplina")){
            System.out.println("Orden: " + orden);
            System.out.println("tu orden sera resuelta por el Teniente");
        } else{
            System.out.println("La orden no puede ser resuelta por el Teniente");
            next.ordenMilitar(orden);
        }
    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
        
    }
    
}

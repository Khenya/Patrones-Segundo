package Practica2.E2;

public class General implements IHandler{
    private IHandler next;

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void ordenMilitar(String orden) {
        if(orden.toLowerCase().equals("entrevistas")){
            System.out.println("Orden: " + orden);
            System.out.println("tu orden sera resuelta por el General");
        } else{
            System.out.println("La orden no puede ser resuelta por el General ");
        }
    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
        
    }
    
}

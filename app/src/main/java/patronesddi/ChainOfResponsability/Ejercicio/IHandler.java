package patronesddi.ChainOfResponsability.Ejercicio;

public interface IHandler {
    void setNext(IHandler handler);
    
    IHandler next();
    
    void criteriaHandler(Falla falla);
}

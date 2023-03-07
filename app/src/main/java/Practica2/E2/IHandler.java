package Practica2.E2;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    // criterio para menejar el problema
    void ordenMilitar(String orden);
}

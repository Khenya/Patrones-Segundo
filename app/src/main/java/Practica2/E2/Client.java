package Practica2.E2;

public class Client {
    public static void main(String[] args) {
        Militar militar = new Militar();
        militar.ordenMilitar("limpiezas");

        Militar militar1 = new Militar();
        militar1.ordenMilitar("manifestaciones");

        Militar militar2 = new Militar();
        militar2.ordenMilitar("desbloqueos");
        
        Militar militar3 = new Militar();
        militar3.ordenMilitar("disciplina");

        Militar militar4 = new Militar();
        militar4.ordenMilitar("entrevistas");

    }
}

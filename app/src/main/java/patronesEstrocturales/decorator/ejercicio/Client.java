package patronesEstrocturales.decorator.ejercicio;

public class Client {
    public static void main(String[] args) {
        Component taxi = new Taxi(85);
        Component minibus = new Minibus(35);
        Component vagoneta = new Vagoneta(55);
        
        taxi = new Tanque(taxi, 45);
        

        vagoneta = new Turbo(vagoneta);
        vagoneta = new GPS(vagoneta,"El alto");

        minibus = new Tanque(minibus, 21);
        minibus = new GPS(minibus, "Irpavi");
        minibus = new Turbo(minibus);
        
        taxi.show();
        vagoneta.show();
        minibus.show();
    }
}

package patronesEstrocturales.composite.ejercicio;

public class Client {
    public static void main(String[] args) {
        Computadora computadora1 = new Computadora();
        Computadora computadora2 = new Computadora();
        Computadora computadora3 = new Computadora();
        Computadora computadora4 = new Computadora();
        
        Composite laboratorio1 = new Composite("laboratorio");
        Composite laboratorio2 = new Composite("laboratorio");
        Composite contenesor = new Composite("contendor");
        
        laboratorio1.add(computadora1);
        laboratorio1.add(computadora2);


        laboratorio2.add(computadora3);
        laboratorio2.add(computadora4);


        contenesor.add(laboratorio1);
        contenesor.add(laboratorio2);

        contenesor.operation();

    }
}

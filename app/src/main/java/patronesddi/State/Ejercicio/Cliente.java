package patronesddi.State.Ejercicio;

public class Cliente {
    public static void main(String[] args) {
        Computadora computadora = new Computadora("Ryzen 9", "Lenovo");

        computadora.show();

        computadora.changeState(new ComputadoraPrendida());
        computadora.show();

        computadora.changeState(new ComputadoraReiniciando());
        computadora.show();

        computadora.changeState(new ComputadoraApagada());
        computadora.show();
 
    }
}

package parcialFinal.e1Decorator;

public class Client {
    public static void main(String[] args) {
        Personaje personaje1 = new Personaje("Personaje1");

        IPersonaje iPersonaje = new Juego();
        iPersonaje.crearPersonaje(personaje1);

        iPersonaje = new Escudo(iPersonaje);
        iPersonaje.agregarHabilidad(personaje1);

        iPersonaje = new Arma(iPersonaje);
        iPersonaje.agregarHabilidad(personaje1);

        iPersonaje = new Curacion(iPersonaje);
        iPersonaje.agregarHabilidad(personaje1);

    }
}

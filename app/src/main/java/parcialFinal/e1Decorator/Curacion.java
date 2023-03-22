package parcialFinal.e1Decorator;

public class Curacion extends Decorator{

    public Curacion(IPersonaje personaje) {
        super(personaje);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("************ Puntos de Regeneracion de Vida ************");
        personaje.setPuntosDefensa(80);
        System.out.println("Los puntos de regeneracion de vida cambiaron a: " + personaje.getPuntosRegeneracio());

        personaje.showInfo();
    }
}

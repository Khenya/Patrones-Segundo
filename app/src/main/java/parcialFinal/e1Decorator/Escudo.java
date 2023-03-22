package parcialFinal.e1Decorator;

public class Escudo extends Decorator{

    public Escudo(IPersonaje personaje) {
        super(personaje);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("************ Escudo ************");
        double puntosdefensaN = personaje.getPuntosDefensa() + personaje.getPuntosDefensa()*0.35;
        personaje.setPuntosDefensa(puntosdefensaN);
        System.out.println("Los puntos de defensa cambiarona : " + personaje.getPuntosDefensa());

        double porcentageArmaduraN = personaje.getPorcentajeArmadura()+ personaje.getPorcentajeArmadura()*0.1;
        personaje.setPorcentajeArmadura(porcentageArmaduraN);
        System.out.println("El persontaje de armadura subio a: " + personaje.getPorcentajeArmadura());

        personaje.showInfo();
    }
}

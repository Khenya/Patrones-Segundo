package parcialFinal.e1Decorator;

import java.util.Random;

public class Arma extends Decorator{
    
    private String[] armas = {"Espada", "Hacha", "Escopeta"};


    public Arma(IPersonaje personaje) {
        super(personaje);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("************ Arma ************");
        int nroArma = new Random().nextInt(3);


        personaje.setArmas(armas[nroArma]);
        double puntosAtaqueN = personaje.getPuntosAtaque() + personaje.getPuntosAtaque()*0.3;
        personaje.setPuntosAtaque(puntosAtaqueN);
        System.out.println("Los puntos de ataque subieron a: " + personaje.getPuntosAtaque());

        int nivelN = personaje.getNivel() * 2;
        personaje.setNivel(nivelN);
        System.out.println("El nivel subio a: " + personaje.getNivel());

        personaje.showInfo();
    }
}

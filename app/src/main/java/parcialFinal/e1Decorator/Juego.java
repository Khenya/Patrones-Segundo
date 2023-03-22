package parcialFinal.e1Decorator;

public class Juego implements IPersonaje {

    @Override
    public void agregarHabilidad(Personaje personaje) {
        
    }

    @Override
    public void crearPersonaje(Personaje personaje) {
        System.out.println("************ Creando Personaje ************");
        personaje.setPorcentajeArmadura(1);
        personaje.setArmas(" ");
        personaje.setNivel(1);
        personaje.setPuntosAtaque(1);
        personaje.setPuntosRegeneracio(1);
        personaje.setPuntosDefensa(1);
        personaje.showInfo();
    }
    
}

package parcialFinal.e1Decorator;

public class Decorator implements  IPersonaje{
   

    protected IPersonaje personaje;


    public Decorator(IPersonaje personaje) {
        this.personaje = personaje;
    }


    @Override
    public void agregarHabilidad(Personaje personaje) {
        
    }


    @Override
    public void crearPersonaje(Personaje personaje) {
        personaje.showInfo();
    }
    

   
}

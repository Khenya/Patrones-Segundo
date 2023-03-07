package Practica2.E5;

public class Git implements ControVersiones{

	private Proyecto lastVersionProyecto;

    @Override
    public Proyecto getLastVersion() {
        return lastVersionProyecto;
    }

    @Override
    public void setLastVersion(Proyecto proyecto) {
        lastVersionProyecto = proyecto.clone();
        
    }
    
}

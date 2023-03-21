package parcialFinal.e1Decorator;

import java.util.List;

public class Decorator implements  Personaje{
    private Personaje personaje;


    public Decorator(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public List<String> getArmas() {
        return null;
    }

    @Override
    public double getNivel() {
        return 0;
    }

    @Override
    public String getNombre() {
        return personaje.getNombre();
    }

    @Override
    public double getPorcentajeArmadura() {
        return 0;
    }

    @Override
    public double getPuntosAtaque() {
        return 0;
    }

    @Override
    public double getPuntosDefensa() {
        return 0;
    }

    @Override
    public double getPuntosRegeneracion() {
        return 0;
    }

    @Override
    public void setArmas(List<String> armas) {
        
    }

    @Override
    public void setNivel(double nivel) {
        
    }

    @Override
    public void setNombre(String nombre) {
        personaje.setNombre(nombre);
    }

    @Override
    public void setPorcentajeArmadura(double porcentajeArmadura) {
      
    }

    @Override
    public void setPuntosAtaques(double puntosAtaques) {
        
    }

    @Override
    public void setPuntosDefensa(double puntosDefensa) {
        
        
    }

    @Override
    public void setPuntosRegeneracion(double puntosRegeneracion) {
       
    }

    @Override
    public void showPersonaje() {
        personaje.showPersonaje();
    }


}

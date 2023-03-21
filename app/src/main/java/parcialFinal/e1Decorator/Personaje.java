package parcialFinal.e1Decorator;

import java.util.List;

public interface Personaje {
   
    void showPersonaje();

    void setNombre(String nombre);
    String getNombre();

    void setNivel(double nivel);
    double getNivel();

    void setArmas(List<String> armas);
    List<String> getArmas();

    void setPorcentajeArmadura(double porcentajeArmadura);
    double getPorcentajeArmadura();

    void setPuntosAtaques(double puntosAtaques);
    double getPuntosAtaque();

    void setPuntosDefensa(double puntosDefensa);
    double getPuntosDefensa();

    void setPuntosRegeneracion(double puntosRegeneracion);
    double getPuntosRegeneracion();


}

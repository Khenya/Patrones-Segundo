package parcialFinal.e1Decorator;


public class Personaje {
    private String nombre;
    private int nivel;
    private String armas;
    private double porcentajeArmadura;
    private double puntosAtaque;
    private double puntosDefensa;
    private double puntosRegeneracio;

   
    public Personaje(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getArmas() {
        return armas;
    }
    public void setArmas(String armas) {
        this.armas = armas;
    }


    public double getPorcentajeArmadura() {
        return porcentajeArmadura;
    }
    public void setPorcentajeArmadura(double porcentajeArmadura) {
        this.porcentajeArmadura = porcentajeArmadura;
    }


    public double getPuntosAtaque() {
        return puntosAtaque;
    }
    public void setPuntosAtaque(double puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }


    public double getPuntosDefensa() {
        return puntosDefensa;
    }
    public void setPuntosDefensa(double puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public double getPuntosRegeneracio() {
        return puntosRegeneracio;
    }
    public void setPuntosRegeneracio(double puntosRegeneracio) {
        this.puntosRegeneracio = puntosRegeneracio;
    }


    public void showInfo(){
        System.out.println("************ Personaje ************");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Armas: " + getArmas());
        System.out.println("Porcentaje de armadura: " + getPorcentajeArmadura());
        System.out.println("Puntos de ataque: " + getPuntosAtaque());
        System.out.println("Puntos de defensa: " + getPuntosDefensa());
        System.out.println("Puntos de regeneracion de vida: " + getPuntosRegeneracio());
    }
    

}

package patronesEstrocturales.decorator.ejercicio;

public class Taxi implements Component{
    private double velocidad;

    public Taxi(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public void setVelocidad(double velocidad) {
       this.velocidad= velocidad;
        
    }

    @Override
    public void show() {
        System.out.println("*************** Taxi ***************");
        System.out.println("Velocidad: " + velocidad);
    }
    
}

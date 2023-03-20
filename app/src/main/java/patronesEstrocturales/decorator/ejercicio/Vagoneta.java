package patronesEstrocturales.decorator.ejercicio;

public class Vagoneta implements Component{

    private double velocidad;
    public Vagoneta(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public void setVelocidad(double velocidad) {
        this.velocidad=velocidad;
    }

    @Override
    public void show() {
        System.out.println("*************** Vagoneta ***************");
        System.out.println("Velocidad: " + velocidad);
    }
    
}

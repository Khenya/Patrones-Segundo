package patronesEstrocturales.decorator.ejercicio;

public class Turbo extends Accesorio{

    public Turbo(Component component) {
        super(component);
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Turbo: " + this.getComponent().getVelocidad()*(1.5));
    }
}

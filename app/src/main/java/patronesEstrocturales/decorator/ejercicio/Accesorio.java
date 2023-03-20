package patronesEstrocturales.decorator.ejercicio;

public class Accesorio implements Component{
    

    private Component component;

    public Accesorio(Component component) {
        this.component = component;    
    }

    @Override
    public double getVelocidad() {
        throw new UnsupportedOperationException("getVelocidad");
    }

    @Override
    public void setVelocidad(double velocidad) {
        throw new UnsupportedOperationException("setVelocidad");
    }

    @Override
    public void show() {
       component.show();
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
    
}

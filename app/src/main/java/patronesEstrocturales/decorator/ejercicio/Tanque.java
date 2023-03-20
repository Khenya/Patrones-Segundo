package patronesEstrocturales.decorator.ejercicio;

public class Tanque extends Accesorio{
    private double gas;

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public Tanque(Component component, double gas) {
        super(component);
        this.gas=gas;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("Gas: " + gas);
    }
    
}

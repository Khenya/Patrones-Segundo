package patronesEstrocturales.composite.ejercicio;

public class Computadora extends Component {

    public Computadora() {
        setPrecio(100);
        setTipo("computadora");
    }

    @Override
    public void add(Component composite) {
        // No se debe poner nada
    }

    @Override
    public Component get(int position) {
       // No se debe poner nada
        return null;
    }

    @Override
    public void operation() {
        System.out.println("Precio: " + getPrecio());
    }

    @Override
    public void remove(Component composite) {
       // No se debe poner nada
    }
    
}

package patronesEstrocturales.composite.template;

public class Composite extends Component{

    public Composite(String attribute1, String attribute2) {
        super(attribute1,attribute2);
    }

    @Override
    public void add(Component composite) {
    }

    @Override
    public Component get(int position) {
        return null;
    }

    @Override
    public void operation() {
        
        
    }

    @Override
    public void remove(Component composite) {
        elementos.remove(composite);
    }
    
}

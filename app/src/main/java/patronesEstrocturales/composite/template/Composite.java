package patronesEstrocturales.composite.template;

public class Composite extends Component{

    public Composite(String attribute1, String attribute2) {
        super(attribute1,attribute2);
    }

    @Override
    public void add(Component composite) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Component get(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void operation() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(Component composite) {
        elementos.remove(composite);
    }
    
}

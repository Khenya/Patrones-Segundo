package patronesddi.Command.Ejercicio;

public class Protegerse implements ICommand{
    private Personanje personanje;

    public Protegerse(Personanje personanje) {
        this.personanje = personanje;
    }

    @Override
    public void execute() {
        this.personanje.proteger();
    }
    
}

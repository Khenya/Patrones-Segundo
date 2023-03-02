package patronesddi.Command.Ejercicio;

public class Correr implements ICommand {
    private Personanje personanje;

    public Correr(Personanje personanje) {
        this.personanje = personanje;
    }

    @Override
    public void execute() {
        this.personanje.correr();
    }
    
}

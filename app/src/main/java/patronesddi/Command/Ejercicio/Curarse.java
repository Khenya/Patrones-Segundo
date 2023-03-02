package patronesddi.Command.Ejercicio;

public class Curarse implements ICommand {
    private Personanje personanje;

    public Curarse(Personanje personanje) {
        this.personanje = personanje;
    }

    @Override
    public void execute() {
        this.personanje.curar();
    }
    
}

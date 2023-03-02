package patronesddi.Command.Ejercicio;

public class Saltar implements ICommand {
    private Personanje personanje;

    public Saltar(Personanje personanje) {
        this.personanje = personanje;
    }


    @Override
    public void execute() {
        this.personanje.saltar();
    }
    
}

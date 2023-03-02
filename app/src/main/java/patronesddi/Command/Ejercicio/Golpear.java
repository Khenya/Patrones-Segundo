package patronesddi.Command.Ejercicio;

public class Golpear implements ICommand{
    private Personanje personanje;

    public Golpear(Personanje personanje) {
        this.personanje = personanje;
    }

    @Override
    public void execute() {
        this.personanje.golpear();
    }
    
}

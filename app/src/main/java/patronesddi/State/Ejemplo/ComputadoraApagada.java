package patronesddi.State.Ejemplo;

public class ComputadoraApagada implements IStateComputer{

    @Override
    public void computerBehavior(Computadora computadora) {
        computadora.getMemoryRam().setPercentageUse(0);
		computadora.getTarjetaVideo().setPercentageUse(0);
		System.out.println("Estado: Apagado");
		computadora.getMemoryRam().show();
		computadora.getTarjetaVideo().show();
    }
    
}

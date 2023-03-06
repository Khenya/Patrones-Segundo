package patronesddi.State.Ejercicio;

public class ComputadoraApagada implements IStateComputer{

    @Override
    public void changeComponentsState(Computadora computadora) {
        System.out.println("Apagando computadora...");

		computadora.getOpenPrograms().clear();
		computadora.getCpu().setConsumoCPU(1);
		computadora.getRam().setConsumo(1);

		System.out.println("Computadora apagada");
    }
    
}

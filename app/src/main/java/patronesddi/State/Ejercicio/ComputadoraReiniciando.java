package patronesddi.State.Ejercicio;

import java.util.List;

public class ComputadoraReiniciando implements IStateComputer{

    @Override
    public void changeComponentsState(Computadora computadora) {
        System.out.println("Reiniciando computadora...");

		List<String> openPrograms = computadora.getOpenPrograms();

		for (String programa : openPrograms) {
			System.out.println("Cerrando el programa: " + programa);
		}

		computadora.getOpenPrograms().clear();
		computadora.getCpu().setConsumoCPU(0);
		computadora.getRam().setConsumo(0);

		System.out.println("Computadora reiniciada");
    }
    
}

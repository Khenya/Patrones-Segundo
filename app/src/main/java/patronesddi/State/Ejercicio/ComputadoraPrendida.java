package patronesddi.State.Ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputadoraPrendida implements IStateComputer {

    @Override
    public void changeComponentsState(Computadora computadora) {
        System.out.println("Prendiendo la computadora...");

		List<String> programasComputadora = new ArrayList<>();
        programasComputadora.add("Twich");
        programasComputadora.add("Spotify");
        programasComputadora.add("Eclipse");
        programasComputadora.add("Code");
        programasComputadora.add("WhatsApp");
        programasComputadora.add("Steam");
        programasComputadora.add("Edge");
        programasComputadora.add("Discord");
        programasComputadora.add("Chrome");
        programasComputadora.add("AnyDesk");

		Random rnd = new Random();

		int programasParaAbrir = (int) rnd.nextInt(9) + 1;
		double currentCpuConsume = computadora.getCpu().getConsumoCPU();
		double currentRamConsume = computadora.getRam().getConsumo();

		String openProgram;

		for (int i = 0; i < programasParaAbrir; i++) {
			openProgram = programasComputadora.get(i);
			System.out.println("Abriendo el programa: " + openProgram);
			computadora.getOpenPrograms().add(openProgram);
			try {
				Thread.sleep(5000);
				currentCpuConsume += 5;
				computadora.getCpu().setConsumoCPU(currentCpuConsume);
				currentRamConsume += 5;
				computadora.getRam().setConsumo(currentRamConsume);
				computadora.show();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
        System.out.println("Computadora encendida");

    }
    
}

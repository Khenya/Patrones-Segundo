package patronesddi.State.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Computadora {
    private List<String> openPrograms = new ArrayList<>();
	private RAM ram;
	private CPU cpu;
	private IStateComputer currentState;

	public List<String> getOpenPrograms() {
		return openPrograms;
	}

	public void setOpenPrograms(List<String> openPrograms) {
		this.openPrograms = openPrograms;
	}

	public RAM getRam() {
		return ram;
	}
	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public Computadora(String ramName, String cpuName) {
		currentState = new ComputadoraApagada();
		ram = new RAM(ramName);
		cpu = new CPU(cpuName);
	}

	public void show() {
		System.out.println("*********** Computadora ***********");
		System.out.println("Cantidad de programas abiertos: " + openPrograms.size());
		ram.show();
		cpu.show();
	}

	public void changeState(IStateComputer state) {
		currentState = state;
		currentState.changeComponentsState(this);
	}
}

package patronesddi.State.Ejercicio;

public class CPU {
    
    private String nameCPU;
    private double consumoCPU;
    
    
    public CPU(String nameCPU) {
        this.nameCPU = nameCPU;
    }


    public String getNameCPU() {
        return nameCPU;
    }
    public void setNameCPU(String nameCPU) {
        this.nameCPU = nameCPU;
    }
    
    public double getConsumoCPU() {
        return consumoCPU;
    }
    public void setConsumoCPU(double consumoCPU) {
        this.consumoCPU = consumoCPU;
    }

    public void show() {
		System.out.println("*********** CPU ***********");
		System.out.println("Nombre: " + nameCPU);
		System.out.println("Consumo: " + consumoCPU);
	}
    
}

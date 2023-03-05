package patronesddi.State.Ejercicio;

public class RAM {
	private String name;
	private double consumo = 0;

	public RAM(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getConsumo() {
        return consumo;
    }
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void show() {
		System.out.println("*********** RAM ***********");
		System.out.println("Nombre: " + name);
		System.out.println("Consumo: " + consumo);
	}
}

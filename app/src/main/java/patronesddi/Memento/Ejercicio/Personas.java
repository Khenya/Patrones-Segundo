package patronesddi.Memento.Ejercicio;

public class Personas {
    private String name;
    private int CI;
    private int edad;
    
  
    public Personas(String name, int cI, int edad) {
        this.name = name;
        CI = cI;
        this.edad = edad;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCI() {
        return CI;
    }
    public void setCI(int cI) {
        CI = cI;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void showInfo() {
		System.out.println("*****Persona******");
		System.out.format("Nombre: ", name);
		System.out.format("CI: ", CI);
		System.out.format("Edad: ", edad);
		System.out.println();
	}
}

package patronesddi.Memento.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class BD {
    private List<Personas> personas = new ArrayList<>();

    public BD(){
        personas = new ArrayList<>();
    }

    public List<Personas> getPersonas() {
        return personas;
    }
    public void setPersonas(List<Personas> personas) {
        this.personas = personas;
    }

    public void addPersona(Personas persona) {
		personas.add(persona);
	}

	public void showInfo() {
		System.out.println("********** Lista de Personas **********");
        personas.forEach(bdPersona -> bdPersona.showInfo());
	}
}

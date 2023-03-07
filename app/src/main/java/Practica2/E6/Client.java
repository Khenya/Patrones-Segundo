package Practica2.E6;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();

        List<Persona> personas = new ArrayList<>();

        telegram.setPersonas(personas);

        personas.add(new Desarrollador("desarrollador1","d1"));
        personas.add(new Desarrollador("desarrollador2","d2"));
        personas.add(new Desarrollador("desarrollador3","d3"));
        personas.add(new Desarrollador("desarrollador4","d4"));

        for (Persona desarrollador : personas) {
			desarrollador.setComunicationChannel(telegram);
		}

		personas.get(0).sendGlobalMessage("Subiendo mi ultimo commit");

		personas.get(1).sendPersonalMessage("Me ayudas con el git?", personas.get(2));

    }
}
